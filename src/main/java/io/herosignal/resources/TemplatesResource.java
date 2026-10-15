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
 * Şablon yönetimi, sürümler ve önizleme.
 */
public final class TemplatesResource {
    private final HeroSignal client;

    public TemplatesResource(HeroSignal client) {
        this.client = client;
    }

    private static final TypeReference<TemplatePage> TYPE_0 = new TypeReference<TemplatePage>() {};

    /**
     * Şablon listesi
     *
     * {@code GET /v1/apps/{appId}/templates}
     */
    public TemplatePage list() {
        return list(null, null);
    }

    /**
     * Şablon listesi
     *
     * {@code GET /v1/apps/{appId}/templates}
     */
    public TemplatePage list(TemplatesListParams params) {
        return list(params, null);
    }

    /**
     * Şablon listesi
     *
     * {@code GET /v1/apps/{appId}/templates}
     *
     * Parametreler: channel — Değerler: "ios_push", "android_push", "hms_push", "web_push", "email", "sms".
     */
    public TemplatePage list(TemplatesListParams params, RequestOptions options) {
        Operation op = new Operation("GET", "/v1/apps/{appId}/templates");
        if (params != null) {
            params.applyTo(op);
        }
        return client.execute(op, options, TYPE_0);
    }

    /**
     * list sonuçlarını next_cursor ile tüm sayfalar boyunca tek tek dolaşır (sayfalar tembel yüklenir).
     */
    public PageIterable<Template> listAll() {
        return listAll(null, null);
    }

    /**
     * list sonuçlarını next_cursor ile tüm sayfalar boyunca tek tek dolaşır (sayfalar tembel yüklenir).
     */
    public PageIterable<Template> listAll(TemplatesListParams params) {
        return listAll(params, null);
    }

    /**
     * list sonuçlarını next_cursor ile tüm sayfalar boyunca tek tek dolaşır (sayfalar tembel yüklenir).
     */
    public PageIterable<Template> listAll(TemplatesListParams params, RequestOptions options) {
        TemplatesListParams base = params == null ? new TemplatesListParams() : params.copy();
        return new PageIterable<>(cursor -> {
            TemplatesListParams p = base.copy();
            if (cursor != null) {
                p.cursor(cursor);
            }
            TemplatePage page = list(p, options);
            return new PageIterable.Page<>(page.getData(), page.getNextCursor(), Boolean.TRUE.equals(page.getHasMore()));
        });
    }

    private static final TypeReference<Template> TYPE_1 = new TypeReference<Template>() {};

    /**
     * Şablon oluştur
     *
     * {@code POST /v1/apps/{appId}/templates}
     */
    public Template create(CreateTemplateDto body) {
        return create(body, null);
    }

    /**
     * Şablon oluştur
     *
     * {@code POST /v1/apps/{appId}/templates}
     */
    public Template create(CreateTemplateDto body, RequestOptions options) {
        Operation op = new Operation("POST", "/v1/apps/{appId}/templates");
        if (body == null) {
            throw new IllegalArgumentException("HeroSignal: istek gövdesi null olamaz.");
        }
        op.body(body);
        return client.execute(op, options, TYPE_1);
    }

    private static final TypeReference<Template> TYPE_2 = new TypeReference<Template>() {};

    /**
     * Şablon detayı
     *
     * {@code GET /v1/apps/{appId}/templates/{templateId}}
     */
    public Template get(String templateId) {
        return get(templateId, null);
    }

    /**
     * Şablon detayı
     *
     * {@code GET /v1/apps/{appId}/templates/{templateId}}
     */
    public Template get(String templateId, RequestOptions options) {
        Operation op = new Operation("GET", "/v1/apps/{appId}/templates/{templateId}");
        op.pathParam("templateId", templateId);
        return client.execute(op, options, TYPE_2);
    }

    private static final TypeReference<Template> TYPE_3 = new TypeReference<Template>() {};

    /**
     * Şablon güncelle
     *
     * {@code PATCH /v1/apps/{appId}/templates/{templateId}}
     */
    public Template update(String templateId, UpdateTemplateDto body) {
        return update(templateId, body, null);
    }

