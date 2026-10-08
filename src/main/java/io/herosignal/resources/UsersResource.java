// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.
package io.herosignal.resources;

import com.fasterxml.jackson.core.type.TypeReference;
import io.herosignal.AutoPagingIterable;
import io.herosignal.RequestOptions;
import io.herosignal.core.ApiExecutor;
import io.herosignal.core.ApiRequest;
import io.herosignal.models.AddSubscriptionDto;
import io.herosignal.models.App;
import io.herosignal.models.InboxItem;
import io.herosignal.models.InboxPage;
import io.herosignal.models.Ok;
import io.herosignal.models.PatchUserDto;
import io.herosignal.models.Segment;
import io.herosignal.models.Subscription;
import io.herosignal.models.UpsertUserDto;
import io.herosignal.models.User;
import io.herosignal.models.UserDetail;
import io.herosignal.models.UserExport;
import io.herosignal.models.UserIdentity;
import io.herosignal.models.UserList;
import io.herosignal.models.UsersSearchBody;
/** Kullanıcı oluşturma/güncelleme (tag, özellik), arama ve abonelik ekleme. */
public final class UsersResource {
    private final ApiExecutor executor;

    /**
     * Kaynağı oluşturur (istemci tarafından çağrılır).
     *
     * @param executor istekleri gönderen yürütücü
     */
    public UsersResource(ApiExecutor executor) {
        this.executor = executor;
    }

    /**
     * Kullanıcı listesi
     *
     * <p>{@code GET /v1/apps/{appId}/users}
     *
     * <p>App kapsamı istemcinin varsayılan app'idir; {@link RequestOptions.Builder#appId(String)} ile değiştirilebilir.
     *
     * @param params isteğe bağlı sorgu parametreleri (null olabilir)
     * @param options çağrı seçenekleri (null olabilir)
     * @return API yanıtı
     * @throws io.herosignal.HeroSignalException API veya ağ hatasında
     */
    public UserList list(UsersListParams params, RequestOptions options) {
        ApiRequest request = new ApiRequest("GET", "/v1/apps/{appId}/users");
        request.appIdInPath();
        if (params != null) {
            request.query("limit", params.getLimit());
            request.query("cursor", params.getCursor());
            request.query("sort", params.getSort());
            request.query("q", params.getQ());
            request.query("tag", params.getTag());
            request.query("last_active_after", params.getLastActiveAfter());
            request.query("last_active_before", params.getLastActiveBefore());
        }
        return executor.execute(request, options, new TypeReference<UserList>() {});
    }

    /**
     * Kullanıcı listesi
     *
     * <p>{@code GET /v1/apps/{appId}/users}
     *
     * <p>App kapsamı istemcinin varsayılan app'idir; {@link RequestOptions.Builder#appId(String)} ile değiştirilebilir.
     *
     * @param params isteğe bağlı sorgu parametreleri (null olabilir)
     * @return API yanıtı
     * @throws io.herosignal.HeroSignalException API veya ağ hatasında
     */
    public UserList list(UsersListParams params) {
        return list(params, null);
    }

    /**
     * Kullanıcı listesi
     *
     * <p>{@code GET /v1/apps/{appId}/users}
     *
     * <p>App kapsamı istemcinin varsayılan app'idir; {@link RequestOptions.Builder#appId(String)} ile değiştirilebilir.
     *
     * @return API yanıtı
     * @throws io.herosignal.HeroSignalException API veya ağ hatasında
     */
    public UserList list() {
        return list(null, null);
    }

    /**
     * {@link #list} sonuçlarını {@code next_cursor} ile tüm sayfalar boyunca tek tek dolaşır; sayfalar
     * ihtiyaç oldukça istenir.
     *
     * @param params isteğe bağlı sorgu parametreleri (null olabilir)
     * @param options çağrı seçenekleri (null olabilir)
     * @return öğeler üzerinde tembel (lazy) yinelenebilir
     */
    public Iterable<User> listAutoPaging(UsersListParams params, RequestOptions options) {
        final UsersListParams base = params == null ? new UsersListParams() : params.copy();
        return new AutoPagingIterable<>(base.getCursor(), cursor -> {
            UserList page = list(base.copy().setCursor(cursor), options);
            return new AutoPagingIterable.Page<>(page.getData(), page.getNextCursor(), Boolean.TRUE.equals(page.getHasMore()));
        });
    }

