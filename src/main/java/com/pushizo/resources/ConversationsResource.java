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
 * conversations kaynağı.
 */
public final class ConversationsResource {
    private final Pushizo client;

    public ConversationsResource(Pushizo client) {
        this.client = client;
    }

    private static final TypeReference<ConversationPage> TYPE_0 = new TypeReference<ConversationPage>() {};

    /**
     * Konuşmalar (SMS, WhatsApp, RCS, e-posta, canlı sohbet; son mesaja göre; kanal/durum/okunmamış/atanan/takım/kişi filtresi)
     *
     * {@code GET /v1/apps/{appId}/conversations}
     */
    public ConversationPage list() {
        return list(null, null);
    }

    /**
     * Konuşmalar (SMS, WhatsApp, RCS, e-posta, canlı sohbet; son mesaja göre; kanal/durum/okunmamış/atanan/takım/kişi filtresi)
     *
     * {@code GET /v1/apps/{appId}/conversations}
     */
    public ConversationPage list(ConversationsListParams params) {
        return list(params, null);
    }

    /**
     * Konuşmalar (SMS, WhatsApp, RCS, e-posta, canlı sohbet; son mesaja göre; kanal/durum/okunmamış/atanan/takım/kişi filtresi)
     *
     * {@code GET /v1/apps/{appId}/conversations}
     *
     * Parametreler: channel — Değerler: "sms", "whatsapp", "rcs", "telegram", "viber", "email", "chat".; status — Değerler: "open", "pending", "resolved", "closed".; unread — Değerler: "true", "false".
     */
    public ConversationPage list(ConversationsListParams params, RequestOptions options) {
        Operation op = new Operation("GET", "/v1/apps/{appId}/conversations");
        if (params != null) {
            params.applyTo(op);
        }
        return client.execute(op, options, TYPE_0);
    }

    /**
     * list sonuçlarını next_cursor ile tüm sayfalar boyunca tek tek dolaşır (sayfalar tembel yüklenir).
     */
    public PageIterable<Conversation> listAll() {
        return listAll(null, null);
    }

    /**
     * list sonuçlarını next_cursor ile tüm sayfalar boyunca tek tek dolaşır (sayfalar tembel yüklenir).
     */
    public PageIterable<Conversation> listAll(ConversationsListParams params) {
        return listAll(params, null);
    }

    /**
     * list sonuçlarını next_cursor ile tüm sayfalar boyunca tek tek dolaşır (sayfalar tembel yüklenir).
     */
    public PageIterable<Conversation> listAll(ConversationsListParams params, RequestOptions options) {
        ConversationsListParams base = params == null ? new ConversationsListParams() : params.copy();
        return new PageIterable<>(cursor -> {
            ConversationsListParams p = base.copy();
            if (cursor != null) {
                p.cursor(cursor);
            }
            ConversationPage page = list(p, options);
            return new PageIterable.Page<>(page.getData(), page.getNextCursor(), Boolean.TRUE.equals(page.getHasMore()));
        });
    }

    private static final TypeReference<Conversation> TYPE_1 = new TypeReference<Conversation>() {};

    /**
     * Konuşma (atama, SLA, bot durumu, WhatsApp oturum penceresi ve açık rıza dahil)
     *
     * {@code GET /v1/apps/{appId}/conversations/{conversationId}}
     */
    public Conversation get(String conversationId) {
        return get(conversationId, null);
    }

    /**
     * Konuşma (atama, SLA, bot durumu, WhatsApp oturum penceresi ve açık rıza dahil)
     *
     * {@code GET /v1/apps/{appId}/conversations/{conversationId}}
     */
    public Conversation get(String conversationId, RequestOptions options) {
        Operation op = new Operation("GET", "/v1/apps/{appId}/conversations/{conversationId}");
        op.pathParam("conversationId", conversationId);
        return client.execute(op, options, TYPE_1);
    }

    private static final TypeReference<Conversation> TYPE_2 = new TypeReference<Conversation>() {};

    /**
     * Konuşma durumu: open / pending / resolved (closed = resolved)
     *
     * {@code PATCH /v1/apps/{appId}/conversations/{conversationId}}
     */
    public Conversation setStatus(String conversationId, ConversationUpdateDto body) {
        return setStatus(conversationId, body, null);
    }

    /**
     * Konuşma durumu: open / pending / resolved (closed = resolved)
     *
     * {@code PATCH /v1/apps/{appId}/conversations/{conversationId}}
     */
    public Conversation setStatus(String conversationId, ConversationUpdateDto body, RequestOptions options) {
        Operation op = new Operation("PATCH", "/v1/apps/{appId}/conversations/{conversationId}");
        op.pathParam("conversationId", conversationId);
        if (body == null) {
            throw new IllegalArgumentException("Pushizo: istek gövdesi null olamaz.");
        }
        op.body(body);
        return client.execute(op, options, TYPE_2);
    }

