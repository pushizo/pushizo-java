// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.
package io.herosignal.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
/** UpdateInAppDtoAudience şeması (api/openapi.yaml). */
public final class UpdateInAppDtoAudience {

    /** "included_segments" alanı. */
    @JsonProperty("included_segments")
    private List<String> includedSegments;

    /** "excluded_segments" alanı. */
    @JsonProperty("excluded_segments")
    private List<String> excludedSegments;

    /** @return "included_segments" alanı */
    public List<String> getIncludedSegments() {
        return includedSegments;
    }

    /**
     * "included_segments" alanını ayarlar.
     *
     * @param includedSegments yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public UpdateInAppDtoAudience setIncludedSegments(List<String> includedSegments) {
        this.includedSegments = includedSegments;
        return this;
    }

    /** @return "excluded_segments" alanı */
    public List<String> getExcludedSegments() {
        return excludedSegments;
    }

    /**
     * "excluded_segments" alanını ayarlar.
     *
     * @param excludedSegments yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public UpdateInAppDtoAudience setExcludedSegments(List<String> excludedSegments) {
        this.excludedSegments = excludedSegments;
        return this;
    }
}
