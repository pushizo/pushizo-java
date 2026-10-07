// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package io.herosignal.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * UsersSearchBody şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class UsersSearchBody {
    /**
     * Zorunlu. Filtre AST: all/any/none grupları ve { field, op, value } koşulları (docs/plan/05 §5.7).
     */
    @JsonProperty("definition")
    private UsersSearchBodyDefinition definition;

    @JsonProperty("limit")
    private Long limit;

    @JsonProperty("cursor")
    private String cursor;

    public UsersSearchBodyDefinition getDefinition() {
        return definition;
    }

    public UsersSearchBody definition(UsersSearchBodyDefinition definition) {
        this.definition = definition;
        return this;
    }

    public Long getLimit() {
        return limit;
    }

    public UsersSearchBody limit(Long limit) {
        this.limit = limit;
        return this;
    }

    public String getCursor() {
        return cursor;
    }

    public UsersSearchBody cursor(String cursor) {
        this.cursor = cursor;
        return this;
    }

    @Override
    public String toString() {
        return io.herosignal.core.Json.stringify(this);
    }
}
