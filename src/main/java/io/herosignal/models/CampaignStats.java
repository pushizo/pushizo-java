// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package io.herosignal.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * CampaignStats şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class CampaignStats {
    /**
     * Zorunlu.
     */
    @JsonProperty("campaign")
    private Campaign campaign;

    /**
     * Zorunlu.
     */
    @JsonProperty("rates")
    private CampaignStatsRates rates;

    /**
     * Zorunlu.
     */
    @JsonProperty("channels")
    private java.util.List<CampaignStatsChannelsItem> channels;

    /**
     * Zorunlu.
     */
    @JsonProperty("hourly")
    private java.util.List<CampaignStatsHourlyItem> hourly;

    /**
     * Zorunlu.
     */
    @JsonProperty("errors")
    private java.util.List<CampaignStatsErrorsItem> errors;

    /**
     * Zorunlu.
     */
    @JsonProperty("messages")
    private java.util.List<Message> messages;

    public Campaign getCampaign() {
        return campaign;
    }

    public CampaignStats campaign(Campaign campaign) {
        this.campaign = campaign;
        return this;
    }

    public CampaignStatsRates getRates() {
        return rates;
    }

    public CampaignStats rates(CampaignStatsRates rates) {
        this.rates = rates;
        return this;
    }

    public java.util.List<CampaignStatsChannelsItem> getChannels() {
        return channels;
    }

    public CampaignStats channels(java.util.List<CampaignStatsChannelsItem> channels) {
        this.channels = channels;
        return this;
    }

    public java.util.List<CampaignStatsHourlyItem> getHourly() {
        return hourly;
    }

    public CampaignStats hourly(java.util.List<CampaignStatsHourlyItem> hourly) {
        this.hourly = hourly;
        return this;
    }

    public java.util.List<CampaignStatsErrorsItem> getErrors() {
        return errors;
    }

    public CampaignStats errors(java.util.List<CampaignStatsErrorsItem> errors) {
        this.errors = errors;
        return this;
    }

    public java.util.List<Message> getMessages() {
        return messages;
    }

    public CampaignStats messages(java.util.List<Message> messages) {
        this.messages = messages;
        return this;
    }

    @Override
    public String toString() {
        return io.herosignal.core.Json.stringify(this);
    }
}
