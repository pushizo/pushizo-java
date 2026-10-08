// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.
package io.herosignal.resources;
/**
 * AnalyticsResource.events için isteğe bağlı sorgu parametreleri.
 */
public final class AnalyticsEventsParams {

    /** "from" sorgu parametresi. */
    private String from;

    /** "to" sorgu parametresi. */
    private String to;

    /** "compare" sorgu parametresi. Değerler: "true", "false". */
    private String compare;

    /** "format" sorgu parametresi. Değerler: "json", "csv". */
    private String format;

    /** "name" sorgu parametresi. */
    private String name;

    /** "group_by" sorgu parametresi. Değerler: "day", "name". */
    private String groupBy;

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
    public AnalyticsEventsParams setFrom(String from) {
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
    public AnalyticsEventsParams setTo(String to) {
        this.to = to;
        return this;
    }

    /** @return "compare" değeri */
    public String getCompare() {
        return compare;
    }

    /**
     * "compare" değerini ayarlar.
     *
     * @param compare yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public AnalyticsEventsParams setCompare(String compare) {
        this.compare = compare;
        return this;
    }

    /** @return "format" değeri */
    public String getFormat() {
        return format;
    }

    /**
     * "format" değerini ayarlar.
     *
     * @param format yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public AnalyticsEventsParams setFormat(String format) {
        this.format = format;
        return this;
    }

    /** @return "name" değeri */
    public String getName() {
        return name;
    }

    /**
     * "name" değerini ayarlar.
     *
     * @param name yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public AnalyticsEventsParams setName(String name) {
        this.name = name;
        return this;
    }

    /** @return "group_by" değeri */
    public String getGroupBy() {
        return groupBy;
    }

    /**
     * "group_by" değerini ayarlar.
     *
     * @param groupBy yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public AnalyticsEventsParams setGroupBy(String groupBy) {
        this.groupBy = groupBy;
        return this;
    }

    /** @return bu parametrelerin sığ kopyası */
    public AnalyticsEventsParams copy() {
        AnalyticsEventsParams copy = new AnalyticsEventsParams();
        copy.from = from;
        copy.to = to;
        copy.compare = compare;
        copy.format = format;
        copy.name = name;
        copy.groupBy = groupBy;
        return copy;
    }
}