    /**
     * {@link #list} sonuçlarını {@code next_cursor} ile tüm sayfalar boyunca tek tek dolaşır; sayfalar
     * ihtiyaç oldukça istenir.
     *
     * @param params isteğe bağlı sorgu parametreleri (null olabilir)
     * @return öğeler üzerinde tembel (lazy) yinelenebilir
     */
    public Iterable<User> listAutoPaging(UsersListParams params) {
        return listAutoPaging(params, null);
    }

    /**
     * Kullanıcı oluştur/güncelle (external_id ile, isteğe bağlı aboneliklerle)
     *
     * <p>{@code POST /v1/apps/{appId}/users}
     *
     * <p>App kapsamı istemcinin varsayılan app'idir; {@link RequestOptions.Builder#appId(String)} ile değiştirilebilir.
     *
     * @param body istek gövdesi
     * @param options çağrı seçenekleri (null olabilir)
     * @return API yanıtı
     * @throws io.herosignal.HeroSignalException API veya ağ hatasında
     */
    public UserDetail upsert(UpsertUserDto body, RequestOptions options) {
        ApiRequest request = new ApiRequest("POST", "/v1/apps/{appId}/users");
        request.appIdInPath();
        request.idempotent();
        request.body(body);
        return executor.execute(request, options, new TypeReference<UserDetail>() {});
    }

    /**
     * Kullanıcı oluştur/güncelle (external_id ile, isteğe bağlı aboneliklerle)
     *
     * <p>{@code POST /v1/apps/{appId}/users}
     *
     * <p>App kapsamı istemcinin varsayılan app'idir; {@link RequestOptions.Builder#appId(String)} ile değiştirilebilir.
     *
     * @param body istek gövdesi
     * @return API yanıtı
     * @throws io.herosignal.HeroSignalException API veya ağ hatasında
     */
    public UserDetail upsert(UpsertUserDto body) {
        return upsert(body, null);
    }

    /**
     * Segment tanımı ile kullanıcı arama
     *
     * <p>{@code POST /v1/apps/{appId}/users/search}
     *
     * <p>App kapsamı istemcinin varsayılan app'idir; {@link RequestOptions.Builder#appId(String)} ile değiştirilebilir.
     *
     * @param body istek gövdesi
     * @param options çağrı seçenekleri (null olabilir)
     * @return API yanıtı
     * @throws io.herosignal.HeroSignalException API veya ağ hatasında
     */
    public UserList search(UsersSearchBody body, RequestOptions options) {
        ApiRequest request = new ApiRequest("POST", "/v1/apps/{appId}/users/search");
        request.appIdInPath();
        request.body(body);
        return executor.execute(request, options, new TypeReference<UserList>() {});
    }

    /**
     * Segment tanımı ile kullanıcı arama
     *
     * <p>{@code POST /v1/apps/{appId}/users/search}
     *
     * <p>App kapsamı istemcinin varsayılan app'idir; {@link RequestOptions.Builder#appId(String)} ile değiştirilebilir.
     *
     * @param body istek gövdesi
     * @return API yanıtı
     * @throws io.herosignal.HeroSignalException API veya ağ hatasında
     */
    public UserList search(UsersSearchBody body) {
        return search(body, null);
    }

    /**
     * Alias ile kullanıcı (hs_id, external_id veya özel etiket)
     *
     * <p>{@code GET /v1/apps/{appId}/users/by/{label}/{value}}
     *
     * <p>App kapsamı istemcinin varsayılan app'idir; {@link RequestOptions.Builder#appId(String)} ile değiştirilebilir.
     *
     * @param label {label} yol parametresi
     * @param value {value} yol parametresi
     * @param options çağrı seçenekleri (null olabilir)
     * @return API yanıtı
     * @throws io.herosignal.HeroSignalException API veya ağ hatasında
     */
    public UserDetail getByAlias(String label, String value, RequestOptions options) {
        ApiRequest request = new ApiRequest("GET", "/v1/apps/{appId}/users/by/{label}/{value}");
        request.appIdInPath();
        request.pathParam("label", label);
        request.pathParam("value", value);
        return executor.execute(request, options, new TypeReference<UserDetail>() {});
    }

