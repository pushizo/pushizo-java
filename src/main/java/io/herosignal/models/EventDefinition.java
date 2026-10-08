// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.
package io.herosignal.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;
/** EventDefinition şeması (api/openapi.yaml). */
public final class EventDefinition {

    /** "id" alanı. Zorunlu. */
    @JsonProperty("id")
    private String id;

    /** "app_id" alanı. Zorunlu. */
    @JsonProperty("app_id")
    private String appId;

    /** "name" alanı. Zorunlu. */
    @JsonProperty("name")
    private String name;

    /** "display_name" alanı. Zorunlu. */
    @JsonProperty("display_name")
    private String displayName;

    /** "properties_schema" alanı. Zorunlu. */
    @JsonProperty("properties_schema")
    private Map<String, String> propertiesSchema;

    /** "is_conversion" alanı. Zorunlu. */
    @JsonProperty("is_conversion")
    private Boolean isConversion;

    /** "first_seen_at" alanı. Zorunlu. */
    @JsonProperty("first_seen_at")
    private String firstSeenAt;

    /** "last_seen_at" alanı. Zorunlu. */
    @JsonProperty("last_seen_at")
    private String lastSeenAt;

    /** "count_30d" alanı. Zorunlu. */
    @JsonProperty("count_30d")
    private Long count30d;

    /** "created_at" alanı. Zorunlu. */
    @JsonProperty("created_at")
    private String createdAt;

    /** "updated_at" alanı. Zorunlu. */
    @JsonProperty("updated_at")
    private String updatedAt;

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
    public EventDefinition setId(String id) {
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
    public EventDefinition setAppId(String appId) {
        this.appId = appId;
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
    public EventDefinition setName(String name) {
        this.name = name;
        return this;
    }

    /** @return "display_name" alanı */
    public String getDisplayName() {
        return displayName;
    }

    /**
     * "display_name" alanını ayarlar.
     *
     * @param displayName yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public EventDefinition setDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }

    /** @return "properties_schema" alanı */
    public Map<String, String> getPropertiesSchema() {
        return propertiesSchema;
    }

    /**
     * "properties_schema" alanını ayarlar.
     *
     * @param propertiesSchema yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public EventDefinition setPropertiesSchema(Map<String, String> propertiesSchema) {
        this.propertiesSchema = propertiesSchema;
        return this;
    }

    /** @return "is_conversion" alanı */
    public Boolean getIsConversion() {
        return isConversion;
    }

    /**
     * "is_conversion" alanını ayarlar.
     *
     * @param isConversion yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public EventDefinition setIsConversion(Boolean isConversion) {
        this.isConversion = isConversion;
        return this;
    }

    /** @return "first_seen_at" alanı */
    public String getFirstSeenAt() {
        return firstSeenAt;
    }

    /**
     * "first_seen_at" alanını ayarlar.
     *
     * @param firstSeenAt yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public EventDefinition setFirstSeenAt(String firstSeenAt) {
        this.firstSeenAt = firstSeenAt;
        return this;
    }

    /** @return "last_seen_at" alanı */
    public String getLastSeenAt() {
        return lastSeenAt;
    }

    /**
     * "last_seen_at" alanını ayarlar.
     *
     * @param lastSeenAt yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public EventDefinition setLastSeenAt(String lastSeenAt) {
        this.lastSeenAt = lastSeenAt;
        return this;
    }

    /** @return "count_30d" alanı */
    public Long getCount30d() {
        return count30d;
    }

    /**
     * "count_30d" alanını ayarlar.
     *
     * @param count30d yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public EventDefinition setCount30d(Long count30d) {
        this.count30d = count30d;
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
    public EventDefinition setCreatedAt(String createdAt) {
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
    public EventDefinition setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }
}
