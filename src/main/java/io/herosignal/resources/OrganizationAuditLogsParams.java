// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.
package io.herosignal.resources;
/**
 * OrganizationResource.auditLogs için isteğe bağlı sorgu parametreleri.
 */
public final class OrganizationAuditLogsParams {

    /** "limit" sorgu parametresi. */
    private Long limit;

    /** "cursor" sorgu parametresi. */
    private String cursor;

    /** "action" sorgu parametresi. */
    private String action;

    /** "actor_id" sorgu parametresi. */
    private String actorId;

    /** "app_id" sorgu parametresi. */
    private String appId;

    /** "from" sorgu parametresi. */
    private String from;

    /** "to" sorgu parametresi. */
    private String to;

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
    public OrganizationAuditLogsParams setLimit(Long limit) {
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
    public OrganizationAuditLogsParams setCursor(String cursor) {
        this.cursor = cursor;
        return this;
    }

    /** @return "action" değeri */
    public String getAction() {
        return action;
    }

    /**
     * "action" değerini ayarlar.
     *
     * @param action yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public OrganizationAuditLogsParams setAction(String action) {
        this.action = action;
        return this;
    }

    /** @return "actor_id" değeri */
    public String getActorId() {
        return actorId;
    }

    /**
     * "actor_id" değerini ayarlar.
     *
     * @param actorId yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public OrganizationAuditLogsParams setActorId(String actorId) {
        this.actorId = actorId;
        return this;
    }

    /** @return "app_id" değeri */
    public String getAppId() {
        return appId;
    }

    /**
     * "app_id" değerini ayarlar.
     *
     * @param appId yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public OrganizationAuditLogsParams setAppId(String appId) {
        this.appId = appId;
        return this;
    }

    /** @return "from" değeri */
    public String getFrom() {
        return from;
    }

    /**
     * "from" değerini ayarlar.
     *
     * @param from yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public OrganizationAuditLogsParams setFrom(String from) {
        this.from = from;
        return this;
    }

    /** @return "to" değeri */
    public String getTo() {
        return to;
    }

    /**
     * "to" değerini ayarlar.
     *
     * @param to yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public OrganizationAuditLogsParams setTo(String to) {
        this.to = to;
        return this;
    }

    /** @return bu parametrelerin sığ kopyası */
    public OrganizationAuditLogsParams copy() {
        OrganizationAuditLogsParams copy = new OrganizationAuditLogsParams();
        copy.limit = limit;
        copy.cursor = cursor;
        copy.action = action;
        copy.actorId = actorId;
        copy.appId = appId;
        copy.from = from;
        copy.to = to;
        return copy;
    }
}
