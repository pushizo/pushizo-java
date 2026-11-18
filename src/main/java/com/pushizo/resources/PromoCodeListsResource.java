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
 * promoCodeLists kaynağı.
 */
public final class PromoCodeListsResource {
    private final Pushizo client;

    public PromoCodeListsResource(Pushizo client) {
        this.client = client;
    }

    private static final TypeReference<PromoCodeListList> TYPE_0 = new TypeReference<PromoCodeListList>() {};

    /**
     * Promosyon kodu listeleri
     *
     * {@code GET /v1/apps/{appId}/promo-code-lists}
     */
    public PromoCodeListList listPromoLists() {
        return listPromoLists(null);
    }

    /**
     * Promosyon kodu listeleri
     *
     * {@code GET /v1/apps/{appId}/promo-code-lists}
     */
    public PromoCodeListList listPromoLists(RequestOptions options) {
        Operation op = new Operation("GET", "/v1/apps/{appId}/promo-code-lists");
        return client.execute(op, options, TYPE_0);
    }

    private static final TypeReference<PromoCodeList> TYPE_1 = new TypeReference<PromoCodeList>() {};

    /**
     * Promosyon kodu listesi oluştur
     *
     * {@code POST /v1/apps/{appId}/promo-code-lists}
     *
     * Şablonda `{% promo_code '&lt;ad&gt;' %}` teslimat başına tek kullanımlık kod verir. Kod kalmazsa teslimat `PromoCodeUnavailable` hatasıyla düşer.
     */
    public PromoCodeList createPromoList(CreatePromoCodeListDto body) {
        return createPromoList(body, null);
    }

    /**
     * Promosyon kodu listesi oluştur
     *
     * {@code POST /v1/apps/{appId}/promo-code-lists}
     *
     * Şablonda `{% promo_code '&lt;ad&gt;' %}` teslimat başına tek kullanımlık kod verir. Kod kalmazsa teslimat `PromoCodeUnavailable` hatasıyla düşer.
     */
    public PromoCodeList createPromoList(CreatePromoCodeListDto body, RequestOptions options) {
        Operation op = new Operation("POST", "/v1/apps/{appId}/promo-code-lists");
        if (body == null) {
            throw new IllegalArgumentException("Pushizo: istek gövdesi null olamaz.");
        }
        op.body(body);
        return client.execute(op, options, TYPE_1);
    }

    private static final TypeReference<PromoCodeList> TYPE_2 = new TypeReference<PromoCodeList>() {};

    /**
     * Promosyon kodu listesi ayrıntısı
     *
     * {@code GET /v1/apps/{appId}/promo-code-lists/{listId}}
     */
    public PromoCodeList getPromoList(String listId) {
        return getPromoList(listId, null);
    }

    /**
     * Promosyon kodu listesi ayrıntısı
     *
     * {@code GET /v1/apps/{appId}/promo-code-lists/{listId}}
     */
    public PromoCodeList getPromoList(String listId, RequestOptions options) {
        Operation op = new Operation("GET", "/v1/apps/{appId}/promo-code-lists/{listId}");
        op.pathParam("listId", listId);
        return client.execute(op, options, TYPE_2);
    }

    private static final TypeReference<PromoCodeList> TYPE_3 = new TypeReference<PromoCodeList>() {};

    /**
     * Promosyon kodu listesini güncelle (açıklama, son kullanma)
     *
     * {@code PATCH /v1/apps/{appId}/promo-code-lists/{listId}}
     */
    public PromoCodeList updatePromoList(String listId, UpdatePromoCodeListDto body) {
        return updatePromoList(listId, body, null);
    }

    /**
     * Promosyon kodu listesini güncelle (açıklama, son kullanma)
     *
     * {@code PATCH /v1/apps/{appId}/promo-code-lists/{listId}}
     */
    public PromoCodeList updatePromoList(String listId, UpdatePromoCodeListDto body, RequestOptions options) {
        Operation op = new Operation("PATCH", "/v1/apps/{appId}/promo-code-lists/{listId}");
        op.pathParam("listId", listId);
        if (body == null) {
            throw new IllegalArgumentException("Pushizo: istek gövdesi null olamaz.");
        }
        op.body(body);
        return client.execute(op, options, TYPE_3);
    }

    private static final TypeReference<Ok> TYPE_4 = new TypeReference<Ok>() {};

    /**
     * Promosyon kodu listesini sil
     *
     * {@code DELETE /v1/apps/{appId}/promo-code-lists/{listId}}
     */
    public Ok deletePromoList(String listId) {
        return deletePromoList(listId, null);
    }

    /**
     * Promosyon kodu listesini sil
     *
     * {@code DELETE /v1/apps/{appId}/promo-code-lists/{listId}}
     */
    public Ok deletePromoList(String listId, RequestOptions options) {
        Operation op = new Operation("DELETE", "/v1/apps/{appId}/promo-code-lists/{listId}");
        op.pathParam("listId", listId);
        return client.execute(op, options, TYPE_4);
    }

    private static final TypeReference<PromoCodeUploadResult> TYPE_5 = new TypeReference<PromoCodeUploadResult>() {};

    /**
     * CSV ile kod ekle (zaten olanlar atlanır)
     *
     * {@code POST /v1/apps/{appId}/promo-code-lists/{listId}/codes}
     */
    public PromoCodeUploadResult uploadPromoList(String listId, PromoCodeListsUploadPromoListForm form) {
        return uploadPromoList(listId, form, null);
    }

    /**
     * CSV ile kod ekle (zaten olanlar atlanır)
     *
     * {@code POST /v1/apps/{appId}/promo-code-lists/{listId}/codes}
     */
    public PromoCodeUploadResult uploadPromoList(String listId, PromoCodeListsUploadPromoListForm form, RequestOptions options) {
        Operation op = new Operation("POST", "/v1/apps/{appId}/promo-code-lists/{listId}/codes");
        op.pathParam("listId", listId);
        if (form == null) {
            throw new IllegalArgumentException("Pushizo: form null olamaz.");
        }
        form.applyTo(op);
        return client.execute(op, options, TYPE_5);
    }

    private static final TypeReference<PromoCodesPage> TYPE_6 = new TypeReference<PromoCodesPage>() {};

    /**
     * Listedeki kodlar ve atamaları
     *
     * {@code GET /v1/apps/{appId}/promo-code-lists/{listId}/codes}
     */
    public PromoCodesPage promoCodes(String listId) {
        return promoCodes(listId, null, null);
    }

    /**
     * Listedeki kodlar ve atamaları
     *
     * {@code GET /v1/apps/{appId}/promo-code-lists/{listId}/codes}
     */
    public PromoCodesPage promoCodes(String listId, PromoCodeListsPromoCodesParams params) {
        return promoCodes(listId, params, null);
    }

    /**
     * Listedeki kodlar ve atamaları
     *
     * {@code GET /v1/apps/{appId}/promo-code-lists/{listId}/codes}
     *
     * Parametreler: status — Değerler: "available", "assigned".
     */
    public PromoCodesPage promoCodes(String listId, PromoCodeListsPromoCodesParams params, RequestOptions options) {
        Operation op = new Operation("GET", "/v1/apps/{appId}/promo-code-lists/{listId}/codes");
        op.pathParam("listId", listId);
        if (params != null) {
            params.applyTo(op);
        }
        return client.execute(op, options, TYPE_6);
    }
}
