// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.
package io.herosignal.models;

import com.fasterxml.jackson.annotation.JsonProperty;
/** Export şeması (api/openapi.yaml). */
public final class Export {

    /** "id" alanı. Zorunlu. */
    @JsonProperty("id")
    private String id;

    /** "app_id" alanı. Zorunlu. */
    @JsonProperty("app_id")
    private String appId;

    /** "type" alanı. Zorunlu. Değerler: "users", "subscriptions", "events", "deliveries", "message_events". */
    @JsonProperty("type")
    private String type;

    /** "filters" alanı. Zorunlu. */
    @JsonProperty("filters")
    private ExportFilters filters;

    /** "status" alanı. Zorunlu. Değerler: "pending", "running", "completed", "failed". */
    @JsonProperty("status")
    private String status;

    /** "row_count" alanı. Zorunlu. */
    @JsonProperty("row_count")
    private Long rowCount;

    /** "error" alanı. Zorunlu. */
    @JsonProperty("error")
    private String error;

    /** "download_url" alanı. Zorunlu. */
    @JsonProperty("download_url")
    private String downloadUrl;

    /** "expires_at" alanı. Zorunlu. */
    @JsonProperty("expires_at")
    private String expiresAt;

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
    public Export setId(String id) {
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
    public Export setAppId(String appId) {
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
    public Export setType(String type) {
        this.type = type;
        return this;
    }

    /** @return "filters" alanı */
    public ExportFilters getFilters() {
        return filters;
    }

    /**
     * "filters" alanını ayarlar.
     *
     * @param filters yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public Export setFilters(ExportFilters filters) {
        this.filters = filters;
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
    public Export setStatus(String status) {
        this.status = status;
        return this;
    }

    /** @return "row_count" alanı */
    public Long getRowCount() {
        return rowCount;
    }

    /**
     * "row_count" alanını ayarlar.
     *
     * @param rowCount yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public Export setRowCount(Long rowCount) {
        this.rowCount = rowCount;
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
    public Export setError(String error) {
        this.error = error;
        return this;
    }

    /** @return "download_url" alanı */
    public String getDownloadUrl() {
        return downloadUrl;
    }

    /**
     * "download_url" alanını ayarlar.
     *
     * @param downloadUrl yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public Export setDownloadUrl(String downloadUrl) {
        this.downloadUrl = downloadUrl;
        return this;
    }

    /** @return "expires_at" alanı */
    public String getExpiresAt() {
        return expiresAt;
    }

    /**
     * "expires_at" alanını ayarlar.
     *
     * @param expiresAt yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public Export setExpiresAt(String expiresAt) {
        this.expiresAt = expiresAt;
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
    public Export setRequestedBy(String requestedBy) {
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
    public Export setCreatedAt(String createdAt) {
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
    public Export setCompletedAt(String completedAt) {
        this.completedAt = completedAt;
        return this;
    }
}
