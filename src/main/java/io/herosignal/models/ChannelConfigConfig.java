// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.
package io.herosignal.models;

import com.fasterxml.jackson.annotation.JsonProperty;
/** ChannelConfigConfig şeması (api/openapi.yaml). */
public final class ChannelConfigConfig {

    /** "auth_type" alanı. Değerler: "token", "certificate". */
    @JsonProperty("auth_type")
    private String authType;

    /** "certificate_environment" alanı. Değerler: "sandbox", "production", "universal". */
    @JsonProperty("certificate_environment")
    private String certificateEnvironment;

    /** "certificate_subject" alanı. */
    @JsonProperty("certificate_subject")
    private String certificateSubject;

    /** "certificate_expires_at" alanı. */
    @JsonProperty("certificate_expires_at")
    private String certificateExpiresAt;

    /** "key_id" alanı. */
    @JsonProperty("key_id")
    private String keyId;

    /** "team_id" alanı. */
    @JsonProperty("team_id")
    private String teamId;

    /** "bundle_id" alanı. */
    @JsonProperty("bundle_id")
    private String bundleId;

    /** "environment" alanı. Değerler: "sandbox", "production". */
    @JsonProperty("environment")
    private String environment;

    /** "project_id" alanı. */
    @JsonProperty("project_id")
    private String projectId;

    /** "client_email" alanı. */
    @JsonProperty("client_email")
    private String clientEmail;

    /** "subject" alanı. */
    @JsonProperty("subject")
    private String subject;

    /** "vapid_public_key" alanı. */
    @JsonProperty("vapid_public_key")
    private String vapidPublicKey;

    /** "site_url" alanı. */
    @JsonProperty("site_url")
    private String siteUrl;

    /** "from_address" alanı. */
    @JsonProperty("from_address")
    private String fromAddress;

    /** "from_name" alanı. */
    @JsonProperty("from_name")
    private String fromName;

    /** "reply_to" alanı. */
    @JsonProperty("reply_to")
    private String replyTo;

    /** "postal_address" alanı. */
    @JsonProperty("postal_address")
    private String postalAddress;

    /** "host" alanı. */
    @JsonProperty("host")
    private String host;

    /** "port" alanı. */
    @JsonProperty("port")
    private Long port;

    /** "secure" alanı. */
    @JsonProperty("secure")
    private Boolean secure;

    /** "username" alanı. */
    @JsonProperty("username")
    private String username;

    /** "region" alanı. */
    @JsonProperty("region")
    private String region;

    /** "access_key_id" alanı. */
    @JsonProperty("access_key_id")
    private String accessKeyId;

    /** "configuration_set" alanı. */
    @JsonProperty("configuration_set")
    private String configurationSet;

    /** "account_sid" alanı. */
    @JsonProperty("account_sid")
    private String accountSid;

    /** "from_number" alanı. */
    @JsonProperty("from_number")
    private String fromNumber;

    /** "messaging_service_sid" alanı. */
    @JsonProperty("messaging_service_sid")
    private String messagingServiceSid;

    /** "usercode" alanı. */
    @JsonProperty("usercode")
    private String usercode;

    /** "msgheader" alanı. */
    @JsonProperty("msgheader")
    private String msgheader;

    /** "iys_filter" alanı. Değerler: "0", "11", "12". */
    @JsonProperty("iys_filter")
    private String iysFilter;

    /** @return "auth_type" alanı */
    public String getAuthType() {
        return authType;
    }

    /**
     * "auth_type" alanını ayarlar.
     *
     * @param authType yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public ChannelConfigConfig setAuthType(String authType) {
        this.authType = authType;
        return this;
    }

    /** @return "certificate_environment" alanı */
    public String getCertificateEnvironment() {
        return certificateEnvironment;
    }

    /**
     * "certificate_environment" alanını ayarlar.
     *
     * @param certificateEnvironment yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public ChannelConfigConfig setCertificateEnvironment(String certificateEnvironment) {
        this.certificateEnvironment = certificateEnvironment;
        return this;
    }

    /** @return "certificate_subject" alanı */
    public String getCertificateSubject() {
        return certificateSubject;
    }