    /**
     * Alias ile kullanıcı (hs_id, external_id veya özel etiket)
     *
     * <p>{@code GET /v1/apps/{appId}/users/by/{label}/{value}}
     *
     * <p>App kapsamı istemcinin varsayılan app'idir; {@link RequestOptions.Builder#appId(String)} ile değiştirilebilir.
     *
     * @param label {label} yol parametresi
     * @param value {value} yol parametresi
     * @return API yanıtı
     * @throws io.herosignal.HeroSignalException API veya ağ hatasında
     */
    public UserDetail getByAlias(String label, String value) {
        return getByAlias(label, value, null);
    }

    /**
     * Tag/property merge-patch ve deltas
     *
     * <p>{@code PATCH /v1/apps/{appId}/users/by/{label}/{value}}
     *
     * <p>App kapsamı istemcinin varsayılan app'idir; {@link RequestOptions.Builder#appId(String)} ile değiştirilebilir.
     *
     * @param label {label} yol parametresi
     * @param value {value} yol parametresi
     * @param body istek gövdesi
     * @param options çağrı seçenekleri (null olabilir)
     * @return API yanıtı
     * @throws io.herosignal.HeroSignalException API veya ağ hatasında
     */
    public UserDetail update(String label, String value, PatchUserDto body, RequestOptions options) {
        ApiRequest request = new ApiRequest("PATCH", "/v1/apps/{appId}/users/by/{label}/{value}");
        request.appIdInPath();
        request.pathParam("label", label);
        request.pathParam("value", value);
        request.body(body);
        return executor.execute(request, options, new TypeReference<UserDetail>() {});
    }

    /**
     * Tag/property merge-patch ve deltas
     *
     * <p>{@code PATCH /v1/apps/{appId}/users/by/{label}/{value}}
     *
     * <p>App kapsamı istemcinin varsayılan app'idir; {@link RequestOptions.Builder#appId(String)} ile değiştirilebilir.
     *
     * @param label {label} yol parametresi
     * @param value {value} yol parametresi
     * @param body istek gövdesi
     * @return API yanıtı
     * @throws io.herosignal.HeroSignalException API veya ağ hatasında
     */
    public UserDetail update(String label, String value, PatchUserDto body) {
        return update(label, value, body, null);
    }

    /**
     * Kullanıcıyı sil (abonelikler silinir, olaylar anonimleşir)
     *
     * <p>{@code DELETE /v1/apps/{appId}/users/by/{label}/{value}}
     *
     * <p>App kapsamı istemcinin varsayılan app'idir; {@link RequestOptions.Builder#appId(String)} ile değiştirilebilir.
     *
     * @param label {label} yol parametresi
     * @param value {value} yol parametresi
     * @param options çağrı seçenekleri (null olabilir)
     * @return API yanıtı
     * @throws io.herosignal.HeroSignalException API veya ağ hatasında
     */
    public Ok delete(String label, String value, RequestOptions options) {
        ApiRequest request = new ApiRequest("DELETE", "/v1/apps/{appId}/users/by/{label}/{value}");
        request.appIdInPath();
        request.pathParam("label", label);
        request.pathParam("value", value);
        return executor.execute(request, options, new TypeReference<Ok>() {});
    }

    /**
     * Kullanıcıyı sil (abonelikler silinir, olaylar anonimleşir)
     *
     * <p>{@code DELETE /v1/apps/{appId}/users/by/{label}/{value}}
     *
     * <p>App kapsamı istemcinin varsayılan app'idir; {@link RequestOptions.Builder#appId(String)} ile değiştirilebilir.
     *
     * @param label {label} yol parametresi
     * @param value {value} yol parametresi
     * @return API yanıtı
     * @throws io.herosignal.HeroSignalException API veya ağ hatasında
     */
    public Ok delete(String label, String value) {
        return delete(label, value, null);
    }