    private static final TypeReference<ConversationContact> TYPE_3 = new TypeReference<ConversationContact>() {};

    /**
     * Kişi profili: özellikler, etiketler, abonelikler (maskeli), son olaylar, diğer konuşmalar
     *
     * {@code GET /v1/apps/{appId}/conversations/{conversationId}/contact}
     */
    public ConversationContact contact(String conversationId) {
        return contact(conversationId, null);
    }

    /**
     * Kişi profili: özellikler, etiketler, abonelikler (maskeli), son olaylar, diğer konuşmalar
     *
     * {@code GET /v1/apps/{appId}/conversations/{conversationId}/contact}
     */
    public ConversationContact contact(String conversationId, RequestOptions options) {
        Operation op = new Operation("GET", "/v1/apps/{appId}/conversations/{conversationId}/contact");
        op.pathParam("conversationId", conversationId);
        return client.execute(op, options, TYPE_3);
    }

    private static final TypeReference<ConversationMessagePage> TYPE_4 = new TypeReference<ConversationMessagePage>() {};

    /**
     * Konuşma mesajları (yeniden eskiye; `after_seq` ile eskiden yeniye; giden mesaj durumu teslimattan veya okundu işaretçisinden)
     *
     * {@code GET /v1/apps/{appId}/conversations/{conversationId}/messages}
     */
    public ConversationMessagePage messages(String conversationId) {
        return messages(conversationId, null, null);
    }

    /**
     * Konuşma mesajları (yeniden eskiye; `after_seq` ile eskiden yeniye; giden mesaj durumu teslimattan veya okundu işaretçisinden)
     *
     * {@code GET /v1/apps/{appId}/conversations/{conversationId}/messages}
     */
    public ConversationMessagePage messages(String conversationId, ConversationsMessagesParams params) {
        return messages(conversationId, params, null);
    }

    /**
     * Konuşma mesajları (yeniden eskiye; `after_seq` ile eskiden yeniye; giden mesaj durumu teslimattan veya okundu işaretçisinden)
     *
     * {@code GET /v1/apps/{appId}/conversations/{conversationId}/messages}
     */
    public ConversationMessagePage messages(String conversationId, ConversationsMessagesParams params, RequestOptions options) {
        Operation op = new Operation("GET", "/v1/apps/{appId}/conversations/{conversationId}/messages");
        op.pathParam("conversationId", conversationId);
        if (params != null) {
            params.applyTo(op);
        }
        return client.execute(op, options, TYPE_4);
    }

    /**
     * messages sonuçlarını next_cursor ile tüm sayfalar boyunca tek tek dolaşır (sayfalar tembel yüklenir).
     */
    public PageIterable<ConversationMessagePageDataItem> messagesAll(String conversationId) {
        return messagesAll(conversationId, null, null);
    }

    /**
     * messages sonuçlarını next_cursor ile tüm sayfalar boyunca tek tek dolaşır (sayfalar tembel yüklenir).
     */
    public PageIterable<ConversationMessagePageDataItem> messagesAll(String conversationId, ConversationsMessagesParams params) {
        return messagesAll(conversationId, params, null);
    }

    /**
     * messages sonuçlarını next_cursor ile tüm sayfalar boyunca tek tek dolaşır (sayfalar tembel yüklenir).
     */
    public PageIterable<ConversationMessagePageDataItem> messagesAll(String conversationId, ConversationsMessagesParams params, RequestOptions options) {
        ConversationsMessagesParams base = params == null ? new ConversationsMessagesParams() : params.copy();
        return new PageIterable<>(cursor -> {
            ConversationsMessagesParams p = base.copy();
            if (cursor != null) {
                p.cursor(cursor);
            }
            ConversationMessagePage page = messages(conversationId, p, options);
            return new PageIterable.Page<>(page.getData(), page.getNextCursor(), Boolean.TRUE.equals(page.getHasMore()));
        });
    }

    private static final TypeReference<ConversationReplyResult> TYPE_5 = new TypeReference<ConversationReplyResult>() {};

    /**
     * Yanıt gönder (client_message_id ile tekilleşir). Sohbet: doğrudan; e-posta: yanıt adresli işlemsel e-posta; WhatsApp: açık rıza zorunlu, son gelen mesajdan 24 saat içinde metin/medya, pencere dışında yalnızca onaylı şablon (aksi 422 WHATSAPP_WINDOW_CLOSED).
     *
     * {@code POST /v1/apps/{appId}/conversations/{conversationId}/messages}
     */
    public ConversationReplyResult reply(String conversationId, ConversationReplyDto body) {
        return reply(conversationId, body, null);
    }

