// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.
package io.herosignal.models;

import com.fasterxml.jackson.annotation.JsonProperty;
/** AppSettingsQuietHours şeması (api/openapi.yaml). */
public final class AppSettingsQuietHours {

    /** "start" alanı. Zorunlu. */
    @JsonProperty("start")
    private String start;

    /** "end" alanı. Zorunlu. */
    @JsonProperty("end")
    private String end;

    /** "timezoneMode" alanı. Zorunlu. Değerler: "user", "app". */
    @JsonProperty("timezoneMode")
    private String timezoneMode;

    /** @return "start" alanı */
    public String getStart() {
        return start;
    }

    /**
     * "start" alanını ayarlar.
     *
     * @param start yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public AppSettingsQuietHours setStart(String start) {
        this.start = start;
        return this;
    }

    /** @return "end" alanı */
    public String getEnd() {
        return end;
    }

    /**
     * "end" alanını ayarlar.
     *
     * @param end yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public AppSettingsQuietHours setEnd(String end) {
        this.end = end;
        return this;
    }

    /** @return "timezoneMode" alanı */
    public String getTimezoneMode() {
        return timezoneMode;
    }

    /**
     * "timezoneMode" alanını ayarlar.
     *
     * @param timezoneMode yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public AppSettingsQuietHours setTimezoneMode(String timezoneMode) {
        this.timezoneMode = timezoneMode;
        return this;
    }
}
