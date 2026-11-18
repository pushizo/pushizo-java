// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package com.pushizo.params;

/**
 * SubscriptionsResource.listSubscriptions için isteğe bağlı sorgu parametreleri.
 */
public final class SubscriptionsListSubscriptionsParams {
    private Long limit;

    private String cursor;

    /**
     * Değerler: "ios_push", "android_push", "hms_push", "adm_push", "wns_push", "web_push", "email", "sms", "whatsapp", "rcs", "telegram", "viber".
     */
    private String channel;

    /**
     * Değerler: "subscribed", "unsubscribed", "invalid", "pending".
     */
    private String status;

    /**
     * Değerler: "true", "false".
     */
    private String testDevice;

    private String since;

    public Long getLimit() {
        return limit;
    }

    public SubscriptionsListSubscriptionsParams limit(Long limit) {
        this.limit = limit;
        return this;
    }

    public String getCursor() {
        return cursor;
    }

    public SubscriptionsListSubscriptionsParams cursor(String cursor) {
        this.cursor = cursor;
        return this;
    }

    public String getChannel() {
        return channel;
    }

    public SubscriptionsListSubscriptionsParams channel(String channel) {
        this.channel = channel;
        return this;
    }

    public String getStatus() {
        return status;
    }

    public SubscriptionsListSubscriptionsParams status(String status) {
        this.status = status;
        return this;
    }

    public String getTestDevice() {
        return testDevice;
    }

    public SubscriptionsListSubscriptionsParams testDevice(String testDevice) {
        this.testDevice = testDevice;
        return this;
    }

    public String getSince() {
        return since;
    }

    public SubscriptionsListSubscriptionsParams since(String since) {
        this.since = since;
        return this;
    }

    /** Sığ kopya (sayfalama sırasında çağıranın nesnesi değiştirilmez). */
    public SubscriptionsListSubscriptionsParams copy() {
        SubscriptionsListSubscriptionsParams c = new SubscriptionsListSubscriptionsParams();
        c.limit = limit;
        c.cursor = cursor;
        c.channel = channel;
        c.status = status;
        c.testDevice = testDevice;
        c.since = since;
        return c;
    }

    /** İç API: alanları isteğe ekler. */
    public void applyTo(com.pushizo.core.Operation op) {
        op.query("limit", limit);
        op.query("cursor", cursor);
        op.query("channel", channel);
        op.query("status", status);
        op.query("test_device", testDevice);
        op.query("since", since);
    }
}
