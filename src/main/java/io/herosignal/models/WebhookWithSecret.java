// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.
package io.herosignal.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
/** WebhookWithSecret şeması (api/openapi.yaml). */
public final class WebhookWithSecret {

    /** "id" alanı. Zorunlu. */
    @JsonProperty("id")
    private String id;

    /** "app_id" alanı. Zorunlu. */
    @JsonProperty("app_id")
    private String appId;

    /** "url" alanı. Zorunlu. */
    @JsonProperty("url")
    private String url;

    /** "description" alanı. Zorunlu. */
    @JsonProperty("description")
    private String description;

    /** "events" alanı. Zorunlu. */
    @JsonProperty("events")
    private List<String> events;

    /** "event_filters" alanı. Zorunlu. */
    @JsonProperty("event_filters")
    private WebhookWithSecretEventFilters eventFilters;

    /** "batch" alanı. Zorunlu. */
    @JsonProperty("batch")
    private Boolean batch;

    /** "status" alanı. Zorunlu. Değerler: "active", "failing", "disabled". */
    @JsonProperty("status")
    private String status;

    /** "disabled_reason" alanı. Zorunlu. */
    @JsonProperty("disabled_reason")
    private String disabledReason;

    /** "failure_count" alanı. Zorunlu. */
    @JsonProperty("failure_count")
    private Long failureCount;

    /** "failing_since" alanı. Zorunlu. */
    @JsonProperty("failing_since")
    private String failingSince;

    /** "last_success_at" alanı. Zorunlu. */
    @JsonProperty("last_success_at")
    private String lastSuccessAt;

    /** "last_failure_at" alanı. Zorunlu. */
    @JsonProperty("last_failure_at")
    private String lastFailureAt;

    /** "header_names" alanı. Zorunlu. */
    @JsonProperty("header_names")
    private List<String> headerNames;

    /** "previous_secret_expires_at" alanı. Zorunlu. */
    @JsonProperty("previous_secret_expires_at")
    private String previousSecretExpiresAt;

    /** "created_at" alanı. Zorunlu. */
    @JsonProperty("created_at")
    private String createdAt;

    /** "updated_at" alanı. Zorunlu. */
    @JsonProperty("updated_at")
    private String updatedAt;

    /** "secret" alanı. Zorunlu. Yalnızca oluşturma ve rotasyon yanıtında bir kez döner. */
    @JsonProperty("secret")
    private String secret;

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
    public WebhookWithSecret setId(String id) {
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
    public WebhookWithSecret setAppId(String appId) {
        this.appId = appId;
        return this;
    }

    /** @return "url" alanı */
    public String getUrl() {
        return url;
    }

    /**
     * "url" alanını ayarlar.
     *
     * @param url yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public WebhookWithSecret setUrl(String url) {
        this.url = url;
        return this;
    }

    /** @return "description" alanı */
    public String getDescription() {
        return description;
    }

    /**
     * "description" alanını ayarlar.
     *
     * @param description yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public WebhookWithSecret setDescription(String description) {
        this.description = description;
        return this;
    }

    /** @return "events" alanı */
    public List<String> getEvents() {
        return events;
    }

    /**
     * "events" alanını ayarlar.
     *
     * @param events yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public WebhookWithSecret setEvents(List<String> events) {
        this.events = events;
        return this;
    }

    /** @return "event_filters" alanı */
    public WebhookWithSecretEventFilters getEventFilters() {
        return eventFilters;
    }

    /**
     * "event_filters" alanını ayarlar.
     *
     * @param eventFilters yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public WebhookWithSecret setEventFilters(WebhookWithSecretEventFilters eventFilters) {
        this.eventFilters = eventFilters;
        return this;
    }

    /** @return "batch" alanı */
    public Boolean getBatch() {
        return batch;
    }

    /**
     * "batch" alanını ayarlar.
     *
     * @param batch yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public WebhookWithSecret setBatch(Boolean batch) {
        this.batch = batch;
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
    public WebhookWithSecret setStatus(String status) {
        this.status = status;
        return this;
    }

    /** @return "disabled_reason" alanı */
    public String getDisabledReason() {
        return disabledReason;
    }

    /**
     * "disabled_reason" alanını ayarlar.
     *
     * @param disabledReason yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public WebhookWithSecret setDisabledReason(String disabledReason) {
        this.disabledReason = disabledReason;
        return this;
    }

    /** @return "failure_count" alanı */
    public Long getFailureCount() {
        return failureCount;
    }

    /**
     * "failure_count" alanını ayarlar.
     *
     * @param failureCount yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public WebhookWithSecret setFailureCount(Long failureCount) {
        this.failureCount = failureCount;
        return this;
    }

    /** @return "failing_since" alanı */
    public String getFailingSince() {
        return failingSince;
    }

    /**
     * "failing_since" alanını ayarlar.
     *
     * @param failingSince yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public WebhookWithSecret setFailingSince(String failingSince) {
        this.failingSince = failingSince;
        return this;
    }

    /** @return "last_success_at" alanı */
    public String getLastSuccessAt() {
        return lastSuccessAt;
    }

    /**
     * "last_success_at" alanını ayarlar.
     *
     * @param lastSuccessAt yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public WebhookWithSecret setLastSuccessAt(String lastSuccessAt) {
        this.lastSuccessAt = lastSuccessAt;
        return this;
    }

    /** @return "last_failure_at" alanı */
    public String getLastFailureAt() {
        return lastFailureAt;
    }

    /**
     * "last_failure_at" alanını ayarlar.
     *
     * @param lastFailureAt yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public WebhookWithSecret setLastFailureAt(String lastFailureAt) {
        this.lastFailureAt = lastFailureAt;
        return this;
    }

    /** @return "header_names" alanı */
    public List<String> getHeaderNames() {
        return headerNames;
    }

    /**
     * "header_names" alanını ayarlar.
     *
     * @param headerNames yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public WebhookWithSecret setHeaderNames(List<String> headerNames) {
        this.headerNames = headerNames;
        return this;
    }

    /** @return "previous_secret_expires_at" alanı */
    public String getPreviousSecretExpiresAt() {
        return previousSecretExpiresAt;
    }

    /**
     * "previous_secret_expires_at" alanını ayarlar.
     *
     * @param previousSecretExpiresAt yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public WebhookWithSecret setPreviousSecretExpiresAt(String previousSecretExpiresAt) {
        this.previousSecretExpiresAt = previousSecretExpiresAt;
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
    public WebhookWithSecret setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /** @return "updated_at" alanı */
    public String getUpdatedAt() {
        return updatedAt;
    }

    /**
     * "updated_at" alanını ayarlar.
     *
     * @param updatedAt yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public WebhookWithSecret setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    /** @return "secret" alanı */
    public String getSecret() {
        return secret;
    }

    /**
     * "secret" alanını ayarlar.
     *
     * @param secret yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public WebhookWithSecret setSecret(String secret) {
        this.secret = secret;
        return this;
    }
}
