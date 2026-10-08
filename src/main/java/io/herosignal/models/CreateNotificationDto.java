// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.
package io.herosignal.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import java.util.Map;
/** CreateNotificationDto şeması (api/openapi.yaml). */
public final class CreateNotificationDto {

    /** "app_id" alanı. */
    @JsonProperty("app_id")
    private String appId;

    /** "idempotency_key" alanı. */
    @JsonProperty("idempotency_key")
    private String idempotencyKey;

    /** "target" alanı. Zorunlu. */
    @JsonProperty("target")
    private CreateNotificationDtoTarget target;

    /** "headings" alanı. */
    @JsonProperty("headings")
    private Map<String, String> headings;

    /** "contents" alanı. */
    @JsonProperty("contents")
    private Map<String, String> contents;

    /** "subtitle" alanı. */
    @JsonProperty("subtitle")
    private Map<String, String> subtitle;

    /** "url" alanı. */
    @JsonProperty("url")
    private String url;

    /** "app_url" alanı. */
    @JsonProperty("app_url")
    private String appUrl;

    /** "data" alanı. */
    @JsonProperty("data")
    private Map<String, String> data;

    /** "buttons" alanı. */
    @JsonProperty("buttons")
    private List<CreateNotificationDtoButtonsItem> buttons;

    /** "big_picture" alanı. */
    @JsonProperty("big_picture")
    private String bigPicture;

    /** "ios_attachments" alanı. */
    @JsonProperty("ios_attachments")
    private Map<String, String> iosAttachments;

    /** "ios_sound" alanı. */
    @JsonProperty("ios_sound")
    private String iosSound;

    /** "ios_badge_type" alanı. Değerler: "None", "SetTo", "Increase". */
    @JsonProperty("ios_badge_type")
    private String iosBadgeType;

    /** "ios_badge_count" alanı. */
    @JsonProperty("ios_badge_count")
    private Long iosBadgeCount;

    /** "ios_interruption_level" alanı. Değerler: "passive", "active", "time-sensitive", "critical". */
    @JsonProperty("ios_interruption_level")
    private String iosInterruptionLevel;

    /** "ios_category" alanı. */
    @JsonProperty("ios_category")
    private String iosCategory;

    /** "android_channel_id" alanı. */
    @JsonProperty("android_channel_id")
    private String androidChannelId;

    /** "android_group" alanı. */
    @JsonProperty("android_group")
    private String androidGroup;

    /** "android_sound" alanı. */
    @JsonProperty("android_sound")
    private String androidSound;

    /** "chrome_web_icon" alanı. */
    @JsonProperty("chrome_web_icon")
    private String chromeWebIcon;

    /** "chrome_web_image" alanı. */
    @JsonProperty("chrome_web_image")
    private String chromeWebImage;

    /** "chrome_web_badge" alanı. */
    @JsonProperty("chrome_web_badge")
    private String chromeWebBadge;

    /** "web_push_topic" alanı. */
    @JsonProperty("web_push_topic")
    private String webPushTopic;

    /** "name" alanı. */
    @JsonProperty("name")
    private String name;

    /** "small_icon" alanı. */
    @JsonProperty("small_icon")
    private String smallIcon;

    /** "large_icon" alanı. */
    @JsonProperty("large_icon")
    private String largeIcon;

    /** "android_accent_color" alanı. */
    @JsonProperty("android_accent_color")
    private String androidAccentColor;

    /** "android_visibility" alanı. Değerler: 1, 0, -1. */
    @JsonProperty("android_visibility")
    private Long androidVisibility;

    /** "web_buttons" alanı. */
    @JsonProperty("web_buttons")
    private List<CreateNotificationDtoWebButtonsItem> webButtons;

    /** "require_interaction" alanı. */
    @JsonProperty("require_interaction")
    private Boolean requireInteraction;

    /** "ios_relevance_score" alanı. */
    @JsonProperty("ios_relevance_score")
    private Double iosRelevanceScore;

    /** "thread_id" alanı. */
    @JsonProperty("thread_id")
    private String threadId;