    /**
     * Şablon güncelle
     *
     * {@code PATCH /v1/apps/{appId}/templates/{templateId}}
     */
    public Template update(String templateId, UpdateTemplateDto body, RequestOptions options) {
        Operation op = new Operation("PATCH", "/v1/apps/{appId}/templates/{templateId}");
        op.pathParam("templateId", templateId);
        if (body == null) {
            throw new IllegalArgumentException("HeroSignal: istek gövdesi null olamaz.");
        }
        op.body(body);
        return client.execute(op, options, TYPE_3);
    }

    private static final TypeReference<Ok> TYPE_4 = new TypeReference<Ok>() {};

    /**
     * Şablon sil
     *
     * {@code DELETE /v1/apps/{appId}/templates/{templateId}}
     */
    public Ok delete(String templateId) {
        return delete(templateId, null);
    }

    /**
     * Şablon sil
     *
     * {@code DELETE /v1/apps/{appId}/templates/{templateId}}
     */
    public Ok delete(String templateId, RequestOptions options) {
        Operation op = new Operation("DELETE", "/v1/apps/{appId}/templates/{templateId}");
        op.pathParam("templateId", templateId);
        return client.execute(op, options, TYPE_4);
    }

    private static final TypeReference<TemplateStats> TYPE_5 = new TypeReference<TemplateStats>() {};

    /**
     * Şablon analitiği
     *
     * {@code GET /v1/apps/{appId}/templates/{templateId}/stats}
     */
    public TemplateStats stats(String templateId) {
        return stats(templateId, null);
    }

    /**
     * Şablon analitiği
     *
     * {@code GET /v1/apps/{appId}/templates/{templateId}/stats}
     */
    public TemplateStats stats(String templateId, RequestOptions options) {
        Operation op = new Operation("GET", "/v1/apps/{appId}/templates/{templateId}/stats");
        op.pathParam("templateId", templateId);
        return client.execute(op, options, TYPE_5);
    }

    private static final TypeReference<Template> TYPE_6 = new TypeReference<Template>() {};

    /**
     * Şablonu aynı organizasyondaki başka bir app'e kopyala
     *
     * {@code POST /v1/apps/{appId}/templates/{templateId}/copy_to_app}
     */
    public Template copyToApp(String templateId, CopyTemplateDto body) {
        return copyToApp(templateId, body, null);
    }

    /**
     * Şablonu aynı organizasyondaki başka bir app'e kopyala
     *
     * {@code POST /v1/apps/{appId}/templates/{templateId}/copy_to_app}
     */
    public Template copyToApp(String templateId, CopyTemplateDto body, RequestOptions options) {
        Operation op = new Operation("POST", "/v1/apps/{appId}/templates/{templateId}/copy_to_app");
        op.pathParam("templateId", templateId);
        if (body == null) {
            throw new IllegalArgumentException("HeroSignal: istek gövdesi null olamaz.");
        }
        op.body(body);
        return client.execute(op, options, TYPE_6);
    }

    private static final TypeReference<TemplateVersionList> TYPE_7 = new TypeReference<TemplateVersionList>() {};

    /**
     * Sürüm geçmişi
     *
     * {@code GET /v1/apps/{appId}/templates/{templateId}/versions}
     */
    public TemplateVersionList versions(String templateId) {
        return versions(templateId, null);
    }

    /**
     * Sürüm geçmişi
     *
     * {@code GET /v1/apps/{appId}/templates/{templateId}/versions}
     */
    public TemplateVersionList versions(String templateId, RequestOptions options) {
        Operation op = new Operation("GET", "/v1/apps/{appId}/templates/{templateId}/versions");
        op.pathParam("templateId", templateId);
        return client.execute(op, options, TYPE_7);
    }

    private static final TypeReference<RenderPreview> TYPE_8 = new TypeReference<RenderPreview>() {};

    /**
     * Şablonu örnek verilerle render et
     *
     * {@code POST /v1/apps/{appId}/templates/{templateId}/render}
     */
    public RenderPreview render(String templateId, RenderTemplateDto body) {
        return render(templateId, body, null);
    }

    /**
     * Şablonu örnek verilerle render et
     *
     * {@code POST /v1/apps/{appId}/templates/{templateId}/render}
     */
    public RenderPreview render(String templateId, RenderTemplateDto body, RequestOptions options) {
        Operation op = new Operation("POST", "/v1/apps/{appId}/templates/{templateId}/render");
        op.pathParam("templateId", templateId);
        if (body == null) {
            throw new IllegalArgumentException("HeroSignal: istek gövdesi null olamaz.");
        }
        op.body(body);
        return client.execute(op, options, TYPE_8);
    }
}
