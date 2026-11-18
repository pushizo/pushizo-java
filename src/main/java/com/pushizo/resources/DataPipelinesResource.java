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
 * dataPipelines kaynağı.
 */
public final class DataPipelinesResource {
    private final Pushizo client;

    public DataPipelinesResource(Pushizo client) {
        this.client = client;
    }

    private static final TypeReference<DataTransformList> TYPE_0 = new TypeReference<DataTransformList>() {};

    /**
     * Veri dönüştürmeleri
     *
     * {@code GET /v1/apps/{appId}/data-pipelines/transforms}
     */
    public DataTransformList listTransforms() {
        return listTransforms(null, null);
    }

    /**
     * Veri dönüştürmeleri
     *
     * {@code GET /v1/apps/{appId}/data-pipelines/transforms}
     */
    public DataTransformList listTransforms(DataPipelinesListTransformsParams params) {
        return listTransforms(params, null);
    }

    /**
     * Veri dönüştürmeleri
     *
     * {@code GET /v1/apps/{appId}/data-pipelines/transforms}
     *
     * Parametreler: target — Değerler: "event", "person".
     */
    public DataTransformList listTransforms(DataPipelinesListTransformsParams params, RequestOptions options) {
        Operation op = new Operation("GET", "/v1/apps/{appId}/data-pipelines/transforms");
        if (params != null) {
            params.applyTo(op);
        }
        return client.execute(op, options, TYPE_0);
    }

    private static final TypeReference<DataTransform> TYPE_1 = new TypeReference<DataTransform>() {};

    /**
     * Veri dönüştürmesi oluştur
     *
     * {@code POST /v1/apps/{appId}/data-pipelines/transforms}
     */
    public DataTransform createTransform(CreateDataTransformDto body) {
        return createTransform(body, null);
    }

    /**
     * Veri dönüştürmesi oluştur
     *
     * {@code POST /v1/apps/{appId}/data-pipelines/transforms}
     */
    public DataTransform createTransform(CreateDataTransformDto body, RequestOptions options) {
        Operation op = new Operation("POST", "/v1/apps/{appId}/data-pipelines/transforms");
        if (body == null) {
            throw new IllegalArgumentException("Pushizo: istek gövdesi null olamaz.");
        }
        op.body(body);
        return client.execute(op, options, TYPE_1);
    }

    private static final TypeReference<DataTransformPreview> TYPE_2 = new TypeReference<DataTransformPreview>() {};

    /**
     * Dönüştürme önizlemesi (örnek kayıtla kuru çalıştırma)
     *
     * {@code POST /v1/apps/{appId}/data-pipelines/transforms/preview}
     */
    public DataTransformPreview preview(PreviewDataTransformDto body) {
        return preview(body, null);
    }

    /**
     * Dönüştürme önizlemesi (örnek kayıtla kuru çalıştırma)
     *
     * {@code POST /v1/apps/{appId}/data-pipelines/transforms/preview}
     */
    public DataTransformPreview preview(PreviewDataTransformDto body, RequestOptions options) {
        Operation op = new Operation("POST", "/v1/apps/{appId}/data-pipelines/transforms/preview");
        if (body == null) {
            throw new IllegalArgumentException("Pushizo: istek gövdesi null olamaz.");
        }
        op.body(body);
        return client.execute(op, options, TYPE_2);
    }

    private static final TypeReference<DataTransform> TYPE_3 = new TypeReference<DataTransform>() {};

    /**
     * Veri dönüştürmesi
     *
     * {@code GET /v1/apps/{appId}/data-pipelines/transforms/{transformId}}
     */
    public DataTransform getTransform(String transformId) {
        return getTransform(transformId, null);
    }

    /**
     * Veri dönüştürmesi
     *
     * {@code GET /v1/apps/{appId}/data-pipelines/transforms/{transformId}}
     */
    public DataTransform getTransform(String transformId, RequestOptions options) {
        Operation op = new Operation("GET", "/v1/apps/{appId}/data-pipelines/transforms/{transformId}");
        op.pathParam("transformId", transformId);
        return client.execute(op, options, TYPE_3);
    }

    private static final TypeReference<DataTransform> TYPE_4 = new TypeReference<DataTransform>() {};

