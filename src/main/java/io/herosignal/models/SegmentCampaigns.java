// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.
package io.herosignal.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
/** SegmentCampaigns şeması (api/openapi.yaml). */
public final class SegmentCampaigns {

    /** "data" alanı. Zorunlu. */
    @JsonProperty("data")
    private List<SegmentCampaignsDataItem> data;

    /** @return "data" alanı */
    public List<SegmentCampaignsDataItem> getData() {
        return data;
    }

    /**
     * "data" alanını ayarlar.
     *
     * @param data yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public SegmentCampaigns setData(List<SegmentCampaignsDataItem> data) {
        this.data = data;
        return this;
    }
}
