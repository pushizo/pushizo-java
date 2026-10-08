// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.
package io.herosignal.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;
/** UserExportEventsItem şeması (api/openapi.yaml). */
public final class UserExportEventsItem {

    /** "id" alanı. Zorunlu. */
    @JsonProperty("id")
    private String id;

    /** "user_id" alanı. Zorunlu. */
    @JsonProperty("user_id")
    private String userId;

    /** "subscription_id" alanı. Zorunlu. */
    @JsonProperty("subscription_id")
    private String subscriptionId;

    /** "name" alanı. Zorunlu. */
    @JsonProperty("name")
    private String name;

    /** "properties" alanı. Zorunlu. */
    @JsonProperty("properties")
    private Map<String, Object> properties;

    /** "value" alanı. Zorunlu. */
    @JsonProperty("value")
    private Double value;

    /** "source" alanı. Zorunlu. Değerler: "sdk", "api", "system", "import". */
    @JsonProperty("source")
    private String source;

    /** "occurred_at" alanı. Zorunlu. */
    @JsonProperty("occurred_at")
    private String occurredAt;

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
    public UserExportEventsItem setId(String id) {
        this.id = id;
        return this;
    }

    /** @return "user_id" alanı */
    public String getUserId() {
        return userId;
    }

    /**
     * "user_id" alanını ayarlar.
     *
     * @param userId yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public UserExportEventsItem setUserId(String userId) {
        this.userId = userId;
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
    public UserExportEventsItem setSubscriptionId(String subscriptionId) {
        this.subscriptionId = subscriptionId;
        return this;
    }

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
    public UserExportEventsItem setName(String name) {
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
    public UserExportEventsItem setProperties(Map<String, Object> properties) {
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
    public UserExportEventsItem setValue(Double value) {
        this.value = value;
        return this;
    }

    /** @return "source" alanı */
    public String getSource() {
        return source;
    }

    /**
     * "source" alanını ayarlar.
     *
     * @param source yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public UserExportEventsItem setSource(String source) {
        this.source = source;
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
    public UserExportEventsItem setOccurredAt(String occurredAt) {
        this.occurredAt = occurredAt;
        return this;
    }
}
