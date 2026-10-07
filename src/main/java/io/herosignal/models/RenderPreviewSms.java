// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package io.herosignal.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * RenderPreviewSms şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class RenderPreviewSms {
    /**
     * Zorunlu.
     */
    @JsonProperty("body")
    private String body;

    /**
     * Zorunlu. Değerler: "gsm7", "gsm7_tr", "ucs2".
     */
    @JsonProperty("encoding")
    private String encoding;

    /**
     * Zorunlu.
     */
    @JsonProperty("characters")
    private Long characters;

    /**
     * Zorunlu.
     */
    @JsonProperty("segments")
    private Long segments;

    /**
     * Zorunlu.
     */
    @JsonProperty("per_segment")
    private Long perSegment;

    /**
     * Zorunlu.
     */
    @JsonProperty("non_gsm_characters")
    private java.util.List<String> nonGsmCharacters;

    /**
     * Zorunlu.
     */
    @JsonProperty("turkish_characters")
    private java.util.List<String> turkishCharacters;

    public String getBody() {
        return body;
    }

    public RenderPreviewSms body(String body) {
        this.body = body;
        return this;
    }

    public String getEncoding() {
        return encoding;
    }

    public RenderPreviewSms encoding(String encoding) {
        this.encoding = encoding;
        return this;
    }

    public Long getCharacters() {
        return characters;
    }

    public RenderPreviewSms characters(Long characters) {
        this.characters = characters;
        return this;
    }

    public Long getSegments() {
        return segments;
    }

    public RenderPreviewSms segments(Long segments) {
        this.segments = segments;
        return this;
    }

    public Long getPerSegment() {
        return perSegment;
    }

    public RenderPreviewSms perSegment(Long perSegment) {
        this.perSegment = perSegment;
        return this;
    }

    public java.util.List<String> getNonGsmCharacters() {
        return nonGsmCharacters;
    }

    public RenderPreviewSms nonGsmCharacters(java.util.List<String> nonGsmCharacters) {
        this.nonGsmCharacters = nonGsmCharacters;
        return this;
    }

    public java.util.List<String> getTurkishCharacters() {
        return turkishCharacters;
    }

    public RenderPreviewSms turkishCharacters(java.util.List<String> turkishCharacters) {
        this.turkishCharacters = turkishCharacters;
        return this;
    }

    @Override
    public String toString() {
        return io.herosignal.core.Json.stringify(this);
    }
}
