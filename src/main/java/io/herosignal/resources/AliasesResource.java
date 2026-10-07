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
 * Kullanıcı kimlikleri (alias): ekleme ve kaldırma.
 */
public final class AliasesResource {
    private final HeroSignal client;

    public AliasesResource(HeroSignal client) {
        this.client = client;
    }

    private static final TypeReference<UserDetail> TYPE_0 = new TypeReference<UserDetail>() {};

    /**
     * Alias ekle
     *
     * {@code PATCH /v1/apps/{appId}/users/by/{label}/{value}/identity}
     */
    public UserDetail add(String label, String value, AddAliasDto body) {
        return add(label, value, body, null);
    }

    /**
     * Alias ekle
     *
     * {@code PATCH /v1/apps/{appId}/users/by/{label}/{value}/identity}
     */
    public UserDetail add(String label, String value, AddAliasDto body, RequestOptions options) {
        Operation op = new Operation("PATCH", "/v1/apps/{appId}/users/by/{label}/{value}/identity");
        op.pathParam("label", label);
        op.pathParam("value", value);
        if (body == null) {
            throw new IllegalArgumentException("HeroSignal: istek gövdesi null olamaz.");
        }
        op.body(body);
        return client.execute(op, options, TYPE_0);
    }

    private static final TypeReference<UserDetail> TYPE_1 = new TypeReference<UserDetail>() {};

    /**
     * Alias kaldır
     *
     * {@code DELETE /v1/apps/{appId}/users/by/{label}/{value}/identity/{aliasLabel}}
     */
    public UserDetail delete(String label, String value, String aliasLabel) {
        return delete(label, value, aliasLabel, null);
    }

    /**
     * Alias kaldır
     *
     * {@code DELETE /v1/apps/{appId}/users/by/{label}/{value}/identity/{aliasLabel}}
     */
    public UserDetail delete(String label, String value, String aliasLabel, RequestOptions options) {
        Operation op = new Operation("DELETE", "/v1/apps/{appId}/users/by/{label}/{value}/identity/{aliasLabel}");
        op.pathParam("label", label);
        op.pathParam("value", value);
        op.pathParam("aliasLabel", aliasLabel);
        return client.execute(op, options, TYPE_1);
    }
}
