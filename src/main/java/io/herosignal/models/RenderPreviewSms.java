// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.
package io.herosignal.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
/** RenderPreviewSms şeması (api/openapi.yaml). */
public final class RenderPreviewSms {

    /** "body" alanı. Zorunlu. */
    @JsonProperty("body")
    private String body;

    /** "encoding" alanı. Zorunlu. Değerler: "gsm7", "gsm7_tr", "ucs2". */
    @JsonProperty("encoding")
    private String encoding;

    /** "characters" alanı. Zorunlu. */
    @JsonProperty("characters")
    private Long characters;

    /** "segments" alanı. Zorunlu. */
    @JsonProperty("segments")
    private Long segments;

    /** "per_segment" alanı. Zorunlu. */
    @JsonProperty("per_segment")
    private Long perSegment;

    /** "non_gsm_characters" alanı. Zorunlu. */
    @JsonProperty("non_gsm_characters")
    private List<String> nonGsmCharacters;

    /** "turkish_characters" alanı. Zorunlu. */
    @JsonProperty("turkish_characters")
    private List<String> turkishCharacters;

    /** @return "body" alanı */
    public String getBody() {
        return body;
    }

    /**
     * "body" alanını ayarlar.
     *
     * @param body yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public RenderPreviewSms setBody(String body) {
        this.body = body;
        return this;
    }

    /** @return "encoding" alanı */
    public String getEncoding() {
        return encoding;
    }

    /**
     * "encoding" alanını ayarlar.
     *
     * @param encoding yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public RenderPreviewSms setEncoding(String encoding) {
        this.encoding = encoding;
        return this;
    }

    /** @return "characters" alanı */
    public Long getCharacters() {
        return characters;
    }

    /**
     * "characters" alanını ayarlar.
     *
     * @param characters yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public RenderPreviewSms setCharacters(Long characters) {
        this.characters = characters;
        return this;
    }

    /** @return "segments" alanı */
    public Long getSegments() {
        return segments;
    }

    /**
     * "segments" alanını ayarlar.
     *
     * @param segments yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public RenderPreviewSms setSegments(Long segments) {
        this.segments = segments;
        return this;
    }

    /** @return "per_segment" alanı */
    public Long getPerSegment() {
        return perSegment;
    }

    /**
     * "per_segment" alanını ayarlar.
     *
     * @param perSegment yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public RenderPreviewSms setPerSegment(Long perSegment) {
        this.perSegment = perSegment;
        return this;
    }

    /** @return "non_gsm_characters" alanı */
    public List<String> getNonGsmCharacters() {
        return nonGsmCharacters;
    }

    /**
     * "non_gsm_characters" alanını ayarlar.
     *
     * @param nonGsmCharacters yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public RenderPreviewSms setNonGsmCharacters(List<String> nonGsmCharacters) {
        this.nonGsmCharacters = nonGsmCharacters;
        return this;
    }

    /** @return "turkish_characters" alanı */
    public List<String> getTurkishCharacters() {
        return turkishCharacters;
    }

    /**
     * "turkish_characters" alanını ayarlar.
     *
     * @param turkishCharacters yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public RenderPreviewSms setTurkishCharacters(List<String> turkishCharacters) {
        this.turkishCharacters = turkishCharacters;
        return this;
    }
}
