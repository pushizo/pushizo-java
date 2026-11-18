// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package com.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * BatchMembersDto şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class BatchMembersDto {
    /**
     * Zorunlu.
     */
    @JsonProperty("members")
    private java.util.List<BatchMembersDtoMembersItem> members;

    public java.util.List<BatchMembersDtoMembersItem> getMembers() {
        return members;
    }

    public BatchMembersDto members(java.util.List<BatchMembersDtoMembersItem> members) {
        this.members = members;
        return this;
    }

    @Override
    public String toString() {
        return com.pushizo.core.Json.stringify(this);
    }
}
