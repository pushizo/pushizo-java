// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package com.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * InboxTeam şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class InboxTeam {
    /**
     * Zorunlu.
     */
    @JsonProperty("id")
    private String id;

    /**
     * Zorunlu.
     */
    @JsonProperty("name")
    private String name;

    /**
     * Zorunlu.
     */
    @JsonProperty("description")
    private String description;

    /**
     * Zorunlu.
     */
    @JsonProperty("member_ids")
    private java.util.List<String> memberIds;

    /**
     * Zorunlu.
     */
    @JsonProperty("created_at")
    private String createdAt;

    /**
     * Zorunlu.
     */
    @JsonProperty("updated_at")
    private String updatedAt;

    public String getId() {
        return id;
    }

    public InboxTeam id(String id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public InboxTeam name(String name) {
        this.name = name;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public InboxTeam description(String description) {
        this.description = description;
        return this;
    }

    public java.util.List<String> getMemberIds() {
        return memberIds;
    }

    public InboxTeam memberIds(java.util.List<String> memberIds) {
        this.memberIds = memberIds;
        return this;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public InboxTeam createdAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }

    public InboxTeam updatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    @Override
    public String toString() {
        return com.pushizo.core.Json.stringify(this);
    }
}
