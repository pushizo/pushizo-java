// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.
package io.herosignal.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
/** CreateTemplateDto şeması (api/openapi.yaml). */
public final class CreateTemplateDto {

    /** "name" alanı. Zorunlu. */
    @JsonProperty("name")
    private String name;

    /** "channel" alanı. Değerler: "ios_push", "android_push", "web_push", "email", "sms". */
    @JsonProperty("channel")
    private String channel;

    /** "tags" alanı. */
    @JsonProperty("tags")
    private List<String> tags;

    /** "content" alanı. Zorunlu. */
    @JsonProperty("content")
    private CreateTemplateDtoContent content;

    /** @return "name" alanı */
    public String getName() {
        return name;
    }

    /**
     * "name" alanını ayarlar.
     *
     * @param name yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public CreateTemplateDto setName(String name) {
        this.name = name;
        return this;
    }

    /** @return "channel" alanı */
    public String getChannel() {
        return channel;
    }

    /**
     * "channel" alanını ayarlar.
     *
     * @param channel yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public CreateTemplateDto setChannel(String channel) {
        this.channel = channel;
        return this;
    }

    /** @return "tags" alanı */
    public List<String> getTags() {
        return tags;
    }

    /**
     * "tags" alanını ayarlar.
     *
     * @param tags yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public CreateTemplateDto setTags(List<String> tags) {
        this.tags = tags;
        return this;
    }

    /** @return "content" alanı */
    public CreateTemplateDtoContent getContent() {
        return content;
    }

    /**
     * "content" alanını ayarlar.
     *
     * @param content yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public CreateTemplateDto setContent(CreateTemplateDtoContent content) {
        this.content = content;
        return this;
    }
}