    /** "target_content_identifier" alanı. */
    @JsonProperty("target_content_identifier")
    private String targetContentIdentifier;

    /** "throttle_rate_per_minute" alanı. */
    @JsonProperty("throttle_rate_per_minute")
    private Long throttleRatePerMinute;

    /** "sms_media_urls" alanı. */
    @JsonProperty("sms_media_urls")
    private List<String> smsMediaUrls;

    /** "content_available" alanı. */
    @JsonProperty("content_available")
    private Boolean contentAvailable;

    /** "mutable_content" alanı. */
    @JsonProperty("mutable_content")
    private Boolean mutableContent;

    /** "collapse_id" alanı. */
    @JsonProperty("collapse_id")
    private String collapseId;

    /** "priority" alanı. Değerler: 5, 10. */
    @JsonProperty("priority")
    private Long priority;

    /** "ttl" alanı. */
    @JsonProperty("ttl")
    private Long ttl;

    /** "send_after" alanı. */
    @JsonProperty("send_after")
    private String sendAfter;

    /** "delayed_option" alanı. Değerler: "timezone", "optimized". */
    @JsonProperty("delayed_option")
    private String delayedOption;

    /** "delivery_time_of_day" alanı. */
    @JsonProperty("delivery_time_of_day")
    private String deliveryTimeOfDay;

    /** "template_id" alanı. */
    @JsonProperty("template_id")
    private String templateId;

    /** "custom_data" alanı. */
    @JsonProperty("custom_data")
    private Map<String, Object> customData;

    /** "email_subject" alanı. */
    @JsonProperty("email_subject")
    private String emailSubject;

    /** "email_body" alanı. */
    @JsonProperty("email_body")
    private String emailBody;

    /** "email_mjml" alanı. */
    @JsonProperty("email_mjml")
    private String emailMjml;

    /** "email_preheader" alanı. */
    @JsonProperty("email_preheader")
    private String emailPreheader;

    /** "email_from_name" alanı. */
    @JsonProperty("email_from_name")
    private String emailFromName;

    /** "email_from_address" alanı. */
    @JsonProperty("email_from_address")
    private String emailFromAddress;

    /** "email_reply_to_address" alanı. */
    @JsonProperty("email_reply_to_address")
    private String emailReplyToAddress;

    /** "disable_email_click_tracking" alanı. */
    @JsonProperty("disable_email_click_tracking")
    private Boolean disableEmailClickTracking;

    /** "sms_from" alanı. */
    @JsonProperty("sms_from")
    private String smsFrom;

    /** "disable_sms_link_shortening" alanı. */
    @JsonProperty("disable_sms_link_shortening")
    private Boolean disableSmsLinkShortening;

    /** "add_to_inbox" alanı. */
    @JsonProperty("add_to_inbox")
    private Boolean addToInbox;

    /** "inbox_ttl" alanı. */
    @JsonProperty("inbox_ttl")
    private Long inboxTtl;

    /** "frequency_cap_exempt" alanı. */
    @JsonProperty("frequency_cap_exempt")
    private Boolean frequencyCapExempt;

    /** "quiet_hours_exempt" alanı. */
    @JsonProperty("quiet_hours_exempt")
    private Boolean quietHoursExempt;

    /** "one_per_user" alanı. */
    @JsonProperty("one_per_user")
    private Boolean onePerUser;

    /** @return "app_id" alanı */
    public String getAppId() {
        return appId;
    }

    /**
     * "app_id" alanını ayarlar.
     *
     * @param appId yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public CreateNotificationDto setAppId(String appId) {
        this.appId = appId;
        return this;
    }

    /** @return "idempotency_key" alanı */
    public String getIdempotencyKey() {
        return idempotencyKey;
    }

    /**
     * "idempotency_key" alanını ayarlar.
     *
     * @param idempotencyKey yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public CreateNotificationDto setIdempotencyKey(String idempotencyKey) {
        this.idempotencyKey = idempotencyKey;
        return this;
    }

    /** @return "target" alanı */
    public CreateNotificationDtoTarget getTarget() {
        return target;
    }

