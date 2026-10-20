// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package com.pushizo.params;

/**
 * AdsResource.attribution için isteğe bağlı sorgu parametreleri.
 */
public final class AdsAttributionParams {
    /**
     * Değerler: "last_click", "first_click", "linear", "time_decay".
     */
    private String model;

    private Long windowDays;

    private Long halfLifeDays;

    private String currency;

    /**
     * Değerler: "channel", "campaign", "ad_set".
     */
    private String groupBy;

    private String conversionEvents;

    public String getModel() {
        return model;
    }

    public AdsAttributionParams model(String model) {
        this.model = model;
        return this;
    }

    public Long getWindowDays() {
        return windowDays;
    }

    public AdsAttributionParams windowDays(Long windowDays) {
        this.windowDays = windowDays;
        return this;
    }

    public Long getHalfLifeDays() {
        return halfLifeDays;
    }

    public AdsAttributionParams halfLifeDays(Long halfLifeDays) {
        this.halfLifeDays = halfLifeDays;
        return this;
    }

    public String getCurrency() {
        return currency;
    }

    public AdsAttributionParams currency(String currency) {
        this.currency = currency;
        return this;
    }

    public String getGroupBy() {
        return groupBy;
    }

    public AdsAttributionParams groupBy(String groupBy) {
        this.groupBy = groupBy;
        return this;
    }

    public String getConversionEvents() {
        return conversionEvents;
    }

    public AdsAttributionParams conversionEvents(String conversionEvents) {
        this.conversionEvents = conversionEvents;
        return this;
    }

    /** Sığ kopya (sayfalama sırasında çağıranın nesnesi değiştirilmez). */
    public AdsAttributionParams copy() {
        AdsAttributionParams c = new AdsAttributionParams();
        c.model = model;
        c.windowDays = windowDays;
        c.halfLifeDays = halfLifeDays;
        c.currency = currency;
        c.groupBy = groupBy;
        c.conversionEvents = conversionEvents;
        return c;
    }

    /** İç API: alanları isteğe ekler. */
    public void applyTo(com.pushizo.core.Operation op) {
        op.query("model", model);
        op.query("window_days", windowDays);
        op.query("half_life_days", halfLifeDays);
        op.query("currency", currency);
        op.query("group_by", groupBy);
        op.query("conversion_events", conversionEvents);
    }
}
