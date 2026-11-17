// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package com.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * UpdateFormDtoFieldsItem şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class UpdateFormDtoFieldsItem {
    /**
     * Zorunlu.
     */
    @JsonProperty("id")
    private String id;

    /**
     * Zorunlu. Değerler: "email", "phone", "first_name", "last_name", "full_name", "text", "textarea", "select", "radio", "checkbox", "consent".
     */
    @JsonProperty("type")
    private String type;

    /**
     * Zorunlu.
     */
    @JsonProperty("label")
    private java.util.Map<String, String> label;

    @JsonProperty("placeholder")
    private java.util.Map<String, String> placeholder;

    @JsonProperty("required")
    private Boolean required;

    @JsonProperty("options")
    private java.util.List<UpdateFormDtoFieldsItemOptionsItem> options;

    @JsonProperty("maps_to")
    private String mapsTo;

    @JsonProperty("max_length")
    private Long maxLength;

    @JsonProperty("policy_url")
    private String policyUrl;

    public String getId() {
        return id;
    }

    public UpdateFormDtoFieldsItem id(String id) {
        this.id = id;
        return this;
    }

    public String getType() {
        return type;
    }

    public UpdateFormDtoFieldsItem type(String type) {
        this.type = type;
        return this;
    }

    public java.util.Map<String, String> getLabel() {
        return label;
    }

    public UpdateFormDtoFieldsItem label(java.util.Map<String, String> label) {
        this.label = label;
        return this;
    }

    public java.util.Map<String, String> getPlaceholder() {
        return placeholder;
    }

    public UpdateFormDtoFieldsItem placeholder(java.util.Map<String, String> placeholder) {
        this.placeholder = placeholder;
        return this;
    }

    public Boolean getRequired() {
        return required;
    }

    public UpdateFormDtoFieldsItem required(Boolean required) {
        this.required = required;
        return this;
    }

    public java.util.List<UpdateFormDtoFieldsItemOptionsItem> getOptions() {
        return options;
    }

    public UpdateFormDtoFieldsItem options(java.util.List<UpdateFormDtoFieldsItemOptionsItem> options) {
        this.options = options;
        return this;
    }

    public String getMapsTo() {
        return mapsTo;
    }

    public UpdateFormDtoFieldsItem mapsTo(String mapsTo) {
        this.mapsTo = mapsTo;
        return this;
    }

    public Long getMaxLength() {
        return maxLength;
    }

    public UpdateFormDtoFieldsItem maxLength(Long maxLength) {
        this.maxLength = maxLength;
        return this;
    }

    public String getPolicyUrl() {
        return policyUrl;
    }

    public UpdateFormDtoFieldsItem policyUrl(String policyUrl) {
        this.policyUrl = policyUrl;
        return this;
    }

    @Override
    public String toString() {
        return com.pushizo.core.Json.stringify(this);
    }
}