    /**
     * "target" alanını ayarlar.
     *
     * @param target yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public CreateNotificationDto setTarget(CreateNotificationDtoTarget target) {
        this.target = target;
        return this;
    }

    /** @return "headings" alanı */
    public Map<String, String> getHeadings() {
        return headings;
    }

    /**
     * "headings" alanını ayarlar.
     *
     * @param headings yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public CreateNotificationDto setHeadings(Map<String, String> headings) {
        this.headings = headings;
        return this;
    }

    /** @return "contents" alanı */
    public Map<String, String> getContents() {
        return contents;
    }

    /**
     * "contents" alanını ayarlar.
     *
     * @param contents yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public CreateNotificationDto setContents(Map<String, String> contents) {
        this.contents = contents;
        return this;
    }

    /** @return "subtitle" alanı */
    public Map<String, String> getSubtitle() {
        return subtitle;
    }

    /**
     * "subtitle" alanını ayarlar.
     *
     * @param subtitle yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public CreateNotificationDto setSubtitle(Map<String, String> subtitle) {
        this.subtitle = subtitle;
        return this;
    }

    /** @return "url" alanı */
    public String getUrl() {
        return url;
    }

    /**
     * "url" alanını ayarlar.
     *
     * @param url yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public CreateNotificationDto setUrl(String url) {
        this.url = url;
        return this;
    }

    /** @return "app_url" alanı */
    public String getAppUrl() {
        return appUrl;
    }

    /**
     * "app_url" alanını ayarlar.
     *
     * @param appUrl yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public CreateNotificationDto setAppUrl(String appUrl) {
        this.appUrl = appUrl;
        return this;
    }

    /** @return "data" alanı */
    public Map<String, String> getData() {
        return data;
    }

    /**
     * "data" alanını ayarlar.
     *
     * @param data yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public CreateNotificationDto setData(Map<String, String> data) {
        this.data = data;
        return this;
    }

    /** @return "buttons" alanı */
    public List<CreateNotificationDtoButtonsItem> getButtons() {
        return buttons;
    }

    /**
     * "buttons" alanını ayarlar.
     *
     * @param buttons yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public CreateNotificationDto setButtons(List<CreateNotificationDtoButtonsItem> buttons) {
        this.buttons = buttons;
        return this;
    }

    /** @return "big_picture" alanı */
    public String getBigPicture() {
        return bigPicture;
    }

    /**
     * "big_picture" alanını ayarlar.
     *
     * @param bigPicture yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public CreateNotificationDto setBigPicture(String bigPicture) {
        this.bigPicture = bigPicture;
        return this;
    }

    /** @return "ios_attachments" alanı */
    public Map<String, String> getIosAttachments() {
        return iosAttachments;
    }

    /**
     * "ios_attachments" alanını ayarlar.
     *
     * @param iosAttachments yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public CreateNotificationDto setIosAttachments(Map<String, String> iosAttachments) {
        this.iosAttachments = iosAttachments;
        return this;
    }

    /** @return "ios_sound" alanı */
    public String getIosSound() {
        return iosSound;
    }

    /**
     * "ios_sound" alanını ayarlar.
     *
     * @param iosSound yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public CreateNotificationDto setIosSound(String iosSound) {
        this.iosSound = iosSound;
        return this;
    }

    /** @return "ios_badge_type" alanı */
    public String getIosBadgeType() {
        return iosBadgeType;
    }

    /**
     * "ios_badge_type" alanını ayarlar.
     *
     * @param iosBadgeType yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public CreateNotificationDto setIosBadgeType(String iosBadgeType) {
        this.iosBadgeType = iosBadgeType;
        return this;
    }

    /** @return "ios_badge_count" alanı */
    public Long getIosBadgeCount() {
        return iosBadgeCount;
    }

    /**
     * "ios_badge_count" alanını ayarlar.
     *
     * @param iosBadgeCount yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public CreateNotificationDto setIosBadgeCount(Long iosBadgeCount) {
        this.iosBadgeCount = iosBadgeCount;
        return this;
    }

    /** @return "ios_interruption_level" alanı */
    public String getIosInterruptionLevel() {
        return iosInterruptionLevel;
    }

