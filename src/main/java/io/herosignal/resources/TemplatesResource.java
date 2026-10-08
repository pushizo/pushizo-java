// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.
package io.herosignal.resources;

import com.fasterxml.jackson.core.type.TypeReference;
import io.herosignal.AutoPagingIterable;
import io.herosignal.RequestOptions;
import io.herosignal.core.ApiExecutor;
import io.herosignal.core.ApiRequest;
import io.herosignal.models.App;
import io.herosignal.models.CopyTemplateDto;
import io.herosignal.models.CreateTemplateDto;
import io.herosignal.models.Ok;
import io.herosignal.models.RenderPreview;
import io.herosignal.models.RenderTemplateDto;
import io.herosignal.models.Template;
import io.herosignal.models.TemplatePage;
import io.herosignal.models.TemplateVersionList;
import io.herosignal.models.UpdateTemplateDto;
/** Şablon yönetimi, sürümler ve önizleme. */
public final class TemplatesResource {
    private final ApiExecutor executor;

    /**
     * Kaynağı oluşturur (istemci tarafından çağrılır).
     *
     * @param executor istekleri gönderen yürütücü
     */
    public TemplatesResource(ApiExecutor executor) {
        this.executor = executor;
    }

    /**
     * Şablon listesi
     *
     * <p>{@code GET /v1/apps/{appId}/templates}
     *
     * <p>App kapsamı istemcinin varsayılan app'idir; {@link RequestOptions.Builder#appId(String)} ile değiştirilebilir.
     *
     * @param params isteğe bağlı sorgu parametreleri (null olabilir)
     * @param options çağrı seçenekleri (null olabilir)
     * @return API yanıtı
     * @throws io.herosignal.HeroSignalException API veya ağ hatasında
     */
    public TemplatePage list(TemplatesListParams params, RequestOptions options) {
        ApiRequest request = new ApiRequest("GET", "/v1/apps/{appId}/templates");
        request.appIdInPath();
        if (params != null) {
            request.query("limit", params.getLimit());
            request.query("cursor", params.getCursor());
            request.query("q", params.getQ());
            request.query("channel", params.getChannel());
        }
        return executor.execute(request, options, new TypeReference<TemplatePage>() {});
    }

    /**
     * Şablon listesi
     *
     * <p>{@code GET /v1/apps/{appId}/templates}
     *
     * <p>App kapsamı istemcinin varsayılan app'idir; {@link RequestOptions.Builder#appId(String)} ile değiştirilebilir.
     *
     * @param params isteğe bağlı sorgu parametreleri (null olabilir)
     * @return API yanıtı
     * @throws io.herosignal.HeroSignalException API veya ağ hatasında
     */
    public TemplatePage list(TemplatesListParams params) {
        return list(params, null);
    }

