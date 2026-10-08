// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.
package io.herosignal.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
/** WebhookList şeması (api/openapi.yaml). */
public final class WebhookList {

    /** "data" alanı. Zorunlu. */
    @JsonProperty("data")
    private List<Webhook> data;

    /** @return "data" alanı */
    public List<Webhook> getData() {
        return data;
    }

    /**
     * "data" alanını ayarlar.
     *
     * @param data yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public WebhookList setData(List<Webhook> data) {
        this.data = data;
        return this;
    }
}
