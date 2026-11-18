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
 * Özel olay gönderimi ve olay tanımları.
 */
public final class EventsResource {
    private final Pushizo client;

    public EventsResource(Pushizo client) {
        this.client = client;
    }

    private static final TypeReference<EventsAccepted> TYPE_0 = new TypeReference<EventsAccepted>() {};

    /**
     * Toplu olay gönder (en fazla 500)
     *
     * {@code POST /v1/apps/{appId}/events}
     */
    public EventsAccepted send(ApiEventsDto body) {
        return send(body, null);
    }

    /**
     * Toplu olay gönder (en fazla 500)
     *
     * {@code POST /v1/apps/{appId}/events}
     */
    public EventsAccepted send(ApiEventsDto body, RequestOptions options) {
        Operation op = new Operation("POST", "/v1/apps/{appId}/events");
        if (body == null) {
            throw new IllegalArgumentException("Pushizo: istek gövdesi null olamaz.");
        }
        op.body(body);
        return client.execute(op, options, TYPE_0);
    }

    private static final TypeReference<EventDefinitionList> TYPE_1 = new TypeReference<EventDefinitionList>() {};

    /**
     * Olay tanımları
     *
     * {@code GET /v1/apps/{appId}/events/definitions}
     */
    public EventDefinitionList listDefinitions() {
        return listDefinitions(null, null);
    }

    /**
     * Olay tanımları
     *
     * {@code GET /v1/apps/{appId}/events/definitions}
     */
    public EventDefinitionList listDefinitions(EventsListDefinitionsParams params) {
        return listDefinitions(params, null);
    }

    /**
     * Olay tanımları
     *
     * {@code GET /v1/apps/{appId}/events/definitions}
     */
    public EventDefinitionList listDefinitions(EventsListDefinitionsParams params, RequestOptions options) {
        Operation op = new Operation("GET", "/v1/apps/{appId}/events/definitions");
        if (params != null) {
            params.applyTo(op);
        }
        return client.execute(op, options, TYPE_1);
    }

    /**
     * listDefinitions sonuçlarını next_cursor ile tüm sayfalar boyunca tek tek dolaşır (sayfalar tembel yüklenir).
     */
    public PageIterable<EventDefinition> listDefinitionsAll() {
        return listDefinitionsAll(null, null);
    }

    /**
     * listDefinitions sonuçlarını next_cursor ile tüm sayfalar boyunca tek tek dolaşır (sayfalar tembel yüklenir).
     */
    public PageIterable<EventDefinition> listDefinitionsAll(EventsListDefinitionsParams params) {
        return listDefinitionsAll(params, null);
    }

    /**
     * listDefinitions sonuçlarını next_cursor ile tüm sayfalar boyunca tek tek dolaşır (sayfalar tembel yüklenir).
     */
    public PageIterable<EventDefinition> listDefinitionsAll(EventsListDefinitionsParams params, RequestOptions options) {
        EventsListDefinitionsParams base = params == null ? new EventsListDefinitionsParams() : params.copy();
        return new PageIterable<>(cursor -> {
            EventsListDefinitionsParams p = base.copy();
            if (cursor != null) {
                p.cursor(cursor);
            }
            EventDefinitionList page = listDefinitions(p, options);
            return new PageIterable.Page<>(page.getData(), page.getNextCursor(), Boolean.TRUE.equals(page.getHasMore()));
        });
    }

    private static final TypeReference<EventDefinitionDetail> TYPE_2 = new TypeReference<EventDefinitionDetail>() {};

    /**
     * Olay detayı
     *
     * {@code GET /v1/apps/{appId}/events/definitions/{name}}
     */
    public EventDefinitionDetail getDefinition(String name) {
        return getDefinition(name, null);
    }

    /**
     * Olay detayı
     *
     * {@code GET /v1/apps/{appId}/events/definitions/{name}}
     */
    public EventDefinitionDetail getDefinition(String name, RequestOptions options) {
        Operation op = new Operation("GET", "/v1/apps/{appId}/events/definitions/{name}");
        op.pathParam("name", name);
        return client.execute(op, options, TYPE_2);
    }

    private static final TypeReference<EventDefinition> TYPE_3 = new TypeReference<EventDefinition>() {};

    /**
     * Görünen ad / dönüşüm işareti
     *
     * {@code PATCH /v1/apps/{appId}/events/definitions/{name}}
     */
    public EventDefinition updateDefinition(String name, PatchEventDefinitionDto body) {
        return updateDefinition(name, body, null);
    }

    /**
     * Görünen ad / dönüşüm işareti
     *
     * {@code PATCH /v1/apps/{appId}/events/definitions/{name}}
     */
    public EventDefinition updateDefinition(String name, PatchEventDefinitionDto body, RequestOptions options) {
        Operation op = new Operation("PATCH", "/v1/apps/{appId}/events/definitions/{name}");
        op.pathParam("name", name);
        if (body == null) {
            throw new IllegalArgumentException("Pushizo: istek gövdesi null olamaz.");
        }
        op.body(body);
        return client.execute(op, options, TYPE_3);
    }

    private static final TypeReference<RecentEvents> TYPE_4 = new TypeReference<RecentEvents>() {};

    /**
     * Son olaylar (kullanıcı kimliği ve özelliklerle; ad ve zaman filtresi)
     *
     * {@code GET /v1/apps/{appId}/events/recent}
     */
    public RecentEvents recent() {
        return recent(null, null);
    }

    /**
     * Son olaylar (kullanıcı kimliği ve özelliklerle; ad ve zaman filtresi)
     *
     * {@code GET /v1/apps/{appId}/events/recent}
     */
    public RecentEvents recent(EventsRecentParams params) {
        return recent(params, null);
    }

    /**
     * Son olaylar (kullanıcı kimliği ve özelliklerle; ad ve zaman filtresi)
     *
     * {@code GET /v1/apps/{appId}/events/recent}
     */
    public RecentEvents recent(EventsRecentParams params, RequestOptions options) {
        Operation op = new Operation("GET", "/v1/apps/{appId}/events/recent");
        if (params != null) {
            params.applyTo(op);
        }
        return client.execute(op, options, TYPE_4);
    }
}
