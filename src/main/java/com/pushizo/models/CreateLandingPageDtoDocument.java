// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package com.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * CreateLandingPageDtoDocument şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class CreateLandingPageDtoDocument {
    /**
     * Zorunlu. Değerler: 1.
     */
    @JsonProperty("version")
    private Double version;

    /**
     * Zorunlu.
     */
    @JsonProperty("settings")
    private CreateLandingPageDtoDocumentSettings settings;

    /**
     * Zorunlu.
     */
    @JsonProperty("sections")
    private java.util.List<CreateLandingPageDtoDocumentSectionsItem> sections;

    public Double getVersion() {
        return version;
    }

    public CreateLandingPageDtoDocument version(Double version) {
        this.version = version;
        return this;
    }

    public CreateLandingPageDtoDocumentSettings getSettings() {
        return settings;
    }

    public CreateLandingPageDtoDocument settings(CreateLandingPageDtoDocumentSettings settings) {
        this.settings = settings;
        return this;
    }

    public java.util.List<CreateLandingPageDtoDocumentSectionsItem> getSections() {
        return sections;
    }

    public CreateLandingPageDtoDocument sections(java.util.List<CreateLandingPageDtoDocumentSectionsItem> sections) {
        this.sections = sections;
        return this;
    }

    @Override
    public String toString() {
        return com.pushizo.core.Json.stringify(this);
    }
}