    /**
     * Veri dönüştürmesini güncelle
     *
     * {@code PATCH /v1/apps/{appId}/data-pipelines/transforms/{transformId}}
     */
    public DataTransform updateTransform(String transformId, UpdateDataTransformDto body) {
        return updateTransform(transformId, body, null);
    }

    /**
     * Veri dönüştürmesini güncelle
     *
     * {@code PATCH /v1/apps/{appId}/data-pipelines/transforms/{transformId}}
     */
    public DataTransform updateTransform(String transformId, UpdateDataTransformDto body, RequestOptions options) {
        Operation op = new Operation("PATCH", "/v1/apps/{appId}/data-pipelines/transforms/{transformId}");
        op.pathParam("transformId", transformId);
        if (body == null) {
            throw new IllegalArgumentException("Pushizo: istek gövdesi null olamaz.");
        }
        op.body(body);
        return client.execute(op, options, TYPE_4);
    }

    /**
     * Veri dönüştürmesini sil
     *
     * {@code DELETE /v1/apps/{appId}/data-pipelines/transforms/{transformId}}
     */
    public void removeTransform(String transformId) {
        removeTransform(transformId, null);
    }

    /**
     * Veri dönüştürmesini sil
     *
     * {@code DELETE /v1/apps/{appId}/data-pipelines/transforms/{transformId}}
     */
    public void removeTransform(String transformId, RequestOptions options) {
        Operation op = new Operation("DELETE", "/v1/apps/{appId}/data-pipelines/transforms/{transformId}");
        op.pathParam("transformId", transformId);
        client.execute(op, options, null);
    }

    private static final TypeReference<DataSourceList> TYPE_5 = new TypeReference<DataSourceList>() {};

    /**
     * Veri kaynakları (webhook ve HTTP pull)
     *
     * {@code GET /v1/apps/{appId}/data-pipelines/sources}
     */
    public DataSourceList listSources() {
        return listSources(null);
    }

    /**
     * Veri kaynakları (webhook ve HTTP pull)
     *
     * {@code GET /v1/apps/{appId}/data-pipelines/sources}
     */
    public DataSourceList listSources(RequestOptions options) {
        Operation op = new Operation("GET", "/v1/apps/{appId}/data-pipelines/sources");
        return client.execute(op, options, TYPE_5);
    }

    private static final TypeReference<DataSourceWithSecret> TYPE_6 = new TypeReference<DataSourceWithSecret>() {};

    /**
     * Veri kaynağı oluştur
     *
     * {@code POST /v1/apps/{appId}/data-pipelines/sources}
     *
     * Webhook kaynağının imza/erişim anahtarı yalnız bu yanıtta döner.
     */
    public DataSourceWithSecret createSource(CreateDataSourceDto body) {
        return createSource(body, null);
    }

    /**
     * Veri kaynağı oluştur
     *
     * {@code POST /v1/apps/{appId}/data-pipelines/sources}
     *
     * Webhook kaynağının imza/erişim anahtarı yalnız bu yanıtta döner.
     */
    public DataSourceWithSecret createSource(CreateDataSourceDto body, RequestOptions options) {
        Operation op = new Operation("POST", "/v1/apps/{appId}/data-pipelines/sources");
        if (body == null) {
            throw new IllegalArgumentException("Pushizo: istek gövdesi null olamaz.");
        }
        op.body(body);
        return client.execute(op, options, TYPE_6);
    }

    private static final TypeReference<DataSource> TYPE_7 = new TypeReference<DataSource>() {};

    /**
     * Veri kaynağı
     *
     * {@code GET /v1/apps/{appId}/data-pipelines/sources/{sourceId}}
     */
    public DataSource getSource(String sourceId) {
        return getSource(sourceId, null);
    }

    /**
     * Veri kaynağı
     *
     * {@code GET /v1/apps/{appId}/data-pipelines/sources/{sourceId}}
     */
    public DataSource getSource(String sourceId, RequestOptions options) {
        Operation op = new Operation("GET", "/v1/apps/{appId}/data-pipelines/sources/{sourceId}");
        op.pathParam("sourceId", sourceId);
        return client.execute(op, options, TYPE_7);
    }