    /**
     * "ios_interruption_level" alanını ayarlar.
     *
     * @param iosInterruptionLevel yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public CreateNotificationDto setIosInterruptionLevel(String iosInterruptionLevel) {
        this.iosInterruptionLevel = iosInterruptionLevel;
        return this;
    }

    /** @return "ios_category" alanı */
    public String getIosCategory() {
        return iosCategory;
    }

    /**
     * "ios_category" alanını ayarlar.
     *
     * @param iosCategory yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public CreateNotificationDto setIosCategory(String iosCategory) {
        this.iosCategory = iosCategory;
        return this;
    }

    /** @return "android_channel_id" alanı */
    public String getAndroidChannelId() {
        return androidChannelId;
    }

    /**
     * "android_channel_id" alanını ayarlar.
     *
     * @param androidChannelId yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public CreateNotificationDto setAndroidChannelId(String androidChannelId) {
        this.androidChannelId = androidChannelId;
        return this;
    }

    /** @return "android_group" alanı */
    public String getAndroidGroup() {
        return androidGroup;
    }

    /**
     * "android_group" alanını ayarlar.
     *
     * @param androidGroup yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public CreateNotificationDto setAndroidGroup(String androidGroup) {
        this.androidGroup = androidGroup;
        return this;
    }

    /** @return "android_sound" alanı */
    public String getAndroidSound() {
        return androidSound;
    }

    /**
     * "android_sound" alanını ayarlar.
     *
     * @param androidSound yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public CreateNotificationDto setAndroidSound(String androidSound) {
        this.androidSound = androidSound;
        return this;
    }

    /** @return "chrome_web_icon" alanı */
    public String getChromeWebIcon() {
        return chromeWebIcon;
    }

    /**
     * "chrome_web_icon" alanını ayarlar.
     *
     * @param chromeWebIcon yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public CreateNotificationDto setChromeWebIcon(String chromeWebIcon) {
        this.chromeWebIcon = chromeWebIcon;
        return this;
    }

    /** @return "chrome_web_image" alanı */
    public String getChromeWebImage() {
        return chromeWebImage;
    }

    /**
     * "chrome_web_image" alanını ayarlar.
     *
     * @param chromeWebImage yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public CreateNotificationDto setChromeWebImage(String chromeWebImage) {
        this.chromeWebImage = chromeWebImage;
        return this;
    }

    /** @return "chrome_web_badge" alanı */
    public String getChromeWebBadge() {
        return chromeWebBadge;
    }

    /**
     * "chrome_web_badge" alanını ayarlar.
     *
     * @param chromeWebBadge yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public CreateNotificationDto setChromeWebBadge(String chromeWebBadge) {
        this.chromeWebBadge = chromeWebBadge;
        return this;
    }

    /** @return "web_push_topic" alanı */
    public String getWebPushTopic() {
        return webPushTopic;
    }

    /**
     * "web_push_topic" alanını ayarlar.
     *
     * @param webPushTopic yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public CreateNotificationDto setWebPushTopic(String webPushTopic) {
        this.webPushTopic = webPushTopic;
        return this;
    }

    /** @return "name" alanı */
    public String getName() {
        return name;
    }

    /**
     * "name" alanını ayarlar.
     *
     * @param name yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public CreateNotificationDto setName(String name) {
        this.name = name;
        return this;
    }

    /** @return "small_icon" alanı */
    public String getSmallIcon() {
        return smallIcon;
    }

    /**
     * "small_icon" alanını ayarlar.
     *
     * @param smallIcon yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public CreateNotificationDto setSmallIcon(String smallIcon) {
        this.smallIcon = smallIcon;
        return this;
    }

    /** @return "large_icon" alanı */
    public String getLargeIcon() {
        return largeIcon;
    }

    /**
     * "large_icon" alanını ayarlar.
     *
     * @param largeIcon yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public CreateNotificationDto setLargeIcon(String largeIcon) {
        this.largeIcon = largeIcon;
        return this;
    }

    /** @return "android_accent_color" alanı */
    public String getAndroidAccentColor() {
        return androidAccentColor;
    }

