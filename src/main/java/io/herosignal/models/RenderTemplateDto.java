// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.
package io.herosignal.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;
/** RenderTemplateDto şeması (api/openapi.yaml). */
public final class RenderTemplateDto {

    /** "channel" alanı. Değerler: "ios_push", "android_push", "web_push", "email", "sms". */
    @JsonProperty("channel")
    private String channel;

    /** "language" alanı. */
    @JsonProperty("language")
    private String language;

    /** "user" alanı. */
    @JsonProperty("user")
    private RenderTemplateDtoUser user;

    /** "custom_data" alanı. */
    @JsonProperty("custom_data")
    private Map<String, Object> customData;

    /** "content" alanı. */
    @JsonProperty("content")
    private RenderTemplateDtoContent content;

    /** "version" alanı. */
    @JsonProperty("version")
    private Long version;

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
    public RenderTemplateDto setChannel(String channel) {
        this.channel = channel;
        return this;
    }

    /** @return "language" alanı */
    public String getLanguage() {
        return language;
    }

    /**
     * "language" alanını ayarlar.
     *
     * @param language yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public RenderTemplateDto setLanguage(String language) {
        this.language = language;
        return this;
    }

    /** @return "user" alanı */
    public RenderTemplateDtoUser getUser() {
        return user;
    }

    /**
     * "user" alanını ayarlar.
     *
     * @param user yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public RenderTemplateDto setUser(RenderTemplateDtoUser user) {
        this.user = user;
        return this;
    }

    /** @return "custom_data" alanı */
    public Map<String, Object> getCustomData() {
        return customData;
    }

    /**
     * "custom_data" alanını ayarlar.
     *
     * @param customData yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public RenderTemplateDto setCustomData(Map<String, Object> customData) {
        this.customData = customData;
        return this;
    }

    /** @return "content" alanı */
    public RenderTemplateDtoContent getContent() {
        return content;
    }

    /**
     * "content" alanını ayarlar.
     *
     * @param content yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public RenderTemplateDto setContent(RenderTemplateDtoContent content) {
        this.content = content;
        return this;
    }

    /** @return "version" alanı */
    public Long getVersion() {
        return version;
    }

    /**
     * "version" alanını ayarlar.
     *
     * @param version yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public RenderTemplateDto setVersion(Long version) {
        this.version = version;
        return this;
    }
}
