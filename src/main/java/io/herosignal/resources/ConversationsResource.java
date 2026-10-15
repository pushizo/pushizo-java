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
 * conversations kaynağı.
 */
public final class ConversationsResource {
    private final HeroSignal client;

    public ConversationsResource(HeroSignal client) {
        this.client = client;
    }

    private static final TypeReference<ConversationPage> TYPE_0 = new TypeReference<ConversationPage>() {};

    /**
     * Konuşmalar (SMS, WhatsApp, RCS; son mesaja göre; kanal/durum/okunmamış/kişi filtresi)
     *
     * {@code GET /v1/apps/{appId}/conversations}
     */
    public ConversationPage list() {
        return list(null, null);
    }

    /**
     * Konuşmalar (SMS, WhatsApp, RCS; son mesaja göre; kanal/durum/okunmamış/kişi filtresi)
     *
     * {@code GET /v1/apps/{appId}/conversations}
     */
    public ConversationPage list(ConversationsListParams params) {
        return list(params, null);
    }

    /**
     * Konuşmalar (SMS, WhatsApp, RCS; son mesaja göre; kanal/durum/okunmamış/kişi filtresi)
     *
     * {@code GET /v1/apps/{appId}/conversations}
     *
     * Parametreler: channel — Değerler: "sms", "whatsapp", "rcs".; status — Değerler: "open", "closed".; unread — Değerler: "true", "false".
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
     * Konuşma (WhatsApp oturum penceresi ve açık rıza durumu dahil)
     *
     * {@code GET /v1/apps/{appId}/conversations/{conversationId}}
     */
    public Conversation get(String conversationId) {
        return get(conversationId, null);
    }

    /**
     * Konuşma (WhatsApp oturum penceresi ve açık rıza durumu dahil)
     *
     * {@code GET /v1/apps/{appId}/conversations/{conversationId}}
     */
    public Conversation get(String conversationId, RequestOptions options) {
        Operation op = new Operation("GET", "/v1/apps/{appId}/conversations/{conversationId}");
        op.pathParam("conversationId", conversationId);
        return client.execute(op, options, TYPE_1);
    }

    private static final TypeReference<ConversationMessagePage> TYPE_2 = new TypeReference<ConversationMessagePage>() {};

    /**
     * Konuşma mesajları (yeniden eskiye; giden mesaj durumu teslimattan)
     *
     * {@code GET /v1/apps/{appId}/conversations/{conversationId}/messages}
     */
    public ConversationMessagePage messages(String conversationId) {
        return messages(conversationId, null, null);
    }

    /**
     * Konuşma mesajları (yeniden eskiye; giden mesaj durumu teslimattan)
     *
     * {@code GET /v1/apps/{appId}/conversations/{conversationId}/messages}
     */
    public ConversationMessagePage messages(String conversationId, ConversationsMessagesParams params) {
        return messages(conversationId, params, null);
    }

    /**
     * Konuşma mesajları (yeniden eskiye; giden mesaj durumu teslimattan)
     *
     * {@code GET /v1/apps/{appId}/conversations/{conversationId}/messages}
     */
    public ConversationMessagePage messages(String conversationId, ConversationsMessagesParams params, RequestOptions options) {
        Operation op = new Operation("GET", "/v1/apps/{appId}/conversations/{conversationId}/messages");
        op.pathParam("conversationId", conversationId);
        if (params != null) {
            params.applyTo(op);
        }
        return client.execute(op, options, TYPE_2);
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

    private static final TypeReference<ConversationReplyResult> TYPE_3 = new TypeReference<ConversationReplyResult>() {};

    /**
     * Yanıt gönder. WhatsApp: açık rıza zorunlu; son gelen mesajdan 24 saat içinde metin/medya, pencere dışında yalnızca onaylı şablon (aksi 422 WHATSAPP_WINDOW_CLOSED).
     *
     * {@code POST /v1/apps/{appId}/conversations/{conversationId}/messages}
     */
    public ConversationReplyResult reply(String conversationId, ConversationReplyDto body) {
        return reply(conversationId, body, null);
    }

    /**
     * Yanıt gönder. WhatsApp: açık rıza zorunlu; son gelen mesajdan 24 saat içinde metin/medya, pencere dışında yalnızca onaylı şablon (aksi 422 WHATSAPP_WINDOW_CLOSED).
     *
     * {@code POST /v1/apps/{appId}/conversations/{conversationId}/messages}
     */
    public ConversationReplyResult reply(String conversationId, ConversationReplyDto body, RequestOptions options) {
        Operation op = new Operation("POST", "/v1/apps/{appId}/conversations/{conversationId}/messages");
        op.pathParam("conversationId", conversationId);
        if (body == null) {
            throw new IllegalArgumentException("HeroSignal: istek gövdesi null olamaz.");
        }
        op.body(body);
        return client.execute(op, options, TYPE_3);
    }

    private static final TypeReference<Conversation> TYPE_4 = new TypeReference<Conversation>() {};

    /**
     * Gelen mesajları okundu işaretle
     *
     * {@code POST /v1/apps/{appId}/conversations/{conversationId}/read}
     */
    public Conversation read(String conversationId) {
        return read(conversationId, null);
    }

    /**
     * Gelen mesajları okundu işaretle
     *
     * {@code POST /v1/apps/{appId}/conversations/{conversationId}/read}
     */
    public Conversation read(String conversationId, RequestOptions options) {
        Operation op = new Operation("POST", "/v1/apps/{appId}/conversations/{conversationId}/read");
        op.pathParam("conversationId", conversationId);
        return client.execute(op, options, TYPE_4);
    }
}
