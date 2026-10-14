# HeroSignal Java SDK

HeroSignal public API'si için Java sunucu SDK'sı (Java 17+, `java.net.http`, JSON için Jackson).
Modeller (`io.herosignal.models`), parametre sınıfları (`io.herosignal.params`) ve kaynaklar
(`io.herosignal.resources`) `api/openapi.yaml`'dan üretilir; kimlik doğrulama, yeniden deneme, idempotency,
sayfalama ve webhook imza doğrulaması el yazımıdır.

## Kurulum

Maven:

```xml
<dependency>
  <groupId>io.herosignal</groupId>
  <artifactId>herosignal-java</artifactId>
  <version>0.1.0</version>
</dependency>
```

Gradle:

```kotlin
implementation("io.herosignal:herosignal-java:0.1.0")
```

## Kullanım

```java
import io.herosignal.HeroSignal;
import io.herosignal.RequestOptions;
import io.herosignal.models.*;
import io.herosignal.params.SegmentsListParams;
import java.util.List;
import java.util.Map;

HeroSignal hs = HeroSignal.builder()
        .apiKey(System.getenv("HS_API_KEY"))
        .appId("app_…")
        // .baseUrl("http://localhost:4000")
        .build();

// Bildirim gönder: Idempotency-Key verilmezse otomatik UUID (yeniden denemelerde aynı anahtar)
CreateNotificationResult res = hs.notifications().create(
        new CreateNotificationDto()
                .target(new CreateNotificationDtoTarget().includeAliases(Map.of("external_id", List.of("user-42"))))
                .contents(Map.of("en", "Your order shipped", "tr", "Siparişiniz kargoya verildi")),
        RequestOptions.builder().idempotencyKey("order-1001").build());
System.out.println(res.getId() + " " + res.getStatus());

// Kullanıcı oluştur/güncelle
hs.users().upsert(new UpsertUserDto().externalId("user-42").tags(Map.of("plan", "pro")));

// Cursor sayfalama: sayfalar tembel yüklenir
for (Segment segment : hs.segments().listAll(new SegmentsListParams().limit(100L))) {
    System.out.println(segment.getName());
}

// Başka bir app için tek çağrı
hs.apps().get(RequestOptions.forApp("app_diger"));

// SDK identity verification
String identityHash = HeroSignal.identityHash(System.getenv("HS_SDK_SECRET"), "user-42");
```

Model alanları akıcı ayarlayıcılar (`.contents(...)`) ve `getX()` okuyucularıyla kullanılır; `null` alanlar
gönderilmez, yanıttaki bilinmeyen alanlar yok sayılır. SDK'da metodu olmayan uçlar veya JSON dışı yanıtlar için:
`hs.request("GET", "/v1/apps/{appId}/analytics/messages", Map.of("format", "csv"), null, null)` (gövde metin döner).

### Ayarlar

| Builder | Varsayılan | Açıklama |
|---------|------------|----------|
| `apiKey` | — | `hs_live_…` API anahtarı (Bearer) |
| `appId` | — | Çağrıda `RequestOptions.appId` verilmezse kullanılan app |
| `baseUrl` | `https://api.herosignal.dev` | API adresi |
| `timeout` | 30 sn | Deneme başına zaman aşımı |
| `maxRetries` | 3 | En fazla yeniden deneme (politika: aşağıda) |
| `autoIdempotencyKey` | `true` | `Idempotency-Key` destekleyen çağrılarda otomatik UUID |
| `transport` | `JdkHttpTransport` | Özel taşıma (ör. `new JdkHttpTransport(özelHttpClient)`) |

Çağrı başına: `RequestOptions.builder().appId(..).idempotencyKey(..).timeout(..).maxRetries(..).header(..)`.

### Hatalar

429 her metotta; 5xx ve ağ hataları GET/HEAD/OPTIONS/PUT/DELETE'te, POST/PATCH'te yalnızca `Idempotency-Key` varsa (otomatik anahtar dahil) veya istek sunucuya hiç gönderilemediyse (bağlantı reddi, DNS hatası, bağlantı zaman aşımı) üstel geri çekilmeyle (0,3 / 1 / 3 sn) yeniden denenir; `Retry-After` başlığına uyulur.
Kalıcı hatalar `HeroSignalException` (unchecked) alt sınıflarıdır ve `getStatus()`, `getCode()` (`HS_…`),
`getRequestId()`, `getDetails()` taşır:

```java
try {
    hs.notifications().get("msg_yok");
} catch (NotFoundException e) {
    // 404
} catch (InvalidRequestException e) {
    if (ErrorCodes.NO_RECIPIENTS.equals(e.getCode())) { /* 422 */ }
} catch (HeroSignalException e) {
    // AuthenticationException, PermissionDeniedException, ConflictException, RateLimitException, ServerException, NetworkException
}
```

## Webhook imza doğrulaması

```java
import io.herosignal.WebhookEvent;
import io.herosignal.WebhookSignatureException;
import io.herosignal.Webhooks;

byte[] payload = request.getInputStream().readAllBytes();              // ham gövde
try {
    List<WebhookEvent> events = Webhooks.constructEvents(payload,
            request.getHeader(Webhooks.SIGNATURE_HEADER),
            List.of(System.getenv("HS_WEBHOOK_SECRET")));                // rotasyonda eski + yeni secret
    for (WebhookEvent event : events) {                                  // tekil veya batch gövde
        // event.getId() ile tekrarları ayıklayın; event.getType(), event.getData()
    }
    response.setStatus(204);
} catch (WebhookSignatureException e) {
    response.setStatus(400);                                             // e.getReason()
}
```

Zaman damgası 5 dakikadan eskiyse istek tekrar (replay) sayılır. Yalnızca doğrulama için
`Webhooks.verifySignature(...)` `WebhookVerifyResult(ok, timestamp, reason)` döner.

## Geliştirme

```bash
mvn test                                                 # sdk/java içinde
node sdk/scripts/generate-server-sdks.mjs --lang java    # depo kökünde; üretilmiş sınıflar yenilenir
```

`models/`, `params/`, `resources/` ve `HeroSignalResources.java` elle düzenlenmez. Webhook testleri
`sdk/testdata/webhook-signature-vectors.json` ortak vektörlerini kullanır.
