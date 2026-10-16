// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package io.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * FunnelBodyDtoStepsItem şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class FunnelBodyDtoStepsItem {
    /**
     * Zorunlu.
     */
    @JsonProperty("name")
    private String name;

    @JsonProperty("where")
    private FunnelBodyDtoStepsItemWhere where;

    public String getName() {
        return name;
    }

    public FunnelBodyDtoStepsItem name(String name) {
        this.name = name;
        return this;
    }

    public FunnelBodyDtoStepsItemWhere getWhere() {
        return where;
    }

    public FunnelBodyDtoStepsItem where(FunnelBodyDtoStepsItemWhere where) {
        this.where = where;
        return this;
    }

    @Override
    public String toString() {
        return io.pushizo.core.Json.stringify(this);
    }
}
