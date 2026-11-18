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
 * sql kaynağı.
 */
public final class SqlResource {
    private final Pushizo client;

    public SqlResource(Pushizo client) {
        this.client = client;
    }

    private static final TypeReference<SqlSchema> TYPE_0 = new TypeReference<SqlSchema>() {};

    /**
     * SQL görünümleri ve sınırlar
     *
     * {@code GET /v1/apps/{appId}/sql/schema}
     */
    public SqlSchema schema() {
        return schema(null);
    }

    /**
     * SQL görünümleri ve sınırlar
     *
     * {@code GET /v1/apps/{appId}/sql/schema}
     */
    public SqlSchema schema(RequestOptions options) {
        Operation op = new Operation("GET", "/v1/apps/{appId}/sql/schema");
        return client.execute(op, options, TYPE_0);
    }

    private static final TypeReference<SqlQueryResult> TYPE_1 = new TypeReference<SqlQueryResult>() {};

    /**
     * Salt okunur SQL sorgusu çalıştır
     *
     * {@code POST /v1/apps/{appId}/sql/query}
     */
    public SqlQueryResult run(RunSqlQueryDto body) {
        return run(body, null);
    }

    /**
     * Salt okunur SQL sorgusu çalıştır
     *
     * {@code POST /v1/apps/{appId}/sql/query}
     */
    public SqlQueryResult run(RunSqlQueryDto body, RequestOptions options) {
        Operation op = new Operation("POST", "/v1/apps/{appId}/sql/query");
        if (body == null) {
            throw new IllegalArgumentException("Pushizo: istek gövdesi null olamaz.");
        }
        op.body(body);
        return client.execute(op, options, TYPE_1);
    }

    private static final TypeReference<SqlRunList> TYPE_2 = new TypeReference<SqlRunList>() {};

    /**
     * SQL sorgu kaydı
     *
     * {@code GET /v1/apps/{appId}/sql/runs}
     */
    public SqlRunList runs() {
        return runs(null, null);
    }

    /**
     * SQL sorgu kaydı
     *
     * {@code GET /v1/apps/{appId}/sql/runs}
     */
    public SqlRunList runs(SqlRunsParams params) {
        return runs(params, null);
    }

    /**
     * SQL sorgu kaydı
     *
     * {@code GET /v1/apps/{appId}/sql/runs}
     *
     * Parametreler: status — Değerler: "ok", "rejected", "timeout", "failed".
     */
    public SqlRunList runs(SqlRunsParams params, RequestOptions options) {
        Operation op = new Operation("GET", "/v1/apps/{appId}/sql/runs");
        if (params != null) {
            params.applyTo(op);
        }
        return client.execute(op, options, TYPE_2);
    }

    /**
     * runs sonuçlarını next_cursor ile tüm sayfalar boyunca tek tek dolaşır (sayfalar tembel yüklenir).
     */
    public PageIterable<SqlRunListDataItem> runsAll() {
        return runsAll(null, null);
    }

    /**
     * runs sonuçlarını next_cursor ile tüm sayfalar boyunca tek tek dolaşır (sayfalar tembel yüklenir).
     */
    public PageIterable<SqlRunListDataItem> runsAll(SqlRunsParams params) {
        return runsAll(params, null);
    }

    /**
     * runs sonuçlarını next_cursor ile tüm sayfalar boyunca tek tek dolaşır (sayfalar tembel yüklenir).
     */
    public PageIterable<SqlRunListDataItem> runsAll(SqlRunsParams params, RequestOptions options) {
        SqlRunsParams base = params == null ? new SqlRunsParams() : params.copy();
        return new PageIterable<>(cursor -> {
            SqlRunsParams p = base.copy();
            if (cursor != null) {
                p.cursor(cursor);
            }
            SqlRunList page = runs(p, options);
            return new PageIterable.Page<>(page.getData(), page.getNextCursor(), Boolean.TRUE.equals(page.getHasMore()));
        });
    }

    private static final TypeReference<SqlSegmentList> TYPE_3 = new TypeReference<SqlSegmentList>() {};

    /**
     * SQL segmentleri
     *
     * {@code GET /v1/apps/{appId}/sql/segments}
     */
    public SqlSegmentList listSegments() {
        return listSegments(null);
    }

    /**
     * SQL segmentleri
     *
     * {@code GET /v1/apps/{appId}/sql/segments}
     */
    public SqlSegmentList listSegments(RequestOptions options) {
        Operation op = new Operation("GET", "/v1/apps/{appId}/sql/segments");
        return client.execute(op, options, TYPE_3);
    }

    private static final TypeReference<Segment> TYPE_4 = new TypeReference<Segment>() {};

    /**
     * Sorgu sonucunu segment olarak kaydet
     *
     * {@code POST /v1/apps/{appId}/sql/segments}
     */
    public Segment createSegment(CreateSqlSegmentDto body) {
        return createSegment(body, null);
    }

    /**
     * Sorgu sonucunu segment olarak kaydet
     *
     * {@code POST /v1/apps/{appId}/sql/segments}
     */
    public Segment createSegment(CreateSqlSegmentDto body, RequestOptions options) {
        Operation op = new Operation("POST", "/v1/apps/{appId}/sql/segments");
        if (body == null) {
            throw new IllegalArgumentException("Pushizo: istek gövdesi null olamaz.");
        }
        op.body(body);
        return client.execute(op, options, TYPE_4);
    }

    private static final TypeReference<Segment> TYPE_5 = new TypeReference<Segment>() {};

    /**
     * SQL segmentini güncelle
     *
     * {@code PATCH /v1/apps/{appId}/sql/segments/{segmentId}}
     */
    public Segment updateSegment(String segmentId, UpdateSqlSegmentDto body) {
        return updateSegment(segmentId, body, null);
    }

    /**
     * SQL segmentini güncelle
     *
     * {@code PATCH /v1/apps/{appId}/sql/segments/{segmentId}}
     */
    public Segment updateSegment(String segmentId, UpdateSqlSegmentDto body, RequestOptions options) {
        Operation op = new Operation("PATCH", "/v1/apps/{appId}/sql/segments/{segmentId}");
        op.pathParam("segmentId", segmentId);
        if (body == null) {
            throw new IllegalArgumentException("Pushizo: istek gövdesi null olamaz.");
        }
        op.body(body);
        return client.execute(op, options, TYPE_5);
    }

    private static final TypeReference<Segment> TYPE_6 = new TypeReference<Segment>() {};

    /**
     * SQL segmentini şimdi yenile
     *
     * {@code POST /v1/apps/{appId}/sql/segments/{segmentId}/refresh}
     */
    public Segment refresh(String segmentId) {
        return refresh(segmentId, null);
    }

    /**
     * SQL segmentini şimdi yenile
     *
     * {@code POST /v1/apps/{appId}/sql/segments/{segmentId}/refresh}
     */
    public Segment refresh(String segmentId, RequestOptions options) {
        Operation op = new Operation("POST", "/v1/apps/{appId}/sql/segments/{segmentId}/refresh");
        op.pathParam("segmentId", segmentId);
        return client.execute(op, options, TYPE_6);
    }
}