    /**
     * Şablon listesi
     *
     * <p>{@code GET /v1/apps/{appId}/templates}
     *
     * <p>App kapsamı istemcinin varsayılan app'idir; {@link RequestOptions.Builder#appId(String)} ile değiştirilebilir.
     *
     * @return API yanıtı
     * @throws io.herosignal.HeroSignalException API veya ağ hatasında
     */
    public TemplatePage list() {
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
    public Iterable<Template> listAutoPaging(TemplatesListParams params, RequestOptions options) {
        final TemplatesListParams base = params == null ? new TemplatesListParams() : params.copy();
        return new AutoPagingIterable<>(base.getCursor(), cursor -> {
            TemplatePage page = list(base.copy().setCursor(cursor), options);
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
    public Iterable<Template> listAutoPaging(TemplatesListParams params) {
        return listAutoPaging(params, null);
    }

    /**
     * Şablon oluştur
     *
     * <p>{@code POST /v1/apps/{appId}/templates}
     *
     * <p>App kapsamı istemcinin varsayılan app'idir; {@link RequestOptions.Builder#appId(String)} ile değiştirilebilir.
     *
     * @param body istek gövdesi
     * @param options çağrı seçenekleri (null olabilir)
     * @return API yanıtı
     * @throws io.herosignal.HeroSignalException API veya ağ hatasında
     */
    public Template create(CreateTemplateDto body, RequestOptions options) {
        ApiRequest request = new ApiRequest("POST", "/v1/apps/{appId}/templates");
        request.appIdInPath();
        request.body(body);
        return executor.execute(request, options, new TypeReference<Template>() {});
    }

    /**
     * Şablon oluştur
     *
     * <p>{@code POST /v1/apps/{appId}/templates}
     *
     * <p>App kapsamı istemcinin varsayılan app'idir; {@link RequestOptions.Builder#appId(String)} ile değiştirilebilir.
     *
     * @param body istek gövdesi
     * @return API yanıtı
     * @throws io.herosignal.HeroSignalException API veya ağ hatasında
     */
    public Template create(CreateTemplateDto body) {
        return create(body, null);
    }

    /**
     * Şablon detayı
     *
     * <p>{@code GET /v1/apps/{appId}/templates/{templateId}}
     *
     * <p>App kapsamı istemcinin varsayılan app'idir; {@link RequestOptions.Builder#appId(String)} ile değiştirilebilir.
     *
     * @param templateId {templateId} yol parametresi
     * @param options çağrı seçenekleri (null olabilir)
     * @return API yanıtı
     * @throws io.herosignal.HeroSignalException API veya ağ hatasında
     */
    public Template get(String templateId, RequestOptions options) {
        ApiRequest request = new ApiRequest("GET", "/v1/apps/{appId}/templates/{templateId}");
        request.appIdInPath();
        request.pathParam("templateId", templateId);
        return executor.execute(request, options, new TypeReference<Template>() {});
    }

    /**
     * Şablon detayı
     *
     * <p>{@code GET /v1/apps/{appId}/templates/{templateId}}
     *
     * <p>App kapsamı istemcinin varsayılan app'idir; {@link RequestOptions.Builder#appId(String)} ile değiştirilebilir.
     *
     * @param templateId {templateId} yol parametresi
     * @return API yanıtı
     * @throws io.herosignal.HeroSignalException API veya ağ hatasında
     */
    public Template get(String templateId) {
        return get(templateId, null);
    }

    /**
     * Şablon güncelle
     *
     * <p>{@code PATCH /v1/apps/{appId}/templates/{templateId}}
     *
     * <p>App kapsamı istemcinin varsayılan app'idir; {@link RequestOptions.Builder#appId(String)} ile değiştirilebilir.
     *
     * @param templateId {templateId} yol parametresi
     * @param body istek gövdesi
     * @param options çağrı seçenekleri (null olabilir)
     * @return API yanıtı
     * @throws io.herosignal.HeroSignalException API veya ağ hatasında
     */
    public Template update(String templateId, UpdateTemplateDto body, RequestOptions options) {
        ApiRequest request = new ApiRequest("PATCH", "/v1/apps/{appId}/templates/{templateId}");
        request.appIdInPath();
        request.pathParam("templateId", templateId);
        request.body(body);
        return executor.execute(request, options, new TypeReference<Template>() {});
    }

    /**
     * Şablon güncelle
     *
     * <p>{@code PATCH /v1/apps/{appId}/templates/{templateId}}
     *
     * <p>App kapsamı istemcinin varsayılan app'idir; {@link RequestOptions.Builder#appId(String)} ile değiştirilebilir.
     *
     * @param templateId {templateId} yol parametresi
     * @param body istek gövdesi
     * @return API yanıtı
     * @throws io.herosignal.HeroSignalException API veya ağ hatasında
     */
    public Template update(String templateId, UpdateTemplateDto body) {
        return update(templateId, body, null);
    }

    /**
     * Şablon sil
     *
     * <p>{@code DELETE /v1/apps/{appId}/templates/{templateId}}
     *
     * <p>App kapsamı istemcinin varsayılan app'idir; {@link RequestOptions.Builder#appId(String)} ile değiştirilebilir.
     *
     * @param templateId {templateId} yol parametresi
     * @param options çağrı seçenekleri (null olabilir)
     * @return API yanıtı
     * @throws io.herosignal.HeroSignalException API veya ağ hatasında
     */
    public Ok delete(String templateId, RequestOptions options) {
        ApiRequest request = new ApiRequest("DELETE", "/v1/apps/{appId}/templates/{templateId}");
        request.appIdInPath();
        request.pathParam("templateId", templateId);
        return executor.execute(request, options, new TypeReference<Ok>() {});
    }

    /**
     * Şablon sil
     *
     * <p>{@code DELETE /v1/apps/{appId}/templates/{templateId}}
     *
     * <p>App kapsamı istemcinin varsayılan app'idir; {@link RequestOptions.Builder#appId(String)} ile değiştirilebilir.
     *
     * @param templateId {templateId} yol parametresi
     * @return API yanıtı
     * @throws io.herosignal.HeroSignalException API veya ağ hatasında
     */
    public Ok delete(String templateId) {
        return delete(templateId, null);
    }

    /**
     * Sürüm geçmişi
     *
     * <p>{@code GET /v1/apps/{appId}/templates/{templateId}/versions}
     *
     * <p>App kapsamı istemcinin varsayılan app'idir; {@link RequestOptions.Builder#appId(String)} ile değiştirilebilir.
     *
     * @param templateId {templateId} yol parametresi
     * @param options çağrı seçenekleri (null olabilir)
     * @return API yanıtı
     * @throws io.herosignal.HeroSignalException API veya ağ hatasında
     */
    public TemplateVersionList versions(String templateId, RequestOptions options) {
        ApiRequest request = new ApiRequest("GET", "/v1/apps/{appId}/templates/{templateId}/versions");
        request.appIdInPath();
        request.pathParam("templateId", templateId);
        return executor.execute(request, options, new TypeReference<TemplateVersionList>() {});
    }

    /**
     * Sürüm geçmişi
     *
     * <p>{@code GET /v1/apps/{appId}/templates/{templateId}/versions}
     *
     * <p>App kapsamı istemcinin varsayılan app'idir; {@link RequestOptions.Builder#appId(String)} ile değiştirilebilir.
     *
     * @param templateId {templateId} yol parametresi
     * @return API yanıtı
     * @throws io.herosignal.HeroSignalException API veya ağ hatasında
     */
    public TemplateVersionList versions(String templateId) {
        return versions(templateId, null);
    }

    /**
     * Şablonu aynı organizasyondaki başka bir app'e kopyala (org anahtarı gerekir)
     *
     * <p>{@code POST /v1/apps/{appId}/templates/{templateId}/copy}
     *
     * <p>App kapsamı istemcinin varsayılan app'idir; {@link RequestOptions.Builder#appId(String)} ile değiştirilebilir.
     *
     * @param templateId {templateId} yol parametresi
     * @param body istek gövdesi
     * @param options çağrı seçenekleri (null olabilir)
     * @return API yanıtı
     * @throws io.herosignal.HeroSignalException API veya ağ hatasında
     */
    public Template copy(String templateId, CopyTemplateDto body, RequestOptions options) {
        ApiRequest request = new ApiRequest("POST", "/v1/apps/{appId}/templates/{templateId}/copy");
        request.appIdInPath();
        request.pathParam("templateId", templateId);
        request.body(body);
        return executor.execute(request, options, new TypeReference<Template>() {});
    }

    /**
     * Şablonu aynı organizasyondaki başka bir app'e kopyala (org anahtarı gerekir)
     *
     * <p>{@code POST /v1/apps/{appId}/templates/{templateId}/copy}
     *
     * <p>App kapsamı istemcinin varsayılan app'idir; {@link RequestOptions.Builder#appId(String)} ile değiştirilebilir.
     *
     * @param templateId {templateId} yol parametresi
     * @param body istek gövdesi
     * @return API yanıtı
     * @throws io.herosignal.HeroSignalException API veya ağ hatasında
     */
    public Template copy(String templateId, CopyTemplateDto body) {
        return copy(templateId, body, null);
    }

    /**
     * Şablonu örnek verilerle render et
     *
     * <p>{@code POST /v1/apps/{appId}/templates/{templateId}/render}
     *
     * <p>App kapsamı istemcinin varsayılan app'idir; {@link RequestOptions.Builder#appId(String)} ile değiştirilebilir.
     *
     * @param templateId {templateId} yol parametresi
     * @param body istek gövdesi
     * @param options çağrı seçenekleri (null olabilir)
     * @return API yanıtı
     * @throws io.herosignal.HeroSignalException API veya ağ hatasında
     */
    public RenderPreview render(String templateId, RenderTemplateDto body, RequestOptions options) {
        ApiRequest request = new ApiRequest("POST", "/v1/apps/{appId}/templates/{templateId}/render");
        request.appIdInPath();
        request.pathParam("templateId", templateId);
        request.body(body);
        return executor.execute(request, options, new TypeReference<RenderPreview>() {});
    }

    /**
     * Şablonu örnek verilerle render et
     *
     * <p>{@code POST /v1/apps/{appId}/templates/{templateId}/render}
     *
     * <p>App kapsamı istemcinin varsayılan app'idir; {@link RequestOptions.Builder#appId(String)} ile değiştirilebilir.
     *
     * @param templateId {templateId} yol parametresi
     * @param body istek gövdesi
     * @return API yanıtı
     * @throws io.herosignal.HeroSignalException API veya ağ hatasında
     */
    public RenderPreview render(String templateId, RenderTemplateDto body) {
        return render(templateId, body, null);
    }
}
