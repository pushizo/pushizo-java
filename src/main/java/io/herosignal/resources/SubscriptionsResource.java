// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.
package io.herosignal.resources;

import com.fasterxml.jackson.core.type.TypeReference;
import io.herosignal.RequestOptions;
import io.herosignal.core.ApiExecutor;
import io.herosignal.core.ApiRequest;
import io.herosignal.models.App;
import io.herosignal.models.Ok;
import io.herosignal.models.PatchSubscriptionDto;
import io.herosignal.models.SetOwnerDto;
import io.herosignal.models.Subscription;
import io.herosignal.models.UserIdentity;
/** Abonelik (cihaz/e-posta/SMS) okuma, güncelleme, silme ve sahip atama. */
public final class SubscriptionsResource {
    private final ApiExecutor executor;

    /**
     * Kaynağı oluşturur (istemci tarafından çağrılır).
     *
     * @param executor istekleri gönderen yürütücü
     */
    public SubscriptionsResource(ApiExecutor executor) {
        this.executor = executor;
    }

    /**
     * Aboneliğin sahibi kullanıcının kimlikleri
     *
     * <p>{@code GET /v1/apps/{appId}/subscriptions/{subscriptionId}/user/identity}
     *
     * <p>App kapsamı istemcinin varsayılan app'idir; {@link RequestOptions.Builder#appId(String)} ile değiştirilebilir.
     *
     * @param subscriptionId {subscriptionId} yol parametresi
     * @param options çağrı seçenekleri (null olabilir)
     * @return API yanıtı
     * @throws io.herosignal.HeroSignalException API veya ağ hatasında
     */
    public UserIdentity subscriptionIdentity(String subscriptionId, RequestOptions options) {
        ApiRequest request = new ApiRequest("GET", "/v1/apps/{appId}/subscriptions/{subscriptionId}/user/identity");
        request.appIdInPath();
        request.pathParam("subscriptionId", subscriptionId);
        return executor.execute(request, options, new TypeReference<UserIdentity>() {});
    }

    /**
     * Aboneliğin sahibi kullanıcının kimlikleri
     *
     * <p>{@code GET /v1/apps/{appId}/subscriptions/{subscriptionId}/user/identity}
     *
     * <p>App kapsamı istemcinin varsayılan app'idir; {@link RequestOptions.Builder#appId(String)} ile değiştirilebilir.
     *
     * @param subscriptionId {subscriptionId} yol parametresi
     * @return API yanıtı
     * @throws io.herosignal.HeroSignalException API veya ağ hatasında
     */
    public UserIdentity subscriptionIdentity(String subscriptionId) {
        return subscriptionIdentity(subscriptionId, null);
    }

    /**
     * Aboneliği kanal + token ile güncelle (APNs/FCM token, e-posta, E.164 telefon)
     *
     * <p>{@code PATCH /v1/apps/{appId}/subscriptions/by-token/{channel}/{token}}
     *
     * <p>App kapsamı istemcinin varsayılan app'idir; {@link RequestOptions.Builder#appId(String)} ile değiştirilebilir.
     *
     * @param channel {channel} yol parametresi
     * @param token {token} yol parametresi
     * @param body istek gövdesi
     * @param options çağrı seçenekleri (null olabilir)
     * @return API yanıtı
     * @throws io.herosignal.HeroSignalException API veya ağ hatasında
     */
    public Subscription patchSubscriptionByToken(String channel, String token, PatchSubscriptionDto body, RequestOptions options) {
        ApiRequest request = new ApiRequest("PATCH", "/v1/apps/{appId}/subscriptions/by-token/{channel}/{token}");
        request.appIdInPath();
        request.pathParam("channel", channel);
        request.pathParam("token", token);
        request.body(body);
        return executor.execute(request, options, new TypeReference<Subscription>() {});
    }

    /**
     * Aboneliği kanal + token ile güncelle (APNs/FCM token, e-posta, E.164 telefon)
     *
     * <p>{@code PATCH /v1/apps/{appId}/subscriptions/by-token/{channel}/{token}}
     *
     * <p>App kapsamı istemcinin varsayılan app'idir; {@link RequestOptions.Builder#appId(String)} ile değiştirilebilir.
     *
     * @param channel {channel} yol parametresi
     * @param token {token} yol parametresi
     * @param body istek gövdesi
     * @return API yanıtı
     * @throws io.herosignal.HeroSignalException API veya ağ hatasında
     */
    public Subscription patchSubscriptionByToken(String channel, String token, PatchSubscriptionDto body) {
        return patchSubscriptionByToken(channel, token, body, null);
    }

    /**
     * Abonelik detayı
     *
     * <p>{@code GET /v1/apps/{appId}/subscriptions/{subscriptionId}}
     *
     * <p>App kapsamı istemcinin varsayılan app'idir; {@link RequestOptions.Builder#appId(String)} ile değiştirilebilir.
     *
     * @param subscriptionId {subscriptionId} yol parametresi
     * @param options çağrı seçenekleri (null olabilir)
     * @return API yanıtı
     * @throws io.herosignal.HeroSignalException API veya ağ hatasında
     */
    public Subscription get(String subscriptionId, RequestOptions options) {
        ApiRequest request = new ApiRequest("GET", "/v1/apps/{appId}/subscriptions/{subscriptionId}");
        request.appIdInPath();
        request.pathParam("subscriptionId", subscriptionId);
        return executor.execute(request, options, new TypeReference<Subscription>() {});
    }

