// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package com.pushizo.resources;

import com.fasterxml.jackson.core.type.TypeReference;
import com.pushizo.Pushizo;
import com.pushizo.RequestOptions;
import com.pushizo.core.Operation;
import com.pushizo.core.PageIterable;
import com.pushizo.models.*;
import com.pushizo.params.*;

/**
 * mcp kaynağı.
 */
public final class McpResource {
    private final Pushizo client;

    public McpResource(Pushizo client) {
        this.client = client;
    }

    private static final TypeReference<Campaign> TYPE_0 = new TypeReference<Campaign>() {};

    /**
     * Kampanya taslağı oluştur (MCP onaylı mod; gönderim yapmaz)
     *
     * {@code POST /v1/apps/{appId}/mcp/campaign-drafts}
     */
    public Campaign createCampaignDraft(McpCreateCampaignDraftBody body) {
        return createCampaignDraft(body, null);
    }

    /**
     * Kampanya taslağı oluştur (MCP onaylı mod; gönderim yapmaz)
     *
     * {@code POST /v1/apps/{appId}/mcp/campaign-drafts}
     */
    public Campaign createCampaignDraft(McpCreateCampaignDraftBody body, RequestOptions options) {
        Operation op = new Operation("POST", "/v1/apps/{appId}/mcp/campaign-drafts");
        if (body == null) {
            throw new IllegalArgumentException("Pushizo: istek gövdesi null olamaz.");
        }
        op.body(body);
        return client.execute(op, options, TYPE_0);
    }

    private static final TypeReference<Segment> TYPE_1 = new TypeReference<Segment>() {};

    /**
     * Segment taslağı oluştur (MCP onaylı mod; dinamik segment)
     *
     * {@code POST /v1/apps/{appId}/mcp/segment-drafts}
     */
    public Segment createSegmentDraft(McpCreateSegmentDraftBody body) {
        return createSegmentDraft(body, null);
    }

    /**
     * Segment taslağı oluştur (MCP onaylı mod; dinamik segment)
     *
     * {@code POST /v1/apps/{appId}/mcp/segment-drafts}
     */
    public Segment createSegmentDraft(McpCreateSegmentDraftBody body, RequestOptions options) {
        Operation op = new Operation("POST", "/v1/apps/{appId}/mcp/segment-drafts");
        if (body == null) {
            throw new IllegalArgumentException("Pushizo: istek gövdesi null olamaz.");
        }
        op.body(body);
        return client.execute(op, options, TYPE_1);
    }

    private static final TypeReference<Template> TYPE_2 = new TypeReference<Template>() {};

    /**
     * Şablon oluştur (MCP onaylı mod; şablon tek başına gönderim yapmaz)
     *
     * {@code POST /v1/apps/{appId}/mcp/template-drafts}
     */
    public Template createTemplateDraft(CreateTemplateDto body) {
        return createTemplateDraft(body, null);
    }

    /**
     * Şablon oluştur (MCP onaylı mod; şablon tek başına gönderim yapmaz)
     *
     * {@code POST /v1/apps/{appId}/mcp/template-drafts}
     */
    public Template createTemplateDraft(CreateTemplateDto body, RequestOptions options) {
        Operation op = new Operation("POST", "/v1/apps/{appId}/mcp/template-drafts");
        if (body == null) {
            throw new IllegalArgumentException("Pushizo: istek gövdesi null olamaz.");
        }
        op.body(body);
        return client.execute(op, options, TYPE_2);
    }

    private static final TypeReference<JourneyDetail> TYPE_3 = new TypeReference<JourneyDetail>() {};

    /**
     * Journey taslağı oluştur (MCP onaylı mod; yayımlanmaz)
     *
     * {@code POST /v1/apps/{appId}/mcp/journey-drafts}
     */
    public JourneyDetail createJourneyDraft(McpCreateJourneyDraftBody body) {
        return createJourneyDraft(body, null);
    }

    /**
     * Journey taslağı oluştur (MCP onaylı mod; yayımlanmaz)
     *
     * {@code POST /v1/apps/{appId}/mcp/journey-drafts}
     */
    public JourneyDetail createJourneyDraft(McpCreateJourneyDraftBody body, RequestOptions options) {
        Operation op = new Operation("POST", "/v1/apps/{appId}/mcp/journey-drafts");
        if (body == null) {
            throw new IllegalArgumentException("Pushizo: istek gövdesi null olamaz.");
        }
        op.body(body);
        return client.execute(op, options, TYPE_3);
    }

    private static final TypeReference<InAppMessage> TYPE_4 = new TypeReference<InAppMessage>() {};

    /**
     * In-app mesaj taslağı oluştur (MCP onaylı mod; etkinleştirilmez)
     *
     * {@code POST /v1/apps/{appId}/mcp/in-app-drafts}
     */
    public InAppMessage createInAppDraft(CreateInAppDto body) {
        return createInAppDraft(body, null);
    }

    /**
     * In-app mesaj taslağı oluştur (MCP onaylı mod; etkinleştirilmez)
     *
     * {@code POST /v1/apps/{appId}/mcp/in-app-drafts}
     */
    public InAppMessage createInAppDraft(CreateInAppDto body, RequestOptions options) {
        Operation op = new Operation("POST", "/v1/apps/{appId}/mcp/in-app-drafts");
        if (body == null) {
            throw new IllegalArgumentException("Pushizo: istek gövdesi null olamaz.");
        }
        op.body(body);
        return client.execute(op, options, TYPE_4);
    }

