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
 * channelScores kaynağı.
 */
public final class ChannelScoresResource {
    private final Pushizo client;

    public ChannelScoresResource(Pushizo client) {
        this.client = client;
    }

    private static final TypeReference<ChannelScoreConfig> TYPE_0 = new TypeReference<ChannelScoreConfig>() {};

    /**
     * Kanal skoru ayarı
     *
     * {@code GET /v1/apps/{appId}/channel-scores/config}
     */
    public ChannelScoreConfig config() {
        return config(null);
    }

    /**
     * Kanal skoru ayarı
     *
     * {@code GET /v1/apps/{appId}/channel-scores/config}
     */
    public ChannelScoreConfig config(RequestOptions options) {
        Operation op = new Operation("GET", "/v1/apps/{appId}/channel-scores/config");
        return client.execute(op, options, TYPE_0);
    }

    private static final TypeReference<ChannelScoreConfig> TYPE_1 = new TypeReference<ChannelScoreConfig>() {};

    /**
     * Kanal skorunu ayarla
     *
     * {@code PUT /v1/apps/{appId}/channel-scores/config}
     *
     * Açıkken skorlar kayıttan sonra yeniden hesaplanır; kapatınca silinir.
     */
    public ChannelScoreConfig update(UpdateChannelScoreConfigDto body) {
        return update(body, null);
    }

    /**
     * Kanal skorunu ayarla
     *
     * {@code PUT /v1/apps/{appId}/channel-scores/config}
     *
     * Açıkken skorlar kayıttan sonra yeniden hesaplanır; kapatınca silinir.
     */
    public ChannelScoreConfig update(UpdateChannelScoreConfigDto body, RequestOptions options) {
        Operation op = new Operation("PUT", "/v1/apps/{appId}/channel-scores/config");
        if (body == null) {
            throw new IllegalArgumentException("Pushizo: istek gövdesi null olamaz.");
        }
        op.body(body);
        return client.execute(op, options, TYPE_1);
    }

    private static final TypeReference<ChannelScoreConfig> TYPE_2 = new TypeReference<ChannelScoreConfig>() {};

    /**
     * Kanal skorlarını yeniden hesapla
     *
     * {@code POST /v1/apps/{appId}/channel-scores/compute}
     *
     * İş kuyruğa alınır; ilerleme `status` alanından izlenir.
     */
    public ChannelScoreConfig compute() {
        return compute(null);
    }

    /**
     * Kanal skorlarını yeniden hesapla
     *
     * {@code POST /v1/apps/{appId}/channel-scores/compute}
     *
     * İş kuyruğa alınır; ilerleme `status` alanından izlenir.
     */
    public ChannelScoreConfig compute(RequestOptions options) {
        Operation op = new Operation("POST", "/v1/apps/{appId}/channel-scores/compute");
        return client.execute(op, options, TYPE_2);
    }

    private static final TypeReference<ChannelScoreOverview> TYPE_3 = new TypeReference<ChannelScoreOverview>() {};

    /**
     * En iyi kanal dağılımı
     *
     * {@code GET /v1/apps/{appId}/channel-scores/overview}
     */
    public ChannelScoreOverview overview() {
        return overview(null);
    }

    /**
     * En iyi kanal dağılımı
     *
     * {@code GET /v1/apps/{appId}/channel-scores/overview}
     */
    public ChannelScoreOverview overview(RequestOptions options) {
        Operation op = new Operation("GET", "/v1/apps/{appId}/channel-scores/overview");
        return client.execute(op, options, TYPE_3);
    }

    private static final TypeReference<ChannelScoreUsersPage> TYPE_4 = new TypeReference<ChannelScoreUsersPage>() {};

    /**
     * En iyi kanalı belli kullanıcılar
     *
     * {@code GET /v1/apps/{appId}/channel-scores/users}
     */
    public ChannelScoreUsersPage users() {
        return users(null, null);
    }

    /**
     * En iyi kanalı belli kullanıcılar
     *
     * {@code GET /v1/apps/{appId}/channel-scores/users}
     */
    public ChannelScoreUsersPage users(ChannelScoresUsersParams params) {
        return users(params, null);
    }

    /**
     * En iyi kanalı belli kullanıcılar
     *
     * {@code GET /v1/apps/{appId}/channel-scores/users}
     *
     * Parametreler: channel — Değerler: "push", "email", "whatsapp", "rcs", "sms".
     */
    public ChannelScoreUsersPage users(ChannelScoresUsersParams params, RequestOptions options) {
        Operation op = new Operation("GET", "/v1/apps/{appId}/channel-scores/users");
        if (params != null) {
            params.applyTo(op);
        }
        return client.execute(op, options, TYPE_4);
    }

    private static final TypeReference<ChannelScoreUser> TYPE_5 = new TypeReference<ChannelScoreUser>() {};

    /**
     * Kullanıcının kanal skorları
     *
     * {@code GET /v1/apps/{appId}/channel-scores/users/{userId}}
     */
    public ChannelScoreUser user(String userId) {
        return user(userId, null);
    }

    /**
     * Kullanıcının kanal skorları
     *
     * {@code GET /v1/apps/{appId}/channel-scores/users/{userId}}
     */
    public ChannelScoreUser user(String userId, RequestOptions options) {
        Operation op = new Operation("GET", "/v1/apps/{appId}/channel-scores/users/{userId}");
        op.pathParam("userId", userId);
        return client.execute(op, options, TYPE_5);
    }
}
