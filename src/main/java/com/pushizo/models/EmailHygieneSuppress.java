// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package com.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * EmailHygieneSuppress şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class EmailHygieneSuppress {
    /**
     * Zorunlu.
     */
    @JsonProperty("suppressed")
    private Long suppressed;

    /**
     * Zorunlu.
     */
    @JsonProperty("run")
    private EmailHygieneRun run;

    public Long getSuppressed() {
        return suppressed;
    }

    public EmailHygieneSuppress suppressed(Long suppressed) {
        this.suppressed = suppressed;
        return this;
    }

    public EmailHygieneRun getRun() {
        return run;
    }

    public EmailHygieneSuppress run(EmailHygieneRun run) {
        this.run = run;
        return this;
    }

    @Override
    public String toString() {
        return com.pushizo.core.Json.stringify(this);
    }
}
