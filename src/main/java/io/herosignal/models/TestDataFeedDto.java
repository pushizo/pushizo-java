// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package io.herosignal.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * TestDataFeedDto şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class TestDataFeedDto {
    @JsonProperty("external_id")
    private String externalId;

    @JsonProperty("user_id")
    private String userId;

    public String getExternalId() {
        return externalId;
    }

    public TestDataFeedDto externalId(String externalId) {
        this.externalId = externalId;
        return this;
    }

    public String getUserId() {
        return userId;
    }

    public TestDataFeedDto userId(String userId) {
        this.userId = userId;
        return this;
    }

    @Override
    public String toString() {
        return io.herosignal.core.Json.stringify(this);
    }
}