    /**
     * Kullanıcının tüm kimlikleri (hs_id, external_id, alias'lar)
     *
     * <p>{@code GET /v1/apps/{appId}/users/by/{label}/{value}/identity}
     *
     * <p>App kapsamı istemcinin varsayılan app'idir; {@link RequestOptions.Builder#appId(String)} ile değiştirilebilir.
     *
     * @param label {label} yol parametresi
     * @param value {value} yol parametresi
     * @param options çağrı seçenekleri (null olabilir)
     * @return API yanıtı
     * @throws io.herosignal.HeroSignalException API veya ağ hatasında
     */
    public UserIdentity getIdentity(String label, String value, RequestOptions options) {
        ApiRequest request = new ApiRequest("GET", "/v1/apps/{appId}/users/by/{label}/{value}/identity");
        request.appIdInPath();
        request.pathParam("label", label);
        request.pathParam("value", value);
        return executor.execute(request, options, new TypeReference<UserIdentity>() {});
    }

    /**
     * Kullanıcının tüm kimlikleri (hs_id, external_id, alias'lar)
     *
     * <p>{@code GET /v1/apps/{appId}/users/by/{label}/{value}/identity}
     *
     * <p>App kapsamı istemcinin varsayılan app'idir; {@link RequestOptions.Builder#appId(String)} ile değiştirilebilir.
     *
     * @param label {label} yol parametresi
     * @param value {value} yol parametresi
     * @return API yanıtı
     * @throws io.herosignal.HeroSignalException API veya ağ hatasında
     */
    public UserIdentity getIdentity(String label, String value) {
        return getIdentity(label, value, null);
    }

    /**
     * Kullanıcıya abonelik ekle
     *
     * <p>{@code POST /v1/apps/{appId}/users/by/{label}/{value}/subscriptions}
     *
     * <p>App kapsamı istemcinin varsayılan app'idir; {@link RequestOptions.Builder#appId(String)} ile değiştirilebilir.
     *
     * @param label {label} yol parametresi
     * @param value {value} yol parametresi
     * @param body istek gövdesi
     * @param options çağrı seçenekleri (null olabilir)
     * @return API yanıtı
     * @throws io.herosignal.HeroSignalException API veya ağ hatasında
     */
    public Subscription addSubscription(String label, String value, AddSubscriptionDto body, RequestOptions options) {
        ApiRequest request = new ApiRequest("POST", "/v1/apps/{appId}/users/by/{label}/{value}/subscriptions");
        request.appIdInPath();
        request.pathParam("label", label);
        request.pathParam("value", value);
        request.body(body);
        return executor.execute(request, options, new TypeReference<Subscription>() {});
    }

    /**
     * Kullanıcıya abonelik ekle
     *
     * <p>{@code POST /v1/apps/{appId}/users/by/{label}/{value}/subscriptions}
     *
     * <p>App kapsamı istemcinin varsayılan app'idir; {@link RequestOptions.Builder#appId(String)} ile değiştirilebilir.
     *
     * @param label {label} yol parametresi
     * @param value {value} yol parametresi
     * @param body istek gövdesi
     * @return API yanıtı
     * @throws io.herosignal.HeroSignalException API veya ağ hatasında
     */
    public Subscription addSubscription(String label, String value, AddSubscriptionDto body) {
        return addSubscription(label, value, body, null);
    }

    /**
     * Kullanıcı verisini dışa aktar (KVKK/GDPR veri taşınabilirliği): profil, alias, abonelik, son olaylar
     *
     * <p>{@code GET /v1/apps/{appId}/users/by/{label}/{value}/export}
     *
     * <p>App kapsamı istemcinin varsayılan app'idir; {@link RequestOptions.Builder#appId(String)} ile değiştirilebilir.
     *
     * @param label {label} yol parametresi
     * @param value {value} yol parametresi
     * @param options çağrı seçenekleri (null olabilir)
     * @return API yanıtı
     * @throws io.herosignal.HeroSignalException API veya ağ hatasında
     */
    public UserExport exportUser(String label, String value, RequestOptions options) {
        ApiRequest request = new ApiRequest("GET", "/v1/apps/{appId}/users/by/{label}/{value}/export");
        request.appIdInPath();
        request.pathParam("label", label);
        request.pathParam("value", value);
        return executor.execute(request, options, new TypeReference<UserExport>() {});
    }

