// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.
package io.herosignal.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import java.util.Map;
/** AppSettingsWebPushPrompt şeması (api/openapi.yaml). */
public final class AppSettingsWebPushPrompt {

    /** "enabled" alanı. Zorunlu. */
    @JsonProperty("enabled")
    private Boolean enabled;

    /** "type" alanı. Zorunlu. Değerler: "slidedown", "native". */
    @JsonProperty("type")
    private String type;

    /** "delaySeconds" alanı. */
    @JsonProperty("delaySeconds")
    private Long delaySeconds;

    /** "pageViews" alanı. */
    @JsonProperty("pageViews")
    private Long pageViews;

    /** "scrollPercent" alanı. */
    @JsonProperty("scrollPercent")
    private Long scrollPercent;

    /** "texts" alanı. */
    @JsonProperty("texts")
    private Map<String, AppSettingsWebPushPromptTextsValue> texts;

    /** "categories" alanı. */
    @JsonProperty("categories")
    private List<AppSettingsWebPushPromptCategoriesItem> categories;

    /** "accentColor" alanı. */
    @JsonProperty("accentColor")
    private String accentColor;

    /** @return "enabled" alanı */
    public Boolean getEnabled() {
        return enabled;
    }

    /**
     * "enabled" alanını ayarlar.
     *
     * @param enabled yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public AppSettingsWebPushPrompt setEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    /** @return "type" alanı */
    public String getType() {
        return type;
    }

    /**
     * "type" alanını ayarlar.
     *
     * @param type yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public AppSettingsWebPushPrompt setType(String type) {
        this.type = type;
        return this;
    }

    /** @return "delaySeconds" alanı */
    public Long getDelaySeconds() {
        return delaySeconds;
    }

    /**
     * "delaySeconds" alanını ayarlar.
     *
     * @param delaySeconds yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public AppSettingsWebPushPrompt setDelaySeconds(Long delaySeconds) {
        this.delaySeconds = delaySeconds;
        return this;
    }

    /** @return "pageViews" alanı */
    public Long getPageViews() {
        return pageViews;
    }

    /**
     * "pageViews" alanını ayarlar.
     *
     * @param pageViews yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public AppSettingsWebPushPrompt setPageViews(Long pageViews) {
        this.pageViews = pageViews;
        return this;
    }

    /** @return "scrollPercent" alanı */
    public Long getScrollPercent() {
        return scrollPercent;
    }

    /**
     * "scrollPercent" alanını ayarlar.
     *
     * @param scrollPercent yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public AppSettingsWebPushPrompt setScrollPercent(Long scrollPercent) {
        this.scrollPercent = scrollPercent;
        return this;
    }

    /** @return "texts" alanı */
    public Map<String, AppSettingsWebPushPromptTextsValue> getTexts() {
        return texts;
    }

    /**
     * "texts" alanını ayarlar.
     *
     * @param texts yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public AppSettingsWebPushPrompt setTexts(Map<String, AppSettingsWebPushPromptTextsValue> texts) {
        this.texts = texts;
        return this;
    }

    /** @return "categories" alanı */
    public List<AppSettingsWebPushPromptCategoriesItem> getCategories() {
        return categories;
    }

    /**
     * "categories" alanını ayarlar.
     *
     * @param categories yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public AppSettingsWebPushPrompt setCategories(List<AppSettingsWebPushPromptCategoriesItem> categories) {
        this.categories = categories;
        return this;
    }

    /** @return "accentColor" alanı */
    public String getAccentColor() {
        return accentColor;
    }

    /**
     * "accentColor" alanını ayarlar.
     *
     * @param accentColor yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public AppSettingsWebPushPrompt setAccentColor(String accentColor) {
        this.accentColor = accentColor;
        return this;
    }
}
