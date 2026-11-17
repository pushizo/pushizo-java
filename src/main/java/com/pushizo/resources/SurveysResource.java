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
 * surveys kaynağı.
 */
public final class SurveysResource {
    private final Pushizo client;

    public SurveysResource(Pushizo client) {
        this.client = client;
    }

    private static final TypeReference<SurveyPage> TYPE_0 = new TypeReference<SurveyPage>() {};

    /**
     * Anketler
     *
     * {@code GET /v1/apps/{appId}/surveys}
     */
    public SurveyPage list() {
        return list(null, null);
    }

    /**
     * Anketler
     *
     * {@code GET /v1/apps/{appId}/surveys}
     */
    public SurveyPage list(SurveysListParams params) {
        return list(params, null);
    }

    /**
     * Anketler
     *
     * {@code GET /v1/apps/{appId}/surveys}
     *
     * Parametreler: status — Değerler: "draft", "active", "closed".
     */
    public SurveyPage list(SurveysListParams params, RequestOptions options) {
        Operation op = new Operation("GET", "/v1/apps/{appId}/surveys");
        if (params != null) {
            params.applyTo(op);
        }
        return client.execute(op, options, TYPE_0);
    }

    /**
     * list sonuçlarını next_cursor ile tüm sayfalar boyunca tek tek dolaşır (sayfalar tembel yüklenir).
     */
    public PageIterable<Survey> listAll() {
        return listAll(null, null);
    }

    /**
     * list sonuçlarını next_cursor ile tüm sayfalar boyunca tek tek dolaşır (sayfalar tembel yüklenir).
     */
    public PageIterable<Survey> listAll(SurveysListParams params) {
        return listAll(params, null);
    }

    /**
     * list sonuçlarını next_cursor ile tüm sayfalar boyunca tek tek dolaşır (sayfalar tembel yüklenir).
     */
    public PageIterable<Survey> listAll(SurveysListParams params, RequestOptions options) {
        SurveysListParams base = params == null ? new SurveysListParams() : params.copy();
        return new PageIterable<>(cursor -> {
            SurveysListParams p = base.copy();
            if (cursor != null) {
                p.cursor(cursor);
            }
            SurveyPage page = list(p, options);
            return new PageIterable.Page<>(page.getData(), page.getNextCursor(), Boolean.TRUE.equals(page.getHasMore()));
        });
    }

    private static final TypeReference<Survey> TYPE_1 = new TypeReference<Survey>() {};

    /**
     * Anket oluştur (taslak)
     *
     * {@code POST /v1/apps/{appId}/surveys}
     */
    public Survey create(CreateSurveyDto body) {
        return create(body, null);
    }

    /**
     * Anket oluştur (taslak)
     *
     * {@code POST /v1/apps/{appId}/surveys}
     */
    public Survey create(CreateSurveyDto body, RequestOptions options) {
        Operation op = new Operation("POST", "/v1/apps/{appId}/surveys");
        if (body == null) {
            throw new IllegalArgumentException("Pushizo: istek gövdesi null olamaz.");
        }
        op.body(body);
        return client.execute(op, options, TYPE_1);
    }

    private static final TypeReference<Survey> TYPE_2 = new TypeReference<Survey>() {};

    /**
     * Anket detayı
     *
     * {@code GET /v1/apps/{appId}/surveys/{surveyId}}
     */
    public Survey get(String surveyId) {
        return get(surveyId, null);
    }

    /**
     * Anket detayı
     *
     * {@code GET /v1/apps/{appId}/surveys/{surveyId}}
     */
    public Survey get(String surveyId, RequestOptions options) {
        Operation op = new Operation("GET", "/v1/apps/{appId}/surveys/{surveyId}");
        op.pathParam("surveyId", surveyId);
        return client.execute(op, options, TYPE_2);
    }

    private static final TypeReference<Survey> TYPE_3 = new TypeReference<Survey>() {};

    /**
     * Anketi düzenle (bağlı in-app mesajı yenilenir)
     *
     * {@code PATCH /v1/apps/{appId}/surveys/{surveyId}}
     */
    public Survey update(String surveyId, UpdateSurveyDto body) {
        return update(surveyId, body, null);
    }

    /**
     * Anketi düzenle (bağlı in-app mesajı yenilenir)
     *
     * {@code PATCH /v1/apps/{appId}/surveys/{surveyId}}
     */
    public Survey update(String surveyId, UpdateSurveyDto body, RequestOptions options) {
        Operation op = new Operation("PATCH", "/v1/apps/{appId}/surveys/{surveyId}");
        op.pathParam("surveyId", surveyId);
        if (body == null) {
            throw new IllegalArgumentException("Pushizo: istek gövdesi null olamaz.");
        }
        op.body(body);
        return client.execute(op, options, TYPE_3);
    }

    private static final TypeReference<Ok> TYPE_4 = new TypeReference<Ok>() {};

    /**
     * Anketi sil (yanıtları ve bağlı in-app mesajıyla birlikte)
     *
     * {@code DELETE /v1/apps/{appId}/surveys/{surveyId}}
     */
    public Ok delete(String surveyId) {
        return delete(surveyId, null);
    }

    /**
     * Anketi sil (yanıtları ve bağlı in-app mesajıyla birlikte)
     *
     * {@code DELETE /v1/apps/{appId}/surveys/{surveyId}}
     */
    public Ok delete(String surveyId, RequestOptions options) {
        Operation op = new Operation("DELETE", "/v1/apps/{appId}/surveys/{surveyId}");
        op.pathParam("surveyId", surveyId);
        return client.execute(op, options, TYPE_4);
    }

    private static final TypeReference<Survey> TYPE_5 = new TypeReference<Survey>() {};

