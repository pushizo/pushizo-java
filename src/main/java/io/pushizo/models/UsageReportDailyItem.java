// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package io.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * UsageReportDailyItem şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class UsageReportDailyItem {
    /**
     * Zorunlu.
     */
    @JsonProperty("date")
    private String date;

    /**
     * Zorunlu.
     */
    @JsonProperty("messages_sent")
    private Double messagesSent;

    /**
     * Zorunlu.
     */
    @JsonProperty("api_requests")
    private Double apiRequests;

    /**
     * Zorunlu.
     */
    @JsonProperty("events_ingested")
    private Double eventsIngested;

    public String getDate() {
        return date;
    }

    public UsageReportDailyItem date(String date) {
        this.date = date;
        return this;
    }

    public Double getMessagesSent() {
        return messagesSent;
    }

    public UsageReportDailyItem messagesSent(Double messagesSent) {
        this.messagesSent = messagesSent;
        return this;
    }

    public Double getApiRequests() {
        return apiRequests;
    }

    public UsageReportDailyItem apiRequests(Double apiRequests) {
        this.apiRequests = apiRequests;
        return this;
    }

    public Double getEventsIngested() {
        return eventsIngested;
    }

    public UsageReportDailyItem eventsIngested(Double eventsIngested) {
        this.eventsIngested = eventsIngested;
        return this;
    }

    @Override
    public String toString() {
        return io.pushizo.core.Json.stringify(this);
    }
}
