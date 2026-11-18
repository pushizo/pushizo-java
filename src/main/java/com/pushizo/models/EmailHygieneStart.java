// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package com.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * EmailHygieneStart şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class EmailHygieneStart {
    /**
     * Zorunlu.
     */
    @JsonProperty("run")
    private EmailHygieneRun run;

    /**
     * Zorunlu.
     */
    @JsonProperty("created")
    private Boolean created;

    public EmailHygieneRun getRun() {
        return run;
    }

    public EmailHygieneStart run(EmailHygieneRun run) {
        this.run = run;
        return this;
    }

    public Boolean getCreated() {
        return created;
    }

    public EmailHygieneStart created(Boolean created) {
        this.created = created;
        return this;
    }

    @Override
    public String toString() {
        return com.pushizo.core.Json.stringify(this);
    }
}
