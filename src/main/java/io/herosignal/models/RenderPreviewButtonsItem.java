// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.
package io.herosignal.models;

import com.fasterxml.jackson.annotation.JsonProperty;
/** RenderPreviewButtonsItem şeması (api/openapi.yaml). */
public final class RenderPreviewButtonsItem {

    /** "id" alanı. Zorunlu. */
    @JsonProperty("id")
    private String id;

    /** "text" alanı. Zorunlu. */
    @JsonProperty("text")
    private String text;

    /** "url" alanı. Zorunlu. */
    @JsonProperty("url")
    private String url;

    /** @return "id" alanı */
    public String getId() {
        return id;
    }

    /**
     * "id" alanını ayarlar.
     *
     * @param id yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public RenderPreviewButtonsItem setId(String id) {
        this.id = id;
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
    public RenderPreviewButtonsItem setText(String text) {
        this.text = text;
        return this;
    }

    /** @return "url" alanı */
    public String getUrl() {
        return url;
    }

    /**
     * "url" alanını ayarlar.
     *
     * @param url yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public RenderPreviewButtonsItem setUrl(String url) {
        this.url = url;
        return this;
    }
}
