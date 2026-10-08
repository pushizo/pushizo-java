// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.
package io.herosignal.resources;

import com.fasterxml.jackson.core.type.TypeReference;
import io.herosignal.RequestOptions;
import io.herosignal.core.ApiExecutor;
import io.herosignal.core.ApiRequest;
import io.herosignal.models.App;
import io.herosignal.models.ChannelConfig;
import io.herosignal.models.ChannelList;
import io.herosignal.models.ChannelValidation;
/** Kanal (APNs, FCM, Web Push, e-posta, SMS) yapılandırması ve doğrulaması. */
public final class ChannelsResource {
    private final ApiExecutor executor;

    /**
     * Kaynağı oluşturur (istemci tarafından çağrılır).
     *
     * @param executor istekleri gönderen yürütücü
     */
    public ChannelsResource(ApiExecutor executor) {
        this.executor = executor;
    }

    /**
     * Kanal yapılandırmaları
     *
     * <p>{@code GET /v1/apps/{appId}/channels}
     *
     * <p>App kapsamı istemcinin varsayılan app'idir; {@link RequestOptions.Builder#appId(String)} ile değiştirilebilir.
     *
     * @param options çağrı seçenekleri (null olabilir)
     * @return API yanıtı
     * @throws io.herosignal.HeroSignalException API veya ağ hatasında
     */
    public ChannelList list(RequestOptions options) {
        ApiRequest request = new ApiRequest("GET", "/v1/apps/{appId}/channels");
        request.appIdInPath();
        return executor.execute(request, options, new TypeReference<ChannelList>() {});
    }

    /**
     * Kanal yapılandırmaları
     *
     * <p>{@code GET /v1/apps/{appId}/channels}
     *
     * <p>App kapsamı istemcinin varsayılan app'idir; {@link RequestOptions.Builder#appId(String)} ile değiştirilebilir.
     *
     * @return API yanıtı
     * @throws io.herosignal.HeroSignalException API veya ağ hatasında
     */
    public ChannelList list() {
        return list(null);
    }

    /**
     * Kimlik bilgisi yükle (APNs p8, FCM servis hesabı, VAPID, mock)
     *
     * <p>{@code PUT /v1/apps/{appId}/channels/{channel}}
     *
     * <p>App kapsamı istemcinin varsayılan app'idir; {@link RequestOptions.Builder#appId(String)} ile değiştirilebilir.
     *
     * @param channel {channel} yol parametresi
     * @param body istek gövdesi
     * @param options çağrı seçenekleri (null olabilir)
     * @return API yanıtı
     * @throws io.herosignal.HeroSignalException API veya ağ hatasında
     */
    public ChannelConfig upsert(String channel, Object body, RequestOptions options) {
        ApiRequest request = new ApiRequest("PUT", "/v1/apps/{appId}/channels/{channel}");
        request.appIdInPath();
        request.pathParam("channel", channel);
        request.body(body);
        return executor.execute(request, options, new TypeReference<ChannelConfig>() {});
    }

    /**
     * Kimlik bilgisi yükle (APNs p8, FCM servis hesabı, VAPID, mock)
     *
     * <p>{@code PUT /v1/apps/{appId}/channels/{channel}}
     *
     * <p>App kapsamı istemcinin varsayılan app'idir; {@link RequestOptions.Builder#appId(String)} ile değiştirilebilir.
     *
     * @param channel {channel} yol parametresi
     * @param body istek gövdesi
     * @return API yanıtı
     * @throws io.herosignal.HeroSignalException API veya ağ hatasında
     */
    public ChannelConfig upsert(String channel, Object body) {
        return upsert(channel, body, null);
    }

    /**
     * Sağlayıcıya test bağlantısı
     *
     * <p>{@code POST /v1/apps/{appId}/channels/{channel}/validate}
     *
     * <p>App kapsamı istemcinin varsayılan app'idir; {@link RequestOptions.Builder#appId(String)} ile değiştirilebilir.
     *
     * @param channel {channel} yol parametresi
     * @param options çağrı seçenekleri (null olabilir)
     * @return API yanıtı
     * @throws io.herosignal.HeroSignalException API veya ağ hatasında
     */
    public ChannelValidation validate(String channel, RequestOptions options) {
        ApiRequest request = new ApiRequest("POST", "/v1/apps/{appId}/channels/{channel}/validate");
        request.appIdInPath();
        request.pathParam("channel", channel);
        return executor.execute(request, options, new TypeReference<ChannelValidation>() {});
    }

    /**
     * Sağlayıcıya test bağlantısı
     *
     * <p>{@code POST /v1/apps/{appId}/channels/{channel}/validate}
     *
     * <p>App kapsamı istemcinin varsayılan app'idir; {@link RequestOptions.Builder#appId(String)} ile değiştirilebilir.
     *
     * @param channel {channel} yol parametresi
     * @return API yanıtı
     * @throws io.herosignal.HeroSignalException API veya ağ hatasında
     */
    public ChannelValidation validate(String channel) {
        return validate(channel, null);
    }
}
