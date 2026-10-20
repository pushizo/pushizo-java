// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package com.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * LandingPageDocument şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class LandingPageDocument {
    /**
     * Zorunlu. Değerler: 1.
     */
    @JsonProperty("version")
    private Double version;

    /**
     * Zorunlu.
     */
    @JsonProperty("settings")
    private LandingPageDocumentSettings settings;

    /**
     * Zorunlu.
     */
    @JsonProperty("sections")
    private java.util.List<LandingPageDocumentSectionsItem> sections;

    public Double getVersion() {
        return version;
    }

    public LandingPageDocument version(Double version) {
        this.version = version;
        return this;
    }

    public LandingPageDocumentSettings getSettings() {
        return settings;
    }

    public LandingPageDocument settings(LandingPageDocumentSettings settings) {
        this.settings = settings;
        return this;
    }

    public java.util.List<LandingPageDocumentSectionsItem> getSections() {
        return sections;
    }

    public LandingPageDocument sections(java.util.List<LandingPageDocumentSectionsItem> sections) {
        this.sections = sections;
        return this;
    }

    @Override
    public String toString() {
        return com.pushizo.core.Json.stringify(this);
    }
}
