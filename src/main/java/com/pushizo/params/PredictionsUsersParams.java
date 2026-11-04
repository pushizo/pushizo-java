// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package com.pushizo.params;

/**
 * PredictionsResource.users için isteğe bağlı sorgu parametreleri.
 */
public final class PredictionsUsersParams {
    /**
     * Değerler: "low", "medium", "high".
     */
    private String bucket;

    private Long limit;

    private String cursor;

    public String getBucket() {
        return bucket;
    }

    public PredictionsUsersParams bucket(String bucket) {
        this.bucket = bucket;
        return this;
    }

    public Long getLimit() {
        return limit;
    }

    public PredictionsUsersParams limit(Long limit) {
        this.limit = limit;
        return this;
    }

    public String getCursor() {
        return cursor;
    }

    public PredictionsUsersParams cursor(String cursor) {
        this.cursor = cursor;
        return this;
    }

    /** Sığ kopya (sayfalama sırasında çağıranın nesnesi değiştirilmez). */
    public PredictionsUsersParams copy() {
        PredictionsUsersParams c = new PredictionsUsersParams();
        c.bucket = bucket;
        c.limit = limit;
        c.cursor = cursor;
        return c;
    }

    /** İç API: alanları isteğe ekler. */
    public void applyTo(com.pushizo.core.Operation op) {
        op.query("bucket", bucket);
        op.query("limit", limit);
        op.query("cursor", cursor);
    }
}
