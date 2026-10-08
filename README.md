# herosignal-java (Java)

HeroSignal sunucu SDK'sı: bildirim gönderme, kullanıcı/abonelik yönetimi, segment/şablon/kampanya, analitik ve webhook imza doğrulaması. API anahtarı yalnızca sunucuda kullanılır.

## Kurulum
```
implementation("io.herosignal:herosignal-java:0.1.0")
```

## Kullanım
```java
HeroSignal hs = HeroSignal.builder().apiKey(System.getenv("HS_API_KEY")).appId("app_…").build();
hs.notifications().create(
    new CreateNotificationDto()
        .setTarget(new CreateNotificationDtoTarget().setIncludeAliases(Map.of("external_id", List.of("u1"))))
        .setContents(Map.of("en", "Shipped")),
    RequestOptions.builder().idempotencyKey("order-42").build());
```

- Kimlik doğrulama (Bearer API anahtarı), zaman aşımı, 429/5xx/ağ hatalarında üstel geri çekilmeli yeniden deneme (`Retry-After`'a uyar), otomatik `Idempotency-Key`, hata tipi (status, code, message, request_id), cursor sayfalama ve `HeroSignal-Signature` webhook doğrulaması (sabit zamanlı, tolerans, secret rotasyonu).
- Kaynaklar ve modeller `api/openapi.yaml`'dan `node sdk/scripts/generate-server-sdks.mjs` ile üretilir; üretilmiş dosyaları elle düzenlemeyin.

Ayrıntılı rehber: [docs/sdk/java.md](../../docs/sdk/java.md)

## Test
```
gradle test
```
