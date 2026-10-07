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
 * Kullanıcı oluşturma/güncelleme (tag, özellik), arama ve abonelik ekleme.
 */
public final class UsersResource {
    private final HeroSignal client;

    public UsersResource(HeroSignal client) {
        this.client = client;
    }

    private static final TypeReference<UserList> TYPE_0 = new TypeReference<UserList>() {};

    /**
     * Kullanıcı listesi
     *
     * {@code GET /v1/apps/{appId}/users}
     */
    public UserList list() {
        return list(null, null);
    }

    /**
     * Kullanıcı listesi
     *
     * {@code GET /v1/apps/{appId}/users}
     */
    public UserList list(UsersListParams params) {
        return list(params, null);
    }

    /**
     * Kullanıcı listesi
     *
     * {@code GET /v1/apps/{appId}/users}
     *
     * Parametreler: sort — Değerler: "last_active_at", "-last_active_at".
     */
    public UserList list(UsersListParams params, RequestOptions options) {
        Operation op = new Operation("GET", "/v1/apps/{appId}/users");
        if (params != null) {
            params.applyTo(op);
        }
        return client.execute(op, options, TYPE_0);
    }

    /**
     * list sonuçlarını next_cursor ile tüm sayfalar boyunca tek tek dolaşır (sayfalar tembel yüklenir).
     */
    public PageIterable<User> listAll() {
        return listAll(null, null);
    }

    /**
     * list sonuçlarını next_cursor ile tüm sayfalar boyunca tek tek dolaşır (sayfalar tembel yüklenir).
     */
    public PageIterable<User> listAll(UsersListParams params) {
        return listAll(params, null);
    }

    /**
     * list sonuçlarını next_cursor ile tüm sayfalar boyunca tek tek dolaşır (sayfalar tembel yüklenir).
     */
    public PageIterable<User> listAll(UsersListParams params, RequestOptions options) {
        UsersListParams base = params == null ? new UsersListParams() : params.copy();
        return new PageIterable<>(cursor -> {
            UsersListParams p = base.copy();
            if (cursor != null) {
                p.cursor(cursor);
            }
            UserList page = list(p, options);
            return new PageIterable.Page<>(page.getData(), page.getNextCursor(), Boolean.TRUE.equals(page.getHasMore()));
        });
    }

    private static final TypeReference<UserDetail> TYPE_1 = new TypeReference<UserDetail>() {};

    /**
     * Kullanıcı oluştur/güncelle (external_id ile, isteğe bağlı aboneliklerle)
     *
     * {@code POST /v1/apps/{appId}/users}
     *
     * Idempotency-Key başlığı: RequestOptions.idempotencyKey, gövdedeki idempotency_key veya otomatik UUID.
     */
    public UserDetail upsert(UpsertUserDto body) {
        return upsert(body, null);
    }

    /**
     * Kullanıcı oluştur/güncelle (external_id ile, isteğe bağlı aboneliklerle)
     *
     * {@code POST /v1/apps/{appId}/users}
     *
     * Idempotency-Key başlığı: RequestOptions.idempotencyKey, gövdedeki idempotency_key veya otomatik UUID.
     */
    public UserDetail upsert(UpsertUserDto body, RequestOptions options) {
        Operation op = new Operation("POST", "/v1/apps/{appId}/users");
        if (body == null) {
            throw new IllegalArgumentException("HeroSignal: istek gövdesi null olamaz.");
        }
        op.body(body);
        op.idempotent(true);
        return client.execute(op, options, TYPE_1);
    }

    private static final TypeReference<UserList> TYPE_2 = new TypeReference<UserList>() {};

    /**
     * Segment tanımı ile kullanıcı arama
     *
     * {@code POST /v1/apps/{appId}/users/search}
     */
    public UserList search(UsersSearchBody body) {
        return search(body, null);
    }

    /**
     * Segment tanımı ile kullanıcı arama
     *
     * {@code POST /v1/apps/{appId}/users/search}
     */
    public UserList search(UsersSearchBody body, RequestOptions options) {
        Operation op = new Operation("POST", "/v1/apps/{appId}/users/search");
        if (body == null) {
            throw new IllegalArgumentException("HeroSignal: istek gövdesi null olamaz.");
        }
        op.body(body);
        return client.execute(op, options, TYPE_2);
    }

    private static final TypeReference<UserDetail> TYPE_3 = new TypeReference<UserDetail>() {};

    /**
     * Alias ile kullanıcı (hs_id, external_id veya özel etiket)
     *
     * {@code GET /v1/apps/{appId}/users/by/{label}/{value}}
     */
    public UserDetail getByAlias(String label, String value) {
        return getByAlias(label, value, null);
    }

    /**
     * Alias ile kullanıcı (hs_id, external_id veya özel etiket)
     *
     * {@code GET /v1/apps/{appId}/users/by/{label}/{value}}
     */
    public UserDetail getByAlias(String label, String value, RequestOptions options) {
        Operation op = new Operation("GET", "/v1/apps/{appId}/users/by/{label}/{value}");
        op.pathParam("label", label);
        op.pathParam("value", value);
        return client.execute(op, options, TYPE_3);
    }

