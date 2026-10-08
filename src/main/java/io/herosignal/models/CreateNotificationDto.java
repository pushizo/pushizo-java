// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package io.herosignal.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * CreateNotificationDto şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class CreateNotificationDto {
    @JsonProperty("app_id")
    private String appId;

    @JsonProperty("idempotency_key")
    private String idempotencyKey;

    /**
     * Zorunlu.
     */
    @JsonProperty("target")
    private CreateNotificationDtoTarget target;

    @JsonProperty("headings")
    private java.util.Map<String, String> headings;

    @JsonProperty("contents")
    private java.util.Map<String, String> contents;

    @JsonProperty("subtitle")
    private java.util.Map<String, String> subtitle;

    @JsonProperty("url")
    private String url;

    @JsonProperty("app_url")
    private String appUrl;

    @JsonProperty("data")
    private java.util.Map<String, String> data;

    @JsonProperty("buttons")
    private java.util.List<CreateNotificationDtoButtonsItem> buttons;

    @JsonProperty("big_picture")
    private String bigPicture;

    @JsonProperty("ios_attachments")
    private java.util.Map<String, String> iosAttachments;

    @JsonProperty("ios_sound")
    private String iosSound;

    /**
     * Değerler: "None", "SetTo", "Increase".
     */
    @JsonProperty("ios_badge_type")
    private String iosBadgeType;

    @JsonProperty("ios_badge_count")
    private Long iosBadgeCount;

    /**
     * Değerler: "passive", "active", "time-sensitive", "critical".
     */
    @JsonProperty("ios_interruption_level")
    private String iosInterruptionLevel;

    @JsonProperty("ios_category")
    private String iosCategory;

    @JsonProperty("thread_id")
    private String threadId;

    @JsonProperty("ios_relevance_score")
    private Double iosRelevanceScore;

    @JsonProperty("target_content_identifier")
    private String targetContentIdentifier;

    @JsonProperty("android_channel_id")
    private String androidChannelId;

    @JsonProperty("android_group")
    private String androidGroup;

    @JsonProperty("android_sound")
    private String androidSound;

    @JsonProperty("small_icon")
    private String smallIcon;

    @JsonProperty("large_icon")
    private String largeIcon;

    @JsonProperty("android_accent_color")
    private String androidAccentColor;

    /**
     * Değerler: 1, 0, -1.
     */
    @JsonProperty("android_visibility")
    private Long androidVisibility;

    @JsonProperty("chrome_web_icon")
    private String chromeWebIcon;

    @JsonProperty("chrome_web_image")
    private String chromeWebImage;

    @JsonProperty("chrome_web_badge")
    private String chromeWebBadge;

    @JsonProperty("web_push_topic")
    private String webPushTopic;

    @JsonProperty("web_buttons")
    private java.util.List<CreateNotificationDtoWebButtonsItem> webButtons;

    @JsonProperty("require_interaction")
    private Boolean requireInteraction;

    @JsonProperty("content_available")
    private Boolean contentAvailable;

    @JsonProperty("mutable_content")
    private Boolean mutableContent;

    @JsonProperty("collapse_id")
    private String collapseId;

    /**
     * Değerler: 5, 10.
     */
    @JsonProperty("priority")
    private Long priority;

    @JsonProperty("ttl")
    private Long ttl;

    @JsonProperty("send_after")
    private String sendAfter;

    /**
     * Değerler: "timezone", "optimized".
     */
    @JsonProperty("delayed_option")
    private String delayedOption;

    @JsonProperty("delivery_time_of_day")
    private String deliveryTimeOfDay;

    @JsonProperty("template_id")
    private String templateId;

    @JsonProperty("custom_data")
    private java.util.Map<String, Object> customData;

    @JsonProperty("email_subject")
    private String emailSubject;

    @JsonProperty("email_body")
    private String emailBody;

    @JsonProperty("email_mjml")
    private String emailMjml;

    @JsonProperty("email_preheader")
    private String emailPreheader;

    @JsonProperty("email_from_name")
    private String emailFromName;

    @JsonProperty("email_from_address")
    private String emailFromAddress;

    @JsonProperty("email_reply_to_address")
    private String emailReplyToAddress;

    @JsonProperty("disable_email_click_tracking")
    private Boolean disableEmailClickTracking;

    @JsonProperty("sms_from")
    private String smsFrom;

    @JsonProperty("sms_media_urls")
    private java.util.List<String> smsMediaUrls;

    @JsonProperty("disable_sms_link_shortening")
    private Boolean disableSmsLinkShortening;

    @JsonProperty("add_to_inbox")
    private Boolean addToInbox;

    @JsonProperty("inbox_ttl")
    private Long inboxTtl;

    @JsonProperty("frequency_cap_exempt")
    private Boolean frequencyCapExempt;

    @JsonProperty("quiet_hours_exempt")
    private Boolean quietHoursExempt;

    @JsonProperty("one_per_user")
    private Boolean onePerUser;

    @JsonProperty("throttle_rate_per_minute")
    private Long throttleRatePerMinute;

    @JsonProperty("include_unsubscribed")
    private Boolean includeUnsubscribed;

    @JsonProperty("name")
    private String name;

    @JsonProperty("labels")
    private java.util.List<String> labels;

    @JsonProperty("category")
    private String category;

    public String getAppId() {
        return appId;
    }

    public CreateNotificationDto appId(String appId) {
        this.appId = appId;
        return this;
    }

    public String getIdempotencyKey() {
        return idempotencyKey;
    }

    public CreateNotificationDto idempotencyKey(String idempotencyKey) {
        this.idempotencyKey = idempotencyKey;
        return this;
    }

    public CreateNotificationDtoTarget getTarget() {
        return target;
    }

    public CreateNotificationDto target(CreateNotificationDtoTarget target) {
        this.target = target;
        return this;
    }

    public java.util.Map<String, String> getHeadings() {
        return headings;
    }

    public CreateNotificationDto headings(java.util.Map<String, String> headings) {
        this.headings = headings;
        return this;
    }

    public java.util.Map<String, String> getContents() {
        return contents;
    }

    public CreateNotificationDto contents(java.util.Map<String, String> contents) {
        this.contents = contents;
        return this;
    }

    public java.util.Map<String, String> getSubtitle() {
        return subtitle;
    }

    public CreateNotificationDto subtitle(java.util.Map<String, String> subtitle) {
        this.subtitle = subtitle;
        return this;
    }

    public String getUrl() {
        return url;
    }

    public CreateNotificationDto url(String url) {
        this.url = url;
        return this;
    }

    public String getAppUrl() {
        return appUrl;
    }

    public CreateNotificationDto appUrl(String appUrl) {
        this.appUrl = appUrl;
        return this;
    }

    public java.util.Map<String, String> getData() {
        return data;
    }

    public CreateNotificationDto data(java.util.Map<String, String> data) {
        this.data = data;
        return this;
    }

    public java.util.List<CreateNotificationDtoButtonsItem> getButtons() {
        return buttons;
    }

    public CreateNotificationDto buttons(java.util.List<CreateNotificationDtoButtonsItem> buttons) {
        this.buttons = buttons;
        return this;
    }

    public String getBigPicture() {
        return bigPicture;
    }

    public CreateNotificationDto bigPicture(String bigPicture) {
        this.bigPicture = bigPicture;
        return this;
    }

    public java.util.Map<String, String> getIosAttachments() {
        return iosAttachments;
    }

    public CreateNotificationDto iosAttachments(java.util.Map<String, String> iosAttachments) {
        this.iosAttachments = iosAttachments;
        return this;
    }

    public String getIosSound() {
        return iosSound;
    }

    public CreateNotificationDto iosSound(String iosSound) {
        this.iosSound = iosSound;
        return this;
    }

    public String getIosBadgeType() {
        return iosBadgeType;
    }

    public CreateNotificationDto iosBadgeType(String iosBadgeType) {
        this.iosBadgeType = iosBadgeType;
        return this;
    }

    public Long getIosBadgeCount() {
        return iosBadgeCount;
    }

    public CreateNotificationDto iosBadgeCount(Long iosBadgeCount) {
        this.iosBadgeCount = iosBadgeCount;
        return this;
    }

    public String getIosInterruptionLevel() {
        return iosInterruptionLevel;
    }

    public CreateNotificationDto iosInterruptionLevel(String iosInterruptionLevel) {
        this.iosInterruptionLevel = iosInterruptionLevel;
        return this;
    }

    public String getIosCategory() {
        return iosCategory;
    }

    public CreateNotificationDto iosCategory(String iosCategory) {
        this.iosCategory = iosCategory;
        return this;
    }

    public String getThreadId() {
        return threadId;
    }

    public CreateNotificationDto threadId(String threadId) {
        this.threadId = threadId;
        return this;
    }

    public Double getIosRelevanceScore() {
        return iosRelevanceScore;
    }

    public CreateNotificationDto iosRelevanceScore(Double iosRelevanceScore) {
        this.iosRelevanceScore = iosRelevanceScore;
        return this;
    }

    public String getTargetContentIdentifier() {
        return targetContentIdentifier;
    }

    public CreateNotificationDto targetContentIdentifier(String targetContentIdentifier) {
        this.targetContentIdentifier = targetContentIdentifier;
        return this;
    }

    public String getAndroidChannelId() {
        return androidChannelId;
    }

    public CreateNotificationDto androidChannelId(String androidChannelId) {
        this.androidChannelId = androidChannelId;
        return this;
    }

    public String getAndroidGroup() {
        return androidGroup;
    }

    public CreateNotificationDto androidGroup(String androidGroup) {
        this.androidGroup = androidGroup;
        return this;
    }

    public String getAndroidSound() {
        return androidSound;
    }

    public CreateNotificationDto androidSound(String androidSound) {
        this.androidSound = androidSound;
        return this;
    }

    public String getSmallIcon() {
        return smallIcon;
    }

    public CreateNotificationDto smallIcon(String smallIcon) {
        this.smallIcon = smallIcon;
        return this;
    }

    public String getLargeIcon() {
        return largeIcon;
    }

    public CreateNotificationDto largeIcon(String largeIcon) {
        this.largeIcon = largeIcon;
        return this;
    }

    public String getAndroidAccentColor() {
        return androidAccentColor;
    }

    public CreateNotificationDto androidAccentColor(String androidAccentColor) {
        this.androidAccentColor = androidAccentColor;
        return this;
    }

    public Long getAndroidVisibility() {
        return androidVisibility;
    }

    public CreateNotificationDto androidVisibility(Long androidVisibility) {
        this.androidVisibility = androidVisibility;
        return this;
    }

    public String getChromeWebIcon() {
        return chromeWebIcon;
    }

    public CreateNotificationDto chromeWebIcon(String chromeWebIcon) {
        this.chromeWebIcon = chromeWebIcon;
        return this;
    }

    public String getChromeWebImage() {
        return chromeWebImage;
    }

    public CreateNotificationDto chromeWebImage(String chromeWebImage) {
        this.chromeWebImage = chromeWebImage;
        return this;
    }

    public String getChromeWebBadge() {
        return chromeWebBadge;
    }

    public CreateNotificationDto chromeWebBadge(String chromeWebBadge) {
        this.chromeWebBadge = chromeWebBadge;
        return this;
    }

    public String getWebPushTopic() {
        return webPushTopic;
    }

    public CreateNotificationDto webPushTopic(String webPushTopic) {
        this.webPushTopic = webPushTopic;
        return this;
    }

    public java.util.List<CreateNotificationDtoWebButtonsItem> getWebButtons() {
        return webButtons;
    }

    public CreateNotificationDto webButtons(java.util.List<CreateNotificationDtoWebButtonsItem> webButtons) {
        this.webButtons = webButtons;
        return this;
    }

    public Boolean getRequireInteraction() {
        return requireInteraction;
    }

    public CreateNotificationDto requireInteraction(Boolean requireInteraction) {
        this.requireInteraction = requireInteraction;
        return this;
    }

    public Boolean getContentAvailable() {
        return contentAvailable;
    }

    public CreateNotificationDto contentAvailable(Boolean contentAvailable) {
        this.contentAvailable = contentAvailable;
        return this;
    }

    public Boolean getMutableContent() {
        return mutableContent;
    }

    public CreateNotificationDto mutableContent(Boolean mutableContent) {
        this.mutableContent = mutableContent;
        return this;
    }

    public String getCollapseId() {
        return collapseId;
    }

    public CreateNotificationDto collapseId(String collapseId) {
        this.collapseId = collapseId;
        return this;
    }

    public Long getPriority() {
        return priority;
    }

    public CreateNotificationDto priority(Long priority) {
        this.priority = priority;
        return this;
    }

    public Long getTtl() {
        return ttl;
    }

    public CreateNotificationDto ttl(Long ttl) {
        this.ttl = ttl;
        return this;
    }

    public String getSendAfter() {
        return sendAfter;
    }

    public CreateNotificationDto sendAfter(String sendAfter) {
        this.sendAfter = sendAfter;
        return this;
    }

    public String getDelayedOption() {
        return delayedOption;
    }

    public CreateNotificationDto delayedOption(String delayedOption) {
        this.delayedOption = delayedOption;
        return this;
    }

    public String getDeliveryTimeOfDay() {
        return deliveryTimeOfDay;
    }

    public CreateNotificationDto deliveryTimeOfDay(String deliveryTimeOfDay) {
        this.deliveryTimeOfDay = deliveryTimeOfDay;
        return this;
    }

    public String getTemplateId() {
        return templateId;
    }

    public CreateNotificationDto templateId(String templateId) {
        this.templateId = templateId;
        return this;
    }

    public java.util.Map<String, Object> getCustomData() {
        return customData;
    }

    public CreateNotificationDto customData(java.util.Map<String, Object> customData) {
        this.customData = customData;
        return this;
    }

    public String getEmailSubject() {
        return emailSubject;
    }

    public CreateNotificationDto emailSubject(String emailSubject) {
        this.emailSubject = emailSubject;
        return this;
    }

    public String getEmailBody() {
        return emailBody;
    }

    public CreateNotificationDto emailBody(String emailBody) {
        this.emailBody = emailBody;
        return this;
    }

    public String getEmailMjml() {
        return emailMjml;
    }

    public CreateNotificationDto emailMjml(String emailMjml) {
        this.emailMjml = emailMjml;
        return this;
    }

    public String getEmailPreheader() {
        return emailPreheader;
    }

    public CreateNotificationDto emailPreheader(String emailPreheader) {
        this.emailPreheader = emailPreheader;
        return this;
    }

    public String getEmailFromName() {
        return emailFromName;
    }

    public CreateNotificationDto emailFromName(String emailFromName) {
        this.emailFromName = emailFromName;
        return this;
    }

    public String getEmailFromAddress() {
        return emailFromAddress;
    }

    public CreateNotificationDto emailFromAddress(String emailFromAddress) {
        this.emailFromAddress = emailFromAddress;
        return this;
    }

    public String getEmailReplyToAddress() {
        return emailReplyToAddress;
    }

    public CreateNotificationDto emailReplyToAddress(String emailReplyToAddress) {
        this.emailReplyToAddress = emailReplyToAddress;
        return this;
    }

    public Boolean getDisableEmailClickTracking() {
        return disableEmailClickTracking;
    }

    public CreateNotificationDto disableEmailClickTracking(Boolean disableEmailClickTracking) {
        this.disableEmailClickTracking = disableEmailClickTracking;
        return this;
    }

    public String getSmsFrom() {
        return smsFrom;
    }

    public CreateNotificationDto smsFrom(String smsFrom) {
        this.smsFrom = smsFrom;
        return this;
    }

    public java.util.List<String> getSmsMediaUrls() {
        return smsMediaUrls;
    }

    public CreateNotificationDto smsMediaUrls(java.util.List<String> smsMediaUrls) {
        this.smsMediaUrls = smsMediaUrls;
        return this;
    }

    public Boolean getDisableSmsLinkShortening() {
        return disableSmsLinkShortening;
    }

    public CreateNotificationDto disableSmsLinkShortening(Boolean disableSmsLinkShortening) {
        this.disableSmsLinkShortening = disableSmsLinkShortening;
        return this;
    }

    public Boolean getAddToInbox() {
        return addToInbox;
    }

    public CreateNotificationDto addToInbox(Boolean addToInbox) {
        this.addToInbox = addToInbox;
        return this;
    }

    public Long getInboxTtl() {
        return inboxTtl;
    }

    public CreateNotificationDto inboxTtl(Long inboxTtl) {
        this.inboxTtl = inboxTtl;
        return this;
    }

    public Boolean getFrequencyCapExempt() {
        return frequencyCapExempt;
    }

    public CreateNotificationDto frequencyCapExempt(Boolean frequencyCapExempt) {
        this.frequencyCapExempt = frequencyCapExempt;
        return this;
    }

    public Boolean getQuietHoursExempt() {
        return quietHoursExempt;
    }

    public CreateNotificationDto quietHoursExempt(Boolean quietHoursExempt) {
        this.quietHoursExempt = quietHoursExempt;
        return this;
    }

    public Boolean getOnePerUser() {
        return onePerUser;
    }

    public CreateNotificationDto onePerUser(Boolean onePerUser) {
        this.onePerUser = onePerUser;
        return this;
    }

    public Long getThrottleRatePerMinute() {
        return throttleRatePerMinute;
    }

    public CreateNotificationDto throttleRatePerMinute(Long throttleRatePerMinute) {
        this.throttleRatePerMinute = throttleRatePerMinute;
        return this;
    }

    public Boolean getIncludeUnsubscribed() {
        return includeUnsubscribed;
    }

    public CreateNotificationDto includeUnsubscribed(Boolean includeUnsubscribed) {
        this.includeUnsubscribed = includeUnsubscribed;
        return this;
    }

    public String getName() {
        return name;
    }

    public CreateNotificationDto name(String name) {
        this.name = name;
        return this;
    }

    public java.util.List<String> getLabels() {
        return labels;
    }

    public CreateNotificationDto labels(java.util.List<String> labels) {
        this.labels = labels;
        return this;
    }

    public String getCategory() {
        return category;
    }

    public CreateNotificationDto category(String category) {
        this.category = category;
        return this;
    }

    @Override
    public String toString() {
        return io.herosignal.core.Json.stringify(this);
    }
}
