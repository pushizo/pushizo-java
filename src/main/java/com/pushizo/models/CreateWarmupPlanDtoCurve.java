// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package com.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * CreateWarmupPlanDtoCurve şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class CreateWarmupPlanDtoCurve {
    /**
     * Zorunlu.
     */
    @JsonProperty("start")
    private Long start;

    /**
     * Zorunlu.
     */
    @JsonProperty("growth")
    private Double growth;

    /**
     * Zorunlu.
     */
    @JsonProperty("target")
    private Long target;

    public Long getStart() {
        return start;
    }

    public CreateWarmupPlanDtoCurve start(Long start) {
        this.start = start;
        return this;
    }

    public Double getGrowth() {
        return growth;
    }

    public CreateWarmupPlanDtoCurve growth(Double growth) {
        this.growth = growth;
        return this;
    }

    public Long getTarget() {
        return target;
    }

    public CreateWarmupPlanDtoCurve target(Long target) {
        this.target = target;
        return this;
    }

    @Override
    public String toString() {
        return com.pushizo.core.Json.stringify(this);
    }
}
