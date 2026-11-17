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
 * messengerLinks kaynağı.
 */
public final class MessengerLinksResource {
    private final Pushizo client;

    public MessengerLinksResource(Pushizo client) {
        this.client = client;
    }

    private static final TypeReference<MessengerLink> TYPE_0 = new TypeReference<MessengerLink>() {};

    /**
     * Telegram/Viber abonelik bağlama derin bağlantısı (tek kullanımlık belirteç; kullanıcı bota yazınca sohbet kimliği bu kullanıcıya abonelik olarak bağlanır)
     *
     * {@code POST /v1/apps/{appId}/messenger-links}
     */
    public MessengerLink create(CreateMessengerLinkDto body) {
        return create(body, null);
    }

    /**
     * Telegram/Viber abonelik bağlama derin bağlantısı (tek kullanımlık belirteç; kullanıcı bota yazınca sohbet kimliği bu kullanıcıya abonelik olarak bağlanır)
     *
     * {@code POST /v1/apps/{appId}/messenger-links}
     */
    public MessengerLink create(CreateMessengerLinkDto body, RequestOptions options) {
        Operation op = new Operation("POST", "/v1/apps/{appId}/messenger-links");
        if (body == null) {
            throw new IllegalArgumentException("Pushizo: istek gövdesi null olamaz.");
        }
        op.body(body);
        return client.execute(op, options, TYPE_0);
    }
}
