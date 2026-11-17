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
 * forms kaynağı.
 */
public final class FormsResource {
    private final Pushizo client;

    public FormsResource(Pushizo client) {
        this.client = client;
    }

    private static final TypeReference<FormPage> TYPE_0 = new TypeReference<FormPage>() {};

    /**
     * Formlar
     *
     * {@code GET /v1/apps/{appId}/forms}
     */
    public FormPage list() {
        return list(null, null);
    }

    /**
     * Formlar
     *
     * {@code GET /v1/apps/{appId}/forms}
     */
    public FormPage list(FormsListParams params) {
        return list(params, null);
    }

    /**
     * Formlar
     *
     * {@code GET /v1/apps/{appId}/forms}
     *
     * Parametreler: status — Değerler: "active", "archived".
     */
    public FormPage list(FormsListParams params, RequestOptions options) {
        Operation op = new Operation("GET", "/v1/apps/{appId}/forms");
        if (params != null) {
            params.applyTo(op);
        }
        return client.execute(op, options, TYPE_0);
    }

    /**
     * list sonuçlarını next_cursor ile tüm sayfalar boyunca tek tek dolaşır (sayfalar tembel yüklenir).
     */
    public PageIterable<Form> listAll() {
        return listAll(null, null);
    }

    /**
     * list sonuçlarını next_cursor ile tüm sayfalar boyunca tek tek dolaşır (sayfalar tembel yüklenir).
     */
    public PageIterable<Form> listAll(FormsListParams params) {
        return listAll(params, null);
    }

    /**
     * list sonuçlarını next_cursor ile tüm sayfalar boyunca tek tek dolaşır (sayfalar tembel yüklenir).
     */
    public PageIterable<Form> listAll(FormsListParams params, RequestOptions options) {
        FormsListParams base = params == null ? new FormsListParams() : params.copy();
        return new PageIterable<>(cursor -> {
            FormsListParams p = base.copy();
            if (cursor != null) {
                p.cursor(cursor);
            }
            FormPage page = list(p, options);
            return new PageIterable.Page<>(page.getData(), page.getNextCursor(), Boolean.TRUE.equals(page.getHasMore()));
        });
    }

    private static final TypeReference<Form> TYPE_1 = new TypeReference<Form>() {};

    /**
     * Form oluştur
     *
     * {@code POST /v1/apps/{appId}/forms}
     */
    public Form create(CreateFormDto body) {
        return create(body, null);
    }

    /**
     * Form oluştur
     *
     * {@code POST /v1/apps/{appId}/forms}
     */
    public Form create(CreateFormDto body, RequestOptions options) {
        Operation op = new Operation("POST", "/v1/apps/{appId}/forms");
        if (body == null) {
            throw new IllegalArgumentException("Pushizo: istek gövdesi null olamaz.");
        }
        op.body(body);
        return client.execute(op, options, TYPE_1);
    }

    private static final TypeReference<Form> TYPE_2 = new TypeReference<Form>() {};

    /**
     * Form detayı
     *
     * {@code GET /v1/apps/{appId}/forms/{formId}}
     */
    public Form get(String formId) {
        return get(formId, null);
    }

    /**
     * Form detayı
     *
     * {@code GET /v1/apps/{appId}/forms/{formId}}
     */
    public Form get(String formId, RequestOptions options) {
        Operation op = new Operation("GET", "/v1/apps/{appId}/forms/{formId}");
        op.pathParam("formId", formId);
        return client.execute(op, options, TYPE_2);
    }

    private static final TypeReference<Form> TYPE_3 = new TypeReference<Form>() {};

    /**
     * Formu düzenle
     *
     * {@code PATCH /v1/apps/{appId}/forms/{formId}}
     */
    public Form update(String formId, UpdateFormDto body) {
        return update(formId, body, null);
    }

    /**
     * Formu düzenle
     *
     * {@code PATCH /v1/apps/{appId}/forms/{formId}}
     */
    public Form update(String formId, UpdateFormDto body, RequestOptions options) {
        Operation op = new Operation("PATCH", "/v1/apps/{appId}/forms/{formId}");
        op.pathParam("formId", formId);
        if (body == null) {
            throw new IllegalArgumentException("Pushizo: istek gövdesi null olamaz.");
        }
        op.body(body);
        return client.execute(op, options, TYPE_3);
    }

