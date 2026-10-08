// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.
package io.herosignal.models;

import com.fasterxml.jackson.annotation.JsonProperty;
/** ImportStats şeması (api/openapi.yaml). */
public final class ImportStats {

    /** "processed" alanı. */
    @JsonProperty("processed")
    private Long processed;

    /** "created_users" alanı. */
    @JsonProperty("created_users")
    private Long createdUsers;

    /** "updated_users" alanı. */
    @JsonProperty("updated_users")
    private Long updatedUsers;

    /** "created_subscriptions" alanı. */
    @JsonProperty("created_subscriptions")
    private Long createdSubscriptions;

    /** "skipped" alanı. */
    @JsonProperty("skipped")
    private Long skipped;

    /** "errors" alanı. */
    @JsonProperty("errors")
    private Long errors;

    /** @return "processed" alanı */
    public Long getProcessed() {
        return processed;
    }

    /**
     * "processed" alanını ayarlar.
     *
     * @param processed yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public ImportStats setProcessed(Long processed) {
        this.processed = processed;
        return this;
    }

    /** @return "created_users" alanı */
    public Long getCreatedUsers() {
        return createdUsers;
    }

    /**
     * "created_users" alanını ayarlar.
     *
     * @param createdUsers yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public ImportStats setCreatedUsers(Long createdUsers) {
        this.createdUsers = createdUsers;
        return this;
    }

    /** @return "updated_users" alanı */
    public Long getUpdatedUsers() {
        return updatedUsers;
    }

    /**
     * "updated_users" alanını ayarlar.
     *
     * @param updatedUsers yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public ImportStats setUpdatedUsers(Long updatedUsers) {
        this.updatedUsers = updatedUsers;
        return this;
    }

    /** @return "created_subscriptions" alanı */
    public Long getCreatedSubscriptions() {
        return createdSubscriptions;
    }

    /**
     * "created_subscriptions" alanını ayarlar.
     *
     * @param createdSubscriptions yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public ImportStats setCreatedSubscriptions(Long createdSubscriptions) {
        this.createdSubscriptions = createdSubscriptions;
        return this;
    }

    /** @return "skipped" alanı */
    public Long getSkipped() {
        return skipped;
    }

    /**
     * "skipped" alanını ayarlar.
     *
     * @param skipped yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public ImportStats setSkipped(Long skipped) {
        this.skipped = skipped;
        return this;
    }

    /** @return "errors" alanı */
    public Long getErrors() {
        return errors;
    }

    /**
     * "errors" alanını ayarlar.
     *
     * @param errors yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public ImportStats setErrors(Long errors) {
        this.errors = errors;
        return this;
    }
}
