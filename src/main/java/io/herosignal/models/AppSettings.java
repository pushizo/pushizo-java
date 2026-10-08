// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package io.herosignal.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * AppSettings şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class AppSettings {
    @JsonProperty("quietHours")
    private AppSettingsQuietHours quietHours;

    @JsonProperty("frequencyCap")
    private AppSettingsFrequencyCap frequencyCap;

    @JsonProperty("frequencyCaps")
    private java.util.List<AppSettingsFrequencyCapsItem> frequencyCaps;

    @JsonProperty("inApp")
    private AppSettingsInApp inApp;

    @JsonProperty("androidChannels")
    private java.util.List<AppSettingsAndroidChannelsItem> androidChannels;

    @JsonProperty("sms")
    private AppSettingsSms sms;

    @JsonProperty("preferenceCenter")
    private AppSettingsPreferenceCenter preferenceCenter;

    @JsonProperty("defaultTtlSeconds")
    private Long defaultTtlSeconds;

    @JsonProperty("identityVerificationRequired")
    private Boolean identityVerificationRequired;

    @JsonProperty("allowedOrigins")
    private java.util.List<String> allowedOrigins;

    @JsonProperty("campaignApprovalRequired")
    private Boolean campaignApprovalRequired;

    @JsonProperty("webPush")
    private AppSettingsWebPush webPush;

    @JsonProperty("onboarding")
    private AppSettingsOnboarding onboarding;

    @JsonProperty("sdkSetup")
    private AppSettingsSdkSetup sdkSetup;

    public AppSettingsQuietHours getQuietHours() {
        return quietHours;
    }

    public AppSettings quietHours(AppSettingsQuietHours quietHours) {
        this.quietHours = quietHours;
        return this;
    }

    public AppSettingsFrequencyCap getFrequencyCap() {
        return frequencyCap;
    }

    public AppSettings frequencyCap(AppSettingsFrequencyCap frequencyCap) {
        this.frequencyCap = frequencyCap;
        return this;
    }

    public java.util.List<AppSettingsFrequencyCapsItem> getFrequencyCaps() {
        return frequencyCaps;
    }

    public AppSettings frequencyCaps(java.util.List<AppSettingsFrequencyCapsItem> frequencyCaps) {
        this.frequencyCaps = frequencyCaps;
        return this;
    }

    public AppSettingsInApp getInApp() {
        return inApp;
    }

    public AppSettings inApp(AppSettingsInApp inApp) {
        this.inApp = inApp;
        return this;
    }

    public java.util.List<AppSettingsAndroidChannelsItem> getAndroidChannels() {
        return androidChannels;
    }

    public AppSettings androidChannels(java.util.List<AppSettingsAndroidChannelsItem> androidChannels) {
        this.androidChannels = androidChannels;
        return this;
    }

    public AppSettingsSms getSms() {
        return sms;
    }

    public AppSettings sms(AppSettingsSms sms) {
        this.sms = sms;
        return this;
    }

    public AppSettingsPreferenceCenter getPreferenceCenter() {
        return preferenceCenter;
    }

    public AppSettings preferenceCenter(AppSettingsPreferenceCenter preferenceCenter) {
        this.preferenceCenter = preferenceCenter;
        return this;
    }

    public Long getDefaultTtlSeconds() {
        return defaultTtlSeconds;
    }

    public AppSettings defaultTtlSeconds(Long defaultTtlSeconds) {
        this.defaultTtlSeconds = defaultTtlSeconds;
        return this;
    }

    public Boolean getIdentityVerificationRequired() {
        return identityVerificationRequired;
    }

    public AppSettings identityVerificationRequired(Boolean identityVerificationRequired) {
        this.identityVerificationRequired = identityVerificationRequired;
        return this;
    }

    public java.util.List<String> getAllowedOrigins() {
        return allowedOrigins;
    }

    public AppSettings allowedOrigins(java.util.List<String> allowedOrigins) {
        this.allowedOrigins = allowedOrigins;
        return this;
    }

    public Boolean getCampaignApprovalRequired() {
        return campaignApprovalRequired;
    }

    public AppSettings campaignApprovalRequired(Boolean campaignApprovalRequired) {
        this.campaignApprovalRequired = campaignApprovalRequired;
        return this;
    }

    public AppSettingsWebPush getWebPush() {
        return webPush;
    }

    public AppSettings webPush(AppSettingsWebPush webPush) {
        this.webPush = webPush;
        return this;
    }

    public AppSettingsOnboarding getOnboarding() {
        return onboarding;
    }

    public AppSettings onboarding(AppSettingsOnboarding onboarding) {
        this.onboarding = onboarding;
        return this;
    }

    public AppSettingsSdkSetup getSdkSetup() {
        return sdkSetup;
    }

    public AppSettings sdkSetup(AppSettingsSdkSetup sdkSetup) {
        this.sdkSetup = sdkSetup;
        return this;
    }

    @Override
    public String toString() {
        return io.herosignal.core.Json.stringify(this);
    }
}
