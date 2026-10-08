// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.
package io.herosignal.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;
/** UpdateAppDtoSettingsWebPushPromptCategoriesItem şeması (api/openapi.yaml). */
public final class UpdateAppDtoSettingsWebPushPromptCategoriesItem {

    /** "tag" alanı. Zorunlu. */
    @JsonProperty("tag")
    private String tag;

    /** "label" alanı. Zorunlu. */
    @JsonProperty("label")
    private Map<String, String> label;

    /** @return "tag" alanı */
    public String getTag() {
        return tag;
    }

    /**
     * "tag" alanını ayarlar.
     *
     * @param tag yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public UpdateAppDtoSettingsWebPushPromptCategoriesItem setTag(String tag) {
        this.tag = tag;
        return this;
    }

    /** @return "label" alanı */
    public Map<String, String> getLabel() {
        return label;
    }

    /**
     * "label" alanını ayarlar.
     *
     * @param label yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public UpdateAppDtoSettingsWebPushPromptCategoriesItem setLabel(Map<String, String> label) {
        this.label = label;
        return this;
    }
}
