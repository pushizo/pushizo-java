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
 * smsKeywords kaynağı.
 */
public final class SmsKeywordsResource {
    private final Pushizo client;

    public SmsKeywordsResource(Pushizo client) {
        this.client = client;
    }

    private static final TypeReference<SmsKeywordList> TYPE_0 = new TypeReference<SmsKeywordList>() {};

    /**
     * İki yönlü mesaj anahtar sözcükleri (org geneli + bu app) ve yasal (ayrılmış) sözcükler
     *
     * {@code GET /v1/apps/{appId}/sms-keywords}
     */
    public SmsKeywordList keywords() {
        return keywords(null);
    }

    /**
     * İki yönlü mesaj anahtar sözcükleri (org geneli + bu app) ve yasal (ayrılmış) sözcükler
     *
     * {@code GET /v1/apps/{appId}/sms-keywords}
     */
    public SmsKeywordList keywords(RequestOptions options) {
        Operation op = new Operation("GET", "/v1/apps/{appId}/sms-keywords");
        return client.execute(op, options, TYPE_0);
    }

    private static final TypeReference<SmsKeyword> TYPE_1 = new TypeReference<SmsKeyword>() {};

    /**
     * Anahtar sözcük oluştur (tag ekle/kaldır, olay → journey tetiği, otomatik yanıt, abonelik)
     *
     * {@code POST /v1/apps/{appId}/sms-keywords}
     */
    public SmsKeyword createKeyword(CreateKeywordDto body) {
        return createKeyword(body, null);
    }

    /**
     * Anahtar sözcük oluştur (tag ekle/kaldır, olay → journey tetiği, otomatik yanıt, abonelik)
     *
     * {@code POST /v1/apps/{appId}/sms-keywords}
     */
    public SmsKeyword createKeyword(CreateKeywordDto body, RequestOptions options) {
        Operation op = new Operation("POST", "/v1/apps/{appId}/sms-keywords");
        if (body == null) {
            throw new IllegalArgumentException("Pushizo: istek gövdesi null olamaz.");
        }
        op.body(body);
        return client.execute(op, options, TYPE_1);
    }

    private static final TypeReference<SmsKeyword> TYPE_2 = new TypeReference<SmsKeyword>() {};

    /**
     * Anahtar sözcüğü güncelle
     *
     * {@code PATCH /v1/apps/{appId}/sms-keywords/{keywordId}}
     */
    public SmsKeyword updateKeyword(String keywordId, UpdateKeywordDto body) {
        return updateKeyword(keywordId, body, null);
    }

    /**
     * Anahtar sözcüğü güncelle
     *
     * {@code PATCH /v1/apps/{appId}/sms-keywords/{keywordId}}
     */
    public SmsKeyword updateKeyword(String keywordId, UpdateKeywordDto body, RequestOptions options) {
        Operation op = new Operation("PATCH", "/v1/apps/{appId}/sms-keywords/{keywordId}");
        op.pathParam("keywordId", keywordId);
        if (body == null) {
            throw new IllegalArgumentException("Pushizo: istek gövdesi null olamaz.");
        }
        op.body(body);
        return client.execute(op, options, TYPE_2);
    }

    private static final TypeReference<Ok> TYPE_3 = new TypeReference<Ok>() {};

    /**
     * Anahtar sözcüğü sil
     *
     * {@code DELETE /v1/apps/{appId}/sms-keywords/{keywordId}}
     */
    public Ok deleteKeyword(String keywordId) {
        return deleteKeyword(keywordId, null);
    }

    /**
     * Anahtar sözcüğü sil
     *
     * {@code DELETE /v1/apps/{appId}/sms-keywords/{keywordId}}
     */
    public Ok deleteKeyword(String keywordId, RequestOptions options) {
        Operation op = new Operation("DELETE", "/v1/apps/{appId}/sms-keywords/{keywordId}");
        op.pathParam("keywordId", keywordId);
        return client.execute(op, options, TYPE_3);
    }
}
