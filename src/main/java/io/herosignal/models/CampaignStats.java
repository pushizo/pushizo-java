// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.
package io.herosignal.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
/** CampaignStats şeması (api/openapi.yaml). */
public final class CampaignStats {

    /** "campaign" alanı. Zorunlu. */
    @JsonProperty("campaign")
    private Campaign campaign;

    /** "rates" alanı. Zorunlu. */
    @JsonProperty("rates")
    private CampaignStatsRates rates;

    /** "channels" alanı. Zorunlu. */
    @JsonProperty("channels")
    private List<CampaignStatsChannelsItem> channels;

    /** "hourly" alanı. Zorunlu. */
    @JsonProperty("hourly")
    private List<CampaignStatsHourlyItem> hourly;

    /** "errors" alanı. Zorunlu. */
    @JsonProperty("errors")
    private List<CampaignStatsErrorsItem> errors;

    /** "messages" alanı. Zorunlu. */
    @JsonProperty("messages")
    private List<Message> messages;

    /** @return "campaign" alanı */
    public Campaign getCampaign() {
        return campaign;
    }

    /**
     * "campaign" alanını ayarlar.
     *
     * @param campaign yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public CampaignStats setCampaign(Campaign campaign) {
        this.campaign = campaign;
        return this;
    }

    /** @return "rates" alanı */
    public CampaignStatsRates getRates() {
        return rates;
    }

    /**
     * "rates" alanını ayarlar.
     *
     * @param rates yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public CampaignStats setRates(CampaignStatsRates rates) {
        this.rates = rates;
        return this;
    }

    /** @return "channels" alanı */
    public List<CampaignStatsChannelsItem> getChannels() {
        return channels;
    }

    /**
     * "channels" alanını ayarlar.
     *
     * @param channels yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public CampaignStats setChannels(List<CampaignStatsChannelsItem> channels) {
        this.channels = channels;
        return this;
    }

    /** @return "hourly" alanı */
    public List<CampaignStatsHourlyItem> getHourly() {
        return hourly;
    }

    /**
     * "hourly" alanını ayarlar.
     *
     * @param hourly yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public CampaignStats setHourly(List<CampaignStatsHourlyItem> hourly) {
        this.hourly = hourly;
        return this;
    }

    /** @return "errors" alanı */
    public List<CampaignStatsErrorsItem> getErrors() {
        return errors;
    }

    /**
     * "errors" alanını ayarlar.
     *
     * @param errors yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public CampaignStats setErrors(List<CampaignStatsErrorsItem> errors) {
        this.errors = errors;
        return this;
    }

    /** @return "messages" alanı */
    public List<Message> getMessages() {
        return messages;
    }

    /**
     * "messages" alanını ayarlar.
     *
     * @param messages yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public CampaignStats setMessages(List<Message> messages) {
        this.messages = messages;
        return this;
    }
}
