// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package com.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * EmailDeliverabilitySettingsValidation şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class EmailDeliverabilitySettingsValidation {
    /**
     * Zorunlu.
     */
    @JsonProperty("enabled")
    private Boolean enabled;

    /**
     * Zorunlu.
     */
    @JsonProperty("check_mx")
    private Boolean checkMx;

    /**
     * Zorunlu.
     */
    @JsonProperty("block_disposable")
    private Boolean blockDisposable;

    /**
     * Zorunlu.
     */
    @JsonProperty("block_role")
    private Boolean blockRole;

    public Boolean getEnabled() {
        return enabled;
    }

    public EmailDeliverabilitySettingsValidation enabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    public Boolean getCheckMx() {
        return checkMx;
    }

    public EmailDeliverabilitySettingsValidation checkMx(Boolean checkMx) {
        this.checkMx = checkMx;
        return this;
    }

    public Boolean getBlockDisposable() {
        return blockDisposable;
    }

    public EmailDeliverabilitySettingsValidation blockDisposable(Boolean blockDisposable) {
        this.blockDisposable = blockDisposable;
        return this;
    }

    public Boolean getBlockRole() {
        return blockRole;
    }

    public EmailDeliverabilitySettingsValidation blockRole(Boolean blockRole) {
        this.blockRole = blockRole;
        return this;
    }

    @Override
    public String toString() {
        return com.pushizo.core.Json.stringify(this);
    }
}
