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
 * Abonelik (cihaz/e-posta/SMS) okuma, güncelleme, silme ve sahip atama.
 */
public final class SubscriptionsResource {
    private final HeroSignal client;

    public SubscriptionsResource(HeroSignal client) {
        this.client = client;
    }

    private static final TypeReference<Subscription> TYPE_0 = new TypeReference<Subscription>() {};

    /**
     * Abonelik detayı
     *
     * {@code GET /v1/apps/{appId}/subscriptions/{subscriptionId}}
     */
    public Subscription get(String subscriptionId) {
        return get(subscriptionId, null);
    }

    /**
     * Abonelik detayı
     *
     * {@code GET /v1/apps/{appId}/subscriptions/{subscriptionId}}
     */
    public Subscription get(String subscriptionId, RequestOptions options) {
        Operation op = new Operation("GET", "/v1/apps/{appId}/subscriptions/{subscriptionId}");
        op.pathParam("subscriptionId", subscriptionId);
        return client.execute(op, options, TYPE_0);
    }

    private static final TypeReference<Subscription> TYPE_1 = new TypeReference<Subscription>() {};

    /**
     * Abonelik güncelle
     *
     * {@code PATCH /v1/apps/{appId}/subscriptions/{subscriptionId}}
     */
    public Subscription update(String subscriptionId, PatchSubscriptionDto body) {
        return update(subscriptionId, body, null);
    }

    /**
     * Abonelik güncelle
     *
     * {@code PATCH /v1/apps/{appId}/subscriptions/{subscriptionId}}
     */
    public Subscription update(String subscriptionId, PatchSubscriptionDto body, RequestOptions options) {
        Operation op = new Operation("PATCH", "/v1/apps/{appId}/subscriptions/{subscriptionId}");
        op.pathParam("subscriptionId", subscriptionId);
        if (body == null) {
            throw new IllegalArgumentException("HeroSignal: istek gövdesi null olamaz.");
        }
        op.body(body);
        return client.execute(op, options, TYPE_1);
    }

    private static final TypeReference<Ok> TYPE_2 = new TypeReference<Ok>() {};

    /**
     * Aboneliği sil
     *
     * {@code DELETE /v1/apps/{appId}/subscriptions/{subscriptionId}}
     */
    public Ok delete(String subscriptionId) {
        return delete(subscriptionId, null);
    }

    /**
     * Aboneliği sil
     *
     * {@code DELETE /v1/apps/{appId}/subscriptions/{subscriptionId}}
     */
    public Ok delete(String subscriptionId, RequestOptions options) {
        Operation op = new Operation("DELETE", "/v1/apps/{appId}/subscriptions/{subscriptionId}");
        op.pathParam("subscriptionId", subscriptionId);
        return client.execute(op, options, TYPE_2);
    }

    private static final TypeReference<UserIdentity> TYPE_3 = new TypeReference<UserIdentity>() {};

    /**
     * Aboneliğin sahibi kullanıcının kimlikleri
     *
     * {@code GET /v1/apps/{appId}/subscriptions/{subscriptionId}/user/identity}
     */
    public UserIdentity getUserIdentity(String subscriptionId) {
        return getUserIdentity(subscriptionId, null);
    }

    /**
     * Aboneliğin sahibi kullanıcının kimlikleri
     *
     * {@code GET /v1/apps/{appId}/subscriptions/{subscriptionId}/user/identity}
     */
    public UserIdentity getUserIdentity(String subscriptionId, RequestOptions options) {
        Operation op = new Operation("GET", "/v1/apps/{appId}/subscriptions/{subscriptionId}/user/identity");
        op.pathParam("subscriptionId", subscriptionId);
        return client.execute(op, options, TYPE_3);
    }

    private static final TypeReference<Subscription> TYPE_4 = new TypeReference<Subscription>() {};

    /**
     * Token ile abonelik güncelle (token_type: ios_push, android_push, web_push, email, sms veya eski sağlayıcı adları iOSPush, AndroidPush, ChromePush, FirefoxPush, SafariPush, Email, SMS)
     *
     * {@code PATCH /v1/apps/{appId}/subscriptions_by_token/{tokenType}/{token}}
     */
    public Subscription updateByToken(String tokenType, String token, PatchSubscriptionDto body) {
        return updateByToken(tokenType, token, body, null);
    }

    /**
     * Token ile abonelik güncelle (token_type: ios_push, android_push, web_push, email, sms veya eski sağlayıcı adları iOSPush, AndroidPush, ChromePush, FirefoxPush, SafariPush, Email, SMS)
     *
     * {@code PATCH /v1/apps/{appId}/subscriptions_by_token/{tokenType}/{token}}
     */
    public Subscription updateByToken(String tokenType, String token, PatchSubscriptionDto body, RequestOptions options) {
        Operation op = new Operation("PATCH", "/v1/apps/{appId}/subscriptions_by_token/{tokenType}/{token}");
        op.pathParam("tokenType", tokenType);
        op.pathParam("token", token);
        if (body == null) {
            throw new IllegalArgumentException("HeroSignal: istek gövdesi null olamaz.");
        }
        op.body(body);
        return client.execute(op, options, TYPE_4);
    }

    private static final TypeReference<Subscription> TYPE_5 = new TypeReference<Subscription>() {};

    /**
     * Aboneliği external_id ile kullanıcıya bağla
     *
     * {@code POST /v1/apps/{appId}/subscriptions/{subscriptionId}/owner}
     */
    public Subscription setOwner(String subscriptionId, SetOwnerDto body) {
        return setOwner(subscriptionId, body, null);
    }

    /**
     * Aboneliği external_id ile kullanıcıya bağla
     *
     * {@code POST /v1/apps/{appId}/subscriptions/{subscriptionId}/owner}
     */
    public Subscription setOwner(String subscriptionId, SetOwnerDto body, RequestOptions options) {
        Operation op = new Operation("POST", "/v1/apps/{appId}/subscriptions/{subscriptionId}/owner");
        op.pathParam("subscriptionId", subscriptionId);
        if (body == null) {
            throw new IllegalArgumentException("HeroSignal: istek gövdesi null olamaz.");
        }
        op.body(body);
        return client.execute(op, options, TYPE_5);
    }
}
