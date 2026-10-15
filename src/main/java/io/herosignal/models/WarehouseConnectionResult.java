// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package io.herosignal.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * WarehouseConnectionResult şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class WarehouseConnectionResult {
    /**
     * Zorunlu.
     */
    @JsonProperty("ok")
    private Boolean ok;

    /**
     * Zorunlu.
     */
    @JsonProperty("detail")
    private String detail;

    /**
     * Zorunlu.
     */
    @JsonProperty("error")
    private WarehouseConnectionResultError error;

    public Boolean getOk() {
        return ok;
    }

    public WarehouseConnectionResult ok(Boolean ok) {
        this.ok = ok;
        return this;
    }

    public String getDetail() {
        return detail;
    }

    public WarehouseConnectionResult detail(String detail) {
        this.detail = detail;
        return this;
    }

    public WarehouseConnectionResultError getError() {
        return error;
    }

    public WarehouseConnectionResult error(WarehouseConnectionResultError error) {
        this.error = error;
        return this;
    }

    @Override
    public String toString() {
        return io.herosignal.core.Json.stringify(this);
    }
}