    /**
     * Abonelik detayı
     *
     * <p>{@code GET /v1/apps/{appId}/subscriptions/{subscriptionId}}
     *
     * <p>App kapsamı istemcinin varsayılan app'idir; {@link RequestOptions.Builder#appId(String)} ile değiştirilebilir.
     *
     * @param subscriptionId {subscriptionId} yol parametresi
     * @return API yanıtı
     * @throws io.herosignal.HeroSignalException API veya ağ hatasında
     */
    public Subscription get(String subscriptionId) {
        return get(subscriptionId, null);
    }

    /**
     * Abonelik güncelle
     *
     * <p>{@code PATCH /v1/apps/{appId}/subscriptions/{subscriptionId}}
     *
     * <p>App kapsamı istemcinin varsayılan app'idir; {@link RequestOptions.Builder#appId(String)} ile değiştirilebilir.
     *
     * @param subscriptionId {subscriptionId} yol parametresi
     * @param body istek gövdesi
     * @param options çağrı seçenekleri (null olabilir)
     * @return API yanıtı
     * @throws io.herosignal.HeroSignalException API veya ağ hatasında
     */
    public Subscription update(String subscriptionId, PatchSubscriptionDto body, RequestOptions options) {
        ApiRequest request = new ApiRequest("PATCH", "/v1/apps/{appId}/subscriptions/{subscriptionId}");
        request.appIdInPath();
        request.pathParam("subscriptionId", subscriptionId);
        request.body(body);
        return executor.execute(request, options, new TypeReference<Subscription>() {});
    }

    /**
     * Abonelik güncelle
     *
     * <p>{@code PATCH /v1/apps/{appId}/subscriptions/{subscriptionId}}
     *
     * <p>App kapsamı istemcinin varsayılan app'idir; {@link RequestOptions.Builder#appId(String)} ile değiştirilebilir.
     *
     * @param subscriptionId {subscriptionId} yol parametresi
     * @param body istek gövdesi
     * @return API yanıtı
     * @throws io.herosignal.HeroSignalException API veya ağ hatasında
     */
    public Subscription update(String subscriptionId, PatchSubscriptionDto body) {
        return update(subscriptionId, body, null);
    }

    /**
     * Aboneliği sil
     *
     * <p>{@code DELETE /v1/apps/{appId}/subscriptions/{subscriptionId}}
     *
     * <p>App kapsamı istemcinin varsayılan app'idir; {@link RequestOptions.Builder#appId(String)} ile değiştirilebilir.
     *
     * @param subscriptionId {subscriptionId} yol parametresi
     * @param options çağrı seçenekleri (null olabilir)
     * @return API yanıtı
     * @throws io.herosignal.HeroSignalException API veya ağ hatasında
     */
    public Ok delete(String subscriptionId, RequestOptions options) {
        ApiRequest request = new ApiRequest("DELETE", "/v1/apps/{appId}/subscriptions/{subscriptionId}");
        request.appIdInPath();
        request.pathParam("subscriptionId", subscriptionId);
        return executor.execute(request, options, new TypeReference<Ok>() {});
    }

    /**
     * Aboneliği sil
     *
     * <p>{@code DELETE /v1/apps/{appId}/subscriptions/{subscriptionId}}
     *
     * <p>App kapsamı istemcinin varsayılan app'idir; {@link RequestOptions.Builder#appId(String)} ile değiştirilebilir.
     *
     * @param subscriptionId {subscriptionId} yol parametresi
     * @return API yanıtı
     * @throws io.herosignal.HeroSignalException API veya ağ hatasında
     */
    public Ok delete(String subscriptionId) {
        return delete(subscriptionId, null);
    }

    /**
     * Aboneliği external_id ile kullanıcıya bağla
     *
     * <p>{@code POST /v1/apps/{appId}/subscriptions/{subscriptionId}/owner}
     *
     * <p>App kapsamı istemcinin varsayılan app'idir; {@link RequestOptions.Builder#appId(String)} ile değiştirilebilir.
     *
     * @param subscriptionId {subscriptionId} yol parametresi
     * @param body istek gövdesi
     * @param options çağrı seçenekleri (null olabilir)
     * @return API yanıtı
     * @throws io.herosignal.HeroSignalException API veya ağ hatasında
     */
    public Subscription setOwner(String subscriptionId, SetOwnerDto body, RequestOptions options) {
        ApiRequest request = new ApiRequest("POST", "/v1/apps/{appId}/subscriptions/{subscriptionId}/owner");
        request.appIdInPath();
        request.pathParam("subscriptionId", subscriptionId);
        request.body(body);
        return executor.execute(request, options, new TypeReference<Subscription>() {});
    }

    /**
     * Aboneliği external_id ile kullanıcıya bağla
     *
     * <p>{@code POST /v1/apps/{appId}/subscriptions/{subscriptionId}/owner}
     *
     * <p>App kapsamı istemcinin varsayılan app'idir; {@link RequestOptions.Builder#appId(String)} ile değiştirilebilir.
     *
     * @param subscriptionId {subscriptionId} yol parametresi
     * @param body istek gövdesi
     * @return API yanıtı
     * @throws io.herosignal.HeroSignalException API veya ağ hatasında
     */
    public Subscription setOwner(String subscriptionId, SetOwnerDto body) {
        return setOwner(subscriptionId, body, null);
    }
}
