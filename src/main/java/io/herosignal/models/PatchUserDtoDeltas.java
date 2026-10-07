// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package io.herosignal.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * PatchUserDtoDeltas şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class PatchUserDtoDeltas {
    @JsonProperty("session_count")
    private Long sessionCount;

    @JsonProperty("session_time")
    private Long sessionTime;

    @JsonProperty("purchases")
    private java.util.List<PatchUserDtoDeltasPurchasesItem> purchases;

    public Long getSessionCount() {
        return sessionCount;
    }

    public PatchUserDtoDeltas sessionCount(Long sessionCount) {
        this.sessionCount = sessionCount;
        return this;
    }

    public Long getSessionTime() {
        return sessionTime;
    }

    public PatchUserDtoDeltas sessionTime(Long sessionTime) {
        this.sessionTime = sessionTime;
        return this;
    }

    public java.util.List<PatchUserDtoDeltasPurchasesItem> getPurchases() {
        return purchases;
    }

    public PatchUserDtoDeltas purchases(java.util.List<PatchUserDtoDeltasPurchasesItem> purchases) {
        this.purchases = purchases;
        return this;
    }

    @Override
    public String toString() {
        return io.herosignal.core.Json.stringify(this);
    }
}
