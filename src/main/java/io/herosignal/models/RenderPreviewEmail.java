// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.
package io.herosignal.models;

import com.fasterxml.jackson.annotation.JsonProperty;
/** RenderPreviewEmail şeması (api/openapi.yaml). */
public final class RenderPreviewEmail {

    /** "subject" alanı. Zorunlu. */
    @JsonProperty("subject")
    private String subject;

    /** "preheader" alanı. Zorunlu. */
    @JsonProperty("preheader")
    private String preheader;

    /** "html" alanı. Zorunlu. */
    @JsonProperty("html")
    private String html;

    /** "text" alanı. Zorunlu. */
    @JsonProperty("text")
    private String text;

    /** @return "subject" alanı */
    public String getSubject() {
        return subject;
    }

    /**
     * "subject" alanını ayarlar.
     *
     * @param subject yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public RenderPreviewEmail setSubject(String subject) {
        this.subject = subject;
        return this;
    }

    /** @return "preheader" alanı */
    public String getPreheader() {
        return preheader;
    }

    /**
     * "preheader" alanını ayarlar.
     *
     * @param preheader yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public RenderPreviewEmail setPreheader(String preheader) {
        this.preheader = preheader;
        return this;
    }

    /** @return "html" alanı */
    public String getHtml() {
        return html;
    }

    /**
     * "html" alanını ayarlar.
     *
     * @param html yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public RenderPreviewEmail setHtml(String html) {
        this.html = html;
        return this;
    }

    /** @return "text" alanı */
    public String getText() {
        return text;
    }

    /**
     * "text" alanını ayarlar.
     *
     * @param text yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public RenderPreviewEmail setText(String text) {
        this.text = text;
        return this;
    }
}
