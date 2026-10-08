// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.
package io.herosignal.resources;

import com.fasterxml.jackson.core.type.TypeReference;
import io.herosignal.RequestOptions;
import io.herosignal.core.ApiExecutor;
import io.herosignal.core.ApiRequest;
import io.herosignal.models.ApiEventsDto;
import io.herosignal.models.App;
import io.herosignal.models.EventDefinition;
import io.herosignal.models.EventDefinitionDetail;
import io.herosignal.models.EventDefinitionList;
import io.herosignal.models.EventsAccepted;
import io.herosignal.models.PatchEventDefinitionDto;
/** Özel olay gönderimi ve olay tanımları. */
public final class EventsResource {
    private final ApiExecutor executor;

    /**
     * Kaynağı oluşturur (istemci tarafından çağrılır).
     *
     * @param executor istekleri gönderen yürütücü
     */
    public EventsResource(ApiExecutor executor) {
        this.executor = executor;
    }

    /**
     * Toplu olay gönder (en fazla 500)
     *
     * <p>{@code POST /v1/apps/{appId}/events}
     *
     * <p>App kapsamı istemcinin varsayılan app'idir; {@link RequestOptions.Builder#appId(String)} ile değiştirilebilir.
     *
     * @param body istek gövdesi
     * @param options çağrı seçenekleri (null olabilir)
     * @return API yanıtı
     * @throws io.herosignal.HeroSignalException API veya ağ hatasında
     */
    public EventsAccepted send(ApiEventsDto body, RequestOptions options) {
        ApiRequest request = new ApiRequest("POST", "/v1/apps/{appId}/events");
        request.appIdInPath();
        request.body(body);
        return executor.execute(request, options, new TypeReference<EventsAccepted>() {});
    }

    /**
     * Toplu olay gönder (en fazla 500)
     *
     * <p>{@code POST /v1/apps/{appId}/events}
     *
     * <p>App kapsamı istemcinin varsayılan app'idir; {@link RequestOptions.Builder#appId(String)} ile değiştirilebilir.
     *
     * @param body istek gövdesi
     * @return API yanıtı
     * @throws io.herosignal.HeroSignalException API veya ağ hatasında
     */
    public EventsAccepted send(ApiEventsDto body) {
        return send(body, null);
    }

    /**
     * Olay tanımları
     *
     * <p>{@code GET /v1/apps/{appId}/events/definitions}
     *
     * <p>App kapsamı istemcinin varsayılan app'idir; {@link RequestOptions.Builder#appId(String)} ile değiştirilebilir.
     *
     * @param options çağrı seçenekleri (null olabilir)
     * @return API yanıtı
     * @throws io.herosignal.HeroSignalException API veya ağ hatasında
     */
    public EventDefinitionList listDefinitions(RequestOptions options) {
        ApiRequest request = new ApiRequest("GET", "/v1/apps/{appId}/events/definitions");
        request.appIdInPath();
        return executor.execute(request, options, new TypeReference<EventDefinitionList>() {});
    }

    /**
     * Olay tanımları
     *
     * <p>{@code GET /v1/apps/{appId}/events/definitions}
     *
     * <p>App kapsamı istemcinin varsayılan app'idir; {@link RequestOptions.Builder#appId(String)} ile değiştirilebilir.
     *
     * @return API yanıtı
     * @throws io.herosignal.HeroSignalException API veya ağ hatasında
     */
    public EventDefinitionList listDefinitions() {
        return listDefinitions(null);
    }

    /**
     * Olay detayı
     *
     * <p>{@code GET /v1/apps/{appId}/events/definitions/{name}}
     *
     * <p>App kapsamı istemcinin varsayılan app'idir; {@link RequestOptions.Builder#appId(String)} ile değiştirilebilir.
     *
     * @param name {name} yol parametresi
     * @param options çağrı seçenekleri (null olabilir)
     * @return API yanıtı
     * @throws io.herosignal.HeroSignalException API veya ağ hatasında
     */
    public EventDefinitionDetail getDefinition(String name, RequestOptions options) {
        ApiRequest request = new ApiRequest("GET", "/v1/apps/{appId}/events/definitions/{name}");
        request.appIdInPath();
        request.pathParam("name", name);
        return executor.execute(request, options, new TypeReference<EventDefinitionDetail>() {});
    }

    /**
     * Olay detayı
     *
     * <p>{@code GET /v1/apps/{appId}/events/definitions/{name}}
     *
     * <p>App kapsamı istemcinin varsayılan app'idir; {@link RequestOptions.Builder#appId(String)} ile değiştirilebilir.
     *
     * @param name {name} yol parametresi
     * @return API yanıtı
     * @throws io.herosignal.HeroSignalException API veya ağ hatasında
     */
    public EventDefinitionDetail getDefinition(String name) {
        return getDefinition(name, null);
    }

    /**
     * Görünen ad / dönüşüm işareti
     *
     * <p>{@code PATCH /v1/apps/{appId}/events/definitions/{name}}
     *
     * <p>App kapsamı istemcinin varsayılan app'idir; {@link RequestOptions.Builder#appId(String)} ile değiştirilebilir.
     *
     * @param name {name} yol parametresi
     * @param body istek gövdesi
     * @param options çağrı seçenekleri (null olabilir)
     * @return API yanıtı
     * @throws io.herosignal.HeroSignalException API veya ağ hatasında
     */
    public EventDefinition updateDefinition(String name, PatchEventDefinitionDto body, RequestOptions options) {
        ApiRequest request = new ApiRequest("PATCH", "/v1/apps/{appId}/events/definitions/{name}");
        request.appIdInPath();
        request.pathParam("name", name);
        request.body(body);
        return executor.execute(request, options, new TypeReference<EventDefinition>() {});
    }

    /**
     * Görünen ad / dönüşüm işareti
     *
     * <p>{@code PATCH /v1/apps/{appId}/events/definitions/{name}}
     *
     * <p>App kapsamı istemcinin varsayılan app'idir; {@link RequestOptions.Builder#appId(String)} ile değiştirilebilir.
     *
     * @param name {name} yol parametresi
     * @param body istek gövdesi
     * @return API yanıtı
     * @throws io.herosignal.HeroSignalException API veya ağ hatasında
     */
    public EventDefinition updateDefinition(String name, PatchEventDefinitionDto body) {
        return updateDefinition(name, body, null);
    }
}
