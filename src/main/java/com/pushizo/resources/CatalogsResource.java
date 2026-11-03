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
 * catalogs kaynağı.
 */
public final class CatalogsResource {
    private final Pushizo client;

    public CatalogsResource(Pushizo client) {
        this.client = client;
    }

    private static final TypeReference<CatalogList> TYPE_0 = new TypeReference<CatalogList>() {};

    /**
     * Ürün katalogları
     *
     * {@code GET /v1/apps/{appId}/catalogs}
     */
    public CatalogList list() {
        return list(null);
    }

    /**
     * Ürün katalogları
     *
     * {@code GET /v1/apps/{appId}/catalogs}
     */
    public CatalogList list(RequestOptions options) {
        Operation op = new Operation("GET", "/v1/apps/{appId}/catalogs");
        return client.execute(op, options, TYPE_0);
    }

    private static final TypeReference<Catalog> TYPE_1 = new TypeReference<Catalog>() {};

    /**
     * Katalog oluştur
     *
     * {@code POST /v1/apps/{appId}/catalogs}
     *
     * Şablonda `{% catalog_item '&lt;ad&gt;' id: custom_data.product_id as urun %}{{ urun.title }}`.
     */
    public Catalog create(CreateCatalogDto body) {
        return create(body, null);
    }

    /**
     * Katalog oluştur
     *
     * {@code POST /v1/apps/{appId}/catalogs}
     *
     * Şablonda `{% catalog_item '&lt;ad&gt;' id: custom_data.product_id as urun %}{{ urun.title }}`.
     */
    public Catalog create(CreateCatalogDto body, RequestOptions options) {
        Operation op = new Operation("POST", "/v1/apps/{appId}/catalogs");
        if (body == null) {
            throw new IllegalArgumentException("Pushizo: istek gövdesi null olamaz.");
        }
        op.body(body);
        return client.execute(op, options, TYPE_1);
    }

    private static final TypeReference<Catalog> TYPE_2 = new TypeReference<Catalog>() {};

    /**
     * Katalog ayrıntısı
     *
     * {@code GET /v1/apps/{appId}/catalogs/{catalogId}}
     */
    public Catalog get(String catalogId) {
        return get(catalogId, null);
    }

    /**
     * Katalog ayrıntısı
     *
     * {@code GET /v1/apps/{appId}/catalogs/{catalogId}}
     */
    public Catalog get(String catalogId, RequestOptions options) {
        Operation op = new Operation("GET", "/v1/apps/{appId}/catalogs/{catalogId}");
        op.pathParam("catalogId", catalogId);
        return client.execute(op, options, TYPE_2);
    }

    private static final TypeReference<Catalog> TYPE_3 = new TypeReference<Catalog>() {};

    /**
     * Kataloğu güncelle
     *
     * {@code PATCH /v1/apps/{appId}/catalogs/{catalogId}}
     */
    public Catalog update(String catalogId, UpdateCatalogDto body) {
        return update(catalogId, body, null);
    }

    /**
     * Kataloğu güncelle
     *
     * {@code PATCH /v1/apps/{appId}/catalogs/{catalogId}}
     */
    public Catalog update(String catalogId, UpdateCatalogDto body, RequestOptions options) {
        Operation op = new Operation("PATCH", "/v1/apps/{appId}/catalogs/{catalogId}");
        op.pathParam("catalogId", catalogId);
        if (body == null) {
            throw new IllegalArgumentException("Pushizo: istek gövdesi null olamaz.");
        }
        op.body(body);
        return client.execute(op, options, TYPE_3);
    }

    private static final TypeReference<Ok> TYPE_4 = new TypeReference<Ok>() {};

    /**
     * Kataloğu sil
     *
     * {@code DELETE /v1/apps/{appId}/catalogs/{catalogId}}
     */
    public Ok delete(String catalogId) {
        return delete(catalogId, null);
    }

