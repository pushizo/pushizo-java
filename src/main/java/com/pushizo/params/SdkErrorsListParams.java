// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package com.pushizo.params;

/**
 * SdkErrorsResource.list için isteğe bağlı sorgu parametreleri.
 */
public final class SdkErrorsListParams {
    private Long limit;

    private String cursor;

    private String platform;

    /**
     * Değerler: "error", "warning".
     */
    private String level;

    public Long getLimit() {
        return limit;
    }

    public SdkErrorsListParams limit(Long limit) {
        this.limit = limit;
        return this;
    }

    public String getCursor() {
        return cursor;
    }

    public SdkErrorsListParams cursor(String cursor) {
        this.cursor = cursor;
        return this;
    }

    public String getPlatform() {
        return platform;
    }

    public SdkErrorsListParams platform(String platform) {
        this.platform = platform;
        return this;
    }

    public String getLevel() {
        return level;
    }

    public SdkErrorsListParams level(String level) {
        this.level = level;
        return this;
    }

    /** Sığ kopya (sayfalama sırasında çağıranın nesnesi değiştirilmez). */
    public SdkErrorsListParams copy() {
        SdkErrorsListParams c = new SdkErrorsListParams();
        c.limit = limit;
        c.cursor = cursor;
        c.platform = platform;
        c.level = level;
        return c;
    }

    /** İç API: alanları isteğe ekler. */
    public void applyTo(com.pushizo.core.Operation op) {
        op.query("limit", limit);
        op.query("cursor", cursor);
        op.query("platform", platform);
        op.query("level", level);
    }
}
