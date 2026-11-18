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
 * siteSearch kaynağı.
 */
public final class SiteSearchResource {
    private final Pushizo client;

    public SiteSearchResource(Pushizo client) {
        this.client = client;
    }

    private static final TypeReference<SiteSearchOverview> TYPE_0 = new TypeReference<SiteSearchOverview>() {};

    /**
     * Site araması ayarları, dizin durumu ve AI kullanımı
     *
     * {@code GET /v1/apps/{appId}/site-search}
     */
    public SiteSearchOverview overview() {
        return overview(null);
    }

    /**
     * Site araması ayarları, dizin durumu ve AI kullanımı
     *
     * {@code GET /v1/apps/{appId}/site-search}
     */
    public SiteSearchOverview overview(RequestOptions options) {
        Operation op = new Operation("GET", "/v1/apps/{appId}/site-search");
        return client.execute(op, options, TYPE_0);
    }

    private static final TypeReference<SiteSearchOverview> TYPE_1 = new TypeReference<SiteSearchOverview>() {};

    /**
     * Site araması ayarlarını güncelle
     *
     * {@code PATCH /v1/apps/{appId}/site-search/settings}
     */
    public SiteSearchOverview updateSettings(UpdateSiteSearchSettingsDto body) {
        return updateSettings(body, null);
    }

    /**
     * Site araması ayarlarını güncelle
     *
     * {@code PATCH /v1/apps/{appId}/site-search/settings}
     */
    public SiteSearchOverview updateSettings(UpdateSiteSearchSettingsDto body, RequestOptions options) {
        Operation op = new Operation("PATCH", "/v1/apps/{appId}/site-search/settings");
        if (body == null) {
            throw new IllegalArgumentException("Pushizo: istek gövdesi null olamaz.");
        }
        op.body(body);
        return client.execute(op, options, TYPE_1);
    }

    private static final TypeReference<SiteSearchSourceList> TYPE_2 = new TypeReference<SiteSearchSourceList>() {};

    /**
     * Arama kaynakları
     *
     * {@code GET /v1/apps/{appId}/site-search/sources}
     */
    public SiteSearchSourceList sources() {
        return sources(null);
    }

    /**
     * Arama kaynakları
     *
     * {@code GET /v1/apps/{appId}/site-search/sources}
     */
    public SiteSearchSourceList sources(RequestOptions options) {
        Operation op = new Operation("GET", "/v1/apps/{appId}/site-search/sources");
        return client.execute(op, options, TYPE_2);
    }

    private static final TypeReference<SiteSearchSource> TYPE_3 = new TypeReference<SiteSearchSource>() {};

    /**
     * Arama kaynağı ekle
     *
     * {@code POST /v1/apps/{appId}/site-search/sources}
     */
    public SiteSearchSource createSource(CreateSiteSearchSourceDto body) {
        return createSource(body, null);
    }

    /**
     * Arama kaynağı ekle
     *
     * {@code POST /v1/apps/{appId}/site-search/sources}
     */
    public SiteSearchSource createSource(CreateSiteSearchSourceDto body, RequestOptions options) {
        Operation op = new Operation("POST", "/v1/apps/{appId}/site-search/sources");
        if (body == null) {
            throw new IllegalArgumentException("Pushizo: istek gövdesi null olamaz.");
        }
        op.body(body);
        return client.execute(op, options, TYPE_3);
    }

    private static final TypeReference<SiteSearchSource> TYPE_4 = new TypeReference<SiteSearchSource>() {};

    /**
     * Arama kaynağını düzenle
     *
     * {@code PATCH /v1/apps/{appId}/site-search/sources/{sourceId}}
     */
    public SiteSearchSource updateSource(String sourceId, UpdateSiteSearchSourceDto body) {
        return updateSource(sourceId, body, null);
    }

    /**
     * Arama kaynağını düzenle
     *
     * {@code PATCH /v1/apps/{appId}/site-search/sources/{sourceId}}
     */
    public SiteSearchSource updateSource(String sourceId, UpdateSiteSearchSourceDto body, RequestOptions options) {
        Operation op = new Operation("PATCH", "/v1/apps/{appId}/site-search/sources/{sourceId}");
        op.pathParam("sourceId", sourceId);
        if (body == null) {
            throw new IllegalArgumentException("Pushizo: istek gövdesi null olamaz.");
        }
        op.body(body);
        return client.execute(op, options, TYPE_4);
    }

    private static final TypeReference<Ok> TYPE_5 = new TypeReference<Ok>() {};

    /**
     * Arama kaynağını ve sayfalarını sil
     *
     * {@code DELETE /v1/apps/{appId}/site-search/sources/{sourceId}}
     */
    public Ok removeSource(String sourceId) {
        return removeSource(sourceId, null);
    }

    /**
     * Arama kaynağını ve sayfalarını sil
     *
     * {@code DELETE /v1/apps/{appId}/site-search/sources/{sourceId}}
     */
    public Ok removeSource(String sourceId, RequestOptions options) {
        Operation op = new Operation("DELETE", "/v1/apps/{appId}/site-search/sources/{sourceId}");
        op.pathParam("sourceId", sourceId);
        return client.execute(op, options, TYPE_5);
    }

    private static final TypeReference<SiteSearchCrawlRequest> TYPE_6 = new TypeReference<SiteSearchCrawlRequest>() {};

    /**
     * Kaynağı şimdi yeniden tara
     *
     * {@code POST /v1/apps/{appId}/site-search/sources/{sourceId}/crawl}
     */
    public SiteSearchCrawlRequest crawl(String sourceId) {
        return crawl(sourceId, null);
    }