    /**
     * Kullanıcı verisini dışa aktar (KVKK/GDPR veri taşınabilirliği): profil, alias, abonelik, son olaylar
     *
     * <p>{@code GET /v1/apps/{appId}/users/by/{label}/{value}/export}
     *
     * <p>App kapsamı istemcinin varsayılan app'idir; {@link RequestOptions.Builder#appId(String)} ile değiştirilebilir.
     *
     * @param label {label} yol parametresi
     * @param value {value} yol parametresi
     * @return API yanıtı
     * @throws io.herosignal.HeroSignalException API veya ağ hatasında
     */
    public UserExport exportUser(String label, String value) {
        return exportUser(label, value, null);
    }

    /**
     * Kullanıcının bildirim kutusu
     *
     * <p>{@code GET /v1/apps/{appId}/users/by/{label}/{value}/inbox}
     *
     * <p>App kapsamı istemcinin varsayılan app'idir; {@link RequestOptions.Builder#appId(String)} ile değiştirilebilir.
     *
     * @param label {label} yol parametresi
     * @param value {value} yol parametresi
     * @param params isteğe bağlı sorgu parametreleri (null olabilir)
     * @param options çağrı seçenekleri (null olabilir)
     * @return API yanıtı
     * @throws io.herosignal.HeroSignalException API veya ağ hatasında
     */
    public InboxPage listInbox(String label, String value, UsersListInboxParams params, RequestOptions options) {
        ApiRequest request = new ApiRequest("GET", "/v1/apps/{appId}/users/by/{label}/{value}/inbox");
        request.appIdInPath();
        request.pathParam("label", label);
        request.pathParam("value", value);
        if (params != null) {
            request.query("limit", params.getLimit());
            request.query("cursor", params.getCursor());
            request.query("include_archived", params.getIncludeArchived());
        }
        return executor.execute(request, options, new TypeReference<InboxPage>() {});
    }

    /**
     * Kullanıcının bildirim kutusu
     *
     * <p>{@code GET /v1/apps/{appId}/users/by/{label}/{value}/inbox}
     *
     * <p>App kapsamı istemcinin varsayılan app'idir; {@link RequestOptions.Builder#appId(String)} ile değiştirilebilir.
     *
     * @param label {label} yol parametresi
     * @param value {value} yol parametresi
     * @param params isteğe bağlı sorgu parametreleri (null olabilir)
     * @return API yanıtı
     * @throws io.herosignal.HeroSignalException API veya ağ hatasında
     */
    public InboxPage listInbox(String label, String value, UsersListInboxParams params) {
        return listInbox(label, value, params, null);
    }

    /**
     * Kullanıcının bildirim kutusu
     *
     * <p>{@code GET /v1/apps/{appId}/users/by/{label}/{value}/inbox}
     *
     * <p>App kapsamı istemcinin varsayılan app'idir; {@link RequestOptions.Builder#appId(String)} ile değiştirilebilir.
     *
     * @param label {label} yol parametresi
     * @param value {value} yol parametresi
     * @return API yanıtı
     * @throws io.herosignal.HeroSignalException API veya ağ hatasında
     */
    public InboxPage listInbox(String label, String value) {
        return listInbox(label, value, null, null);
    }

    /**
     * {@link #listInbox} sonuçlarını {@code next_cursor} ile tüm sayfalar boyunca tek tek dolaşır; sayfalar
     * ihtiyaç oldukça istenir.
     *
     * @param label {label} yol parametresi
     * @param value {value} yol parametresi
     * @param params isteğe bağlı sorgu parametreleri (null olabilir)
     * @param options çağrı seçenekleri (null olabilir)
     * @return öğeler üzerinde tembel (lazy) yinelenebilir
     */
    public Iterable<InboxItem> listInboxAutoPaging(String label, String value, UsersListInboxParams params, RequestOptions options) {
        final UsersListInboxParams base = params == null ? new UsersListInboxParams() : params.copy();
        return new AutoPagingIterable<>(base.getCursor(), cursor -> {
            InboxPage page = listInbox(label, value, base.copy().setCursor(cursor), options);
            return new AutoPagingIterable.Page<>(page.getData(), page.getNextCursor(), Boolean.TRUE.equals(page.getHasMore()));
        });
    }