    private static final TypeReference<DataSource> TYPE_8 = new TypeReference<DataSource>() {};

    /**
     * Veri kaynağını güncelle
     *
     * {@code PATCH /v1/apps/{appId}/data-pipelines/sources/{sourceId}}
     */
    public DataSource updateSource(String sourceId, UpdateDataSourceDto body) {
        return updateSource(sourceId, body, null);
    }

    /**
     * Veri kaynağını güncelle
     *
     * {@code PATCH /v1/apps/{appId}/data-pipelines/sources/{sourceId}}
     */
    public DataSource updateSource(String sourceId, UpdateDataSourceDto body, RequestOptions options) {
        Operation op = new Operation("PATCH", "/v1/apps/{appId}/data-pipelines/sources/{sourceId}");
        op.pathParam("sourceId", sourceId);
        if (body == null) {
            throw new IllegalArgumentException("Pushizo: istek gövdesi null olamaz.");
        }
        op.body(body);
        return client.execute(op, options, TYPE_8);
    }

    /**
     * Veri kaynağını sil
     *
     * {@code DELETE /v1/apps/{appId}/data-pipelines/sources/{sourceId}}
     */
    public void removeSource(String sourceId) {
        removeSource(sourceId, null);
    }

    /**
     * Veri kaynağını sil
     *
     * {@code DELETE /v1/apps/{appId}/data-pipelines/sources/{sourceId}}
     */
    public void removeSource(String sourceId, RequestOptions options) {
        Operation op = new Operation("DELETE", "/v1/apps/{appId}/data-pipelines/sources/{sourceId}");
        op.pathParam("sourceId", sourceId);
        client.execute(op, options, null);
    }

    private static final TypeReference<DataSourceWithSecret> TYPE_9 = new TypeReference<DataSourceWithSecret>() {};

    /**
     * Webhook kaynağı anahtarını yenile
     *
     * {@code POST /v1/apps/{appId}/data-pipelines/sources/{sourceId}/rotate-secret}
     */
    public DataSourceWithSecret rotate(String sourceId) {
        return rotate(sourceId, null);
    }

    /**
     * Webhook kaynağı anahtarını yenile
     *
     * {@code POST /v1/apps/{appId}/data-pipelines/sources/{sourceId}/rotate-secret}
     */
    public DataSourceWithSecret rotate(String sourceId, RequestOptions options) {
        Operation op = new Operation("POST", "/v1/apps/{appId}/data-pipelines/sources/{sourceId}/rotate-secret");
        op.pathParam("sourceId", sourceId);
        return client.execute(op, options, TYPE_9);
    }

    private static final TypeReference<DataSourceRunResult> TYPE_10 = new TypeReference<DataSourceRunResult>() {};

    /**
     * HTTP pull kaynağını şimdi çalıştır
     *
     * {@code POST /v1/apps/{appId}/data-pipelines/sources/{sourceId}/run}
     */
    public DataSourceRunResult run(String sourceId) {
        return run(sourceId, null);
    }

    /**
     * HTTP pull kaynağını şimdi çalıştır
     *
     * {@code POST /v1/apps/{appId}/data-pipelines/sources/{sourceId}/run}
     */
    public DataSourceRunResult run(String sourceId, RequestOptions options) {
        Operation op = new Operation("POST", "/v1/apps/{appId}/data-pipelines/sources/{sourceId}/run");
        op.pathParam("sourceId", sourceId);
        return client.execute(op, options, TYPE_10);
    }

    private static final TypeReference<DataQuarantineList> TYPE_11 = new TypeReference<DataQuarantineList>() {};

    /**
     * Karantinadaki kayıtlar
     *
     * {@code GET /v1/apps/{appId}/data-pipelines/quarantine}
     */
    public DataQuarantineList quarantine() {
        return quarantine(null, null);
    }

    /**
     * Karantinadaki kayıtlar
     *
     * {@code GET /v1/apps/{appId}/data-pipelines/quarantine}
     */
    public DataQuarantineList quarantine(DataPipelinesQuarantineParams params) {
        return quarantine(params, null);
    }