    /**
     * Kataloğu sil
     *
     * {@code DELETE /v1/apps/{appId}/catalogs/{catalogId}}
     */
    public Ok delete(String catalogId, RequestOptions options) {
        Operation op = new Operation("DELETE", "/v1/apps/{appId}/catalogs/{catalogId}");
        op.pathParam("catalogId", catalogId);
        return client.execute(op, options, TYPE_4);
    }

    private static final TypeReference<CatalogItemsPage> TYPE_5 = new TypeReference<CatalogItemsPage>() {};

    /**
     * Ürünler
     *
     * {@code GET /v1/apps/{appId}/catalogs/{catalogId}/items}
     */
    public CatalogItemsPage items(String catalogId) {
        return items(catalogId, null, null);
    }

    /**
     * Ürünler
     *
     * {@code GET /v1/apps/{appId}/catalogs/{catalogId}/items}
     */
    public CatalogItemsPage items(String catalogId, CatalogsItemsParams params) {
        return items(catalogId, params, null);
    }

    /**
     * Ürünler
     *
     * {@code GET /v1/apps/{appId}/catalogs/{catalogId}/items}
     */
    public CatalogItemsPage items(String catalogId, CatalogsItemsParams params, RequestOptions options) {
        Operation op = new Operation("GET", "/v1/apps/{appId}/catalogs/{catalogId}/items");
        op.pathParam("catalogId", catalogId);
        if (params != null) {
            params.applyTo(op);
        }
        return client.execute(op, options, TYPE_5);
    }

    private static final TypeReference<CatalogUpsertResult> TYPE_6 = new TypeReference<CatalogUpsertResult>() {};

    /**
     * Ürünleri ekle veya güncelle (en fazla 1000)
     *
     * {@code PUT /v1/apps/{appId}/catalogs/{catalogId}/items}
     *
     * Listede olmayan ürünlere dokunulmaz. Listedeki ürünün verilmeyen alanları temizlenir.
     */
    public CatalogUpsertResult upsert(String catalogId, UpsertCatalogItemsDto body) {
        return upsert(catalogId, body, null);
    }

    /**
     * Ürünleri ekle veya güncelle (en fazla 1000)
     *
     * {@code PUT /v1/apps/{appId}/catalogs/{catalogId}/items}
     *
     * Listede olmayan ürünlere dokunulmaz. Listedeki ürünün verilmeyen alanları temizlenir.
     */
    public CatalogUpsertResult upsert(String catalogId, UpsertCatalogItemsDto body, RequestOptions options) {
        Operation op = new Operation("PUT", "/v1/apps/{appId}/catalogs/{catalogId}/items");
        op.pathParam("catalogId", catalogId);
        if (body == null) {
            throw new IllegalArgumentException("Pushizo: istek gövdesi null olamaz.");
        }
        op.body(body);
        return client.execute(op, options, TYPE_6);
    }

    private static final TypeReference<CatalogUpsertResult> TYPE_7 = new TypeReference<CatalogUpsertResult>() {};

    /**
     * CSV ile ürün ekle veya güncelle
     *
     * {@code POST /v1/apps/{appId}/catalogs/{catalogId}/items/upload}
     */
    public CatalogUpsertResult upload(String catalogId, CatalogsUploadForm form) {
        return upload(catalogId, form, null);
    }

    /**
     * CSV ile ürün ekle veya güncelle
     *
     * {@code POST /v1/apps/{appId}/catalogs/{catalogId}/items/upload}
     */
    public CatalogUpsertResult upload(String catalogId, CatalogsUploadForm form, RequestOptions options) {
        Operation op = new Operation("POST", "/v1/apps/{appId}/catalogs/{catalogId}/items/upload");
        op.pathParam("catalogId", catalogId);
        if (form == null) {
            throw new IllegalArgumentException("Pushizo: form null olamaz.");
        }
        form.applyTo(op);
        return client.execute(op, options, TYPE_7);
    }

    private static final TypeReference<CatalogItem> TYPE_8 = new TypeReference<CatalogItem>() {};

    /**
     * Ürün ayrıntısı
     *
     * {@code GET /v1/apps/{appId}/catalogs/{catalogId}/items/{itemId}}
     */
    public CatalogItem item(String catalogId, String itemId) {
        return item(catalogId, itemId, null);
    }