    /**
     * {@link #listInbox} sonuçlarını {@code next_cursor} ile tüm sayfalar boyunca tek tek dolaşır; sayfalar
     * ihtiyaç oldukça istenir.
     *
     * @param label {label} yol parametresi
     * @param value {value} yol parametresi
     * @param params isteğe bağlı sorgu parametreleri (null olabilir)
     * @return öğeler üzerinde tembel (lazy) yinelenebilir
     */
    public Iterable<InboxItem> listInboxAutoPaging(String label, String value, UsersListInboxParams params) {
        return listInboxAutoPaging(label, value, params, null);
    }

    /**
     * Bildirim kutusu öğesini okundu işaretle
     *
     * <p>{@code POST /v1/apps/{appId}/users/by/{label}/{value}/inbox/{itemId}/read}
     *
     * <p>App kapsamı istemcinin varsayılan app'idir; {@link RequestOptions.Builder#appId(String)} ile değiştirilebilir.
     *
     * @param label {label} yol parametresi
     * @param value {value} yol parametresi
     * @param itemId {itemId} yol parametresi
     * @param options çağrı seçenekleri (null olabilir)
     * @return API yanıtı
     * @throws io.herosignal.HeroSignalException API veya ağ hatasında
     */
    public InboxItem readInboxItem(String label, String value, String itemId, RequestOptions options) {
        ApiRequest request = new ApiRequest("POST", "/v1/apps/{appId}/users/by/{label}/{value}/inbox/{itemId}/read");
        request.appIdInPath();
        request.pathParam("label", label);
        request.pathParam("value", value);
        request.pathParam("itemId", itemId);
        return executor.execute(request, options, new TypeReference<InboxItem>() {});
    }

    /**
     * Bildirim kutusu öğesini okundu işaretle
     *
     * <p>{@code POST /v1/apps/{appId}/users/by/{label}/{value}/inbox/{itemId}/read}
     *
     * <p>App kapsamı istemcinin varsayılan app'idir; {@link RequestOptions.Builder#appId(String)} ile değiştirilebilir.
     *
     * @param label {label} yol parametresi
     * @param value {value} yol parametresi
     * @param itemId {itemId} yol parametresi
     * @return API yanıtı
     * @throws io.herosignal.HeroSignalException API veya ağ hatasında
     */
    public InboxItem readInboxItem(String label, String value, String itemId) {
        return readInboxItem(label, value, itemId, null);
    }

    /**
     * Bildirim kutusu öğesini kaldır (arşivle)
     *
     * <p>{@code DELETE /v1/apps/{appId}/users/by/{label}/{value}/inbox/{itemId}}
     *
     * <p>App kapsamı istemcinin varsayılan app'idir; {@link RequestOptions.Builder#appId(String)} ile değiştirilebilir.
     *
     * @param label {label} yol parametresi
     * @param value {value} yol parametresi
     * @param itemId {itemId} yol parametresi
     * @param options çağrı seçenekleri (null olabilir)
     * @return API yanıtı
     * @throws io.herosignal.HeroSignalException API veya ağ hatasında
     */
    public Ok archiveInboxItem(String label, String value, String itemId, RequestOptions options) {
        ApiRequest request = new ApiRequest("DELETE", "/v1/apps/{appId}/users/by/{label}/{value}/inbox/{itemId}");
        request.appIdInPath();
        request.pathParam("label", label);
        request.pathParam("value", value);
        request.pathParam("itemId", itemId);
        return executor.execute(request, options, new TypeReference<Ok>() {});
    }

    /**
     * Bildirim kutusu öğesini kaldır (arşivle)
     *
     * <p>{@code DELETE /v1/apps/{appId}/users/by/{label}/{value}/inbox/{itemId}}
     *
     * <p>App kapsamı istemcinin varsayılan app'idir; {@link RequestOptions.Builder#appId(String)} ile değiştirilebilir.
     *
     * @param label {label} yol parametresi
     * @param value {value} yol parametresi
     * @param itemId {itemId} yol parametresi
     * @return API yanıtı
     * @throws io.herosignal.HeroSignalException API veya ağ hatasında
     */
    public Ok archiveInboxItem(String label, String value, String itemId) {
        return archiveInboxItem(label, value, itemId, null);
    }
}
