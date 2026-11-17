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
 * warehouseSegments kaynağı.
 */
public final class WarehouseSegmentsResource {
    private final Pushizo client;

    public WarehouseSegmentsResource(Pushizo client) {
        this.client = client;
    }

    private static final TypeReference<WarehouseSegmentOptions> TYPE_0 = new TypeReference<WarehouseSegmentOptions>() {};

    /**
     * Ambar segmenti seçenekleri ve sınırlar
     *
     * {@code GET /v1/apps/{appId}/warehouse-segments/options}
     */
    public WarehouseSegmentOptions options() {
        return options(null);
    }

    /**
     * Ambar segmenti seçenekleri ve sınırlar
     *
     * {@code GET /v1/apps/{appId}/warehouse-segments/options}
     */
    public WarehouseSegmentOptions options(RequestOptions options) {
        Operation op = new Operation("GET", "/v1/apps/{appId}/warehouse-segments/options");
        return client.execute(op, options, TYPE_0);
    }

    private static final TypeReference<WarehouseSegmentConnectionList> TYPE_1 = new TypeReference<WarehouseSegmentConnectionList>() {};

    /**
     * Ambar bağlantıları
     *
     * {@code GET /v1/apps/{appId}/warehouse-segments/connections}
     */
    public WarehouseSegmentConnectionList listConnections() {
        return listConnections(null);
    }

    /**
     * Ambar bağlantıları
     *
     * {@code GET /v1/apps/{appId}/warehouse-segments/connections}
     */
    public WarehouseSegmentConnectionList listConnections(RequestOptions options) {
        Operation op = new Operation("GET", "/v1/apps/{appId}/warehouse-segments/connections");
        return client.execute(op, options, TYPE_1);
    }

    private static final TypeReference<WarehouseSegmentConnection> TYPE_2 = new TypeReference<WarehouseSegmentConnection>() {};

    /**
     * Ambar bağlantısı oluştur
     *
     * {@code POST /v1/apps/{appId}/warehouse-segments/connections}
     */
    public WarehouseSegmentConnection createConnection(CreateWarehouseConnectionDto body) {
        return createConnection(body, null);
    }

    /**
     * Ambar bağlantısı oluştur
     *
     * {@code POST /v1/apps/{appId}/warehouse-segments/connections}
     */
    public WarehouseSegmentConnection createConnection(CreateWarehouseConnectionDto body, RequestOptions options) {
        Operation op = new Operation("POST", "/v1/apps/{appId}/warehouse-segments/connections");
        if (body == null) {
            throw new IllegalArgumentException("Pushizo: istek gövdesi null olamaz.");
        }
        op.body(body);
        return client.execute(op, options, TYPE_2);
    }

    private static final TypeReference<WarehouseSegmentConnection> TYPE_3 = new TypeReference<WarehouseSegmentConnection>() {};

    /**
     * Ambar bağlantısı detayı
     *
     * {@code GET /v1/apps/{appId}/warehouse-segments/connections/{connectionId}}
     */
    public WarehouseSegmentConnection getConnection(String connectionId) {
        return getConnection(connectionId, null);
    }

    /**
     * Ambar bağlantısı detayı
     *
     * {@code GET /v1/apps/{appId}/warehouse-segments/connections/{connectionId}}
     */
    public WarehouseSegmentConnection getConnection(String connectionId, RequestOptions options) {
        Operation op = new Operation("GET", "/v1/apps/{appId}/warehouse-segments/connections/{connectionId}");
        op.pathParam("connectionId", connectionId);
        return client.execute(op, options, TYPE_3);
    }

    private static final TypeReference<WarehouseSegmentConnection> TYPE_4 = new TypeReference<WarehouseSegmentConnection>() {};

    /**
     * Ambar bağlantısını güncelle
     *
     * {@code PATCH /v1/apps/{appId}/warehouse-segments/connections/{connectionId}}
     */
    public WarehouseSegmentConnection updateConnection(String connectionId, UpdateWarehouseConnectionDto body) {
        return updateConnection(connectionId, body, null);
    }

    /**
     * Ambar bağlantısını güncelle
     *
     * {@code PATCH /v1/apps/{appId}/warehouse-segments/connections/{connectionId}}
     */
    public WarehouseSegmentConnection updateConnection(String connectionId, UpdateWarehouseConnectionDto body, RequestOptions options) {
        Operation op = new Operation("PATCH", "/v1/apps/{appId}/warehouse-segments/connections/{connectionId}");
        op.pathParam("connectionId", connectionId);
        if (body == null) {
            throw new IllegalArgumentException("Pushizo: istek gövdesi null olamaz.");
        }
        op.body(body);
        return client.execute(op, options, TYPE_4);
    }