    /**
     * "certificate_subject" alanını ayarlar.
     *
     * @param certificateSubject yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public ChannelConfigConfig setCertificateSubject(String certificateSubject) {
        this.certificateSubject = certificateSubject;
        return this;
    }

    /** @return "certificate_expires_at" alanı */
    public String getCertificateExpiresAt() {
        return certificateExpiresAt;
    }

    /**
     * "certificate_expires_at" alanını ayarlar.
     *
     * @param certificateExpiresAt yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public ChannelConfigConfig setCertificateExpiresAt(String certificateExpiresAt) {
        this.certificateExpiresAt = certificateExpiresAt;
        return this;
    }

    /** @return "key_id" alanı */
    public String getKeyId() {
        return keyId;
    }

    /**
     * "key_id" alanını ayarlar.
     *
     * @param keyId yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public ChannelConfigConfig setKeyId(String keyId) {
        this.keyId = keyId;
        return this;
    }

    /** @return "team_id" alanı */
    public String getTeamId() {
        return teamId;
    }

    /**
     * "team_id" alanını ayarlar.
     *
     * @param teamId yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public ChannelConfigConfig setTeamId(String teamId) {
        this.teamId = teamId;
        return this;
    }

    /** @return "bundle_id" alanı */
    public String getBundleId() {
        return bundleId;
    }

    /**
     * "bundle_id" alanını ayarlar.
     *
     * @param bundleId yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public ChannelConfigConfig setBundleId(String bundleId) {
        this.bundleId = bundleId;
        return this;
    }

    /** @return "environment" alanı */
    public String getEnvironment() {
        return environment;
    }

    /**
     * "environment" alanını ayarlar.
     *
     * @param environment yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public ChannelConfigConfig setEnvironment(String environment) {
        this.environment = environment;
        return this;
    }

    /** @return "project_id" alanı */
    public String getProjectId() {
        return projectId;
    }

    /**
     * "project_id" alanını ayarlar.
     *
     * @param projectId yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public ChannelConfigConfig setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }

    /** @return "client_email" alanı */
    public String getClientEmail() {
        return clientEmail;
    }

    /**
     * "client_email" alanını ayarlar.
     *
     * @param clientEmail yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public ChannelConfigConfig setClientEmail(String clientEmail) {
        this.clientEmail = clientEmail;
        return this;
    }

    /** @return "subject" alanı */
    public String getSubject() {
        return subject;
    }

    /**
     * "subject" alanını ayarlar.
     *
     * @param subject yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public ChannelConfigConfig setSubject(String subject) {
        this.subject = subject;
        return this;
    }

    /** @return "vapid_public_key" alanı */
    public String getVapidPublicKey() {
        return vapidPublicKey;
    }

    /**
     * "vapid_public_key" alanını ayarlar.
     *
     * @param vapidPublicKey yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public ChannelConfigConfig setVapidPublicKey(String vapidPublicKey) {
        this.vapidPublicKey = vapidPublicKey;
        return this;
    }

    /** @return "site_url" alanı */
    public String getSiteUrl() {
        return siteUrl;
    }

    /**
     * "site_url" alanını ayarlar.
     *
     * @param siteUrl yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public ChannelConfigConfig setSiteUrl(String siteUrl) {
        this.siteUrl = siteUrl;
        return this;
    }

    /** @return "from_address" alanı */
    public String getFromAddress() {
        return fromAddress;
    }

    /**
     * "from_address" alanını ayarlar.
     *
     * @param fromAddress yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public ChannelConfigConfig setFromAddress(String fromAddress) {
        this.fromAddress = fromAddress;
        return this;
    }

    /** @return "from_name" alanı */
    public String getFromName() {
        return fromName;
    }

    /**
     * "from_name" alanını ayarlar.
     *
     * @param fromName yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public ChannelConfigConfig setFromName(String fromName) {
        this.fromName = fromName;
        return this;
    }

    /** @return "reply_to" alanı */
    public String getReplyTo() {
        return replyTo;
    }

    /**
     * "reply_to" alanını ayarlar.
     *
     * @param replyTo yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public ChannelConfigConfig setReplyTo(String replyTo) {
        this.replyTo = replyTo;
        return this;
    }

    /** @return "postal_address" alanı */
    public String getPostalAddress() {
        return postalAddress;
    }

