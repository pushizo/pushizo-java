// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.
package io.herosignal.resources;
/**
 * SegmentsResource.list için isteğe bağlı sorgu parametreleri.
 */
public final class SegmentsListParams {

    /** "limit" sorgu parametresi. */
    private Long limit;

    /** "cursor" sorgu parametresi. */
    private String cursor;

    /** "q" sorgu parametresi. */
    private String q;

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
    public SegmentsListParams setLimit(Long limit) {
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
    public SegmentsListParams setCursor(String cursor) {
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
    public SegmentsListParams setQ(String q) {
        this.q = q;
        return this;
    }

    /** @return bu parametrelerin sığ kopyası */
    public SegmentsListParams copy() {
        SegmentsListParams copy = new SegmentsListParams();
        copy.limit = limit;
        copy.cursor = cursor;
        copy.q = q;
        return copy;
    }
}
