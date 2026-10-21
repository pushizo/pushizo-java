<!-- pushizo:header -->
<p align="center">
  <a href="https://pushizo.com"><img src="https://raw.githubusercontent.com/pushizo/.github/main/profile/assets/mark.svg" alt="Pushizo" width="56" height="56"></a>
</p>
<p align="center">
  <a href="https://docs.pushizo.com/docs/sdk/java"><img src="https://img.shields.io/badge/docs-docs.pushizo.com-5b4bdb" alt="Docs"></a>
  <a href="https://docs.pushizo.com/docs/api"><img src="https://img.shields.io/badge/API-reference-b44fc4" alt="API reference"></a>
  <a href="https://github.com/pushizo/pushizo-java/blob/main/LICENSE"><img src="https://img.shields.io/badge/license-MIT-16130f" alt="License: MIT"></a>
</p>
<p align="center"><a href="#english">English</a> · <a href="#türkçe">Türkçe</a></p>

## English

**Pushizo Java SDK** — Server-side SDK for Java 17+. Models and resources are generated from the Pushizo OpenAPI schema; retries, idempotency, pagination and webhook verification are built in.

> **Status:** Publishing to Maven Central is in progress.<br>
> **Durum:** Maven Central yayını hazırlanıyor.

**Install from GitHub until then · O zamana kadar GitHub'dan kurulum:**

```bash
curl -LO https://github.com/pushizo/pushizo-java/releases/download/v0.1.0/pushizo-java-0.1.0.jar
curl -LO https://github.com/pushizo/pushizo-java/releases/download/v0.1.0/pom.xml
mvn install:install-file -Dfile=pushizo-java-0.1.0.jar -DpomFile=pom.xml
# ardından / then: com.pushizo:pushizo-java:0.1.0
```

**After publication · Yayından sonra:**

```xml
<dependency>
  <groupId>com.pushizo</groupId>
  <artifactId>pushizo-java</artifactId>
  <version>0.1.0</version>
</dependency>
```

The detailed guide below is in Turkish; code samples are language-neutral. Full documentation:
[docs.pushizo.com/docs/sdk/java](https://docs.pushizo.com/docs/sdk/java) · API reference: [docs.pushizo.com/docs/api](https://docs.pushizo.com/docs/api).

## Türkçe
<!-- /pushizo:header -->

# Pushizo Java SDK

Pushizo public API'si için Java sunucu SDK'sı (Java 17+, `java.net.http`, JSON için Jackson).
Modeller (`com.pushizo.models`), parametre sınıfları (`com.pushizo.params`) ve kaynaklar
(`com.pushizo.resources`) [Pushizo OpenAPI şemasından](https://github.com/pushizo/pushizo-openapi) üretilir; kimlik doğrulama, yeniden deneme, idempotency,
sayfalama ve webhook imza doğrulaması el yazımıdır.

## Kurulum

Maven:

```xml
<dependency>
  <groupId>com.pushizo</groupId>
  <artifactId>pushizo-java</artifactId>
  <version>0.1.0</version>
</dependency>
```

Gradle:

```kotlin
implementation("com.pushizo:pushizo-java:0.1.0")
```

## Kullanım

```java
import com.pushizo.Pushizo;
import com.pushizo.RequestOptions;
import com.pushizo.models.*;
import com.pushizo.params.SegmentsListParams;
import java.util.List;
import java.util.Map;

Pushizo hs = Pushizo.builder()
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
String identityHash = Pushizo.identityHash(System.getenv("HS_SDK_SECRET"), "user-42");
```

Model alanları akıcı ayarlayıcılar (`.contents(...)`) ve `getX()` okuyucularıyla kullanılır; `null` alanlar
gönderilmez, yanıttaki bilinmeyen alanlar yok sayılır. SDK'da metodu olmayan uçlar veya JSON dışı yanıtlar için:
`hs.request("GET", "/v1/apps/{appId}/analytics/messages", Map.of("format", "csv"), null, null)` (gövde metin döner).

### Ayarlar

| Builder | Varsayılan | Açıklama |
|---------|------------|----------|
| `apiKey` | — | `hs_live_…` API anahtarı (Bearer) |
| `appId` | — | Çağrıda `RequestOptions.appId` verilmezse kullanılan app |
| `baseUrl` | `https://api.pushizo.com` | API adresi |
| `timeout` | 30 sn | Deneme başına zaman aşımı |
| `maxRetries` | 3 | En fazla yeniden deneme (politika: aşağıda) |
| `autoIdempotencyKey` | `true` | `Idempotency-Key` destekleyen çağrılarda otomatik UUID |
| `transport` | `JdkHttpTransport` | Özel taşıma (ör. `new JdkHttpTransport(özelHttpClient)`) |

Çağrı başına: `RequestOptions.builder().appId(..).idempotencyKey(..).timeout(..).maxRetries(..).header(..)`.

### Hatalar

429 her metotta; 5xx ve ağ hataları GET/HEAD/OPTIONS/PUT/DELETE'te, POST/PATCH'te yalnızca `Idempotency-Key` varsa (otomatik anahtar dahil) veya istek sunucuya hiç gönderilemediyse (bağlantı reddi, DNS hatası, bağlantı zaman aşımı) üstel geri çekilmeyle (0,3 / 1 / 3 sn) yeniden denenir; `Retry-After` başlığına uyulur.
Kalıcı hatalar `PushizoException` (unchecked) alt sınıflarıdır ve `getStatus()`, `getCode()` (`HS_…`),
`getRequestId()`, `getDetails()` taşır:

```java
try {
    hs.notifications().get("msg_yok");
} catch (NotFoundException e) {
    // 404
} catch (InvalidRequestException e) {
    if (ErrorCodes.NO_RECIPIENTS.equals(e.getCode())) { /* 422 */ }
} catch (PushizoException e) {
    // AuthenticationException, PermissionDeniedException, ConflictException, RateLimitException, ServerException, NetworkException
}
```

## Webhook imza doğrulaması

```java
import com.pushizo.WebhookEvent;
import com.pushizo.WebhookSignatureException;
import com.pushizo.Webhooks;

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

`models/`, `params/`, `resources/` ve `PushizoResources.java` elle düzenlenmez. Webhook testleri
`sdk/testdata/webhook-signature-vectors.json` ortak vektörlerini kullanır.

<!-- pushizo:footer -->
---

## Support · Destek

- **Guide · Rehber:** [docs.pushizo.com/docs/sdk/java](https://docs.pushizo.com/docs/sdk/java)
- **API reference & OpenAPI · API referansı ve OpenAPI:** [docs.pushizo.com/docs/api](https://docs.pushizo.com/docs/api) ·
  [pushizo-openapi](https://github.com/pushizo/pushizo-openapi)
- **Bugs & ideas · Hata ve öneri:** [Issues](https://github.com/pushizo/pushizo-java/issues)
- **Security · Güvenlik:** please do not open public issues; email [security@pushizo.com](mailto:security@pushizo.com) ·
  herkese açık issue açmayın, bu adrese yazın.
- **Help · Destek:** [support@pushizo.com](mailto:support@pushizo.com)

This repository is mirrored automatically from the Pushizo main repository on every release. Please open an issue
instead of a pull request; fixes land in the main repository and ship with the next release.
Bu depo her sürümde Pushizo ana deposundan otomatik yansıtılır. Pull request yerine issue açın; düzeltmeler ana depoda
yapılır ve bir sonraki sürümle buraya gelir.

Released under the MIT License · MIT lisanslıdır — [LICENSE](https://github.com/pushizo/pushizo-java/blob/main/LICENSE).
<!-- /pushizo:footer -->
