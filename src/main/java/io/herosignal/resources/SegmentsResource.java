// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package io.herosignal.resources;

import com.fasterxml.jackson.core.type.TypeReference;
import io.herosignal.HeroSignal;
import io.herosignal.RequestOptions;
import io.herosignal.core.Operation;
import io.herosignal.core.PageIterable;
import io.herosignal.models.*;
import io.herosignal.params.*;

/**
 * Segment yönetimi, önizleme ve kitle tahmini.
 */
public final class SegmentsResource {
    private final HeroSignal client;

    public SegmentsResource(HeroSignal client) {
        this.client = client;
    }

    private static final TypeReference<SegmentPage> TYPE_0 = new TypeReference<SegmentPage>() {};

    /**
     * Segment listesi
     *
     * {@code GET /v1/apps/{appId}/segments}
     */
    public SegmentPage list() {
        return list(null, null);
    }

    /**
     * Segment listesi
     *
     * {@code GET /v1/apps/{appId}/segments}
     */
    public SegmentPage list(SegmentsListParams params) {
        return list(params, null);
    }

    /**
     * Segment listesi
     *
     * {@code GET /v1/apps/{appId}/segments}
     */
    public SegmentPage list(SegmentsListParams params, RequestOptions options) {
        Operation op = new Operation("GET", "/v1/apps/{appId}/segments");
        if (params != null) {
            params.applyTo(op);
        }
        return client.execute(op, options, TYPE_0);
    }

    /**
     * list sonuçlarını next_cursor ile tüm sayfalar boyunca tek tek dolaşır (sayfalar tembel yüklenir).
     */
    public PageIterable<Segment> listAll() {
        return listAll(null, null);
    }

    /**
     * list sonuçlarını next_cursor ile tüm sayfalar boyunca tek tek dolaşır (sayfalar tembel yüklenir).
     */
    public PageIterable<Segment> listAll(SegmentsListParams params) {
        return listAll(params, null);
    }

    /**
     * list sonuçlarını next_cursor ile tüm sayfalar boyunca tek tek dolaşır (sayfalar tembel yüklenir).
     */
    public PageIterable<Segment> listAll(SegmentsListParams params, RequestOptions options) {
        SegmentsListParams base = params == null ? new SegmentsListParams() : params.copy();
        return new PageIterable<>(cursor -> {
            SegmentsListParams p = base.copy();
            if (cursor != null) {
                p.cursor(cursor);
            }
            SegmentPage page = list(p, options);
            return new PageIterable.Page<>(page.getData(), page.getNextCursor(), Boolean.TRUE.equals(page.getHasMore()));
        });
    }

    private static final TypeReference<Segment> TYPE_1 = new TypeReference<Segment>() {};

    /**
     * Segment oluştur
     *
     * {@code POST /v1/apps/{appId}/segments}
     */
    public Segment create(SegmentsCreateBody body) {
        return create(body, null);
    }

    /**
     * Segment oluştur
     *
     * {@code POST /v1/apps/{appId}/segments}
     */
    public Segment create(SegmentsCreateBody body, RequestOptions options) {
        Operation op = new Operation("POST", "/v1/apps/{appId}/segments");
        if (body == null) {
            throw new IllegalArgumentException("HeroSignal: istek gövdesi null olamaz.");
        }
        op.body(body);
        return client.execute(op, options, TYPE_1);
    }

    private static final TypeReference<SegmentPreview> TYPE_2 = new TypeReference<SegmentPreview>() {};

    /**
     * Tanım ile sayım ve örnek kullanıcılar
     *
     * {@code POST /v1/apps/{appId}/segments/preview}
     */
    public SegmentPreview preview(SegmentsPreviewBody body) {
        return preview(body, null);
    }

    /**
     * Tanım ile sayım ve örnek kullanıcılar
     *
     * {@code POST /v1/apps/{appId}/segments/preview}
     */
    public SegmentPreview preview(SegmentsPreviewBody body, RequestOptions options) {
        Operation op = new Operation("POST", "/v1/apps/{appId}/segments/preview");
        if (body == null) {
            throw new IllegalArgumentException("HeroSignal: istek gövdesi null olamaz.");
        }
        op.body(body);
        return client.execute(op, options, TYPE_2);
    }

    private static final TypeReference<Segment> TYPE_3 = new TypeReference<Segment>() {};