    /**
     * Kaynağı şimdi yeniden tara
     *
     * {@code POST /v1/apps/{appId}/site-search/sources/{sourceId}/crawl}
     */
    public SiteSearchCrawlRequest crawl(String sourceId, RequestOptions options) {
        Operation op = new Operation("POST", "/v1/apps/{appId}/site-search/sources/{sourceId}/crawl");
        op.pathParam("sourceId", sourceId);
        return client.execute(op, options, TYPE_6);
    }

    private static final TypeReference<SiteSearchDocumentPage> TYPE_7 = new TypeReference<SiteSearchDocumentPage>() {};

    /**
     * Dizindeki belgeler
     *
     * {@code GET /v1/apps/{appId}/site-search/documents}
     */
    public SiteSearchDocumentPage documents() {
        return documents(null, null);
    }

    /**
     * Dizindeki belgeler
     *
     * {@code GET /v1/apps/{appId}/site-search/documents}
     */
    public SiteSearchDocumentPage documents(SiteSearchDocumentsParams params) {
        return documents(params, null);
    }

    /**
     * Dizindeki belgeler
     *
     * {@code GET /v1/apps/{appId}/site-search/documents}
     */
    public SiteSearchDocumentPage documents(SiteSearchDocumentsParams params, RequestOptions options) {
        Operation op = new Operation("GET", "/v1/apps/{appId}/site-search/documents");
        if (params != null) {
            params.applyTo(op);
        }
        return client.execute(op, options, TYPE_7);
    }

    /**
     * documents sonuçlarını next_cursor ile tüm sayfalar boyunca tek tek dolaşır (sayfalar tembel yüklenir).
     */
    public PageIterable<SiteSearchDocument> documentsAll() {
        return documentsAll(null, null);
    }

    /**
     * documents sonuçlarını next_cursor ile tüm sayfalar boyunca tek tek dolaşır (sayfalar tembel yüklenir).
     */
    public PageIterable<SiteSearchDocument> documentsAll(SiteSearchDocumentsParams params) {
        return documentsAll(params, null);
    }

    /**
     * documents sonuçlarını next_cursor ile tüm sayfalar boyunca tek tek dolaşır (sayfalar tembel yüklenir).
     */
    public PageIterable<SiteSearchDocument> documentsAll(SiteSearchDocumentsParams params, RequestOptions options) {
        SiteSearchDocumentsParams base = params == null ? new SiteSearchDocumentsParams() : params.copy();
        return new PageIterable<>(cursor -> {
            SiteSearchDocumentsParams p = base.copy();
            if (cursor != null) {
                p.cursor(cursor);
            }
            SiteSearchDocumentPage page = documents(p, options);
            return new PageIterable.Page<>(page.getData(), page.getNextCursor(), Boolean.TRUE.equals(page.getHasMore()));
        });
    }

    private static final TypeReference<SiteSearchDocumentResult> TYPE_8 = new TypeReference<SiteSearchDocumentResult>() {};

    /**
     * Belgeyi dizine yükle veya değiştir (anahtar app içinde tekildir)
     *
     * {@code PUT /v1/apps/{appId}/site-search/documents/{documentKey}}
     */
    public SiteSearchDocumentResult putDocument(String documentKey, PutSiteSearchDocumentDto body) {
        return putDocument(documentKey, body, null);
    }

    /**
     * Belgeyi dizine yükle veya değiştir (anahtar app içinde tekildir)
     *
     * {@code PUT /v1/apps/{appId}/site-search/documents/{documentKey}}
     */
    public SiteSearchDocumentResult putDocument(String documentKey, PutSiteSearchDocumentDto body, RequestOptions options) {
        Operation op = new Operation("PUT", "/v1/apps/{appId}/site-search/documents/{documentKey}");
        op.pathParam("documentKey", documentKey);
        if (body == null) {
            throw new IllegalArgumentException("Pushizo: istek gövdesi null olamaz.");
        }
        op.body(body);
        return client.execute(op, options, TYPE_8);
    }

    private static final TypeReference<Ok> TYPE_9 = new TypeReference<Ok>() {};

    /**
     * Belgeyi dizinden sil (belge kimliği veya anahtarı)
     *
     * {@code DELETE /v1/apps/{appId}/site-search/documents/{documentKey}}
     */
    public Ok removeDocument(String documentKey) {
        return removeDocument(documentKey, null);
    }

    /**
     * Belgeyi dizinden sil (belge kimliği veya anahtarı)
     *
     * {@code DELETE /v1/apps/{appId}/site-search/documents/{documentKey}}
     */
    public Ok removeDocument(String documentKey, RequestOptions options) {
        Operation op = new Operation("DELETE", "/v1/apps/{appId}/site-search/documents/{documentKey}");
        op.pathParam("documentKey", documentKey);
        return client.execute(op, options, TYPE_9);
    }

    private static final TypeReference<SiteSearchReport> TYPE_10 = new TypeReference<SiteSearchReport>() {};

    /**
     * Arama raporu
     *
     * {@code GET /v1/apps/{appId}/site-search/report}
     */
    public SiteSearchReport report() {
        return report(null, null);
    }

    /**
     * Arama raporu
     *
     * {@code GET /v1/apps/{appId}/site-search/report}
     */
    public SiteSearchReport report(SiteSearchReportParams params) {
        return report(params, null);
    }

    /**
     * Arama raporu
     *
     * {@code GET /v1/apps/{appId}/site-search/report}
     */
    public SiteSearchReport report(SiteSearchReportParams params, RequestOptions options) {
        Operation op = new Operation("GET", "/v1/apps/{appId}/site-search/report");
        if (params != null) {
            params.applyTo(op);
        }
        return client.execute(op, options, TYPE_10);
    }
}
