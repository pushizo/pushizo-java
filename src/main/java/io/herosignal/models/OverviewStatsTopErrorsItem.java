// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package io.herosignal.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * OverviewStatsTopErrorsItem şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class OverviewStatsTopErrorsItem {
    /**
     * Zorunlu.
     */
    @JsonProperty("code")
    private String code;

    /**
     * Zorunlu.
     */
    @JsonProperty("count")
    private Long count;

    public String getCode() {
        return code;
    }

    public OverviewStatsTopErrorsItem code(String code) {
        this.code = code;
        return this;
    }

    public Long getCount() {
        return count;
    }

    public OverviewStatsTopErrorsItem count(Long count) {
        this.count = count;
        return this;
    }

    @Override
    public String toString() {
        return io.herosignal.core.Json.stringify(this);
    }
}