    private static final TypeReference<Ok> TYPE_5 = new TypeReference<Ok>() {};

    /**
     * Ambar bağlantısını sil
     *
     * {@code DELETE /v1/apps/{appId}/warehouse-segments/connections/{connectionId}}
     */
    public Ok removeConnection(String connectionId) {
        return removeConnection(connectionId, null);
    }

    /**
     * Ambar bağlantısını sil
     *
     * {@code DELETE /v1/apps/{appId}/warehouse-segments/connections/{connectionId}}
     */
    public Ok removeConnection(String connectionId, RequestOptions options) {
        Operation op = new Operation("DELETE", "/v1/apps/{appId}/warehouse-segments/connections/{connectionId}");
        op.pathParam("connectionId", connectionId);
        return client.execute(op, options, TYPE_5);
    }

    private static final TypeReference<WarehouseSegmentConnectionTest> TYPE_6 = new TypeReference<WarehouseSegmentConnectionTest>() {};

    /**
     * Ambar bağlantısını dene
     *
     * {@code POST /v1/apps/{appId}/warehouse-segments/connections/{connectionId}/test}
     */
    public WarehouseSegmentConnectionTest testConnection(String connectionId) {
        return testConnection(connectionId, null);
    }

    /**
     * Ambar bağlantısını dene
     *
     * {@code POST /v1/apps/{appId}/warehouse-segments/connections/{connectionId}/test}
     */
    public WarehouseSegmentConnectionTest testConnection(String connectionId, RequestOptions options) {
        Operation op = new Operation("POST", "/v1/apps/{appId}/warehouse-segments/connections/{connectionId}/test");
        op.pathParam("connectionId", connectionId);
        return client.execute(op, options, TYPE_6);
    }

    private static final TypeReference<WarehouseSegmentPreview> TYPE_7 = new TypeReference<WarehouseSegmentPreview>() {};

    /**
     * Ambar sorgusunu önizle (dry-run veya örnek)
     *
     * {@code POST /v1/apps/{appId}/warehouse-segments/preview}
     */
    public WarehouseSegmentPreview preview(PreviewWarehouseQueryDto body) {
        return preview(body, null);
    }

    /**
     * Ambar sorgusunu önizle (dry-run veya örnek)
     *
     * {@code POST /v1/apps/{appId}/warehouse-segments/preview}
     */
    public WarehouseSegmentPreview preview(PreviewWarehouseQueryDto body, RequestOptions options) {
        Operation op = new Operation("POST", "/v1/apps/{appId}/warehouse-segments/preview");
        if (body == null) {
            throw new IllegalArgumentException("Pushizo: istek gövdesi null olamaz.");
        }
        op.body(body);
        return client.execute(op, options, TYPE_7);
    }

    private static final TypeReference<WarehouseSegmentList> TYPE_8 = new TypeReference<WarehouseSegmentList>() {};

    /**
     * Ambar segmentleri
     *
     * {@code GET /v1/apps/{appId}/warehouse-segments/segments}
     */
    public WarehouseSegmentList listSegments() {
        return listSegments(null);
    }

    /**
     * Ambar segmentleri
     *
     * {@code GET /v1/apps/{appId}/warehouse-segments/segments}
     */
    public WarehouseSegmentList listSegments(RequestOptions options) {
        Operation op = new Operation("GET", "/v1/apps/{appId}/warehouse-segments/segments");
        return client.execute(op, options, TYPE_8);
    }

    private static final TypeReference<Segment> TYPE_9 = new TypeReference<Segment>() {};

    /**
     * Ambar segmenti oluştur
     *
     * {@code POST /v1/apps/{appId}/warehouse-segments/segments}
     */
    public Segment createSegment(CreateWarehouseSegmentDto body) {
        return createSegment(body, null);
    }

    /**
     * Ambar segmenti oluştur
     *
     * {@code POST /v1/apps/{appId}/warehouse-segments/segments}
     */
    public Segment createSegment(CreateWarehouseSegmentDto body, RequestOptions options) {
        Operation op = new Operation("POST", "/v1/apps/{appId}/warehouse-segments/segments");
        if (body == null) {
            throw new IllegalArgumentException("Pushizo: istek gövdesi null olamaz.");
        }
        op.body(body);
        return client.execute(op, options, TYPE_9);
    }

