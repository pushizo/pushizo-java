// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.
package io.herosignal.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
/** PatchUserDtoDeltas şeması (api/openapi.yaml). */
public final class PatchUserDtoDeltas {

    /** "session_count" alanı. */
    @JsonProperty("session_count")
    private Long sessionCount;

    /** "session_time" alanı. */
    @JsonProperty("session_time")
    private Long sessionTime;

    /** "purchases" alanı. */
    @JsonProperty("purchases")
    private List<PatchUserDtoDeltasPurchasesItem> purchases;

    /** @return "session_count" alanı */
    public Long getSessionCount() {
        return sessionCount;
    }

    /**
     * "session_count" alanını ayarlar.
     *
     * @param sessionCount yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public PatchUserDtoDeltas setSessionCount(Long sessionCount) {
        this.sessionCount = sessionCount;
        return this;
    }

    /** @return "session_time" alanı */
    public Long getSessionTime() {
        return sessionTime;
    }

    /**
     * "session_time" alanını ayarlar.
     *
     * @param sessionTime yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public PatchUserDtoDeltas setSessionTime(Long sessionTime) {
        this.sessionTime = sessionTime;
        return this;
    }

    /** @return "purchases" alanı */
    public List<PatchUserDtoDeltasPurchasesItem> getPurchases() {
        return purchases;
    }

    /**
     * "purchases" alanını ayarlar.
     *
     * @param purchases yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public PatchUserDtoDeltas setPurchases(List<PatchUserDtoDeltasPurchasesItem> purchases) {
        this.purchases = purchases;
        return this;
    }
}
