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
 * verify kaynağı.
 */
public final class VerifyResource {
    private final Pushizo client;

    public VerifyResource(Pushizo client) {
        this.client = client;
    }

    private static final TypeReference<SmsVerification> TYPE_0 = new TypeReference<SmsVerification>() {};

    /**
     * SMS doğrulama kodu gönder
     *
     * {@code POST /v1/apps/{appId}/verify/sms}
     */
    public SmsVerification start(StartVerifyDto body) {
        return start(body, null);
    }

    /**
     * SMS doğrulama kodu gönder
     *
     * {@code POST /v1/apps/{appId}/verify/sms}
     */
    public SmsVerification start(StartVerifyDto body, RequestOptions options) {
        Operation op = new Operation("POST", "/v1/apps/{appId}/verify/sms");
        if (body == null) {
            throw new IllegalArgumentException("Pushizo: istek gövdesi null olamaz.");
        }
        op.body(body);
        return client.execute(op, options, TYPE_0);
    }

    private static final TypeReference<SmsVerificationCheck> TYPE_1 = new TypeReference<SmsVerificationCheck>() {};

    /**
     * SMS doğrulama kodunu kontrol et
     *
     * {@code POST /v1/apps/{appId}/verify/sms/check}
     */
    public SmsVerificationCheck check(CheckVerifyDto body) {
        return check(body, null);
    }

    /**
     * SMS doğrulama kodunu kontrol et
     *
     * {@code POST /v1/apps/{appId}/verify/sms/check}
     */
    public SmsVerificationCheck check(CheckVerifyDto body, RequestOptions options) {
        Operation op = new Operation("POST", "/v1/apps/{appId}/verify/sms/check");
        if (body == null) {
            throw new IllegalArgumentException("Pushizo: istek gövdesi null olamaz.");
        }
        op.body(body);
        return client.execute(op, options, TYPE_1);
    }
}
