// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.
package io.herosignal.models;

import com.fasterxml.jackson.annotation.JsonProperty;
/** Import şeması (api/openapi.yaml). */
public final class Import {

    /** "id" alanı. Zorunlu. */
    @JsonProperty("id")
    private String id;

    /** "app_id" alanı. Zorunlu. */
    @JsonProperty("app_id")
    private String appId;

    /** "type" alanı. Zorunlu. Değerler: "eski sağlayıcı_players", "csv_users". */
    @JsonProperty("type")
    private String type;

    /** "file_name" alanı. Zorunlu. */
    @JsonProperty("file_name")
    private String fileName;

    /** "status" alanı. Zorunlu. Değerler: "pending", "running", "completed", "failed". */
    @JsonProperty("status")
    private String status;

    /** "stats" alanı. Zorunlu. */
    @JsonProperty("stats")
    private ImportStats stats;

    /** "error" alanı. Zorunlu. */
    @JsonProperty("error")
    private String error;

    /** "error_report_url" alanı. Zorunlu. */
    @JsonProperty("error_report_url")
    private String errorReportUrl;

    /** "requested_by" alanı. Zorunlu. */
    @JsonProperty("requested_by")
    private String requestedBy;

    /** "created_at" alanı. Zorunlu. */
    @JsonProperty("created_at")
    private String createdAt;

    /** "completed_at" alanı. Zorunlu. */
    @JsonProperty("completed_at")
    private String completedAt;

    /** @return "id" alanı */
    public String getId() {
        return id;
    }

    /**
     * "id" alanını ayarlar.
     *
     * @param id yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public Import setId(String id) {
        this.id = id;
        return this;
    }

    /** @return "app_id" alanı */
    public String getAppId() {
        return appId;
    }

    /**
     * "app_id" alanını ayarlar.
     *
     * @param appId yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public Import setAppId(String appId) {
        this.appId = appId;
        return this;
    }

    /** @return "type" alanı */
    public String getType() {
        return type;
    }

    /**
     * "type" alanını ayarlar.
     *
     * @param type yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public Import setType(String type) {
        this.type = type;
        return this;
    }

    /** @return "file_name" alanı */
    public String getFileName() {
        return fileName;
    }

    /**
     * "file_name" alanını ayarlar.
     *
     * @param fileName yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public Import setFileName(String fileName) {
        this.fileName = fileName;
        return this;
    }

    /** @return "status" alanı */
    public String getStatus() {
        return status;
    }

    /**
     * "status" alanını ayarlar.
     *
     * @param status yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public Import setStatus(String status) {
        this.status = status;
        return this;
    }

    /** @return "stats" alanı */
    public ImportStats getStats() {
        return stats;
    }

    /**
     * "stats" alanını ayarlar.
     *
     * @param stats yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public Import setStats(ImportStats stats) {
        this.stats = stats;
        return this;
    }

    /** @return "error" alanı */
    public String getError() {
        return error;
    }

    /**
     * "error" alanını ayarlar.
     *
     * @param error yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public Import setError(String error) {
        this.error = error;
        return this;
    }

    /** @return "error_report_url" alanı */
    public String getErrorReportUrl() {
        return errorReportUrl;
    }

    /**
     * "error_report_url" alanını ayarlar.
     *
     * @param errorReportUrl yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public Import setErrorReportUrl(String errorReportUrl) {
        this.errorReportUrl = errorReportUrl;
        return this;
    }

    /** @return "requested_by" alanı */
    public String getRequestedBy() {
        return requestedBy;
    }

    /**
     * "requested_by" alanını ayarlar.
     *
     * @param requestedBy yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public Import setRequestedBy(String requestedBy) {
        this.requestedBy = requestedBy;
        return this;
    }

    /** @return "created_at" alanı */
    public String getCreatedAt() {
        return createdAt;
    }

    /**
     * "created_at" alanını ayarlar.
     *
     * @param createdAt yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public Import setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /** @return "completed_at" alanı */
    public String getCompletedAt() {
        return completedAt;
    }

    /**
     * "completed_at" alanını ayarlar.
     *
     * @param completedAt yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public Import setCompletedAt(String completedAt) {
        this.completedAt = completedAt;
        return this;
    }
}
