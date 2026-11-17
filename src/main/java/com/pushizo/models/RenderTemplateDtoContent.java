// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package com.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * RenderTemplateDtoContent şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class RenderTemplateDtoContent {
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
    private java.util.List<RenderTemplateDtoContentButtonsItem> buttons;

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

    @JsonProperty("android_channel_id")
    private String androidChannelId;

    @JsonProperty("android_group")
    private String androidGroup;

    @JsonProperty("android_sound")
    private String androidSound;

    @JsonProperty("chrome_web_icon")
    private String chromeWebIcon;

    @JsonProperty("chrome_web_image")
    private String chromeWebImage;

    @JsonProperty("chrome_web_badge")
    private String chromeWebBadge;

    @JsonProperty("web_push_topic")
    private String webPushTopic;

    @JsonProperty("content_available")
    private Boolean contentAvailable;

    @JsonProperty("mutable_content")
    private Boolean mutableContent;

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

    @JsonProperty("disable_sms_link_shortening")
    private Boolean disableSmsLinkShortening;

    @JsonProperty("add_to_inbox")
    private Boolean addToInbox;

    @JsonProperty("inbox_ttl")
    private Long inboxTtl;

    @JsonProperty("content_card")
    private RenderTemplateDtoContentContentCard contentCard;

    @JsonProperty("thread_id")
    private String threadId;

    @JsonProperty("ios_relevance_score")
    private Double iosRelevanceScore;

    @JsonProperty("target_content_identifier")
    private String targetContentIdentifier;

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

    @JsonProperty("web_buttons")
    private java.util.List<RenderTemplateDtoContentWebButtonsItem> webButtons;

    @JsonProperty("require_interaction")
    private Boolean requireInteraction;

    @JsonProperty("sms_media_urls")
    private java.util.List<String> smsMediaUrls;

    @JsonProperty("whatsapp_template")
    private RenderTemplateDtoContentWhatsappTemplate whatsappTemplate;

    @JsonProperty("whatsapp_media")
    private RenderTemplateDtoContentWhatsappMedia whatsappMedia;

    @JsonProperty("whatsapp_interactive")
    private RenderTemplateDtoContentWhatsappInteractive whatsappInteractive;

    @JsonProperty("rcs_card")
    private RenderTemplateDtoContentRcsCard rcsCard;

    @JsonProperty("rcs_suggestions")
    private java.util.List<Object> rcsSuggestions;

    @JsonProperty("rcs_content_sid")
    private String rcsContentSid;

    @JsonProperty("rcs_content_variables")
    private java.util.Map<String, String> rcsContentVariables;

    @JsonProperty("rcs_fallback_text")
    private java.util.Map<String, String> rcsFallbackText;

    @JsonProperty("messenger_image_url")
    private String messengerImageUrl;

    @JsonProperty("messenger_buttons")
    private java.util.List<Object> messengerButtons;

    @JsonProperty("ios_carousel")
    private java.util.List<RenderTemplateDtoContentIosCarouselItem> iosCarousel;

    @JsonProperty("android_live_update")
    private RenderTemplateDtoContentAndroidLiveUpdate androidLiveUpdate;

    @JsonProperty("voip")
    private Boolean voip;

    @JsonProperty("app_clip")
    private Boolean appClip;

    public java.util.Map<String, String> getHeadings() {
        return headings;
    }

    public RenderTemplateDtoContent headings(java.util.Map<String, String> headings) {
        this.headings = headings;
        return this;
    }

    public java.util.Map<String, String> getContents() {
        return contents;
    }

    public RenderTemplateDtoContent contents(java.util.Map<String, String> contents) {
        this.contents = contents;
        return this;
    }

    public java.util.Map<String, String> getSubtitle() {
        return subtitle;
    }

    public RenderTemplateDtoContent subtitle(java.util.Map<String, String> subtitle) {
        this.subtitle = subtitle;
        return this;
    }

    public String getUrl() {
        return url;
    }

    public RenderTemplateDtoContent url(String url) {
        this.url = url;
        return this;
    }

    public String getAppUrl() {
        return appUrl;
    }

    public RenderTemplateDtoContent appUrl(String appUrl) {
        this.appUrl = appUrl;
        return this;
    }

    public java.util.Map<String, String> getData() {
        return data;
    }

    public RenderTemplateDtoContent data(java.util.Map<String, String> data) {
        this.data = data;
        return this;
    }

    public java.util.List<RenderTemplateDtoContentButtonsItem> getButtons() {
        return buttons;
    }

    public RenderTemplateDtoContent buttons(java.util.List<RenderTemplateDtoContentButtonsItem> buttons) {
        this.buttons = buttons;
        return this;
    }

    public String getBigPicture() {
        return bigPicture;
    }

    public RenderTemplateDtoContent bigPicture(String bigPicture) {
        this.bigPicture = bigPicture;
        return this;
    }

    public java.util.Map<String, String> getIosAttachments() {
        return iosAttachments;
    }

    public RenderTemplateDtoContent iosAttachments(java.util.Map<String, String> iosAttachments) {
        this.iosAttachments = iosAttachments;
        return this;
    }

    public String getIosSound() {
        return iosSound;
    }

    public RenderTemplateDtoContent iosSound(String iosSound) {
        this.iosSound = iosSound;
        return this;
    }

    public String getIosBadgeType() {
        return iosBadgeType;
    }

    public RenderTemplateDtoContent iosBadgeType(String iosBadgeType) {
        this.iosBadgeType = iosBadgeType;
        return this;
    }

    public Long getIosBadgeCount() {
        return iosBadgeCount;
    }

    public RenderTemplateDtoContent iosBadgeCount(Long iosBadgeCount) {
        this.iosBadgeCount = iosBadgeCount;
        return this;
    }

    public String getIosInterruptionLevel() {
        return iosInterruptionLevel;
    }

    public RenderTemplateDtoContent iosInterruptionLevel(String iosInterruptionLevel) {
        this.iosInterruptionLevel = iosInterruptionLevel;
        return this;
    }

    public String getIosCategory() {
        return iosCategory;
    }

    public RenderTemplateDtoContent iosCategory(String iosCategory) {
        this.iosCategory = iosCategory;
        return this;
    }

    public String getAndroidChannelId() {
        return androidChannelId;
    }

    public RenderTemplateDtoContent androidChannelId(String androidChannelId) {
        this.androidChannelId = androidChannelId;
        return this;
    }

    public String getAndroidGroup() {
        return androidGroup;
    }

    public RenderTemplateDtoContent androidGroup(String androidGroup) {
        this.androidGroup = androidGroup;
        return this;
    }

    public String getAndroidSound() {
        return androidSound;
    }

    public RenderTemplateDtoContent androidSound(String androidSound) {
        this.androidSound = androidSound;
        return this;
    }

    public String getChromeWebIcon() {
        return chromeWebIcon;
    }

    public RenderTemplateDtoContent chromeWebIcon(String chromeWebIcon) {
        this.chromeWebIcon = chromeWebIcon;
        return this;
    }

    public String getChromeWebImage() {
        return chromeWebImage;
    }

    public RenderTemplateDtoContent chromeWebImage(String chromeWebImage) {
        this.chromeWebImage = chromeWebImage;
        return this;
    }

    public String getChromeWebBadge() {
        return chromeWebBadge;
    }

    public RenderTemplateDtoContent chromeWebBadge(String chromeWebBadge) {
        this.chromeWebBadge = chromeWebBadge;
        return this;
    }

    public String getWebPushTopic() {
        return webPushTopic;
    }

    public RenderTemplateDtoContent webPushTopic(String webPushTopic) {
        this.webPushTopic = webPushTopic;
        return this;
    }

    public Boolean getContentAvailable() {
        return contentAvailable;
    }

    public RenderTemplateDtoContent contentAvailable(Boolean contentAvailable) {
        this.contentAvailable = contentAvailable;
        return this;
    }

    public Boolean getMutableContent() {
        return mutableContent;
    }

    public RenderTemplateDtoContent mutableContent(Boolean mutableContent) {
        this.mutableContent = mutableContent;
        return this;
    }

    public java.util.Map<String, Object> getCustomData() {
        return customData;
    }

    public RenderTemplateDtoContent customData(java.util.Map<String, Object> customData) {
        this.customData = customData;
        return this;
    }

    public String getEmailSubject() {
        return emailSubject;
    }

    public RenderTemplateDtoContent emailSubject(String emailSubject) {
        this.emailSubject = emailSubject;
        return this;
    }

    public String getEmailBody() {
        return emailBody;
    }

    public RenderTemplateDtoContent emailBody(String emailBody) {
        this.emailBody = emailBody;
        return this;
    }

    public String getEmailMjml() {
        return emailMjml;
    }

    public RenderTemplateDtoContent emailMjml(String emailMjml) {
        this.emailMjml = emailMjml;
        return this;
    }

    public String getEmailPreheader() {
        return emailPreheader;
    }

    public RenderTemplateDtoContent emailPreheader(String emailPreheader) {
        this.emailPreheader = emailPreheader;
        return this;
    }

    public String getEmailFromName() {
        return emailFromName;
    }

    public RenderTemplateDtoContent emailFromName(String emailFromName) {
        this.emailFromName = emailFromName;
        return this;
    }

    public String getEmailFromAddress() {
        return emailFromAddress;
    }

    public RenderTemplateDtoContent emailFromAddress(String emailFromAddress) {
        this.emailFromAddress = emailFromAddress;
        return this;
    }

    public String getEmailReplyToAddress() {
        return emailReplyToAddress;
    }

    public RenderTemplateDtoContent emailReplyToAddress(String emailReplyToAddress) {
        this.emailReplyToAddress = emailReplyToAddress;
        return this;
    }

    public Boolean getDisableEmailClickTracking() {
        return disableEmailClickTracking;
    }

    public RenderTemplateDtoContent disableEmailClickTracking(Boolean disableEmailClickTracking) {
        this.disableEmailClickTracking = disableEmailClickTracking;
        return this;
    }

    public String getSmsFrom() {
        return smsFrom;
    }

    public RenderTemplateDtoContent smsFrom(String smsFrom) {
        this.smsFrom = smsFrom;
        return this;
    }

    public Boolean getDisableSmsLinkShortening() {
        return disableSmsLinkShortening;
    }

    public RenderTemplateDtoContent disableSmsLinkShortening(Boolean disableSmsLinkShortening) {
        this.disableSmsLinkShortening = disableSmsLinkShortening;
        return this;
    }

    public Boolean getAddToInbox() {
        return addToInbox;
    }

    public RenderTemplateDtoContent addToInbox(Boolean addToInbox) {
        this.addToInbox = addToInbox;
        return this;
    }

    public Long getInboxTtl() {
        return inboxTtl;
    }

    public RenderTemplateDtoContent inboxTtl(Long inboxTtl) {
        this.inboxTtl = inboxTtl;
        return this;
    }

    public RenderTemplateDtoContentContentCard getContentCard() {
        return contentCard;
    }

    public RenderTemplateDtoContent contentCard(RenderTemplateDtoContentContentCard contentCard) {
        this.contentCard = contentCard;
        return this;
    }

    public String getThreadId() {
        return threadId;
    }

    public RenderTemplateDtoContent threadId(String threadId) {
        this.threadId = threadId;
        return this;
    }

    public Double getIosRelevanceScore() {
        return iosRelevanceScore;
    }

    public RenderTemplateDtoContent iosRelevanceScore(Double iosRelevanceScore) {
        this.iosRelevanceScore = iosRelevanceScore;
        return this;
    }

    public String getTargetContentIdentifier() {
        return targetContentIdentifier;
    }

    public RenderTemplateDtoContent targetContentIdentifier(String targetContentIdentifier) {
        this.targetContentIdentifier = targetContentIdentifier;
        return this;
    }

    public String getSmallIcon() {
        return smallIcon;
    }

    public RenderTemplateDtoContent smallIcon(String smallIcon) {
        this.smallIcon = smallIcon;
        return this;
    }

    public String getLargeIcon() {
        return largeIcon;
    }

    public RenderTemplateDtoContent largeIcon(String largeIcon) {
        this.largeIcon = largeIcon;
        return this;
    }

    public String getAndroidAccentColor() {
        return androidAccentColor;
    }

    public RenderTemplateDtoContent androidAccentColor(String androidAccentColor) {
        this.androidAccentColor = androidAccentColor;
        return this;
    }

    public Long getAndroidVisibility() {
        return androidVisibility;
    }

    public RenderTemplateDtoContent androidVisibility(Long androidVisibility) {
        this.androidVisibility = androidVisibility;
        return this;
    }

    public java.util.List<RenderTemplateDtoContentWebButtonsItem> getWebButtons() {
        return webButtons;
    }

    public RenderTemplateDtoContent webButtons(java.util.List<RenderTemplateDtoContentWebButtonsItem> webButtons) {
        this.webButtons = webButtons;
        return this;
    }

    public Boolean getRequireInteraction() {
        return requireInteraction;
    }

    public RenderTemplateDtoContent requireInteraction(Boolean requireInteraction) {
        this.requireInteraction = requireInteraction;
        return this;
    }

    public java.util.List<String> getSmsMediaUrls() {
        return smsMediaUrls;
    }

    public RenderTemplateDtoContent smsMediaUrls(java.util.List<String> smsMediaUrls) {
        this.smsMediaUrls = smsMediaUrls;
        return this;
    }

    public RenderTemplateDtoContentWhatsappTemplate getWhatsappTemplate() {
        return whatsappTemplate;
    }

    public RenderTemplateDtoContent whatsappTemplate(RenderTemplateDtoContentWhatsappTemplate whatsappTemplate) {
        this.whatsappTemplate = whatsappTemplate;
        return this;
    }

    public RenderTemplateDtoContentWhatsappMedia getWhatsappMedia() {
        return whatsappMedia;
    }

    public RenderTemplateDtoContent whatsappMedia(RenderTemplateDtoContentWhatsappMedia whatsappMedia) {
        this.whatsappMedia = whatsappMedia;
        return this;
    }

    public RenderTemplateDtoContentWhatsappInteractive getWhatsappInteractive() {
        return whatsappInteractive;
    }

    public RenderTemplateDtoContent whatsappInteractive(RenderTemplateDtoContentWhatsappInteractive whatsappInteractive) {
        this.whatsappInteractive = whatsappInteractive;
        return this;
    }

    public RenderTemplateDtoContentRcsCard getRcsCard() {
        return rcsCard;
    }

    public RenderTemplateDtoContent rcsCard(RenderTemplateDtoContentRcsCard rcsCard) {
        this.rcsCard = rcsCard;
        return this;
    }

    public java.util.List<Object> getRcsSuggestions() {
        return rcsSuggestions;
    }

    public RenderTemplateDtoContent rcsSuggestions(java.util.List<Object> rcsSuggestions) {
        this.rcsSuggestions = rcsSuggestions;
        return this;
    }

    public String getRcsContentSid() {
        return rcsContentSid;
    }

    public RenderTemplateDtoContent rcsContentSid(String rcsContentSid) {
        this.rcsContentSid = rcsContentSid;
        return this;
    }

    public java.util.Map<String, String> getRcsContentVariables() {
        return rcsContentVariables;
    }

    public RenderTemplateDtoContent rcsContentVariables(java.util.Map<String, String> rcsContentVariables) {
        this.rcsContentVariables = rcsContentVariables;
        return this;
    }

    public java.util.Map<String, String> getRcsFallbackText() {
        return rcsFallbackText;
    }

    public RenderTemplateDtoContent rcsFallbackText(java.util.Map<String, String> rcsFallbackText) {
        this.rcsFallbackText = rcsFallbackText;
        return this;
    }

    public String getMessengerImageUrl() {
        return messengerImageUrl;
    }

    public RenderTemplateDtoContent messengerImageUrl(String messengerImageUrl) {
        this.messengerImageUrl = messengerImageUrl;
        return this;
    }

    public java.util.List<Object> getMessengerButtons() {
        return messengerButtons;
    }

    public RenderTemplateDtoContent messengerButtons(java.util.List<Object> messengerButtons) {
        this.messengerButtons = messengerButtons;
        return this;
    }

    public java.util.List<RenderTemplateDtoContentIosCarouselItem> getIosCarousel() {
        return iosCarousel;
    }

    public RenderTemplateDtoContent iosCarousel(java.util.List<RenderTemplateDtoContentIosCarouselItem> iosCarousel) {
        this.iosCarousel = iosCarousel;
        return this;
    }

    public RenderTemplateDtoContentAndroidLiveUpdate getAndroidLiveUpdate() {
        return androidLiveUpdate;
    }

    public RenderTemplateDtoContent androidLiveUpdate(RenderTemplateDtoContentAndroidLiveUpdate androidLiveUpdate) {
        this.androidLiveUpdate = androidLiveUpdate;
        return this;
    }

    public Boolean getVoip() {
        return voip;
    }

    public RenderTemplateDtoContent voip(Boolean voip) {
        this.voip = voip;
        return this;
    }

    public Boolean getAppClip() {
        return appClip;
    }

    public RenderTemplateDtoContent appClip(Boolean appClip) {
        this.appClip = appClip;
        return this;
    }

    @Override
    public String toString() {
        return com.pushizo.core.Json.stringify(this);
    }
}
