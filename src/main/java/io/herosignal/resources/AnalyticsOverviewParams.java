// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.
package io.herosignal.resources;
/**
 * AnalyticsResource.overview için isteğe bağlı sorgu parametreleri.
 */
public final class AnalyticsOverviewParams {

    /** "range" sorgu parametresi. Değerler: "7d", "30d". */
    private String range;

    /** "from" sorgu parametresi. */
    private String from;

    /** "to" sorgu parametresi. */
    private String to;

    /** @return "range" değeri */
    public String getRange() {
        return range;
    }

    /**
     * "range" değerini ayarlar.
     *
     * @param range yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public AnalyticsOverviewParams setRange(String range) {
        this.range = range;
        return this;
    }

    /** @return "from" değeri */
    public String getFrom() {
        return from;
    }

    /**
     * "from" değerini ayarlar.
     *
     * @param from yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public AnalyticsOverviewParams setFrom(String from) {
        this.from = from;
        return this;
    }

    /** @return "to" değeri */
    public String getTo() {
        return to;
    }

    /**
     * "to" değerini ayarlar.
     *
     * @param to yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public AnalyticsOverviewParams setTo(String to) {
        this.to = to;
        return this;
    }

    /** @return bu parametrelerin sığ kopyası */
    public AnalyticsOverviewParams copy() {
        AnalyticsOverviewParams copy = new AnalyticsOverviewParams();
        copy.range = range;
        copy.from = from;
        copy.to = to;
        return copy;
    }
}
