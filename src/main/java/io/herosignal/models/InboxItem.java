// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.
package io.herosignal.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;
/** InboxItem şeması (api/openapi.yaml). */
public final class InboxItem {

    /** "id" alanı. Zorunlu. */
    @JsonProperty("id")
    private String id;

    /** "message_id" alanı. Zorunlu. */
    @JsonProperty("message_id")
    private String messageId;

    /** "title" alanı. Zorunlu. */
    @JsonProperty("title")
    private String title;

    /** "body" alanı. Zorunlu. */
    @JsonProperty("body")
    private String body;

    /** "url" alanı. Zorunlu. */
    @JsonProperty("url")
    private String url;

    /** "image_url" alanı. Zorunlu. */
    @JsonProperty("image_url")
    private String imageUrl;

    /** "data" alanı. Zorunlu. */
    @JsonProperty("data")
    private Map<String, String> data;

    /** "read" alanı. Zorunlu. */
    @JsonProperty("read")
    private Boolean read;

    /** "read_at" alanı. Zorunlu. */
    @JsonProperty("read_at")
    private String readAt;

    /** "archived_at" alanı. Zorunlu. */
    @JsonProperty("archived_at")
    private String archivedAt;

    /** "expires_at" alanı. Zorunlu. */
    @JsonProperty("expires_at")
    private String expiresAt;

    /** "created_at" alanı. Zorunlu. */
    @JsonProperty("created_at")
    private String createdAt;

    /** @return "id" alanı */
    public String getId() {
        return id;
    }

    /**
     * "id" alanını ayarlar.
     *
     * @param id yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public InboxItem setId(String id) {
        this.id = id;
        return this;
    }

    /** @return "message_id" alanı */
    public String getMessageId() {
        return messageId;
    }

    /**
     * "message_id" alanını ayarlar.
     *
     * @param messageId yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public InboxItem setMessageId(String messageId) {
        this.messageId = messageId;
        return this;
    }

    /** @return "title" alanı */
    public String getTitle() {
        return title;
    }

    /**
     * "title" alanını ayarlar.
     *
     * @param title yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public InboxItem setTitle(String title) {
        this.title = title;
        return this;
    }

    /** @return "body" alanı */
    public String getBody() {
        return body;
    }

    /**
     * "body" alanını ayarlar.
     *
     * @param body yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public InboxItem setBody(String body) {
        this.body = body;
        return this;
    }

    /** @return "url" alanı */
    public String getUrl() {
        return url;
    }

    /**
     * "url" alanını ayarlar.
     *
     * @param url yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public InboxItem setUrl(String url) {
        this.url = url;
        return this;
    }

    /** @return "image_url" alanı */
    public String getImageUrl() {
        return imageUrl;
    }

    /**
     * "image_url" alanını ayarlar.
     *
     * @param imageUrl yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public InboxItem setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
        return this;
    }

    /** @return "data" alanı */
    public Map<String, String> getData() {
        return data;
    }

    /**
     * "data" alanını ayarlar.
     *
     * @param data yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public InboxItem setData(Map<String, String> data) {
        this.data = data;
        return this;
    }

    /** @return "read" alanı */
    public Boolean getRead() {
        return read;
    }

    /**
     * "read" alanını ayarlar.
     *
     * @param read yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public InboxItem setRead(Boolean read) {
        this.read = read;
        return this;
    }

    /** @return "read_at" alanı */
    public String getReadAt() {
        return readAt;
    }

    /**
     * "read_at" alanını ayarlar.
     *
     * @param readAt yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public InboxItem setReadAt(String readAt) {
        this.readAt = readAt;
        return this;
    }

    /** @return "archived_at" alanı */
    public String getArchivedAt() {
        return archivedAt;
    }

    /**
     * "archived_at" alanını ayarlar.
     *
     * @param archivedAt yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public InboxItem setArchivedAt(String archivedAt) {
        this.archivedAt = archivedAt;
        return this;
    }

    /** @return "expires_at" alanı */
    public String getExpiresAt() {
        return expiresAt;
    }

    /**
     * "expires_at" alanını ayarlar.
     *
     * @param expiresAt yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public InboxItem setExpiresAt(String expiresAt) {
        this.expiresAt = expiresAt;
        return this;
    }

    /** @return "created_at" alanı */
    public String getCreatedAt() {
        return createdAt;
    }

    /**
     * "created_at" alanını ayarlar.
     *
     * @param createdAt yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public InboxItem setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }
}
