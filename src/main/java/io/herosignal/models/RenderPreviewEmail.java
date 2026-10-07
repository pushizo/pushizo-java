// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package io.herosignal.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * RenderPreviewEmail şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class RenderPreviewEmail {
    /**
     * Zorunlu.
     */
    @JsonProperty("subject")
    private String subject;

    /**
     * Zorunlu.
     */
    @JsonProperty("preheader")
    private String preheader;

    /**
     * Zorunlu.
     */
    @JsonProperty("html")
    private String html;

    /**
     * Zorunlu.
     */
    @JsonProperty("text")
    private String text;

    public String getSubject() {
        return subject;
    }

    public RenderPreviewEmail subject(String subject) {
        this.subject = subject;
        return this;
    }

    public String getPreheader() {
        return preheader;
    }

    public RenderPreviewEmail preheader(String preheader) {
        this.preheader = preheader;
        return this;
    }

    public String getHtml() {
        return html;
    }

    public RenderPreviewEmail html(String html) {
        this.html = html;
        return this;
    }

    public String getText() {
        return text;
    }

    public RenderPreviewEmail text(String text) {
        this.text = text;
        return this;
    }

    @Override
    public String toString() {
        return io.herosignal.core.Json.stringify(this);
    }
}
