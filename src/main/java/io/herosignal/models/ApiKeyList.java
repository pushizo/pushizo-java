// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.
package io.herosignal.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
/** ApiKeyList şeması (api/openapi.yaml). */
public final class ApiKeyList {

    /** "data" alanı. Zorunlu. */
    @JsonProperty("data")
    private List<ApiKey> data;

    /** @return "data" alanı */
    public List<ApiKey> getData() {
        return data;
    }

    /**
     * "data" alanını ayarlar.
     *
     * @param data yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public ApiKeyList setData(List<ApiKey> data) {
        this.data = data;
        return this;
    }
}
