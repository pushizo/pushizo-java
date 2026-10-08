// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.
package io.herosignal.models;

import com.fasterxml.jackson.annotation.JsonProperty;
/** FunnelBodyDtoStepsItem şeması (api/openapi.yaml). */
public final class FunnelBodyDtoStepsItem {

    /** "name" alanı. Zorunlu. */
    @JsonProperty("name")
    private String name;

    /** "where" alanı. */
    @JsonProperty("where")
    private FunnelBodyDtoStepsItemWhere where;

    /** @return "name" alanı */
    public String getName() {
        return name;
    }

    /**
     * "name" alanını ayarlar.
     *
     * @param name yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public FunnelBodyDtoStepsItem setName(String name) {
        this.name = name;
        return this;
    }

    /** @return "where" alanı */
    public FunnelBodyDtoStepsItemWhere getWhere() {
        return where;
    }

    /**
     * "where" alanını ayarlar.
     *
     * @param where yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public FunnelBodyDtoStepsItem setWhere(FunnelBodyDtoStepsItemWhere where) {
        this.where = where;
        return this;
    }
}
