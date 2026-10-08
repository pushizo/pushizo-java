// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.
package io.herosignal.models;

import com.fasterxml.jackson.annotation.JsonProperty;
/** CreateExportDto şeması (api/openapi.yaml). */
public final class CreateExportDto {

    /** "type" alanı. Zorunlu. Değerler: "users", "subscriptions", "events", "deliveries", "message_events". */
    @JsonProperty("type")
    private String type;

    /** "filters" alanı. */
    @JsonProperty("filters")
    private CreateExportDtoFilters filters;

    /** @return "type" alanı */
    public String getType() {
        return type;
    }

    /**
     * "type" alanını ayarlar.
     *
     * @param type yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public CreateExportDto setType(String type) {
        this.type = type;
        return this;
    }

    /** @return "filters" alanı */
    public CreateExportDtoFilters getFilters() {
        return filters;
    }

    /**
     * "filters" alanını ayarlar.
     *
     * @param filters yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public CreateExportDto setFilters(CreateExportDtoFilters filters) {
        this.filters = filters;
        return this;
    }
}
