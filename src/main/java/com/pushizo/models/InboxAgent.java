// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package com.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * InboxAgent şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class InboxAgent {
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
    @JsonProperty("email")
    private String email;

    /**
     * Zorunlu.
     */
    @JsonProperty("role")
    private String role;

    /**
     * Zorunlu. Değerler: "online", "busy", "offline".
     */
    @JsonProperty("status")
    private String status;

    /**
     * Zorunlu.
     */
    @JsonProperty("last_heartbeat_at")
    private String lastHeartbeatAt;

    /**
     * Zorunlu.
     */
    @JsonProperty("max_concurrent")
    private Long maxConcurrent;

    /**
     * Zorunlu.
     */
    @JsonProperty("languages")
    private java.util.List<String> languages;

    /**
     * Zorunlu.
     */
    @JsonProperty("open_conversations")
    private Long openConversations;

    /**
     * Zorunlu.
     */
    @JsonProperty("team_ids")
    private java.util.List<String> teamIds;

    public String getAccountId() {
        return accountId;
    }

    public InboxAgent accountId(String accountId) {
        this.accountId = accountId;
        return this;
    }

    public String getName() {
        return name;
    }

    public InboxAgent name(String name) {
        this.name = name;
        return this;
    }

    public String getEmail() {
        return email;
    }

    public InboxAgent email(String email) {
        this.email = email;
        return this;
    }

    public String getRole() {
        return role;
    }

    public InboxAgent role(String role) {
        this.role = role;
        return this;
    }

    public String getStatus() {
        return status;
    }

    public InboxAgent status(String status) {
        this.status = status;
        return this;
    }

    public String getLastHeartbeatAt() {
        return lastHeartbeatAt;
    }

    public InboxAgent lastHeartbeatAt(String lastHeartbeatAt) {
        this.lastHeartbeatAt = lastHeartbeatAt;
        return this;
    }

    public Long getMaxConcurrent() {
        return maxConcurrent;
    }

    public InboxAgent maxConcurrent(Long maxConcurrent) {
        this.maxConcurrent = maxConcurrent;
        return this;
    }

    public java.util.List<String> getLanguages() {
        return languages;
    }

    public InboxAgent languages(java.util.List<String> languages) {
        this.languages = languages;
        return this;
    }

    public Long getOpenConversations() {
        return openConversations;
    }

    public InboxAgent openConversations(Long openConversations) {
        this.openConversations = openConversations;
        return this;
    }

    public java.util.List<String> getTeamIds() {
        return teamIds;
    }

    public InboxAgent teamIds(java.util.List<String> teamIds) {
        this.teamIds = teamIds;
        return this;
    }

    @Override
    public String toString() {
        return com.pushizo.core.Json.stringify(this);
    }
}
