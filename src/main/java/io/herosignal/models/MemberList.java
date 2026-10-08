// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.
package io.herosignal.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
/** MemberList şeması (api/openapi.yaml). */
public final class MemberList {

    /** "data" alanı. Zorunlu. */
    @JsonProperty("data")
    private List<Member> data;

    /** @return "data" alanı */
    public List<Member> getData() {
        return data;
    }

    /**
     * "data" alanını ayarlar.
     *
     * @param data yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public MemberList setData(List<Member> data) {
        this.data = data;
        return this;
    }
}
