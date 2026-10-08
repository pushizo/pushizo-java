// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.
package io.herosignal.resources;
/**
 * UsersResource.listInbox için isteğe bağlı sorgu parametreleri.
 */
public final class UsersListInboxParams {

    /** "limit" sorgu parametresi. */
    private Long limit;

    /** "cursor" sorgu parametresi. */
    private String cursor;

    /** "include_archived" sorgu parametresi. Değerler: "true", "false". */
    private String includeArchived;

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
    public UsersListInboxParams setLimit(Long limit) {
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
    public UsersListInboxParams setCursor(String cursor) {
        this.cursor = cursor;
        return this;
    }

    /** @return "include_archived" değeri */
    public String getIncludeArchived() {
        return includeArchived;
    }

    /**
     * "include_archived" değerini ayarlar.
     *
     * @param includeArchived yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public UsersListInboxParams setIncludeArchived(String includeArchived) {
        this.includeArchived = includeArchived;
        return this;
    }

    /** @return bu parametrelerin sığ kopyası */
    public UsersListInboxParams copy() {
        UsersListInboxParams copy = new UsersListInboxParams();
        copy.limit = limit;
        copy.cursor = cursor;
        copy.includeArchived = includeArchived;
        return copy;
    }
}
