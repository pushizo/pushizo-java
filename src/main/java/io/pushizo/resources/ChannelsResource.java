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
 * Kanal (APNs, FCM, Web Push, e-posta, SMS) yapılandırması ve doğrulaması.
 */
public final class ChannelsResource {
    private final Pushizo client;

    public ChannelsResource(Pushizo client) {
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
            throw new IllegalArgumentException("Pushizo: istek gövdesi null olamaz.");
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
