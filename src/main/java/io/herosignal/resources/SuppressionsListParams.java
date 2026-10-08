// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.
package io.herosignal.resources;
/**
 * SuppressionsResource.list için isteğe bağlı sorgu parametreleri.
 */
public final class SuppressionsListParams {

    /** "limit" sorgu parametresi. */
    private Long limit;

    /** "cursor" sorgu parametresi. */
    private String cursor;

    /** "channel" sorgu parametresi. Değerler: "email", "sms". */
    private String channel;

    /** "reason" sorgu parametresi. Değerler: "bounce", "complaint", "manual", "unsubscribe_link", "stop". */
    private String reason;

    /** "value" sorgu parametresi. */
    private String value;

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
    public SuppressionsListParams setLimit(Long limit) {
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
    public SuppressionsListParams setCursor(String cursor) {
        this.cursor = cursor;
        return this;
    }

    /** @return "channel" değeri */
    public String getChannel() {
        return channel;
    }

    /**
     * "channel" değerini ayarlar.
     *
     * @param channel yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public SuppressionsListParams setChannel(String channel) {
        this.channel = channel;
        return this;
    }

    /** @return "reason" değeri */
    public String getReason() {
        return reason;
    }

    /**
     * "reason" değerini ayarlar.
     *
     * @param reason yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public SuppressionsListParams setReason(String reason) {
        this.reason = reason;
        return this;
    }

    /** @return "value" değeri */
    public String getValue() {
        return value;
    }

    /**
     * "value" değerini ayarlar.
     *
     * @param value yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public SuppressionsListParams setValue(String value) {
        this.value = value;
        return this;
    }

    /** @return bu parametrelerin sığ kopyası */
    public SuppressionsListParams copy() {
        SuppressionsListParams copy = new SuppressionsListParams();
        copy.limit = limit;
        copy.cursor = cursor;
        copy.channel = channel;
        copy.reason = reason;
        copy.value = value;
        return copy;
    }
}
