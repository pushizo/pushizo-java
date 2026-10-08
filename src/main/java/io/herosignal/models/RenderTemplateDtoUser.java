// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.
package io.herosignal.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;
/** RenderTemplateDtoUser şeması (api/openapi.yaml). */
public final class RenderTemplateDtoUser {

    /** "external_id" alanı. */
    @JsonProperty("external_id")
    private String externalId;

    /** "tags" alanı. */
    @JsonProperty("tags")
    private Map<String, String> tags;

    /** "properties" alanı. */
    @JsonProperty("properties")
    private Map<String, Object> properties;

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
    public RenderTemplateDtoUser setExternalId(String externalId) {
        this.externalId = externalId;
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
    public RenderTemplateDtoUser setTags(Map<String, String> tags) {
        this.tags = tags;
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
    public RenderTemplateDtoUser setProperties(Map<String, Object> properties) {
        this.properties = properties;
        return this;
    }
}
