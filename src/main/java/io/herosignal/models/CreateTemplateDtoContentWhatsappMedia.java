// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package io.herosignal.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * CreateTemplateDtoContentWhatsappMedia şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class CreateTemplateDtoContentWhatsappMedia {
    /**
     * Zorunlu. Değerler: "image", "video", "document", "audio".
     */
    @JsonProperty("type")
    private String type;

    /**
     * Zorunlu.
     */
    @JsonProperty("url")
    private String url;

    @JsonProperty("filename")
    private String filename;

    public String getType() {
        return type;
    }

    public CreateTemplateDtoContentWhatsappMedia type(String type) {
        this.type = type;
        return this;
    }

    public String getUrl() {
        return url;
    }

    public CreateTemplateDtoContentWhatsappMedia url(String url) {
        this.url = url;
        return this;
    }

    public String getFilename() {
        return filename;
    }

    public CreateTemplateDtoContentWhatsappMedia filename(String filename) {
        this.filename = filename;
        return this;
    }

    @Override
    public String toString() {
        return io.herosignal.core.Json.stringify(this);
    }
}
