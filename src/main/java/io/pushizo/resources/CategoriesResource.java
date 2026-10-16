// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package io.pushizo.resources;

import com.fasterxml.jackson.core.type.TypeReference;
import io.pushizo.Pushizo;
import io.pushizo.RequestOptions;
import io.pushizo.core.Operation;
import io.pushizo.core.PageIterable;
import io.pushizo.models.*;
import io.pushizo.params.*;

/**
 * categories kaynağı.
 */
public final class CategoriesResource {
    private final Pushizo client;

    public CategoriesResource(Pushizo client) {
        this.client = client;
    }

    private static final TypeReference<MessageCategoryList> TYPE_0 = new TypeReference<MessageCategoryList>() {};

    /**
     * Mesaj kategorileri
     *
     * {@code GET /v1/apps/{appId}/categories}
     */
    public MessageCategoryList list() {
        return list(null);
    }

    /**
     * Mesaj kategorileri
     *
     * {@code GET /v1/apps/{appId}/categories}
     */
    public MessageCategoryList list(RequestOptions options) {
        Operation op = new Operation("GET", "/v1/apps/{appId}/categories");
        return client.execute(op, options, TYPE_0);
    }

    private static final TypeReference<MessageCategory> TYPE_1 = new TypeReference<MessageCategory>() {};

    /**
     * Kategori oluştur
     *
     * {@code POST /v1/apps/{appId}/categories}
     */
    public MessageCategory create(CreateCategoryDto body) {
        return create(body, null);
    }

    /**
     * Kategori oluştur
     *
     * {@code POST /v1/apps/{appId}/categories}
     */
    public MessageCategory create(CreateCategoryDto body, RequestOptions options) {
        Operation op = new Operation("POST", "/v1/apps/{appId}/categories");
        if (body == null) {
            throw new IllegalArgumentException("Pushizo: istek gövdesi null olamaz.");
        }
        op.body(body);
        return client.execute(op, options, TYPE_1);
    }

    private static final TypeReference<MessageCategory> TYPE_2 = new TypeReference<MessageCategory>() {};

    /**
     * Kategori güncelle
     *
     * {@code PATCH /v1/apps/{appId}/categories/{categoryId}}
     */
    public MessageCategory update(String categoryId, UpdateCategoryDto body) {
        return update(categoryId, body, null);
    }

    /**
     * Kategori güncelle
     *
     * {@code PATCH /v1/apps/{appId}/categories/{categoryId}}
     */
    public MessageCategory update(String categoryId, UpdateCategoryDto body, RequestOptions options) {
        Operation op = new Operation("PATCH", "/v1/apps/{appId}/categories/{categoryId}");
        op.pathParam("categoryId", categoryId);
        if (body == null) {
            throw new IllegalArgumentException("Pushizo: istek gövdesi null olamaz.");
        }
        op.body(body);
        return client.execute(op, options, TYPE_2);
    }

    private static final TypeReference<Ok> TYPE_3 = new TypeReference<Ok>() {};

    /**
     * Kategori sil
     *
     * {@code DELETE /v1/apps/{appId}/categories/{categoryId}}
     */
    public Ok delete(String categoryId) {
        return delete(categoryId, null);
    }

    /**
     * Kategori sil
     *
     * {@code DELETE /v1/apps/{appId}/categories/{categoryId}}
     */
    public Ok delete(String categoryId, RequestOptions options) {
        Operation op = new Operation("DELETE", "/v1/apps/{appId}/categories/{categoryId}");
        op.pathParam("categoryId", categoryId);
        return client.execute(op, options, TYPE_3);
    }
}
