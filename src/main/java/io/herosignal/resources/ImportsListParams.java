// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.
package io.herosignal.resources;
/**
 * ImportsResource.list için isteğe bağlı sorgu parametreleri.
 */
public final class ImportsListParams {

    /** "limit" sorgu parametresi. */
    private Long limit;

    /** "cursor" sorgu parametresi. */
    private String cursor;

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
    public ImportsListParams setLimit(Long limit) {
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
    public ImportsListParams setCursor(String cursor) {
        this.cursor = cursor;
        return this;
    }

    /** @return bu parametrelerin sığ kopyası */
    public ImportsListParams copy() {
        ImportsListParams copy = new ImportsListParams();
        copy.limit = limit;
        copy.cursor = cursor;
        return copy;
    }
}