    /**
     * Karantinadaki kayıtlar
     *
     * {@code GET /v1/apps/{appId}/data-pipelines/quarantine}
     *
     * Parametreler: status — Değerler: "pending", "reprocessed", "discarded".; target — Değerler: "event", "person".
     */
    public DataQuarantineList quarantine(DataPipelinesQuarantineParams params, RequestOptions options) {
        Operation op = new Operation("GET", "/v1/apps/{appId}/data-pipelines/quarantine");
        if (params != null) {
            params.applyTo(op);
        }
        return client.execute(op, options, TYPE_11);
    }

    /**
     * quarantine sonuçlarını next_cursor ile tüm sayfalar boyunca tek tek dolaşır (sayfalar tembel yüklenir).
     */
    public PageIterable<DataQuarantineListDataItem> quarantineAll() {
        return quarantineAll(null, null);
    }

    /**
     * quarantine sonuçlarını next_cursor ile tüm sayfalar boyunca tek tek dolaşır (sayfalar tembel yüklenir).
     */
    public PageIterable<DataQuarantineListDataItem> quarantineAll(DataPipelinesQuarantineParams params) {
        return quarantineAll(params, null);
    }

    /**
     * quarantine sonuçlarını next_cursor ile tüm sayfalar boyunca tek tek dolaşır (sayfalar tembel yüklenir).
     */
    public PageIterable<DataQuarantineListDataItem> quarantineAll(DataPipelinesQuarantineParams params, RequestOptions options) {
        DataPipelinesQuarantineParams base = params == null ? new DataPipelinesQuarantineParams() : params.copy();
        return new PageIterable<>(cursor -> {
            DataPipelinesQuarantineParams p = base.copy();
            if (cursor != null) {
                p.cursor(cursor);
            }
            DataQuarantineList page = quarantine(p, options);
            return new PageIterable.Page<>(page.getData(), page.getNextCursor(), Boolean.TRUE.equals(page.getHasMore()));
        });
    }

    private static final TypeReference<DataQuarantineReprocessResult> TYPE_12 = new TypeReference<DataQuarantineReprocessResult>() {};

    /**
     * Karantinadaki kayıtları yeniden işle
     *
     * {@code POST /v1/apps/{appId}/data-pipelines/quarantine/reprocess}
     *
     * Kimlik verilmezse bekleyen en eski 500 kayıt işlenir.
     */
    public DataQuarantineReprocessResult reprocess(ReprocessQuarantineDto body) {
        return reprocess(body, null);
    }

    /**
     * Karantinadaki kayıtları yeniden işle
     *
     * {@code POST /v1/apps/{appId}/data-pipelines/quarantine/reprocess}
     *
     * Kimlik verilmezse bekleyen en eski 500 kayıt işlenir.
     */
    public DataQuarantineReprocessResult reprocess(ReprocessQuarantineDto body, RequestOptions options) {
        Operation op = new Operation("POST", "/v1/apps/{appId}/data-pipelines/quarantine/reprocess");
        if (body == null) {
            throw new IllegalArgumentException("Pushizo: istek gövdesi null olamaz.");
        }
        op.body(body);
        return client.execute(op, options, TYPE_12);
    }

    private static final TypeReference<DataQuarantineDiscardResult> TYPE_13 = new TypeReference<DataQuarantineDiscardResult>() {};

    /**
     * Karantinadaki kayıtları yeniden işlemeden kapat
     *
     * {@code POST /v1/apps/{appId}/data-pipelines/quarantine/discard}
     */
    public DataQuarantineDiscardResult discard(DiscardQuarantineDto body) {
        return discard(body, null);
    }

    /**
     * Karantinadaki kayıtları yeniden işlemeden kapat
     *
     * {@code POST /v1/apps/{appId}/data-pipelines/quarantine/discard}
     */
    public DataQuarantineDiscardResult discard(DiscardQuarantineDto body, RequestOptions options) {
        Operation op = new Operation("POST", "/v1/apps/{appId}/data-pipelines/quarantine/discard");
        if (body == null) {
            throw new IllegalArgumentException("Pushizo: istek gövdesi null olamaz.");
        }
        op.body(body);
        return client.execute(op, options, TYPE_13);
    }
}
