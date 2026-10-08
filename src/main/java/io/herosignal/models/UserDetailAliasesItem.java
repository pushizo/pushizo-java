// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.
package io.herosignal.models;

import com.fasterxml.jackson.annotation.JsonProperty;
/** UserDetailAliasesItem şeması (api/openapi.yaml). */
public final class UserDetailAliasesItem {

    /** "label" alanı. Zorunlu. */
    @JsonProperty("label")
    private String label;

    /** "value" alanı. Zorunlu. */
    @JsonProperty("value")
    private String value;

    /** @return "label" alanı */
    public String getLabel() {
        return label;
    }

    /**
     * "label" alanını ayarlar.
     *
     * @param label yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public UserDetailAliasesItem setLabel(String label) {
        this.label = label;
        return this;
    }

    /** @return "value" alanı */
    public String getValue() {
        return value;
    }

    /**
     * "value" alanını ayarlar.
     *
     * @param value yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public UserDetailAliasesItem setValue(String value) {
        this.value = value;
        return this;
    }
}