    private static final TypeReference<UserDetail> TYPE_4 = new TypeReference<UserDetail>() {};

    /**
     * Tag/property merge-patch ve deltas
     *
     * {@code PATCH /v1/apps/{appId}/users/by/{label}/{value}}
     */
    public UserDetail update(String label, String value, PatchUserDto body) {
        return update(label, value, body, null);
    }

    /**
     * Tag/property merge-patch ve deltas
     *
     * {@code PATCH /v1/apps/{appId}/users/by/{label}/{value}}
     */
    public UserDetail update(String label, String value, PatchUserDto body, RequestOptions options) {
        Operation op = new Operation("PATCH", "/v1/apps/{appId}/users/by/{label}/{value}");
        op.pathParam("label", label);
        op.pathParam("value", value);
        if (body == null) {
            throw new IllegalArgumentException("HeroSignal: istek gövdesi null olamaz.");
        }
        op.body(body);
        return client.execute(op, options, TYPE_4);
    }

    private static final TypeReference<Ok> TYPE_5 = new TypeReference<Ok>() {};

    /**
     * Kullanıcıyı sil (abonelikler silinir, olaylar anonimleşir)
     *
     * {@code DELETE /v1/apps/{appId}/users/by/{label}/{value}}
     */
    public Ok delete(String label, String value) {
        return delete(label, value, null);
    }

    /**
     * Kullanıcıyı sil (abonelikler silinir, olaylar anonimleşir)
     *
     * {@code DELETE /v1/apps/{appId}/users/by/{label}/{value}}
     */
    public Ok delete(String label, String value, RequestOptions options) {
        Operation op = new Operation("DELETE", "/v1/apps/{appId}/users/by/{label}/{value}");
        op.pathParam("label", label);
        op.pathParam("value", value);
        return client.execute(op, options, TYPE_5);
    }

    private static final TypeReference<UserIdentity> TYPE_6 = new TypeReference<UserIdentity>() {};

    /**
     * Kullanıcının tüm kimlikleri (hs_id, external_id, özel alias'lar)
     *
     * {@code GET /v1/apps/{appId}/users/by/{label}/{value}/identity}
     */
    public UserIdentity getIdentity(String label, String value) {
        return getIdentity(label, value, null);
    }

    /**
     * Kullanıcının tüm kimlikleri (hs_id, external_id, özel alias'lar)
     *
     * {@code GET /v1/apps/{appId}/users/by/{label}/{value}/identity}
     */
    public UserIdentity getIdentity(String label, String value, RequestOptions options) {
        Operation op = new Operation("GET", "/v1/apps/{appId}/users/by/{label}/{value}/identity");
        op.pathParam("label", label);
        op.pathParam("value", value);
        return client.execute(op, options, TYPE_6);
    }

    private static final TypeReference<UserExport> TYPE_7 = new TypeReference<UserExport>() {};

    /**
     * Kullanıcı verisini dışa aktar (KVKK/GDPR taşınabilirlik): profil, alias, abonelik, son olaylar
     *
     * {@code GET /v1/apps/{appId}/users/by/{label}/{value}/export}
     */
    public UserExport export(String label, String value) {
        return export(label, value, null);
    }

    /**
     * Kullanıcı verisini dışa aktar (KVKK/GDPR taşınabilirlik): profil, alias, abonelik, son olaylar
     *
     * {@code GET /v1/apps/{appId}/users/by/{label}/{value}/export}
     */
    public UserExport export(String label, String value, RequestOptions options) {
        Operation op = new Operation("GET", "/v1/apps/{appId}/users/by/{label}/{value}/export");
        op.pathParam("label", label);
        op.pathParam("value", value);
        return client.execute(op, options, TYPE_7);
    }

    private static final TypeReference<Subscription> TYPE_8 = new TypeReference<Subscription>() {};

    /**
     * Kullanıcıya abonelik ekle
     *
     * {@code POST /v1/apps/{appId}/users/by/{label}/{value}/subscriptions}
     */
    public Subscription addSubscription(String label, String value, AddSubscriptionDto body) {
        return addSubscription(label, value, body, null);
    }

    /**
     * Kullanıcıya abonelik ekle
     *
     * {@code POST /v1/apps/{appId}/users/by/{label}/{value}/subscriptions}
     */
    public Subscription addSubscription(String label, String value, AddSubscriptionDto body, RequestOptions options) {
        Operation op = new Operation("POST", "/v1/apps/{appId}/users/by/{label}/{value}/subscriptions");
        op.pathParam("label", label);
        op.pathParam("value", value);
        if (body == null) {
            throw new IllegalArgumentException("HeroSignal: istek gövdesi null olamaz.");
        }
        op.body(body);
        return client.execute(op, options, TYPE_8);
    }
}
