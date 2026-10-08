// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.
package io.herosignal.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
/** UpdateAppDtoSettings şeması (api/openapi.yaml). */
public final class UpdateAppDtoSettings {

    /** "quietHours" alanı. */
    @JsonProperty("quietHours")
    private UpdateAppDtoSettingsQuietHours quietHours;

    /** "frequencyCap" alanı. */
    @JsonProperty("frequencyCap")
    private UpdateAppDtoSettingsFrequencyCap frequencyCap;

    /** "defaultTtlSeconds" alanı. */
    @JsonProperty("defaultTtlSeconds")
    private Long defaultTtlSeconds;

    /** "identityVerificationRequired" alanı. */
    @JsonProperty("identityVerificationRequired")
    private Boolean identityVerificationRequired;

    /** "allowedOrigins" alanı. */
    @JsonProperty("allowedOrigins")
    private List<String> allowedOrigins;

    /** "campaignApprovalRequired" alanı. */
    @JsonProperty("campaignApprovalRequired")
    private Boolean campaignApprovalRequired;

    /** "webPush" alanı. */
    @JsonProperty("webPush")
    private UpdateAppDtoSettingsWebPush webPush;

    /** "onboarding" alanı. */
    @JsonProperty("onboarding")
    private UpdateAppDtoSettingsOnboarding onboarding;

    /** @return "quietHours" alanı */
    public UpdateAppDtoSettingsQuietHours getQuietHours() {
        return quietHours;
    }

    /**
     * "quietHours" alanını ayarlar.
     *
     * @param quietHours yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public UpdateAppDtoSettings setQuietHours(UpdateAppDtoSettingsQuietHours quietHours) {
        this.quietHours = quietHours;
        return this;
    }

    /** @return "frequencyCap" alanı */
    public UpdateAppDtoSettingsFrequencyCap getFrequencyCap() {
        return frequencyCap;
    }

    /**
     * "frequencyCap" alanını ayarlar.
     *
     * @param frequencyCap yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public UpdateAppDtoSettings setFrequencyCap(UpdateAppDtoSettingsFrequencyCap frequencyCap) {
        this.frequencyCap = frequencyCap;
        return this;
    }

    /** @return "defaultTtlSeconds" alanı */
    public Long getDefaultTtlSeconds() {
        return defaultTtlSeconds;
    }

    /**
     * "defaultTtlSeconds" alanını ayarlar.
     *
     * @param defaultTtlSeconds yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public UpdateAppDtoSettings setDefaultTtlSeconds(Long defaultTtlSeconds) {
        this.defaultTtlSeconds = defaultTtlSeconds;
        return this;
    }

    /** @return "identityVerificationRequired" alanı */
    public Boolean getIdentityVerificationRequired() {
        return identityVerificationRequired;
    }

    /**
     * "identityVerificationRequired" alanını ayarlar.
     *
     * @param identityVerificationRequired yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public UpdateAppDtoSettings setIdentityVerificationRequired(Boolean identityVerificationRequired) {
        this.identityVerificationRequired = identityVerificationRequired;
        return this;
    }

    /** @return "allowedOrigins" alanı */
    public List<String> getAllowedOrigins() {
        return allowedOrigins;
    }

    /**
     * "allowedOrigins" alanını ayarlar.
     *
     * @param allowedOrigins yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public UpdateAppDtoSettings setAllowedOrigins(List<String> allowedOrigins) {
        this.allowedOrigins = allowedOrigins;
        return this;
    }

    /** @return "campaignApprovalRequired" alanı */
    public Boolean getCampaignApprovalRequired() {
        return campaignApprovalRequired;
    }

    /**
     * "campaignApprovalRequired" alanını ayarlar.
     *
     * @param campaignApprovalRequired yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public UpdateAppDtoSettings setCampaignApprovalRequired(Boolean campaignApprovalRequired) {
        this.campaignApprovalRequired = campaignApprovalRequired;
        return this;
    }

    /** @return "webPush" alanı */
    public UpdateAppDtoSettingsWebPush getWebPush() {
        return webPush;
    }

    /**
     * "webPush" alanını ayarlar.
     *
     * @param webPush yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public UpdateAppDtoSettings setWebPush(UpdateAppDtoSettingsWebPush webPush) {
        this.webPush = webPush;
        return this;
    }

    /** @return "onboarding" alanı */
    public UpdateAppDtoSettingsOnboarding getOnboarding() {
        return onboarding;
    }

    /**
     * "onboarding" alanını ayarlar.
     *
     * @param onboarding yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public UpdateAppDtoSettings setOnboarding(UpdateAppDtoSettingsOnboarding onboarding) {
        this.onboarding = onboarding;
        return this;
    }
}
