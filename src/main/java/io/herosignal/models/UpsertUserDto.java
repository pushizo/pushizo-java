// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.
package io.herosignal.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import java.util.Map;
/** UpsertUserDto şeması (api/openapi.yaml). */
public final class UpsertUserDto {

    /** "identity" alanı. */
    @JsonProperty("identity")
    private Object identity;

    /** "external_id" alanı. */
    @JsonProperty("external_id")
    private String externalId;

    /** "properties" alanı. */
    @JsonProperty("properties")
    private Map<String, Object> properties;

    /** "tags" alanı. */
    @JsonProperty("tags")
    private Map<String, String> tags;

    /** "subscriptions" alanı. */
    @JsonProperty("subscriptions")
    private List<AddSubscriptionDto> subscriptions;

    /** @return "identity" alanı */
    public Object getIdentity() {
        return identity;
    }

    /**
     * "identity" alanını ayarlar.
     *
     * @param identity yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public UpsertUserDto setIdentity(Object identity) {
        this.identity = identity;
        return this;
    }

    /** @return "external_id" alanı */
    public String getExternalId() {
        return externalId;
    }

    /**
     * "external_id" alanını ayarlar.
     *
     * @param externalId yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public UpsertUserDto setExternalId(String externalId) {
        this.externalId = externalId;
        return this;
    }

    /** @return "properties" alanı */
    public Map<String, Object> getProperties() {
        return properties;
    }

    /**
     * "properties" alanını ayarlar.
     *
     * @param properties yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public UpsertUserDto setProperties(Map<String, Object> properties) {
        this.properties = properties;
        return this;
    }

    /** @return "tags" alanı */
    public Map<String, String> getTags() {
        return tags;
    }

    /**
     * "tags" alanını ayarlar.
     *
     * @param tags yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public UpsertUserDto setTags(Map<String, String> tags) {
        this.tags = tags;
        return this;
    }

    /** @return "subscriptions" alanı */
    public List<AddSubscriptionDto> getSubscriptions() {
        return subscriptions;
    }

    /**
     * "subscriptions" alanını ayarlar.
     *
     * @param subscriptions yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public UpsertUserDto setSubscriptions(List<AddSubscriptionDto> subscriptions) {
        this.subscriptions = subscriptions;
        return this;
    }
}
