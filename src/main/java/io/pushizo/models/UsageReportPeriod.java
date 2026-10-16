// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package io.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * UsageReportPeriod şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class UsageReportPeriod {
    /**
     * Zorunlu.
     */
    @JsonProperty("start")
    private String start;

    /**
     * Zorunlu.
     */
    @JsonProperty("end")
    private String end;

    public String getStart() {
        return start;
    }

    public UsageReportPeriod start(String start) {
        this.start = start;
        return this;
    }

    public String getEnd() {
        return end;
    }

    public UsageReportPeriod end(String end) {
        this.end = end;
        return this;
    }

    @Override
    public String toString() {
        return io.pushizo.core.Json.stringify(this);
    }
}
