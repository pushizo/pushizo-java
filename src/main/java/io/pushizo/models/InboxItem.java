// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package io.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * InboxItem şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class InboxItem {
    /**
     * Zorunlu.
     */
    @JsonProperty("id")
    private String id;

    /**
     * Zorunlu.
     */
    @JsonProperty("message_id")
    private String messageId;

    /**
     * Zorunlu.
     */
    @JsonProperty("title")
    private String title;

    /**
     * Zorunlu.
     */
    @JsonProperty("body")
    private String body;

    /**
     * Zorunlu.
     */
    @JsonProperty("url")
    private String url;

    /**
     * Zorunlu.
     */
    @JsonProperty("image_url")
    private String imageUrl;

    /**
     * Zorunlu.
     */
    @JsonProperty("data")
    private java.util.Map<String, String> data;

    /**
     * Zorunlu.
     */
    @JsonProperty("read")
    private Boolean read;

    /**
     * Zorunlu.
     */
    @JsonProperty("read_at")
    private String readAt;

    /**
     * Zorunlu.
     */
    @JsonProperty("archived_at")
    private String archivedAt;

    /**
     * Zorunlu.
     */
    @JsonProperty("expires_at")
    private String expiresAt;

    /**
     * Zorunlu.
     */
    @JsonProperty("created_at")
    private String createdAt;

    public String getId() {
        return id;
    }

    public InboxItem id(String id) {
        this.id = id;
        return this;
    }

    public String getMessageId() {
        return messageId;
    }

    public InboxItem messageId(String messageId) {
        this.messageId = messageId;
        return this;
    }

    public String getTitle() {
        return title;
    }

    public InboxItem title(String title) {
        this.title = title;
        return this;
    }

    public String getBody() {
        return body;
    }

    public InboxItem body(String body) {
        this.body = body;
        return this;
    }

    public String getUrl() {
        return url;
    }

    public InboxItem url(String url) {
        this.url = url;
        return this;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public InboxItem imageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
        return this;
    }

    public java.util.Map<String, String> getData() {
        return data;
    }

    public InboxItem data(java.util.Map<String, String> data) {
        this.data = data;
        return this;
    }

    public Boolean getRead() {
        return read;
    }

    public InboxItem read(Boolean read) {
        this.read = read;
        return this;
    }

    public String getReadAt() {
        return readAt;
    }

    public InboxItem readAt(String readAt) {
        this.readAt = readAt;
        return this;
    }

    public String getArchivedAt() {
        return archivedAt;
    }

    public InboxItem archivedAt(String archivedAt) {
        this.archivedAt = archivedAt;
        return this;
    }

    public String getExpiresAt() {
        return expiresAt;
    }

    public InboxItem expiresAt(String expiresAt) {
        this.expiresAt = expiresAt;
        return this;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public InboxItem createdAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    @Override
    public String toString() {
        return io.pushizo.core.Json.stringify(this);
    }
}