    /**
     * "android_accent_color" alanını ayarlar.
     *
     * @param androidAccentColor yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public CreateNotificationDto setAndroidAccentColor(String androidAccentColor) {
        this.androidAccentColor = androidAccentColor;
        return this;
    }

    /** @return "android_visibility" alanı */
    public Long getAndroidVisibility() {
        return androidVisibility;
    }

    /**
     * "android_visibility" alanını ayarlar.
     *
     * @param androidVisibility yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public CreateNotificationDto setAndroidVisibility(Long androidVisibility) {
        this.androidVisibility = androidVisibility;
        return this;
    }

    /** @return "web_buttons" alanı */
    public List<CreateNotificationDtoWebButtonsItem> getWebButtons() {
        return webButtons;
    }

    /**
     * "web_buttons" alanını ayarlar.
     *
     * @param webButtons yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public CreateNotificationDto setWebButtons(List<CreateNotificationDtoWebButtonsItem> webButtons) {
        this.webButtons = webButtons;
        return this;
    }

    /** @return "require_interaction" alanı */
    public Boolean getRequireInteraction() {
        return requireInteraction;
    }

    /**
     * "require_interaction" alanını ayarlar.
     *
     * @param requireInteraction yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public CreateNotificationDto setRequireInteraction(Boolean requireInteraction) {
        this.requireInteraction = requireInteraction;
        return this;
    }

    /** @return "ios_relevance_score" alanı */
    public Double getIosRelevanceScore() {
        return iosRelevanceScore;
    }

    /**
     * "ios_relevance_score" alanını ayarlar.
     *
     * @param iosRelevanceScore yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public CreateNotificationDto setIosRelevanceScore(Double iosRelevanceScore) {
        this.iosRelevanceScore = iosRelevanceScore;
        return this;
    }

    /** @return "thread_id" alanı */
    public String getThreadId() {
        return threadId;
    }

    /**
     * "thread_id" alanını ayarlar.
     *
     * @param threadId yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public CreateNotificationDto setThreadId(String threadId) {
        this.threadId = threadId;
        return this;
    }

    /** @return "target_content_identifier" alanı */
    public String getTargetContentIdentifier() {
        return targetContentIdentifier;
    }

    /**
     * "target_content_identifier" alanını ayarlar.
     *
     * @param targetContentIdentifier yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public CreateNotificationDto setTargetContentIdentifier(String targetContentIdentifier) {
        this.targetContentIdentifier = targetContentIdentifier;
        return this;
    }

    /** @return "throttle_rate_per_minute" alanı */
    public Long getThrottleRatePerMinute() {
        return throttleRatePerMinute;
    }

    /**
     * "throttle_rate_per_minute" alanını ayarlar.
     *
     * @param throttleRatePerMinute yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public CreateNotificationDto setThrottleRatePerMinute(Long throttleRatePerMinute) {
        this.throttleRatePerMinute = throttleRatePerMinute;
        return this;
    }

    /** @return "sms_media_urls" alanı */
    public List<String> getSmsMediaUrls() {
        return smsMediaUrls;
    }

    /**
     * "sms_media_urls" alanını ayarlar.
     *
     * @param smsMediaUrls yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public CreateNotificationDto setSmsMediaUrls(List<String> smsMediaUrls) {
        this.smsMediaUrls = smsMediaUrls;
        return this;
    }

    /** @return "content_available" alanı */
    public Boolean getContentAvailable() {
        return contentAvailable;
    }

    /**
     * "content_available" alanını ayarlar.
     *
     * @param contentAvailable yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public CreateNotificationDto setContentAvailable(Boolean contentAvailable) {
        this.contentAvailable = contentAvailable;
        return this;
    }

    /** @return "mutable_content" alanı */
    public Boolean getMutableContent() {
        return mutableContent;
    }

    /**
     * "mutable_content" alanını ayarlar.
     *
     * @param mutableContent yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public CreateNotificationDto setMutableContent(Boolean mutableContent) {
        this.mutableContent = mutableContent;
        return this;
    }

    /** @return "collapse_id" alanı */
    public String getCollapseId() {
        return collapseId;
    }