    /**
     * Segment detayı
     *
     * {@code GET /v1/apps/{appId}/segments/{segmentId}}
     */
    public Segment get(String segmentId) {
        return get(segmentId, null);
    }

    /**
     * Segment detayı
     *
     * {@code GET /v1/apps/{appId}/segments/{segmentId}}
     */
    public Segment get(String segmentId, RequestOptions options) {
        Operation op = new Operation("GET", "/v1/apps/{appId}/segments/{segmentId}");
        op.pathParam("segmentId", segmentId);
        return client.execute(op, options, TYPE_3);
    }

    private static final TypeReference<Segment> TYPE_4 = new TypeReference<Segment>() {};

    /**
     * Segment güncelle
     *
     * {@code PATCH /v1/apps/{appId}/segments/{segmentId}}
     */
    public Segment update(String segmentId, SegmentsUpdateBody body) {
        return update(segmentId, body, null);
    }

    /**
     * Segment güncelle
     *
     * {@code PATCH /v1/apps/{appId}/segments/{segmentId}}
     */
    public Segment update(String segmentId, SegmentsUpdateBody body, RequestOptions options) {
        Operation op = new Operation("PATCH", "/v1/apps/{appId}/segments/{segmentId}");
        op.pathParam("segmentId", segmentId);
        if (body == null) {
            throw new IllegalArgumentException("HeroSignal: istek gövdesi null olamaz.");
        }
        op.body(body);
        return client.execute(op, options, TYPE_4);
    }

    private static final TypeReference<Ok> TYPE_5 = new TypeReference<Ok>() {};

    /**
     * Segment sil
     *
     * {@code DELETE /v1/apps/{appId}/segments/{segmentId}}
     */
    public Ok delete(String segmentId) {
        return delete(segmentId, null);
    }

    /**
     * Segment sil
     *
     * {@code DELETE /v1/apps/{appId}/segments/{segmentId}}
     */
    public Ok delete(String segmentId, RequestOptions options) {
        Operation op = new Operation("DELETE", "/v1/apps/{appId}/segments/{segmentId}");
        op.pathParam("segmentId", segmentId);
        return client.execute(op, options, TYPE_5);
    }

    private static final TypeReference<SegmentCampaigns> TYPE_6 = new TypeReference<SegmentCampaigns>() {};

    /**
     * Segmenti kullanan kampanyalar
     *
     * {@code GET /v1/apps/{appId}/segments/{segmentId}/campaigns}
     */
    public SegmentCampaigns usedBy(String segmentId) {
        return usedBy(segmentId, null);
    }

    /**
     * Segmenti kullanan kampanyalar
     *
     * {@code GET /v1/apps/{appId}/segments/{segmentId}/campaigns}
     */
    public SegmentCampaigns usedBy(String segmentId, RequestOptions options) {
        Operation op = new Operation("GET", "/v1/apps/{appId}/segments/{segmentId}/campaigns");
        op.pathParam("segmentId", segmentId);
        return client.execute(op, options, TYPE_6);
    }

    private static final TypeReference<SegmentEstimate> TYPE_7 = new TypeReference<SegmentEstimate>() {};

    /**
     * Tahmini sayım
     *
     * {@code POST /v1/apps/{appId}/segments/{segmentId}/estimate}
     */
    public SegmentEstimate estimate(String segmentId) {
        return estimate(segmentId, null, null);
    }

    /**
     * Tahmini sayım
     *
     * {@code POST /v1/apps/{appId}/segments/{segmentId}/estimate}
     */
    public SegmentEstimate estimate(String segmentId, SegmentsEstimateParams params) {
        return estimate(segmentId, params, null);
    }

    /**
     * Tahmini sayım
     *
     * {@code POST /v1/apps/{appId}/segments/{segmentId}/estimate}
     *
     * Parametreler: force — true: önbelleği atla, tam sayım Değerler: "true", "false".
     */
    public SegmentEstimate estimate(String segmentId, SegmentsEstimateParams params, RequestOptions options) {
        Operation op = new Operation("POST", "/v1/apps/{appId}/segments/{segmentId}/estimate");
        op.pathParam("segmentId", segmentId);
        if (params != null) {
            params.applyTo(op);
        }
        return client.execute(op, options, TYPE_7);
    }
}
