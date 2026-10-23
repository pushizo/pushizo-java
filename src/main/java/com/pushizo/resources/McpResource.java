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

    private static final TypeReference<CreateNotificationResult> TYPE_5 = new TypeReference<CreateNotificationResult>() {};

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
        return client.execute(op, options, TYPE_5);
    }
}