    /**
     * Yanıt gönder (client_message_id ile tekilleşir). Sohbet: doğrudan; e-posta: yanıt adresli işlemsel e-posta; WhatsApp: açık rıza zorunlu, son gelen mesajdan 24 saat içinde metin/medya, pencere dışında yalnızca onaylı şablon (aksi 422 WHATSAPP_WINDOW_CLOSED).
     *
     * {@code POST /v1/apps/{appId}/conversations/{conversationId}/messages}
     */
    public ConversationReplyResult reply(String conversationId, ConversationReplyDto body, RequestOptions options) {
        Operation op = new Operation("POST", "/v1/apps/{appId}/conversations/{conversationId}/messages");
        op.pathParam("conversationId", conversationId);
        if (body == null) {
            throw new IllegalArgumentException("Pushizo: istek gövdesi null olamaz.");
        }
        op.body(body);
        return client.execute(op, options, TYPE_5);
    }

    private static final TypeReference<Conversation> TYPE_6 = new TypeReference<Conversation>() {};

    /**
     * Gelen mesajları okundu işaretle (sohbette ziyaretçiye okundu bilgisi gider)
     *
     * {@code POST /v1/apps/{appId}/conversations/{conversationId}/read}
     */
    public Conversation read(String conversationId) {
        return read(conversationId, null);
    }

    /**
     * Gelen mesajları okundu işaretle (sohbette ziyaretçiye okundu bilgisi gider)
     *
     * {@code POST /v1/apps/{appId}/conversations/{conversationId}/read}
     */
    public Conversation read(String conversationId, RequestOptions options) {
        Operation op = new Operation("POST", "/v1/apps/{appId}/conversations/{conversationId}/read");
        op.pathParam("conversationId", conversationId);
        return client.execute(op, options, TYPE_6);
    }

    private static final TypeReference<Conversation> TYPE_7 = new TypeReference<Conversation>() {};

    /**
     * Konuşmayı temsilciye ve/veya takıma ata (inbox.manage olmadan yalnızca kendine)
     *
     * {@code POST /v1/apps/{appId}/conversations/{conversationId}/assign}
     */
    public Conversation assign(String conversationId, ConversationAssignDto body) {
        return assign(conversationId, body, null);
    }

    /**
     * Konuşmayı temsilciye ve/veya takıma ata (inbox.manage olmadan yalnızca kendine)
     *
     * {@code POST /v1/apps/{appId}/conversations/{conversationId}/assign}
     */
    public Conversation assign(String conversationId, ConversationAssignDto body, RequestOptions options) {
        Operation op = new Operation("POST", "/v1/apps/{appId}/conversations/{conversationId}/assign");
        op.pathParam("conversationId", conversationId);
        if (body == null) {
            throw new IllegalArgumentException("Pushizo: istek gövdesi null olamaz.");
        }
        op.body(body);
        return client.execute(op, options, TYPE_7);
    }

    private static final TypeReference<ConversationTagsResult> TYPE_8 = new TypeReference<ConversationTagsResult>() {};

    /**
     * Sohbetten kişiye etiket ekle/kaldır
     *
     * {@code POST /v1/apps/{appId}/conversations/{conversationId}/tags}
     */
    public ConversationTagsResult tags(String conversationId, ConversationTagsDto body) {
        return tags(conversationId, body, null);
    }

    /**
     * Sohbetten kişiye etiket ekle/kaldır
     *
     * {@code POST /v1/apps/{appId}/conversations/{conversationId}/tags}
     */
    public ConversationTagsResult tags(String conversationId, ConversationTagsDto body, RequestOptions options) {
        Operation op = new Operation("POST", "/v1/apps/{appId}/conversations/{conversationId}/tags");
        op.pathParam("conversationId", conversationId);
        if (body == null) {
            throw new IllegalArgumentException("Pushizo: istek gövdesi null olamaz.");
        }
        op.body(body);
        return client.execute(op, options, TYPE_8);
    }

    private static final TypeReference<ConversationActivity> TYPE_9 = new TypeReference<ConversationActivity>() {};

    /**
     * Konuşma zaman çizelgesi (atama, durum, ilk yanıt, bot devri)
     *
     * {@code GET /v1/apps/{appId}/conversations/{conversationId}/activity}
     */
    public ConversationActivity activity(String conversationId) {
        return activity(conversationId, null);
    }

    /**
     * Konuşma zaman çizelgesi (atama, durum, ilk yanıt, bot devri)
     *
     * {@code GET /v1/apps/{appId}/conversations/{conversationId}/activity}
     */
    public ConversationActivity activity(String conversationId, RequestOptions options) {
        Operation op = new Operation("GET", "/v1/apps/{appId}/conversations/{conversationId}/activity");
        op.pathParam("conversationId", conversationId);
        return client.execute(op, options, TYPE_9);
    }
}
