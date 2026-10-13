// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package io.herosignal.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * UsageReportAppsItem şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class UsageReportAppsItem {
    /**
     * Zorunlu.
     */
    @JsonProperty("app_id")
    private String appId;

    /**
     * Zorunlu.
     */
    @JsonProperty("name")
    private String name;

    /**
     * Zorunlu.
     */
    @JsonProperty("messages_sent")
    private Double messagesSent;

    /**
     * Zorunlu.
     */
    @JsonProperty("active_subscriptions")
    private Double activeSubscriptions;

    /**
     * Zorunlu.
     */
    @JsonProperty("mau")
    private Double mau;

    public String getAppId() {
        return appId;
    }

    public UsageReportAppsItem appId(String appId) {
        this.appId = appId;
        return this;
    }

    public String getName() {
        return name;
    }

    public UsageReportAppsItem name(String name) {
        this.name = name;
        return this;
    }

    public Double getMessagesSent() {
        return messagesSent;
    }

    public UsageReportAppsItem messagesSent(Double messagesSent) {
        this.messagesSent = messagesSent;
        return this;
    }

    public Double getActiveSubscriptions() {
        return activeSubscriptions;
    }

    public UsageReportAppsItem activeSubscriptions(Double activeSubscriptions) {
        this.activeSubscriptions = activeSubscriptions;
        return this;
    }

    public Double getMau() {
        return mau;
    }

    public UsageReportAppsItem mau(Double mau) {
        this.mau = mau;
        return this;
    }

    @Override
    public String toString() {
        return io.herosignal.core.Json.stringify(this);
    }
}
