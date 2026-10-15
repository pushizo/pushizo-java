// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package io.herosignal.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * DeliverabilitySettingsDtoValidation şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class DeliverabilitySettingsDtoValidation {
    /**
     * Zorunlu.
     */
    @JsonProperty("enabled")
    private Boolean enabled;

    @JsonProperty("check_mx")
    private Boolean checkMx;

    @JsonProperty("block_disposable")
    private Boolean blockDisposable;

    @JsonProperty("block_role")
    private Boolean blockRole;

    public Boolean getEnabled() {
        return enabled;
    }

    public DeliverabilitySettingsDtoValidation enabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    public Boolean getCheckMx() {
        return checkMx;
    }

    public DeliverabilitySettingsDtoValidation checkMx(Boolean checkMx) {
        this.checkMx = checkMx;
        return this;
    }

    public Boolean getBlockDisposable() {
        return blockDisposable;
    }

    public DeliverabilitySettingsDtoValidation blockDisposable(Boolean blockDisposable) {
        this.blockDisposable = blockDisposable;
        return this;
    }

    public Boolean getBlockRole() {
        return blockRole;
    }

    public DeliverabilitySettingsDtoValidation blockRole(Boolean blockRole) {
        this.blockRole = blockRole;
        return this;
    }

    @Override
    public String toString() {
        return io.herosignal.core.Json.stringify(this);
    }
}
