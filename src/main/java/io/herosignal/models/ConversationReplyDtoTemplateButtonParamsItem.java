// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package io.herosignal.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * ConversationReplyDtoTemplateButtonParamsItem şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class ConversationReplyDtoTemplateButtonParamsItem {
    /**
     * Zorunlu.
     */
    @JsonProperty("index")
    private Long index;

    /**
     * Zorunlu. Değerler: "url", "quick_reply", "copy_code".
     */
    @JsonProperty("sub_type")
    private String subType;

    /**
     * Zorunlu.
     */
    @JsonProperty("value")
    private String value;

    public Long getIndex() {
        return index;
    }

    public ConversationReplyDtoTemplateButtonParamsItem index(Long index) {
        this.index = index;
        return this;
    }

    public String getSubType() {
        return subType;
    }

    public ConversationReplyDtoTemplateButtonParamsItem subType(String subType) {
        this.subType = subType;
        return this;
    }

    public String getValue() {
        return value;
    }

    public ConversationReplyDtoTemplateButtonParamsItem value(String value) {
        this.value = value;
        return this;
    }

    @Override
    public String toString() {
        return io.herosignal.core.Json.stringify(this);
    }
}
