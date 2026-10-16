// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package io.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * FunnelBodyDtoStepsItemWhere şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class FunnelBodyDtoStepsItemWhere {
    /**
     * Zorunlu.
     */
    @JsonProperty("key")
    private String key;

    /**
     * Zorunlu.
     */
    @JsonProperty("value")
    private String value;

    public String getKey() {
        return key;
    }

    public FunnelBodyDtoStepsItemWhere key(String key) {
        this.key = key;
        return this;
    }

    public String getValue() {
        return value;
    }

    public FunnelBodyDtoStepsItemWhere value(String value) {
        this.value = value;
        return this;
    }

    @Override
    public String toString() {
        return io.pushizo.core.Json.stringify(this);
    }
}
