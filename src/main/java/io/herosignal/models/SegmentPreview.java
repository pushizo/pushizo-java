// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.
package io.herosignal.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
/** SegmentPreview şeması (api/openapi.yaml). */
public final class SegmentPreview {

    /** "subscriptions" alanı. Zorunlu. */
    @JsonProperty("subscriptions")
    private Long subscriptions;

    /** "users" alanı. Zorunlu. */
    @JsonProperty("users")
    private Long users;

    /** "sampled" alanı. Zorunlu. */
    @JsonProperty("sampled")
    private Boolean sampled;

    /** "sample" alanı. Zorunlu. */
    @JsonProperty("sample")
    private List<SegmentPreviewSampleItem> sample;

    /** @return "subscriptions" alanı */
    public Long getSubscriptions() {
        return subscriptions;
    }

    /**
     * "subscriptions" alanını ayarlar.
     *
     * @param subscriptions yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public SegmentPreview setSubscriptions(Long subscriptions) {
        this.subscriptions = subscriptions;
        return this;
    }

    /** @return "users" alanı */
    public Long getUsers() {
        return users;
    }

    /**
     * "users" alanını ayarlar.
     *
     * @param users yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public SegmentPreview setUsers(Long users) {
        this.users = users;
        return this;
    }

    /** @return "sampled" alanı */
    public Boolean getSampled() {
        return sampled;
    }

    /**
     * "sampled" alanını ayarlar.
     *
     * @param sampled yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public SegmentPreview setSampled(Boolean sampled) {
        this.sampled = sampled;
        return this;
    }

    /** @return "sample" alanı */
    public List<SegmentPreviewSampleItem> getSample() {
        return sample;
    }

    /**
     * "sample" alanını ayarlar.
     *
     * @param sample yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public SegmentPreview setSample(List<SegmentPreviewSampleItem> sample) {
        this.sample = sample;
        return this;
    }
}
