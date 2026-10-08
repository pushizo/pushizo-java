// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.
package io.herosignal.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
/** ChannelList şeması (api/openapi.yaml). */
public final class ChannelList {

    /** "data" alanı. Zorunlu. */
    @JsonProperty("data")
    private List<ChannelConfig> data;

    /** @return "data" alanı */
    public List<ChannelConfig> getData() {
        return data;
    }

    /**
     * "data" alanını ayarlar.
     *
     * @param data yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public ChannelList setData(List<ChannelConfig> data) {
        this.data = data;
        return this;
    }
}
