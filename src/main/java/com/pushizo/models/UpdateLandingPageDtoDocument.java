// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package com.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * UpdateLandingPageDtoDocument şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class UpdateLandingPageDtoDocument {
    /**
     * Zorunlu. Değerler: 1.
     */
    @JsonProperty("version")
    private Double version;

    /**
     * Zorunlu.
     */
    @JsonProperty("settings")
    private UpdateLandingPageDtoDocumentSettings settings;

    /**
     * Zorunlu.
     */
    @JsonProperty("sections")
    private java.util.List<UpdateLandingPageDtoDocumentSectionsItem> sections;

    public Double getVersion() {
        return version;
    }

    public UpdateLandingPageDtoDocument version(Double version) {
        this.version = version;
        return this;
    }

    public UpdateLandingPageDtoDocumentSettings getSettings() {
        return settings;
    }

    public UpdateLandingPageDtoDocument settings(UpdateLandingPageDtoDocumentSettings settings) {
        this.settings = settings;
        return this;
    }

    public java.util.List<UpdateLandingPageDtoDocumentSectionsItem> getSections() {
        return sections;
    }

    public UpdateLandingPageDtoDocument sections(java.util.List<UpdateLandingPageDtoDocumentSectionsItem> sections) {
        this.sections = sections;
        return this;
    }

    @Override
    public String toString() {
        return com.pushizo.core.Json.stringify(this);
    }
}
