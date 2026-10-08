// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.
package io.herosignal.resources;
/**
 * UsersResource.list için isteğe bağlı sorgu parametreleri.
 */
public final class UsersListParams {

    /** "limit" sorgu parametresi. */
    private Long limit;

    /** "cursor" sorgu parametresi. */
    private String cursor;

    /** "sort" sorgu parametresi. Değerler: "last_active_at", "-last_active_at". */
    private String sort;

    /** "q" sorgu parametresi. */
    private String q;

    /** "tag" sorgu parametresi. */
    private String tag;

    /** "last_active_after" sorgu parametresi. */
    private String lastActiveAfter;

    /** "last_active_before" sorgu parametresi. */
    private String lastActiveBefore;

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
    public UsersListParams setLimit(Long limit) {
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
    public UsersListParams setCursor(String cursor) {
        this.cursor = cursor;
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
    public UsersListParams setSort(String sort) {
        this.sort = sort;
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
    public UsersListParams setQ(String q) {
        this.q = q;
        return this;
    }

    /** @return "tag" değeri */
    public String getTag() {
        return tag;
    }

    /**
     * "tag" değerini ayarlar.
     *
     * @param tag yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public UsersListParams setTag(String tag) {
        this.tag = tag;
        return this;
    }

    /** @return "last_active_after" değeri */
    public String getLastActiveAfter() {
        return lastActiveAfter;
    }

    /**
     * "last_active_after" değerini ayarlar.
     *
     * @param lastActiveAfter yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public UsersListParams setLastActiveAfter(String lastActiveAfter) {
        this.lastActiveAfter = lastActiveAfter;
        return this;
    }

    /** @return "last_active_before" değeri */
    public String getLastActiveBefore() {
        return lastActiveBefore;
    }

    /**
     * "last_active_before" değerini ayarlar.
     *
     * @param lastActiveBefore yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public UsersListParams setLastActiveBefore(String lastActiveBefore) {
        this.lastActiveBefore = lastActiveBefore;
        return this;
    }

    /** @return bu parametrelerin sığ kopyası */
    public UsersListParams copy() {
        UsersListParams copy = new UsersListParams();
        copy.limit = limit;
        copy.cursor = cursor;
        copy.sort = sort;
        copy.q = q;
        copy.tag = tag;
        copy.lastActiveAfter = lastActiveAfter;
        copy.lastActiveBefore = lastActiveBefore;
        return copy;
    }
}
