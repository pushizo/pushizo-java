// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.
package io.herosignal.resources;
/**
 * NotificationsResource.list için isteğe bağlı sorgu parametreleri.
 */
public final class NotificationsListParams {

    /** "limit" sorgu parametresi. */
    private Long limit;

    /** "cursor" sorgu parametresi. */
    private String cursor;

    /** "source" sorgu parametresi. Değerler: "campaign", "api", "journey", "test". */
    private String source;

    /** "kind" sorgu parametresi. Değerler: "campaign", "api", "journey", "test". */
    private String kind;

    /** "status" sorgu parametresi. Değerler: "queued", "processing", "completed", "cancelled", "failed". */
    private String status;

    /** "sort" sorgu parametresi. Değerler: "created_at", "-created_at". */
    private String sort;

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
    public NotificationsListParams setLimit(Long limit) {
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
    public NotificationsListParams setCursor(String cursor) {
        this.cursor = cursor;
        return this;
    }

    /** @return "source" değeri */
    public String getSource() {
        return source;
    }

    /**
     * "source" değerini ayarlar.
     *
     * @param source yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public NotificationsListParams setSource(String source) {
        this.source = source;
        return this;
    }

    /** @return "kind" değeri */
    public String getKind() {
        return kind;
    }

    /**
     * "kind" değerini ayarlar.
     *
     * @param kind yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public NotificationsListParams setKind(String kind) {
        this.kind = kind;
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
    public NotificationsListParams setStatus(String status) {
        this.status = status;
        return this;
    }

    /** @return "sort" değeri */
    public String getSort() {
        return sort;
    }

    /**
     * "sort" değerini ayarlar.
     *
     * @param sort yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public NotificationsListParams setSort(String sort) {
        this.sort = sort;
        return this;
    }

    /** @return bu parametrelerin sığ kopyası */
    public NotificationsListParams copy() {
        NotificationsListParams copy = new NotificationsListParams();
        copy.limit = limit;
        copy.cursor = cursor;
        copy.source = source;
        copy.kind = kind;
        copy.status = status;
        copy.sort = sort;
        return copy;
    }
}
