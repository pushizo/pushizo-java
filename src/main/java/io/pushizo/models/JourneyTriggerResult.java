// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package io.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * JourneyTriggerResult şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class JourneyTriggerResult {
    /**
     * Zorunlu.
     */
    @JsonProperty("entered")
    private Boolean entered;

    /**
     * Zorunlu.
     */
    @JsonProperty("run")
    private JourneyRun run;

    /**
     * Zorunlu. Değerler: "inactive", "outside_schedule", "re_entry", "already_active", "unknown_user".
     */
    @JsonProperty("reason")
    private String reason;

    public Boolean getEntered() {
        return entered;
    }

    public JourneyTriggerResult entered(Boolean entered) {
        this.entered = entered;
        return this;
    }

    public JourneyRun getRun() {
        return run;
    }

    public JourneyTriggerResult run(JourneyRun run) {
        this.run = run;
        return this;
    }

    public String getReason() {
        return reason;
    }

    public JourneyTriggerResult reason(String reason) {
        this.reason = reason;
        return this;
    }

    @Override
    public String toString() {
        return io.pushizo.core.Json.stringify(this);
    }
}
