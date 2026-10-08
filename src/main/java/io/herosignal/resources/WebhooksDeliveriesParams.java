// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.
package io.herosignal.resources;
/**
 * WebhooksResource.deliveries için isteğe bağlı sorgu parametreleri.
 */
public final class WebhooksDeliveriesParams {

    /** "limit" sorgu parametresi. */
    private Long limit;

    /** "cursor" sorgu parametresi. */
    private String cursor;

    /** "status" sorgu parametresi. Değerler: "pending", "success", "failed", "dead". */
    private String status;

    /** "event_type" sorgu parametresi. */
    private String eventType;

    /** @return "limit" değeri */
    public Long getLimit() {
        return limit;
    }

    /**
     * "limit" değerini ayarlar.
     *
     * @param limit yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public WebhooksDeliveriesParams setLimit(Long limit) {
        this.limit = limit;
        return this;
    }

    /** @return "cursor" değeri */
    public String getCursor() {
        return cursor;
    }

    /**
     * "cursor" değerini ayarlar.
     *
     * @param cursor yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public WebhooksDeliveriesParams setCursor(String cursor) {
        this.cursor = cursor;
        return this;
    }

    /** @return "status" değeri */
    public String getStatus() {
        return status;
    }

    /**
     * "status" değerini ayarlar.
     *
     * @param status yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public WebhooksDeliveriesParams setStatus(String status) {
        this.status = status;
        return this;
    }

    /** @return "event_type" değeri */
    public String getEventType() {
        return eventType;
    }

    /**
     * "event_type" değerini ayarlar.
     *
     * @param eventType yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public WebhooksDeliveriesParams setEventType(String eventType) {
        this.eventType = eventType;
        return this;
    }

    /** @return bu parametrelerin sığ kopyası */
    public WebhooksDeliveriesParams copy() {
        WebhooksDeliveriesParams copy = new WebhooksDeliveriesParams();
        copy.limit = limit;
        copy.cursor = cursor;
        copy.status = status;
        copy.eventType = eventType;
        return copy;
    }
}
