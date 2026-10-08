// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.
package io.herosignal.resources;
/**
 * TemplatesResource.list için isteğe bağlı sorgu parametreleri.
 */
public final class TemplatesListParams {

    /** "limit" sorgu parametresi. */
    private Long limit;

    /** "cursor" sorgu parametresi. */
    private String cursor;

    /** "q" sorgu parametresi. */
    private String q;

    /** "channel" sorgu parametresi. Değerler: "ios_push", "android_push", "web_push", "email", "sms". */
    private String channel;

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
    public TemplatesListParams setLimit(Long limit) {
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
    public TemplatesListParams setCursor(String cursor) {
        this.cursor = cursor;
        return this;
    }

    /** @return "q" değeri */
    public String getQ() {
        return q;
    }

    /**
     * "q" değerini ayarlar.
     *
     * @param q yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public TemplatesListParams setQ(String q) {
        this.q = q;
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
    public TemplatesListParams setChannel(String channel) {
        this.channel = channel;
        return this;
    }

    /** @return bu parametrelerin sığ kopyası */
    public TemplatesListParams copy() {
        TemplatesListParams copy = new TemplatesListParams();
        copy.limit = limit;
        copy.cursor = cursor;
        copy.q = q;
        copy.channel = channel;
        return copy;
    }
}
