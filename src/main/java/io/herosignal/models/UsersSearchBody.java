// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.
package io.herosignal.models;

import com.fasterxml.jackson.annotation.JsonProperty;
/** UsersSearchBody şeması (api/openapi.yaml). */
public final class UsersSearchBody {

    /** "definition" alanı. Zorunlu. Filtre AST: all/any/none grupları ve { field, op, value } koşulları (docs/plan/05 §5.7). */
    @JsonProperty("definition")
    private UsersSearchBodyDefinition definition;

    /** "limit" alanı. */
    @JsonProperty("limit")
    private Long limit;

    /** "cursor" alanı. */
    @JsonProperty("cursor")
    private String cursor;

    /** @return "definition" alanı */
    public UsersSearchBodyDefinition getDefinition() {
        return definition;
    }

    /**
     * "definition" alanını ayarlar.
     *
     * @param definition yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public UsersSearchBody setDefinition(UsersSearchBodyDefinition definition) {
        this.definition = definition;
        return this;
    }

    /** @return "limit" alanı */
    public Long getLimit() {
        return limit;
    }

    /**
     * "limit" alanını ayarlar.
     *
     * @param limit yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public UsersSearchBody setLimit(Long limit) {
        this.limit = limit;
        return this;
    }

    /** @return "cursor" alanı */
    public String getCursor() {
        return cursor;
    }

    /**
     * "cursor" alanını ayarlar.
     *
     * @param cursor yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public UsersSearchBody setCursor(String cursor) {
        this.cursor = cursor;
        return this;
    }
}