    /**
     * "collapse_id" alanını ayarlar.
     *
     * @param collapseId yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public CreateNotificationDto setCollapseId(String collapseId) {
        this.collapseId = collapseId;
        return this;
    }

    /** @return "priority" alanı */
    public Long getPriority() {
        return priority;
    }

    /**
     * "priority" alanını ayarlar.
     *
     * @param priority yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public CreateNotificationDto setPriority(Long priority) {
        this.priority = priority;
        return this;
    }

    /** @return "ttl" alanı */
    public Long getTtl() {
        return ttl;
    }

    /**
     * "ttl" alanını ayarlar.
     *
     * @param ttl yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public CreateNotificationDto setTtl(Long ttl) {
        this.ttl = ttl;
        return this;
    }

    /** @return "send_after" alanı */
    public String getSendAfter() {
        return sendAfter;
    }

    /**
     * "send_after" alanını ayarlar.
     *
     * @param sendAfter yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public CreateNotificationDto setSendAfter(String sendAfter) {
        this.sendAfter = sendAfter;
        return this;
    }

    /** @return "delayed_option" alanı */
    public String getDelayedOption() {
        return delayedOption;
    }

    /**
     * "delayed_option" alanını ayarlar.
     *
     * @param delayedOption yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public CreateNotificationDto setDelayedOption(String delayedOption) {
        this.delayedOption = delayedOption;
        return this;
    }

    /** @return "delivery_time_of_day" alanı */
    public String getDeliveryTimeOfDay() {
        return deliveryTimeOfDay;
    }

    /**
     * "delivery_time_of_day" alanını ayarlar.
     *
     * @param deliveryTimeOfDay yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public CreateNotificationDto setDeliveryTimeOfDay(String deliveryTimeOfDay) {
        this.deliveryTimeOfDay = deliveryTimeOfDay;
        return this;
    }

    /** @return "template_id" alanı */
    public String getTemplateId() {
        return templateId;
    }

    /**
     * "template_id" alanını ayarlar.
     *
     * @param templateId yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public CreateNotificationDto setTemplateId(String templateId) {
        this.templateId = templateId;
        return this;
    }

    /** @return "custom_data" alanı */
    public Map<String, Object> getCustomData() {
        return customData;
    }

    /**
     * "custom_data" alanını ayarlar.
     *
     * @param customData yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public CreateNotificationDto setCustomData(Map<String, Object> customData) {
        this.customData = customData;
        return this;
    }

    /** @return "email_subject" alanı */
    public String getEmailSubject() {
        return emailSubject;
    }

    /**
     * "email_subject" alanını ayarlar.
     *
     * @param emailSubject yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public CreateNotificationDto setEmailSubject(String emailSubject) {
        this.emailSubject = emailSubject;
        return this;
    }

    /** @return "email_body" alanı */
    public String getEmailBody() {
        return emailBody;
    }

    /**
     * "email_body" alanını ayarlar.
     *
     * @param emailBody yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public CreateNotificationDto setEmailBody(String emailBody) {
        this.emailBody = emailBody;
        return this;
    }

    /** @return "email_mjml" alanı */
    public String getEmailMjml() {
        return emailMjml;
    }

    /**
     * "email_mjml" alanını ayarlar.
     *
     * @param emailMjml yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public CreateNotificationDto setEmailMjml(String emailMjml) {
        this.emailMjml = emailMjml;
        return this;
    }

    /** @return "email_preheader" alanı */
    public String getEmailPreheader() {
        return emailPreheader;
    }

    /**
     * "email_preheader" alanını ayarlar.
     *
     * @param emailPreheader yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public CreateNotificationDto setEmailPreheader(String emailPreheader) {
        this.emailPreheader = emailPreheader;
        return this;
    }

    /** @return "email_from_name" alanı */
    public String getEmailFromName() {
        return emailFromName;
    }