    /**
     * "postal_address" alanını ayarlar.
     *
     * @param postalAddress yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public ChannelConfigConfig setPostalAddress(String postalAddress) {
        this.postalAddress = postalAddress;
        return this;
    }

    /** @return "host" alanı */
    public String getHost() {
        return host;
    }

    /**
     * "host" alanını ayarlar.
     *
     * @param host yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public ChannelConfigConfig setHost(String host) {
        this.host = host;
        return this;
    }

    /** @return "port" alanı */
    public Long getPort() {
        return port;
    }

    /**
     * "port" alanını ayarlar.
     *
     * @param port yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public ChannelConfigConfig setPort(Long port) {
        this.port = port;
        return this;
    }

    /** @return "secure" alanı */
    public Boolean getSecure() {
        return secure;
    }

    /**
     * "secure" alanını ayarlar.
     *
     * @param secure yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public ChannelConfigConfig setSecure(Boolean secure) {
        this.secure = secure;
        return this;
    }

    /** @return "username" alanı */
    public String getUsername() {
        return username;
    }

    /**
     * "username" alanını ayarlar.
     *
     * @param username yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public ChannelConfigConfig setUsername(String username) {
        this.username = username;
        return this;
    }

    /** @return "region" alanı */
    public String getRegion() {
        return region;
    }

    /**
     * "region" alanını ayarlar.
     *
     * @param region yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public ChannelConfigConfig setRegion(String region) {
        this.region = region;
        return this;
    }

    /** @return "access_key_id" alanı */
    public String getAccessKeyId() {
        return accessKeyId;
    }

    /**
     * "access_key_id" alanını ayarlar.
     *
     * @param accessKeyId yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public ChannelConfigConfig setAccessKeyId(String accessKeyId) {
        this.accessKeyId = accessKeyId;
        return this;
    }

    /** @return "configuration_set" alanı */
    public String getConfigurationSet() {
        return configurationSet;
    }

    /**
     * "configuration_set" alanını ayarlar.
     *
     * @param configurationSet yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public ChannelConfigConfig setConfigurationSet(String configurationSet) {
        this.configurationSet = configurationSet;
        return this;
    }

    /** @return "account_sid" alanı */
    public String getAccountSid() {
        return accountSid;
    }

    /**
     * "account_sid" alanını ayarlar.
     *
     * @param accountSid yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public ChannelConfigConfig setAccountSid(String accountSid) {
        this.accountSid = accountSid;
        return this;
    }

    /** @return "from_number" alanı */
    public String getFromNumber() {
        return fromNumber;
    }

    /**
     * "from_number" alanını ayarlar.
     *
     * @param fromNumber yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public ChannelConfigConfig setFromNumber(String fromNumber) {
        this.fromNumber = fromNumber;
        return this;
    }

    /** @return "messaging_service_sid" alanı */
    public String getMessagingServiceSid() {
        return messagingServiceSid;
    }

    /**
     * "messaging_service_sid" alanını ayarlar.
     *
     * @param messagingServiceSid yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public ChannelConfigConfig setMessagingServiceSid(String messagingServiceSid) {
        this.messagingServiceSid = messagingServiceSid;
        return this;
    }

    /** @return "usercode" alanı */
    public String getUsercode() {
        return usercode;
    }

    /**
     * "usercode" alanını ayarlar.
     *
     * @param usercode yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public ChannelConfigConfig setUsercode(String usercode) {
        this.usercode = usercode;
        return this;
    }

    /** @return "msgheader" alanı */
    public String getMsgheader() {
        return msgheader;
    }

    /**
     * "msgheader" alanını ayarlar.
     *
     * @param msgheader yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public ChannelConfigConfig setMsgheader(String msgheader) {
        this.msgheader = msgheader;
        return this;
    }

    /** @return "iys_filter" alanı */
    public String getIysFilter() {
        return iysFilter;
    }

    /**
     * "iys_filter" alanını ayarlar.
     *
     * @param iysFilter yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public ChannelConfigConfig setIysFilter(String iysFilter) {
        this.iysFilter = iysFilter;
        return this;
    }
}
