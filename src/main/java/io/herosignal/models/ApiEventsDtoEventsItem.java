// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.
package io.herosignal.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;
/** ApiEventsDtoEventsItem şeması (api/openapi.yaml). */
public final class ApiEventsDtoEventsItem {

    /** "name" alanı. Zorunlu. */
    @JsonProperty("name")
    private String name;

    /** "properties" alanı. */
    @JsonProperty("properties")
    private Map<String, Object> properties;

    /** "value" alanı. */
    @JsonProperty("value")
    private Double value;

    /** "occurred_at" alanı. */
    @JsonProperty("occurred_at")
    private String occurredAt;

    /** "subscription_id" alanı. */
    @JsonProperty("subscription_id")
    private String subscriptionId;

    /** "external_id" alanı. */
    @JsonProperty("external_id")
    private String externalId;

    /** @return "name" alanı */
    public String getName() {
        return name;
    }

    /**
     * "name" alanını ayarlar.
     *
     * @param name yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public ApiEventsDtoEventsItem setName(String name) {
        this.name = name;
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
    public ApiEventsDtoEventsItem setProperties(Map<String, Object> properties) {
        this.properties = properties;
        return this;
    }

    /** @return "value" alanı */
    public Double getValue() {
        return value;
    }

    /**
     * "value" alanını ayarlar.
     *
     * @param value yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public ApiEventsDtoEventsItem setValue(Double value) {
        this.value = value;
        return this;
    }

    /** @return "occurred_at" alanı */
    public String getOccurredAt() {
        return occurredAt;
    }

    /**
     * "occurred_at" alanını ayarlar.
     *
     * @param occurredAt yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public ApiEventsDtoEventsItem setOccurredAt(String occurredAt) {
        this.occurredAt = occurredAt;
        return this;
    }

    /** @return "subscription_id" alanı */
    public String getSubscriptionId() {
        return subscriptionId;
    }

    /**
     * "subscription_id" alanını ayarlar.
     *
     * @param subscriptionId yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public ApiEventsDtoEventsItem setSubscriptionId(String subscriptionId) {
        this.subscriptionId = subscriptionId;
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
    public ApiEventsDtoEventsItem setExternalId(String externalId) {
        this.externalId = externalId;
        return this;
    }
}