    /**
     * Etkinleştir / kapat
     *
     * {@code POST /v1/apps/{appId}/surveys/{surveyId}/status}
     */
    public Survey status(String surveyId, SurveyStatusDto body) {
        return status(surveyId, body, null);
    }

    /**
     * Etkinleştir / kapat
     *
     * {@code POST /v1/apps/{appId}/surveys/{surveyId}/status}
     */
    public Survey status(String surveyId, SurveyStatusDto body, RequestOptions options) {
        Operation op = new Operation("POST", "/v1/apps/{appId}/surveys/{surveyId}/status");
        op.pathParam("surveyId", surveyId);
        if (body == null) {
            throw new IllegalArgumentException("Pushizo: istek gövdesi null olamaz.");
        }
        op.body(body);
        return client.execute(op, options, TYPE_5);
    }

    private static final TypeReference<SurveyReport> TYPE_6 = new TypeReference<SurveyReport>() {};

    /**
     * NPS / CSAT raporu
     *
     * {@code GET /v1/apps/{appId}/surveys/{surveyId}/report}
     */
    public SurveyReport report(String surveyId) {
        return report(surveyId, null, null);
    }

    /**
     * NPS / CSAT raporu
     *
     * {@code GET /v1/apps/{appId}/surveys/{surveyId}/report}
     */
    public SurveyReport report(String surveyId, SurveysReportParams params) {
        return report(surveyId, params, null);
    }

    /**
     * NPS / CSAT raporu
     *
     * {@code GET /v1/apps/{appId}/surveys/{surveyId}/report}
     */
    public SurveyReport report(String surveyId, SurveysReportParams params, RequestOptions options) {
        Operation op = new Operation("GET", "/v1/apps/{appId}/surveys/{surveyId}/report");
        op.pathParam("surveyId", surveyId);
        if (params != null) {
            params.applyTo(op);
        }
        return client.execute(op, options, TYPE_6);
    }

    private static final TypeReference<SurveyResponsePage> TYPE_7 = new TypeReference<SurveyResponsePage>() {};

    /**
     * Anket yanıtları
     *
     * {@code GET /v1/apps/{appId}/surveys/{surveyId}/responses}
     */
    public SurveyResponsePage responses(String surveyId) {
        return responses(surveyId, null, null);
    }

    /**
     * Anket yanıtları
     *
     * {@code GET /v1/apps/{appId}/surveys/{surveyId}/responses}
     */
    public SurveyResponsePage responses(String surveyId, SurveysResponsesParams params) {
        return responses(surveyId, params, null);
    }

    /**
     * Anket yanıtları
     *
     * {@code GET /v1/apps/{appId}/surveys/{surveyId}/responses}
     *
     * Parametreler: nps_category — Değerler: "promoter", "passive", "detractor".
     */
    public SurveyResponsePage responses(String surveyId, SurveysResponsesParams params, RequestOptions options) {
        Operation op = new Operation("GET", "/v1/apps/{appId}/surveys/{surveyId}/responses");
        op.pathParam("surveyId", surveyId);
        if (params != null) {
            params.applyTo(op);
        }
        return client.execute(op, options, TYPE_7);
    }

    /**
     * responses sonuçlarını next_cursor ile tüm sayfalar boyunca tek tek dolaşır (sayfalar tembel yüklenir).
     */
    public PageIterable<SurveyResponse> responsesAll(String surveyId) {
        return responsesAll(surveyId, null, null);
    }

    /**
     * responses sonuçlarını next_cursor ile tüm sayfalar boyunca tek tek dolaşır (sayfalar tembel yüklenir).
     */
    public PageIterable<SurveyResponse> responsesAll(String surveyId, SurveysResponsesParams params) {
        return responsesAll(surveyId, params, null);
    }

    /**
     * responses sonuçlarını next_cursor ile tüm sayfalar boyunca tek tek dolaşır (sayfalar tembel yüklenir).
     */
    public PageIterable<SurveyResponse> responsesAll(String surveyId, SurveysResponsesParams params, RequestOptions options) {
        SurveysResponsesParams base = params == null ? new SurveysResponsesParams() : params.copy();
        return new PageIterable<>(cursor -> {
            SurveysResponsesParams p = base.copy();
            if (cursor != null) {
                p.cursor(cursor);
            }
            SurveyResponsePage page = responses(surveyId, p, options);
            return new PageIterable.Page<>(page.getData(), page.getNextCursor(), Boolean.TRUE.equals(page.getHasMore()));
        });
    }

    private static final TypeReference<SurveyResponseResult> TYPE_8 = new TypeReference<SurveyResponseResult>() {};

    /**
     * Sunucu tarafı anket yanıtı (`external_id` ile kullanıcıya bağlanır)
     *
     * {@code POST /v1/apps/{appId}/surveys/{surveyId}/responses}
     */
    public SurveyResponseResult respond(String surveyId, PublicSurveyResponseDto body) {
        return respond(surveyId, body, null);
    }

    /**
     * Sunucu tarafı anket yanıtı (`external_id` ile kullanıcıya bağlanır)
     *
     * {@code POST /v1/apps/{appId}/surveys/{surveyId}/responses}
     */
    public SurveyResponseResult respond(String surveyId, PublicSurveyResponseDto body, RequestOptions options) {
        Operation op = new Operation("POST", "/v1/apps/{appId}/surveys/{surveyId}/responses");
        op.pathParam("surveyId", surveyId);
        if (body == null) {
            throw new IllegalArgumentException("Pushizo: istek gövdesi null olamaz.");
        }
        op.body(body);
        return client.execute(op, options, TYPE_8);
    }
}