    private static final TypeReference<WebCampaign> TYPE_5 = new TypeReference<WebCampaign>() {};

    /**
     * Web kampanyası taslağı oluştur (MCP onaylı mod; yayımlanmaz)
     *
     * {@code POST /v1/apps/{appId}/mcp/web-campaign-drafts}
     */
    public WebCampaign createWebCampaignDraft(CreateWebCampaignDto body) {
        return createWebCampaignDraft(body, null);
    }

    /**
     * Web kampanyası taslağı oluştur (MCP onaylı mod; yayımlanmaz)
     *
     * {@code POST /v1/apps/{appId}/mcp/web-campaign-drafts}
     */
    public WebCampaign createWebCampaignDraft(CreateWebCampaignDto body, RequestOptions options) {
        Operation op = new Operation("POST", "/v1/apps/{appId}/mcp/web-campaign-drafts");
        if (body == null) {
            throw new IllegalArgumentException("Pushizo: istek gövdesi null olamaz.");
        }
        op.body(body);
        return client.execute(op, options, TYPE_5);
    }

    private static final TypeReference<WebPersonalization> TYPE_6 = new TypeReference<WebPersonalization>() {};

    /**
     * Web kişiselleştirme taslağı oluştur (MCP onaylı mod; yayımlanmaz)
     *
     * {@code POST /v1/apps/{appId}/mcp/web-personalization-drafts}
     */
    public WebPersonalization createWebPersonalizationDraft(CreateWebPersonalizationDto body) {
        return createWebPersonalizationDraft(body, null);
    }

    /**
     * Web kişiselleştirme taslağı oluştur (MCP onaylı mod; yayımlanmaz)
     *
     * {@code POST /v1/apps/{appId}/mcp/web-personalization-drafts}
     */
    public WebPersonalization createWebPersonalizationDraft(CreateWebPersonalizationDto body, RequestOptions options) {
        Operation op = new Operation("POST", "/v1/apps/{appId}/mcp/web-personalization-drafts");
        if (body == null) {
            throw new IllegalArgumentException("Pushizo: istek gövdesi null olamaz.");
        }
        op.body(body);
        return client.execute(op, options, TYPE_6);
    }

    private static final TypeReference<Survey> TYPE_7 = new TypeReference<Survey>() {};

    /**
     * Anket taslağı oluştur (MCP onaylı mod; etkinleştirilmez)
     *
     * {@code POST /v1/apps/{appId}/mcp/survey-drafts}
     */
    public Survey createSurveyDraft(CreateSurveyDto body) {
        return createSurveyDraft(body, null);
    }

    /**
     * Anket taslağı oluştur (MCP onaylı mod; etkinleştirilmez)
     *
     * {@code POST /v1/apps/{appId}/mcp/survey-drafts}
     */
    public Survey createSurveyDraft(CreateSurveyDto body, RequestOptions options) {
        Operation op = new Operation("POST", "/v1/apps/{appId}/mcp/survey-drafts");
        if (body == null) {
            throw new IllegalArgumentException("Pushizo: istek gövdesi null olamaz.");
        }
        op.body(body);
        return client.execute(op, options, TYPE_7);
    }

    private static final TypeReference<LandingPage> TYPE_8 = new TypeReference<LandingPage>() {};

    /**
     * Landing sayfası taslağı oluştur (MCP onaylı mod; yayımlanmaz)
     *
     * {@code POST /v1/apps/{appId}/mcp/landing-page-drafts}
     */
    public LandingPage createLandingPageDraft(CreateLandingPageDto body) {
        return createLandingPageDraft(body, null);
    }

    /**
     * Landing sayfası taslağı oluştur (MCP onaylı mod; yayımlanmaz)
     *
     * {@code POST /v1/apps/{appId}/mcp/landing-page-drafts}
     */
    public LandingPage createLandingPageDraft(CreateLandingPageDto body, RequestOptions options) {
        Operation op = new Operation("POST", "/v1/apps/{appId}/mcp/landing-page-drafts");
        if (body == null) {
            throw new IllegalArgumentException("Pushizo: istek gövdesi null olamaz.");
        }
        op.body(body);
        return client.execute(op, options, TYPE_8);
    }

    private static final TypeReference<CreateNotificationResult> TYPE_9 = new TypeReference<CreateNotificationResult>() {};

    /**
     * Test gönderimi (yalnızca app’in test cihazlarına; MCP onaylı mod)
     *
     * {@code POST /v1/apps/{appId}/mcp/test-sends}
     */
    public CreateNotificationResult testSend(TestPushDto body) {
        return testSend(body, null);
    }

    /**
     * Test gönderimi (yalnızca app’in test cihazlarına; MCP onaylı mod)
     *
     * {@code POST /v1/apps/{appId}/mcp/test-sends}
     */
    public CreateNotificationResult testSend(TestPushDto body, RequestOptions options) {
        Operation op = new Operation("POST", "/v1/apps/{appId}/mcp/test-sends");
        if (body == null) {
            throw new IllegalArgumentException("Pushizo: istek gövdesi null olamaz.");
        }
        op.body(body);
        return client.execute(op, options, TYPE_9);
    }
}
