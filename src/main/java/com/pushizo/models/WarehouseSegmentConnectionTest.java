// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package com.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * WarehouseSegmentConnectionTest şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class WarehouseSegmentConnectionTest {
    /**
     * Zorunlu.
     */
    @JsonProperty("ok")
    private Boolean ok;

    /**
     * Zorunlu.
     */
    @JsonProperty("error")
    private WarehouseSegmentConnectionTestError error;

    public Boolean getOk() {
        return ok;
    }

    public WarehouseSegmentConnectionTest ok(Boolean ok) {
        this.ok = ok;
        return this;
    }

    public WarehouseSegmentConnectionTestError getError() {
        return error;
    }

    public WarehouseSegmentConnectionTest error(WarehouseSegmentConnectionTestError error) {
        this.error = error;
        return this;
    }

    @Override
    public String toString() {
        return com.pushizo.core.Json.stringify(this);
    }
}
