// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package io.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * UserJourneyRuns şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class UserJourneyRuns {
    /**
     * Zorunlu.
     */
    @JsonProperty("data")
    private java.util.List<UserJourneyRunsDataItem> data;

    public java.util.List<UserJourneyRunsDataItem> getData() {
        return data;
    }

    public UserJourneyRuns data(java.util.List<UserJourneyRunsDataItem> data) {
        this.data = data;
        return this;
    }

    @Override
    public String toString() {
        return io.pushizo.core.Json.stringify(this);
    }
}
