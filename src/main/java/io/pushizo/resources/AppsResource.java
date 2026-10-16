// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package io.pushizo.resources;

import com.fasterxml.jackson.core.type.TypeReference;
import io.pushizo.Pushizo;
import io.pushizo.RequestOptions;
import io.pushizo.core.Operation;
import io.pushizo.core.PageIterable;
import io.pushizo.models.*;
import io.pushizo.params.*;

/**
 * App listesi ve ayarları.
 */
public final class AppsResource {
    private final Pushizo client;

    public AppsResource(Pushizo client) {
        this.client = client;
    }

    private static final TypeReference<AppList> TYPE_0 = new TypeReference<AppList>() {};

    /**
     * App listesi (org geneli admin anahtarı)
     *
     * {@code GET /v1/apps}
     */
    public AppList list() {
        return list(null);
    }

    /**
     * App listesi (org geneli admin anahtarı)
     *
     * {@code GET /v1/apps}
     */
    public AppList list(RequestOptions options) {
        Operation op = new Operation("GET", "/v1/apps");
        return client.execute(op, options, TYPE_0);
    }

    private static final TypeReference<App> TYPE_1 = new TypeReference<App>() {};

    /**
     * App oluştur (org geneli admin anahtarı)
     *
     * {@code POST /v1/apps}
     */
    public App create(CreateAppDto body) {
        return create(body, null);
    }

    /**
     * App oluştur (org geneli admin anahtarı)
     *
     * {@code POST /v1/apps}
     */
    public App create(CreateAppDto body, RequestOptions options) {
        Operation op = new Operation("POST", "/v1/apps");
        if (body == null) {
            throw new IllegalArgumentException("Pushizo: istek gövdesi null olamaz.");
        }
        op.body(body);
        return client.execute(op, options, TYPE_1);
    }

    private static final TypeReference<App> TYPE_2 = new TypeReference<App>() {};

    /**
     * App detayı
     *
     * {@code GET /v1/apps/{appId}}
     */
    public App get() {
        return get(null);
    }

    /**
     * App detayı
     *
     * {@code GET /v1/apps/{appId}}
     */
    public App get(RequestOptions options) {
        Operation op = new Operation("GET", "/v1/apps/{appId}");
        return client.execute(op, options, TYPE_2);
    }

    private static final TypeReference<App> TYPE_3 = new TypeReference<App>() {};

    /**
     * App ayarlarını güncelle
     *
     * {@code PATCH /v1/apps/{appId}}
     */
    public App update(UpdateAppDto body) {
        return update(body, null);
    }

    /**
     * App ayarlarını güncelle
     *
     * {@code PATCH /v1/apps/{appId}}
     */
    public App update(UpdateAppDto body, RequestOptions options) {
        Operation op = new Operation("PATCH", "/v1/apps/{appId}");
        if (body == null) {
            throw new IllegalArgumentException("Pushizo: istek gövdesi null olamaz.");
        }
        op.body(body);
        return client.execute(op, options, TYPE_3);
    }
}
