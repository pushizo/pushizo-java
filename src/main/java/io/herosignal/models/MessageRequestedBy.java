// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.
package io.herosignal.models;

import com.fasterxml.jackson.annotation.JsonProperty;
/** MessageRequestedBy şeması (api/openapi.yaml). */
public final class MessageRequestedBy {

    /** "type" alanı. Zorunlu. Değerler: "api_key", "account", "system". */
    @JsonProperty("type")
    private String type;

    /** "id" alanı. */
    @JsonProperty("id")
    private String id;

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
    public MessageRequestedBy setType(String type) {
        this.type = type;
        return this;
    }

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
    public MessageRequestedBy setId(String id) {
        this.id = id;
        return this;
    }
}
