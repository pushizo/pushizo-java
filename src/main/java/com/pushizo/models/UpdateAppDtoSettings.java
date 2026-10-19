// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package com.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * UpdateAppDtoSettings şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class UpdateAppDtoSettings {
    @JsonProperty("quietHours")
    private UpdateAppDtoSettingsQuietHours quietHours;

    @JsonProperty("frequencyCap")
    private UpdateAppDtoSettingsFrequencyCap frequencyCap;

    @JsonProperty("frequencyCaps")
    private java.util.List<UpdateAppDtoSettingsFrequencyCapsItem> frequencyCaps;

    @JsonProperty("inApp")
    private UpdateAppDtoSettingsInApp inApp;

    @JsonProperty("androidChannels")
    private java.util.List<UpdateAppDtoSettingsAndroidChannelsItem> androidChannels;

    @JsonProperty("sms")
    private UpdateAppDtoSettingsSms sms;

    @JsonProperty("preferenceCenter")
    private UpdateAppDtoSettingsPreferenceCenter preferenceCenter;

    @JsonProperty("defaultTtlSeconds")
    private Long defaultTtlSeconds;

    @JsonProperty("identityVerificationRequired")
    private Boolean identityVerificationRequired;

    @JsonProperty("allowedOrigins")
    private java.util.List<String> allowedOrigins;

    @JsonProperty("campaignApprovalRequired")
    private Boolean campaignApprovalRequired;

    @JsonProperty("webPush")
    private UpdateAppDtoSettingsWebPush webPush;

    @JsonProperty("onboarding")
    private UpdateAppDtoSettingsOnboarding onboarding;

    @JsonProperty("sdkSetup")
    private UpdateAppDtoSettingsSdkSetup sdkSetup;

    public UpdateAppDtoSettingsQuietHours getQuietHours() {
        return quietHours;
    }

    public UpdateAppDtoSettings quietHours(UpdateAppDtoSettingsQuietHours quietHours) {
        this.quietHours = quietHours;
        return this;
    }

    public UpdateAppDtoSettingsFrequencyCap getFrequencyCap() {
        return frequencyCap;
    }

    public UpdateAppDtoSettings frequencyCap(UpdateAppDtoSettingsFrequencyCap frequencyCap) {
        this.frequencyCap = frequencyCap;
        return this;
    }

    public java.util.List<UpdateAppDtoSettingsFrequencyCapsItem> getFrequencyCaps() {
        return frequencyCaps;
    }

    public UpdateAppDtoSettings frequencyCaps(java.util.List<UpdateAppDtoSettingsFrequencyCapsItem> frequencyCaps) {
        this.frequencyCaps = frequencyCaps;
        return this;
    }

    public UpdateAppDtoSettingsInApp getInApp() {
        return inApp;
    }

    public UpdateAppDtoSettings inApp(UpdateAppDtoSettingsInApp inApp) {
        this.inApp = inApp;
        return this;
    }

    public java.util.List<UpdateAppDtoSettingsAndroidChannelsItem> getAndroidChannels() {
        return androidChannels;
    }

    public UpdateAppDtoSettings androidChannels(java.util.List<UpdateAppDtoSettingsAndroidChannelsItem> androidChannels) {
        this.androidChannels = androidChannels;
        return this;
    }

    public UpdateAppDtoSettingsSms getSms() {
        return sms;
    }

    public UpdateAppDtoSettings sms(UpdateAppDtoSettingsSms sms) {
        this.sms = sms;
        return this;
    }

    public UpdateAppDtoSettingsPreferenceCenter getPreferenceCenter() {
        return preferenceCenter;
    }

    public UpdateAppDtoSettings preferenceCenter(UpdateAppDtoSettingsPreferenceCenter preferenceCenter) {
        this.preferenceCenter = preferenceCenter;
        return this;
    }

    public Long getDefaultTtlSeconds() {
        return defaultTtlSeconds;
    }

    public UpdateAppDtoSettings defaultTtlSeconds(Long defaultTtlSeconds) {
        this.defaultTtlSeconds = defaultTtlSeconds;
        return this;
    }

    public Boolean getIdentityVerificationRequired() {
        return identityVerificationRequired;
    }

    public UpdateAppDtoSettings identityVerificationRequired(Boolean identityVerificationRequired) {
        this.identityVerificationRequired = identityVerificationRequired;
        return this;
    }

    public java.util.List<String> getAllowedOrigins() {
        return allowedOrigins;
    }

    public UpdateAppDtoSettings allowedOrigins(java.util.List<String> allowedOrigins) {
        this.allowedOrigins = allowedOrigins;
        return this;
    }

    public Boolean getCampaignApprovalRequired() {
        return campaignApprovalRequired;
    }

    public UpdateAppDtoSettings campaignApprovalRequired(Boolean campaignApprovalRequired) {
        this.campaignApprovalRequired = campaignApprovalRequired;
        return this;
    }

    public UpdateAppDtoSettingsWebPush getWebPush() {
        return webPush;
    }

    public UpdateAppDtoSettings webPush(UpdateAppDtoSettingsWebPush webPush) {
        this.webPush = webPush;
        return this;
    }

    public UpdateAppDtoSettingsOnboarding getOnboarding() {
        return onboarding;
    }

    public UpdateAppDtoSettings onboarding(UpdateAppDtoSettingsOnboarding onboarding) {
        this.onboarding = onboarding;
        return this;
    }

    public UpdateAppDtoSettingsSdkSetup getSdkSetup() {
        return sdkSetup;
    }

    public UpdateAppDtoSettings sdkSetup(UpdateAppDtoSettingsSdkSetup sdkSetup) {
        this.sdkSetup = sdkSetup;
        return this;
    }

    @Override
    public String toString() {
        return com.pushizo.core.Json.stringify(this);
    }
}