    /**
     * "email_from_name" alanını ayarlar.
     *
     * @param emailFromName yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public CreateNotificationDto setEmailFromName(String emailFromName) {
        this.emailFromName = emailFromName;
        return this;
    }

    /** @return "email_from_address" alanı */
    public String getEmailFromAddress() {
        return emailFromAddress;
    }

    /**
     * "email_from_address" alanını ayarlar.
     *
     * @param emailFromAddress yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public CreateNotificationDto setEmailFromAddress(String emailFromAddress) {
        this.emailFromAddress = emailFromAddress;
        return this;
    }

    /** @return "email_reply_to_address" alanı */
    public String getEmailReplyToAddress() {
        return emailReplyToAddress;
    }

    /**
     * "email_reply_to_address" alanını ayarlar.
     *
     * @param emailReplyToAddress yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public CreateNotificationDto setEmailReplyToAddress(String emailReplyToAddress) {
        this.emailReplyToAddress = emailReplyToAddress;
        return this;
    }

    /** @return "disable_email_click_tracking" alanı */
    public Boolean getDisableEmailClickTracking() {
        return disableEmailClickTracking;
    }

    /**
     * "disable_email_click_tracking" alanını ayarlar.
     *
     * @param disableEmailClickTracking yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public CreateNotificationDto setDisableEmailClickTracking(Boolean disableEmailClickTracking) {
        this.disableEmailClickTracking = disableEmailClickTracking;
        return this;
    }

    /** @return "sms_from" alanı */
    public String getSmsFrom() {
        return smsFrom;
    }

    /**
     * "sms_from" alanını ayarlar.
     *
     * @param smsFrom yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public CreateNotificationDto setSmsFrom(String smsFrom) {
        this.smsFrom = smsFrom;
        return this;
    }

    /** @return "disable_sms_link_shortening" alanı */
    public Boolean getDisableSmsLinkShortening() {
        return disableSmsLinkShortening;
    }

    /**
     * "disable_sms_link_shortening" alanını ayarlar.
     *
     * @param disableSmsLinkShortening yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public CreateNotificationDto setDisableSmsLinkShortening(Boolean disableSmsLinkShortening) {
        this.disableSmsLinkShortening = disableSmsLinkShortening;
        return this;
    }

    /** @return "add_to_inbox" alanı */
    public Boolean getAddToInbox() {
        return addToInbox;
    }

    /**
     * "add_to_inbox" alanını ayarlar.
     *
     * @param addToInbox yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public CreateNotificationDto setAddToInbox(Boolean addToInbox) {
        this.addToInbox = addToInbox;
        return this;
    }

    /** @return "inbox_ttl" alanı */
    public Long getInboxTtl() {
        return inboxTtl;
    }

    /**
     * "inbox_ttl" alanını ayarlar.
     *
     * @param inboxTtl yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public CreateNotificationDto setInboxTtl(Long inboxTtl) {
        this.inboxTtl = inboxTtl;
        return this;
    }

    /** @return "frequency_cap_exempt" alanı */
    public Boolean getFrequencyCapExempt() {
        return frequencyCapExempt;
    }

    /**
     * "frequency_cap_exempt" alanını ayarlar.
     *
     * @param frequencyCapExempt yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public CreateNotificationDto setFrequencyCapExempt(Boolean frequencyCapExempt) {
        this.frequencyCapExempt = frequencyCapExempt;
        return this;
    }

    /** @return "quiet_hours_exempt" alanı */
    public Boolean getQuietHoursExempt() {
        return quietHoursExempt;
    }

    /**
     * "quiet_hours_exempt" alanını ayarlar.
     *
     * @param quietHoursExempt yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public CreateNotificationDto setQuietHoursExempt(Boolean quietHoursExempt) {
        this.quietHoursExempt = quietHoursExempt;
        return this;
    }

    /** @return "one_per_user" alanı */
    public Boolean getOnePerUser() {
        return onePerUser;
    }

    /**
     * "one_per_user" alanını ayarlar.
     *
     * @param onePerUser yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public CreateNotificationDto setOnePerUser(Boolean onePerUser) {
        this.onePerUser = onePerUser;
        return this;
    }
}
