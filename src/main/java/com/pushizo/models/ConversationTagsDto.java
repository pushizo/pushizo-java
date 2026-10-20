// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package com.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * ConversationTagsDto şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class ConversationTagsDto {
    @JsonProperty("add")
    private java.util.Map<String, String> add;

    @JsonProperty("remove")
    private java.util.List<String> remove;

    public java.util.Map<String, String> getAdd() {
        return add;
    }

    public ConversationTagsDto add(java.util.Map<String, String> add) {
        this.add = add;
        return this;
    }

    public java.util.List<String> getRemove() {
        return remove;
    }

    public ConversationTagsDto remove(java.util.List<String> remove) {
        this.remove = remove;
        return this;
    }

    @Override
    public String toString() {
        return com.pushizo.core.Json.stringify(this);
    }
}
