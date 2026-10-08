// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.
package io.herosignal.resources;

import com.fasterxml.jackson.core.type.TypeReference;
import io.herosignal.RequestOptions;
import io.herosignal.core.ApiExecutor;
import io.herosignal.core.ApiRequest;
import io.herosignal.models.AddAliasDto;
import io.herosignal.models.App;
import io.herosignal.models.UserDetail;
/** Kullanıcı kimlikleri (alias): ekleme ve kaldırma. */
public final class AliasesResource {
    private final ApiExecutor executor;

    /**
     * Kaynağı oluşturur (istemci tarafından çağrılır).
     *
     * @param executor istekleri gönderen yürütücü
     */
    public AliasesResource(ApiExecutor executor) {
        this.executor = executor;
    }

    /**
     * Alias ekle
     *
     * <p>{@code PATCH /v1/apps/{appId}/users/by/{label}/{value}/identity}
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
    public UserDetail add(String label, String value, AddAliasDto body, RequestOptions options) {
        ApiRequest request = new ApiRequest("PATCH", "/v1/apps/{appId}/users/by/{label}/{value}/identity");
        request.appIdInPath();
        request.pathParam("label", label);
        request.pathParam("value", value);
        request.body(body);
        return executor.execute(request, options, new TypeReference<UserDetail>() {});
    }

    /**
     * Alias ekle
     *
     * <p>{@code PATCH /v1/apps/{appId}/users/by/{label}/{value}/identity}
     *
     * <p>App kapsamı istemcinin varsayılan app'idir; {@link RequestOptions.Builder#appId(String)} ile değiştirilebilir.
     *
     * @param label {label} yol parametresi
     * @param value {value} yol parametresi
     * @param body istek gövdesi
     * @return API yanıtı
     * @throws io.herosignal.HeroSignalException API veya ağ hatasında
     */
    public UserDetail add(String label, String value, AddAliasDto body) {
        return add(label, value, body, null);
    }

    /**
     * Alias kaldır
     *
     * <p>{@code DELETE /v1/apps/{appId}/users/by/{label}/{value}/identity/{aliasLabel}}
     *
     * <p>App kapsamı istemcinin varsayılan app'idir; {@link RequestOptions.Builder#appId(String)} ile değiştirilebilir.
     *
     * @param label {label} yol parametresi
     * @param value {value} yol parametresi
     * @param aliasLabel {aliasLabel} yol parametresi
     * @param options çağrı seçenekleri (null olabilir)
     * @return API yanıtı
     * @throws io.herosignal.HeroSignalException API veya ağ hatasında
     */
    public UserDetail delete(String label, String value, String aliasLabel, RequestOptions options) {
        ApiRequest request = new ApiRequest("DELETE", "/v1/apps/{appId}/users/by/{label}/{value}/identity/{aliasLabel}");
        request.appIdInPath();
        request.pathParam("label", label);
        request.pathParam("value", value);
        request.pathParam("aliasLabel", aliasLabel);
        return executor.execute(request, options, new TypeReference<UserDetail>() {});
    }

    /**
     * Alias kaldır
     *
     * <p>{@code DELETE /v1/apps/{appId}/users/by/{label}/{value}/identity/{aliasLabel}}
     *
     * <p>App kapsamı istemcinin varsayılan app'idir; {@link RequestOptions.Builder#appId(String)} ile değiştirilebilir.
     *
     * @param label {label} yol parametresi
     * @param value {value} yol parametresi
     * @param aliasLabel {aliasLabel} yol parametresi
     * @return API yanıtı
     * @throws io.herosignal.HeroSignalException API veya ağ hatasında
     */
    public UserDetail delete(String label, String value, String aliasLabel) {
        return delete(label, value, aliasLabel, null);
    }
}
