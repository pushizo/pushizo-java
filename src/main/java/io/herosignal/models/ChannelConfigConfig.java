// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package io.herosignal.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * ChannelConfigConfig şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class ChannelConfigConfig {
    /**
     * Değerler: "token", "certificate".
     */
    @JsonProperty("auth_type")
    private String authType;

    /**
     * Değerler: "sandbox", "production", "universal".
     */
    @JsonProperty("certificate_environment")
    private String certificateEnvironment;

    @JsonProperty("certificate_subject")
    private String certificateSubject;

    @JsonProperty("certificate_expires_at")
    private String certificateExpiresAt;

    @JsonProperty("key_id")
    private String keyId;

    @JsonProperty("team_id")
    private String teamId;

    @JsonProperty("bundle_id")
    private String bundleId;

    /**
     * Değerler: "sandbox", "production".
     */
    @JsonProperty("environment")
    private String environment;

    @JsonProperty("project_id")
    private String projectId;

    @JsonProperty("client_email")
    private String clientEmail;

    @JsonProperty("subject")
    private String subject;

    @JsonProperty("vapid_public_key")
    private String vapidPublicKey;

    @JsonProperty("site_url")
    private String siteUrl;

    @JsonProperty("from_address")
    private String fromAddress;

    @JsonProperty("from_name")
    private String fromName;

    @JsonProperty("reply_to")
    private String replyTo;

    @JsonProperty("postal_address")
    private String postalAddress;

    @JsonProperty("host")
    private String host;

    @JsonProperty("port")
    private Long port;

    @JsonProperty("secure")
    private Boolean secure;

    @JsonProperty("username")
    private String username;

    @JsonProperty("region")
    private String region;

    @JsonProperty("access_key_id")
    private String accessKeyId;

    @JsonProperty("configuration_set")
    private String configurationSet;

    @JsonProperty("account_sid")
    private String accountSid;

    @JsonProperty("from_number")
    private String fromNumber;

    @JsonProperty("messaging_service_sid")
    private String messagingServiceSid;

    @JsonProperty("usercode")
    private String usercode;

    @JsonProperty("msgheader")
    private String msgheader;

    /**
     * Değerler: "0", "11", "12".
     */
    @JsonProperty("iys_filter")
    private String iysFilter;

    public String getAuthType() {
        return authType;
    }

    public ChannelConfigConfig authType(String authType) {
        this.authType = authType;
        return this;
    }

    public String getCertificateEnvironment() {
        return certificateEnvironment;
    }

    public ChannelConfigConfig certificateEnvironment(String certificateEnvironment) {
        this.certificateEnvironment = certificateEnvironment;
        return this;
    }

    public String getCertificateSubject() {
        return certificateSubject;
    }

    public ChannelConfigConfig certificateSubject(String certificateSubject) {
        this.certificateSubject = certificateSubject;
        return this;
    }

    public String getCertificateExpiresAt() {
        return certificateExpiresAt;
    }

    public ChannelConfigConfig certificateExpiresAt(String certificateExpiresAt) {
        this.certificateExpiresAt = certificateExpiresAt;
        return this;
    }

    public String getKeyId() {
        return keyId;
    }

    public ChannelConfigConfig keyId(String keyId) {
        this.keyId = keyId;
        return this;
    }

    public String getTeamId() {
        return teamId;
    }

    public ChannelConfigConfig teamId(String teamId) {
        this.teamId = teamId;
        return this;
    }

    public String getBundleId() {
        return bundleId;
    }

    public ChannelConfigConfig bundleId(String bundleId) {
        this.bundleId = bundleId;
        return this;
    }

    public String getEnvironment() {
        return environment;
    }

    public ChannelConfigConfig environment(String environment) {
        this.environment = environment;
        return this;
    }

    public String getProjectId() {
        return projectId;
    }

    public ChannelConfigConfig projectId(String projectId) {
        this.projectId = projectId;
        return this;
    }

    public String getClientEmail() {
        return clientEmail;
    }

    public ChannelConfigConfig clientEmail(String clientEmail) {
        this.clientEmail = clientEmail;
        return this;
    }

    public String getSubject() {
        return subject;
    }

    public ChannelConfigConfig subject(String subject) {
        this.subject = subject;
        return this;
    }

    public String getVapidPublicKey() {
        return vapidPublicKey;
    }

    public ChannelConfigConfig vapidPublicKey(String vapidPublicKey) {
        this.vapidPublicKey = vapidPublicKey;
        return this;
    }

    public String getSiteUrl() {
        return siteUrl;
    }

    public ChannelConfigConfig siteUrl(String siteUrl) {
        this.siteUrl = siteUrl;
        return this;
    }

    public String getFromAddress() {
        return fromAddress;
    }

    public ChannelConfigConfig fromAddress(String fromAddress) {
        this.fromAddress = fromAddress;
        return this;
    }

    public String getFromName() {
        return fromName;
    }

    public ChannelConfigConfig fromName(String fromName) {
        this.fromName = fromName;
        return this;
    }

    public String getReplyTo() {
        return replyTo;
    }

    public ChannelConfigConfig replyTo(String replyTo) {
        this.replyTo = replyTo;
        return this;
    }

    public String getPostalAddress() {
        return postalAddress;
    }

    public ChannelConfigConfig postalAddress(String postalAddress) {
        this.postalAddress = postalAddress;
        return this;
    }

    public String getHost() {
        return host;
    }

    public ChannelConfigConfig host(String host) {
        this.host = host;
        return this;
    }

    public Long getPort() {
        return port;
    }

    public ChannelConfigConfig port(Long port) {
        this.port = port;
        return this;
    }

    public Boolean getSecure() {
        return secure;
    }

    public ChannelConfigConfig secure(Boolean secure) {
        this.secure = secure;
        return this;
    }

    public String getUsername() {
        return username;
    }

    public ChannelConfigConfig username(String username) {
        this.username = username;
        return this;
    }

    public String getRegion() {
        return region;
    }

    public ChannelConfigConfig region(String region) {
        this.region = region;
        return this;
    }

    public String getAccessKeyId() {
        return accessKeyId;
    }

    public ChannelConfigConfig accessKeyId(String accessKeyId) {
        this.accessKeyId = accessKeyId;
        return this;
    }

    public String getConfigurationSet() {
        return configurationSet;
    }

    public ChannelConfigConfig configurationSet(String configurationSet) {
        this.configurationSet = configurationSet;
        return this;
    }

    public String getAccountSid() {
        return accountSid;
    }

    public ChannelConfigConfig accountSid(String accountSid) {
        this.accountSid = accountSid;
        return this;
    }

    public String getFromNumber() {
        return fromNumber;
    }

    public ChannelConfigConfig fromNumber(String fromNumber) {
        this.fromNumber = fromNumber;
        return this;
    }

    public String getMessagingServiceSid() {
        return messagingServiceSid;
    }

    public ChannelConfigConfig messagingServiceSid(String messagingServiceSid) {
        this.messagingServiceSid = messagingServiceSid;
        return this;
    }

    public String getUsercode() {
        return usercode;
    }

    public ChannelConfigConfig usercode(String usercode) {
        this.usercode = usercode;
        return this;
    }

    public String getMsgheader() {
        return msgheader;
    }

    public ChannelConfigConfig msgheader(String msgheader) {
        this.msgheader = msgheader;
        return this;
    }

    public String getIysFilter() {
        return iysFilter;
    }

    public ChannelConfigConfig iysFilter(String iysFilter) {
        this.iysFilter = iysFilter;
        return this;
    }

    @Override
    public String toString() {
        return io.herosignal.core.Json.stringify(this);
    }
}