    private static final TypeReference<Segment> TYPE_10 = new TypeReference<Segment>() {};

    /**
     * Ambar segmentini güncelle
     *
     * {@code PATCH /v1/apps/{appId}/warehouse-segments/segments/{segmentId}}
     */
    public Segment updateSegment(String segmentId, UpdateWarehouseSegmentDto body) {
        return updateSegment(segmentId, body, null);
    }

    /**
     * Ambar segmentini güncelle
     *
     * {@code PATCH /v1/apps/{appId}/warehouse-segments/segments/{segmentId}}
     */
    public Segment updateSegment(String segmentId, UpdateWarehouseSegmentDto body, RequestOptions options) {
        Operation op = new Operation("PATCH", "/v1/apps/{appId}/warehouse-segments/segments/{segmentId}");
        op.pathParam("segmentId", segmentId);
        if (body == null) {
            throw new IllegalArgumentException("Pushizo: istek gövdesi null olamaz.");
        }
        op.body(body);
        return client.execute(op, options, TYPE_10);
    }

    private static final TypeReference<Segment> TYPE_11 = new TypeReference<Segment>() {};

    /**
     * Ambar segmentini yenileme kuyruğuna al
     *
     * {@code POST /v1/apps/{appId}/warehouse-segments/segments/{segmentId}/refresh}
     */
    public Segment refresh(String segmentId) {
        return refresh(segmentId, null);
    }

    /**
     * Ambar segmentini yenileme kuyruğuna al
     *
     * {@code POST /v1/apps/{appId}/warehouse-segments/segments/{segmentId}/refresh}
     */
    public Segment refresh(String segmentId, RequestOptions options) {
        Operation op = new Operation("POST", "/v1/apps/{appId}/warehouse-segments/segments/{segmentId}/refresh");
        op.pathParam("segmentId", segmentId);
        return client.execute(op, options, TYPE_11);
    }

    private static final TypeReference<WarehouseSegmentRunList> TYPE_12 = new TypeReference<WarehouseSegmentRunList>() {};

    /**
     * Ambar sorgu kaydı
     *
     * {@code GET /v1/apps/{appId}/warehouse-segments/runs}
     */
    public WarehouseSegmentRunList runs() {
        return runs(null, null);
    }

    /**
     * Ambar sorgu kaydı
     *
     * {@code GET /v1/apps/{appId}/warehouse-segments/runs}
     */
    public WarehouseSegmentRunList runs(WarehouseSegmentsRunsParams params) {
        return runs(params, null);
    }

    /**
     * Ambar sorgu kaydı
     *
     * {@code GET /v1/apps/{appId}/warehouse-segments/runs}
     *
     * Parametreler: status — Değerler: "ok", "rejected", "timeout", "failed".
     */
    public WarehouseSegmentRunList runs(WarehouseSegmentsRunsParams params, RequestOptions options) {
        Operation op = new Operation("GET", "/v1/apps/{appId}/warehouse-segments/runs");
        if (params != null) {
            params.applyTo(op);
        }
        return client.execute(op, options, TYPE_12);
    }

    /**
     * runs sonuçlarını next_cursor ile tüm sayfalar boyunca tek tek dolaşır (sayfalar tembel yüklenir).
     */
    public PageIterable<WarehouseSegmentRunListDataItem> runsAll() {
        return runsAll(null, null);
    }

    /**
     * runs sonuçlarını next_cursor ile tüm sayfalar boyunca tek tek dolaşır (sayfalar tembel yüklenir).
     */
    public PageIterable<WarehouseSegmentRunListDataItem> runsAll(WarehouseSegmentsRunsParams params) {
        return runsAll(params, null);
    }

    /**
     * runs sonuçlarını next_cursor ile tüm sayfalar boyunca tek tek dolaşır (sayfalar tembel yüklenir).
     */
    public PageIterable<WarehouseSegmentRunListDataItem> runsAll(WarehouseSegmentsRunsParams params, RequestOptions options) {
        WarehouseSegmentsRunsParams base = params == null ? new WarehouseSegmentsRunsParams() : params.copy();
        return new PageIterable<>(cursor -> {
            WarehouseSegmentsRunsParams p = base.copy();
            if (cursor != null) {
                p.cursor(cursor);
            }
            WarehouseSegmentRunList page = runs(p, options);
            return new PageIterable.Page<>(page.getData(), page.getNextCursor(), Boolean.TRUE.equals(page.getHasMore()));
        });
    }
}
