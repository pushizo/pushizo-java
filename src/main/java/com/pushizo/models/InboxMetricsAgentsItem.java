// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package com.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * InboxMetricsAgentsItem şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class InboxMetricsAgentsItem {
    /**
     * Zorunlu.
     */
    @JsonProperty("account_id")
    private String accountId;

    /**
     * Zorunlu.
     */
    @JsonProperty("name")
    private String name;

    /**
     * Zorunlu.
     */
    @JsonProperty("first_response")
    private InboxMetricsAgentsItemFirstResponse firstResponse;

    /**
     * Zorunlu.
     */
    @JsonProperty("resolution")
    private InboxMetricsAgentsItemResolution resolution;

    /**
     * Zorunlu.
     */
    @JsonProperty("resolved")
    private Long resolved;

    /**
     * Zorunlu.
     */
    @JsonProperty("open_now")
    private Long openNow;

    public String getAccountId() {
        return accountId;
    }

    public InboxMetricsAgentsItem accountId(String accountId) {
        this.accountId = accountId;
        return this;
    }

    public String getName() {
        return name;
    }

    public InboxMetricsAgentsItem name(String name) {
        this.name = name;
        return this;
    }

    public InboxMetricsAgentsItemFirstResponse getFirstResponse() {
        return firstResponse;
    }

    public InboxMetricsAgentsItem firstResponse(InboxMetricsAgentsItemFirstResponse firstResponse) {
        this.firstResponse = firstResponse;
        return this;
    }

    public InboxMetricsAgentsItemResolution getResolution() {
        return resolution;
    }

    public InboxMetricsAgentsItem resolution(InboxMetricsAgentsItemResolution resolution) {
        this.resolution = resolution;
        return this;
    }

    public Long getResolved() {
        return resolved;
    }

    public InboxMetricsAgentsItem resolved(Long resolved) {
        this.resolved = resolved;
        return this;
    }

    public Long getOpenNow() {
        return openNow;
    }

    public InboxMetricsAgentsItem openNow(Long openNow) {
        this.openNow = openNow;
        return this;
    }

    @Override
    public String toString() {
        return com.pushizo.core.Json.stringify(this);
    }
}
