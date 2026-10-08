// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.
package io.herosignal.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
/** UserList şeması (api/openapi.yaml). */
public final class UserList {

    /** "data" alanı. Zorunlu. */
    @JsonProperty("data")
    private List<User> data;

    /** "next_cursor" alanı. Zorunlu. */
    @JsonProperty("next_cursor")
    private String nextCursor;

    /** "has_more" alanı. Zorunlu. */
    @JsonProperty("has_more")
    private Boolean hasMore;

    /** @return "data" alanı */
    public List<User> getData() {
        return data;
    }

    /**
     * "data" alanını ayarlar.
     *
     * @param data yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public UserList setData(List<User> data) {
        this.data = data;
        return this;
    }

    /** @return "next_cursor" alanı */
    public String getNextCursor() {
        return nextCursor;
    }

    /**
     * "next_cursor" alanını ayarlar.
     *
     * @param nextCursor yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public UserList setNextCursor(String nextCursor) {
        this.nextCursor = nextCursor;
        return this;
    }

    /** @return "has_more" alanı */
    public Boolean getHasMore() {
        return hasMore;
    }

    /**
     * "has_more" alanını ayarlar.
     *
     * @param hasMore yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public UserList setHasMore(Boolean hasMore) {
        this.hasMore = hasMore;
        return this;
    }
}
