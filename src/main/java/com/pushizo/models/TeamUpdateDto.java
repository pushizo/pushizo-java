// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package com.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * TeamUpdateDto şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class TeamUpdateDto {
    @JsonProperty("name")
    private String name;

    @JsonProperty("description")
    private String description;

    @JsonProperty("member_ids")
    private java.util.List<String> memberIds;

    public String getName() {
        return name;
    }

    public TeamUpdateDto name(String name) {
        this.name = name;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public TeamUpdateDto description(String description) {
        this.description = description;
        return this;
    }

    public java.util.List<String> getMemberIds() {
        return memberIds;
    }

    public TeamUpdateDto memberIds(java.util.List<String> memberIds) {
        this.memberIds = memberIds;
        return this;
    }

    @Override
    public String toString() {
        return com.pushizo.core.Json.stringify(this);
    }
}
