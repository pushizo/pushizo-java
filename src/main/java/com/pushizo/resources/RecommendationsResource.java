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
 * recommendations kaynağı.
 */
public final class RecommendationsResource {
    private final Pushizo client;

    public RecommendationsResource(Pushizo client) {
        this.client = client;
    }

    private static final TypeReference<Recommendations> TYPE_0 = new TypeReference<Recommendations>() {};

    /**
     * Ürün önerileri
     *
     * {@code GET /v1/apps/{appId}/catalogs/{catalogId}/recommendations}
     *
     * Stokta olmayan ve kullanıcının satın aldığı ürünler çıkmaz. Sonuç yetmezse yedek kaynakla tamamlanır.
     */
    public Recommendations list(String catalogId, String strategy) {
        return list(catalogId, strategy, null, null);
    }

    /**
     * Ürün önerileri
     *
     * {@code GET /v1/apps/{appId}/catalogs/{catalogId}/recommendations}
     *
     * Stokta olmayan ve kullanıcının satın aldığı ürünler çıkmaz. Sonuç yetmezse yedek kaynakla tamamlanır.
     */
    public Recommendations list(String catalogId, String strategy, RecommendationsListParams params) {
        return list(catalogId, strategy, params, null);
    }

    /**
     * Ürün önerileri
     *
     * {@code GET /v1/apps/{appId}/catalogs/{catalogId}/recommendations}
     *
     * Stokta olmayan ve kullanıcının satın aldığı ürünler çıkmaz. Sonuç yetmezse yedek kaynakla tamamlanır.
     *
     * Parametreler: strategy — Değerler: "personalized", "popular", "trending", "similar", "category", "recently_viewed", "new_arrivals".
     */
    public Recommendations list(String catalogId, String strategy, RecommendationsListParams params, RequestOptions options) {
        Operation op = new Operation("GET", "/v1/apps/{appId}/catalogs/{catalogId}/recommendations");
        op.pathParam("catalogId", catalogId);
        op.query("strategy", strategy);
        if (params != null) {
            params.applyTo(op);
        }
        return client.execute(op, options, TYPE_0);
    }

    private static final TypeReference<RecommendationConfig> TYPE_1 = new TypeReference<RecommendationConfig>() {};

    /**
     * Öneri modeli
     *
     * {@code GET /v1/apps/{appId}/catalogs/{catalogId}/recommendations/config}
     */
    public RecommendationConfig getConfig(String catalogId) {
        return getConfig(catalogId, null);
    }

    /**
     * Öneri modeli
     *
     * {@code GET /v1/apps/{appId}/catalogs/{catalogId}/recommendations/config}
     */
    public RecommendationConfig getConfig(String catalogId, RequestOptions options) {
        Operation op = new Operation("GET", "/v1/apps/{appId}/catalogs/{catalogId}/recommendations/config");
        op.pathParam("catalogId", catalogId);
        return client.execute(op, options, TYPE_1);
    }

    private static final TypeReference<RecommendationConfig> TYPE_2 = new TypeReference<RecommendationConfig>() {};

    /**
     * Öneri modelini ayarla
     *
     * {@code PUT /v1/apps/{appId}/catalogs/{catalogId}/recommendations/config}
     *
     * Model açıksa öneriler kayıttan sonra yeniden hesaplanır.
     */
    public RecommendationConfig updateConfig(String catalogId, UpdateRecommendationConfigDto body) {
        return updateConfig(catalogId, body, null);
    }

    /**
     * Öneri modelini ayarla
     *
     * {@code PUT /v1/apps/{appId}/catalogs/{catalogId}/recommendations/config}
     *
     * Model açıksa öneriler kayıttan sonra yeniden hesaplanır.
     */
    public RecommendationConfig updateConfig(String catalogId, UpdateRecommendationConfigDto body, RequestOptions options) {
        Operation op = new Operation("PUT", "/v1/apps/{appId}/catalogs/{catalogId}/recommendations/config");
        op.pathParam("catalogId", catalogId);
        if (body == null) {
            throw new IllegalArgumentException("Pushizo: istek gövdesi null olamaz.");
        }
        op.body(body);
        return client.execute(op, options, TYPE_2);
    }

    private static final TypeReference<RecommendationConfig> TYPE_3 = new TypeReference<RecommendationConfig>() {};

    /**
     * Önerileri yeniden hesapla
     *
     * {@code POST /v1/apps/{appId}/catalogs/{catalogId}/recommendations/compute}
     *
     * İş kuyruğa alınır; ilerleme `status` alanından izlenir.
     */
    public RecommendationConfig compute(String catalogId) {
        return compute(catalogId, null);
    }

    /**
     * Önerileri yeniden hesapla
     *
     * {@code POST /v1/apps/{appId}/catalogs/{catalogId}/recommendations/compute}
     *
     * İş kuyruğa alınır; ilerleme `status` alanından izlenir.
     */
    public RecommendationConfig compute(String catalogId, RequestOptions options) {
        Operation op = new Operation("POST", "/v1/apps/{appId}/catalogs/{catalogId}/recommendations/compute");
        op.pathParam("catalogId", catalogId);
        return client.execute(op, options, TYPE_3);
    }
}
