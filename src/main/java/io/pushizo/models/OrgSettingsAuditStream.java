// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package io.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * OrgSettingsAuditStream şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class OrgSettingsAuditStream {
    @JsonProperty("s3")
    private Boolean s3;

    @JsonProperty("webhookAppId")
    private String webhookAppId;

    public Boolean getS3() {
        return s3;
    }

    public OrgSettingsAuditStream s3(Boolean s3) {
        this.s3 = s3;
        return this;
    }

    public String getWebhookAppId() {
        return webhookAppId;
    }

    public OrgSettingsAuditStream webhookAppId(String webhookAppId) {
        this.webhookAppId = webhookAppId;
        return this;
    }

    @Override
    public String toString() {
        return io.pushizo.core.Json.stringify(this);
    }
}
