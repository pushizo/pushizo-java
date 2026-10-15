// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package io.herosignal.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * LiveActivityTypeList şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class LiveActivityTypeList {
    /**
     * Zorunlu.
     */
    @JsonProperty("data")
    private java.util.List<LiveActivityType> data;

    public java.util.List<LiveActivityType> getData() {
        return data;
    }

    public LiveActivityTypeList data(java.util.List<LiveActivityType> data) {
        this.data = data;
        return this;
    }

    @Override
    public String toString() {
        return io.herosignal.core.Json.stringify(this);
    }
}