    /**
     * Ürün ayrıntısı
     *
     * {@code GET /v1/apps/{appId}/catalogs/{catalogId}/items/{itemId}}
     */
    public CatalogItem item(String catalogId, String itemId, RequestOptions options) {
        Operation op = new Operation("GET", "/v1/apps/{appId}/catalogs/{catalogId}/items/{itemId}");
        op.pathParam("catalogId", catalogId);
        op.pathParam("itemId", itemId);
        return client.execute(op, options, TYPE_8);
    }

    private static final TypeReference<Ok> TYPE_9 = new TypeReference<Ok>() {};

    /**
     * Ürünü sil
     *
     * {@code DELETE /v1/apps/{appId}/catalogs/{catalogId}/items/{itemId}}
     */
    public Ok removeItem(String catalogId, String itemId) {
        return removeItem(catalogId, itemId, null);
    }

    /**
     * Ürünü sil
     *
     * {@code DELETE /v1/apps/{appId}/catalogs/{catalogId}/items/{itemId}}
     */
    public Ok removeItem(String catalogId, String itemId, RequestOptions options) {
        Operation op = new Operation("DELETE", "/v1/apps/{appId}/catalogs/{catalogId}/items/{itemId}");
        op.pathParam("catalogId", catalogId);
        op.pathParam("itemId", itemId);
        return client.execute(op, options, TYPE_9);
    }

    private static final TypeReference<Recommendations> TYPE_10 = new TypeReference<Recommendations>() {};

    /**
     * Ürün önerileri
     *
     * {@code GET /v1/apps/{appId}/catalogs/{catalogId}/recommendations}
     *
     * Stokta olmayan ve kullanıcının satın aldığı ürünler çıkmaz. Sonuç yetmezse yedek kaynakla tamamlanır.
     */
    public Recommendations listRecommendations(String catalogId, String strategy) {
        return listRecommendations(catalogId, strategy, null, null);
    }

    /**
     * Ürün önerileri
     *
     * {@code GET /v1/apps/{appId}/catalogs/{catalogId}/recommendations}
     *
     * Stokta olmayan ve kullanıcının satın aldığı ürünler çıkmaz. Sonuç yetmezse yedek kaynakla tamamlanır.
     */
    public Recommendations listRecommendations(String catalogId, String strategy, CatalogsListRecommendationsParams params) {
        return listRecommendations(catalogId, strategy, params, null);
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
    public Recommendations listRecommendations(String catalogId, String strategy, CatalogsListRecommendationsParams params, RequestOptions options) {
        Operation op = new Operation("GET", "/v1/apps/{appId}/catalogs/{catalogId}/recommendations");
        op.pathParam("catalogId", catalogId);
        op.query("strategy", strategy);
        if (params != null) {
            params.applyTo(op);
        }
        return client.execute(op, options, TYPE_10);
    }

    private static final TypeReference<RecommendationConfig> TYPE_11 = new TypeReference<RecommendationConfig>() {};

    /**
     * Öneri modeli
     *
     * {@code GET /v1/apps/{appId}/catalogs/{catalogId}/recommendations/config}
     */
    public RecommendationConfig config(String catalogId) {
        return config(catalogId, null);
    }

    /**
     * Öneri modeli
     *
     * {@code GET /v1/apps/{appId}/catalogs/{catalogId}/recommendations/config}
     */
    public RecommendationConfig config(String catalogId, RequestOptions options) {
        Operation op = new Operation("GET", "/v1/apps/{appId}/catalogs/{catalogId}/recommendations/config");
        op.pathParam("catalogId", catalogId);
        return client.execute(op, options, TYPE_11);
    }

    private static final TypeReference<RecommendationConfig> TYPE_12 = new TypeReference<RecommendationConfig>() {};

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
        return client.execute(op, options, TYPE_12);
    }

    private static final TypeReference<RecommendationConfig> TYPE_13 = new TypeReference<RecommendationConfig>() {};

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
        return client.execute(op, options, TYPE_13);
    }
}
