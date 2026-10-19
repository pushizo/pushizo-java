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
}
