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
 * Kanal (APNs, FCM, Web Push, e-posta, SMS) yapılandırması ve doğrulaması.
 */
public final class ChannelsResource {
    private final HeroSignal client;

    public ChannelsResource(HeroSignal client) {
        this.client = client;
    }

    private static final TypeReference<ChannelList> TYPE_0 = new TypeReference<ChannelList>() {};

    /**
     * Kanal yapılandırmaları
     *
     * {@code GET /v1/apps/{appId}/channels}
     */
    public ChannelList list() {
        return list(null);
    }

    /**
     * Kanal yapılandırmaları
     *
     * {@code GET /v1/apps/{appId}/channels}
     */
    public ChannelList list(RequestOptions options) {
        Operation op = new Operation("GET", "/v1/apps/{appId}/channels");
        return client.execute(op, options, TYPE_0);
    }

    private static final TypeReference<ChannelConfig> TYPE_1 = new TypeReference<ChannelConfig>() {};

    /**
     * Kimlik bilgisi yükle (APNs p8, FCM servis hesabı, VAPID, mock)
     *
     * {@code PUT /v1/apps/{appId}/channels/{channel}}
     */
    public ChannelConfig upsert(String channel, Object body) {
        return upsert(channel, body, null);
    }

    /**
     * Kimlik bilgisi yükle (APNs p8, FCM servis hesabı, VAPID, mock)
     *
     * {@code PUT /v1/apps/{appId}/channels/{channel}}
     */
    public ChannelConfig upsert(String channel, Object body, RequestOptions options) {
        Operation op = new Operation("PUT", "/v1/apps/{appId}/channels/{channel}");
        op.pathParam("channel", channel);
        if (body == null) {
            throw new IllegalArgumentException("HeroSignal: istek gövdesi null olamaz.");
        }
        op.body(body);
        return client.execute(op, options, TYPE_1);
    }

    private static final TypeReference<ChannelValidation> TYPE_2 = new TypeReference<ChannelValidation>() {};

    /**
     * Sağlayıcıya test bağlantısı
     *
     * {@code POST /v1/apps/{appId}/channels/{channel}/validate}
     */
    public ChannelValidation validate(String channel) {
        return validate(channel, null);
    }

    /**
     * Sağlayıcıya test bağlantısı
     *
     * {@code POST /v1/apps/{appId}/channels/{channel}/validate}
     */
    public ChannelValidation validate(String channel, RequestOptions options) {
        Operation op = new Operation("POST", "/v1/apps/{appId}/channels/{channel}/validate");
        op.pathParam("channel", channel);
        return client.execute(op, options, TYPE_2);
    }
}
