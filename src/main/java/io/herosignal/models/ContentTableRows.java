// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package io.herosignal.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * ContentTableRows şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class ContentTableRows {
    /**
     * Zorunlu.
     */
    @JsonProperty("columns")
    private java.util.List<String> columns;

    /**
     * Zorunlu.
     */
    @JsonProperty("key_column")
    private String keyColumn;

    /**
     * Zorunlu.
     */
    @JsonProperty("total")
    private Long total;

    /**
     * Zorunlu.
     */
    @JsonProperty("data")
    private java.util.List<java.util.Map<String, String>> data;

    public java.util.List<String> getColumns() {
        return columns;
    }

    public ContentTableRows columns(java.util.List<String> columns) {
        this.columns = columns;
        return this;
    }

    public String getKeyColumn() {
        return keyColumn;
    }

    public ContentTableRows keyColumn(String keyColumn) {
        this.keyColumn = keyColumn;
        return this;
    }

    public Long getTotal() {
        return total;
    }

    public ContentTableRows total(Long total) {
        this.total = total;
        return this;
    }

    public java.util.List<java.util.Map<String, String>> getData() {
        return data;
    }

    public ContentTableRows data(java.util.List<java.util.Map<String, String>> data) {
        this.data = data;
        return this;
    }

    @Override
    public String toString() {
        return io.herosignal.core.Json.stringify(this);
    }
}