    private static final TypeReference<Ok> TYPE_4 = new TypeReference<Ok>() {};

    /**
     * Formu sil (gönderimleriyle birlikte)
     *
     * {@code DELETE /v1/apps/{appId}/forms/{formId}}
     */
    public Ok delete(String formId) {
        return delete(formId, null);
    }

    /**
     * Formu sil (gönderimleriyle birlikte)
     *
     * {@code DELETE /v1/apps/{appId}/forms/{formId}}
     */
    public Ok delete(String formId, RequestOptions options) {
        Operation op = new Operation("DELETE", "/v1/apps/{appId}/forms/{formId}");
        op.pathParam("formId", formId);
        return client.execute(op, options, TYPE_4);
    }

    private static final TypeReference<FormSubmissionPage> TYPE_5 = new TypeReference<FormSubmissionPage>() {};

    /**
     * Form gönderimleri
     *
     * {@code GET /v1/apps/{appId}/forms/{formId}/submissions}
     */
    public FormSubmissionPage submissions(String formId) {
        return submissions(formId, null, null);
    }

    /**
     * Form gönderimleri
     *
     * {@code GET /v1/apps/{appId}/forms/{formId}/submissions}
     */
    public FormSubmissionPage submissions(String formId, FormsSubmissionsParams params) {
        return submissions(formId, params, null);
    }

    /**
     * Form gönderimleri
     *
     * {@code GET /v1/apps/{appId}/forms/{formId}/submissions}
     *
     * Parametreler: status — Değerler: "accepted", "pending_confirmation", "confirmed".
     */
    public FormSubmissionPage submissions(String formId, FormsSubmissionsParams params, RequestOptions options) {
        Operation op = new Operation("GET", "/v1/apps/{appId}/forms/{formId}/submissions");
        op.pathParam("formId", formId);
        if (params != null) {
            params.applyTo(op);
        }
        return client.execute(op, options, TYPE_5);
    }

    /**
     * submissions sonuçlarını next_cursor ile tüm sayfalar boyunca tek tek dolaşır (sayfalar tembel yüklenir).
     */
    public PageIterable<FormSubmission> submissionsAll(String formId) {
        return submissionsAll(formId, null, null);
    }

    /**
     * submissions sonuçlarını next_cursor ile tüm sayfalar boyunca tek tek dolaşır (sayfalar tembel yüklenir).
     */
    public PageIterable<FormSubmission> submissionsAll(String formId, FormsSubmissionsParams params) {
        return submissionsAll(formId, params, null);
    }

    /**
     * submissions sonuçlarını next_cursor ile tüm sayfalar boyunca tek tek dolaşır (sayfalar tembel yüklenir).
     */
    public PageIterable<FormSubmission> submissionsAll(String formId, FormsSubmissionsParams params, RequestOptions options) {
        FormsSubmissionsParams base = params == null ? new FormsSubmissionsParams() : params.copy();
        return new PageIterable<>(cursor -> {
            FormsSubmissionsParams p = base.copy();
            if (cursor != null) {
                p.cursor(cursor);
            }
            FormSubmissionPage page = submissions(formId, p, options);
            return new PageIterable.Page<>(page.getData(), page.getNextCursor(), Boolean.TRUE.equals(page.getHasMore()));
        });
    }

    private static final TypeReference<FormSubmitResult> TYPE_6 = new TypeReference<FormSubmitResult>() {};

    /**
     * Sunucu tarafı form gönderimi (`external_id` verilirse o kullanıcının profili güncellenir)
     *
     * {@code POST /v1/apps/{appId}/forms/{formId}/submissions}
     */
    public FormSubmitResult submit(String formId, PublicFormSubmitDto body) {
        return submit(formId, body, null);
    }

    /**
     * Sunucu tarafı form gönderimi (`external_id` verilirse o kullanıcının profili güncellenir)
     *
     * {@code POST /v1/apps/{appId}/forms/{formId}/submissions}
     */
    public FormSubmitResult submit(String formId, PublicFormSubmitDto body, RequestOptions options) {
        Operation op = new Operation("POST", "/v1/apps/{appId}/forms/{formId}/submissions");
        op.pathParam("formId", formId);
        if (body == null) {
            throw new IllegalArgumentException("Pushizo: istek gövdesi null olamaz.");
        }
        op.body(body);
        return client.execute(op, options, TYPE_6);
    }
}
