// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package com.pushizo.params;

/**
 * RecommendationsResource.list için isteğe bağlı sorgu parametreleri.
 */
public final class RecommendationsListParams {
    private Long limit;

    private String userId;

    private String externalId;

    private String itemId;

    private String category;

    public Long getLimit() {
        return limit;
    }

    public RecommendationsListParams limit(Long limit) {
        this.limit = limit;
        return this;
    }

    public String getUserId() {
        return userId;
    }

    public RecommendationsListParams userId(String userId) {
        this.userId = userId;
        return this;
    }

    public String getExternalId() {
        return externalId;
    }

    public RecommendationsListParams externalId(String externalId) {
        this.externalId = externalId;
        return this;
    }

    public String getItemId() {
        return itemId;
    }

    public RecommendationsListParams itemId(String itemId) {
        this.itemId = itemId;
        return this;
    }

    public String getCategory() {
        return category;
    }

    public RecommendationsListParams category(String category) {
        this.category = category;
        return this;
    }

    /** Sığ kopya (sayfalama sırasında çağıranın nesnesi değiştirilmez). */
    public RecommendationsListParams copy() {
        RecommendationsListParams c = new RecommendationsListParams();
        c.limit = limit;
        c.userId = userId;
        c.externalId = externalId;
        c.itemId = itemId;
        c.category = category;
        return c;
    }

    /** İç API: alanları isteğe ekler. */
    public void applyTo(com.pushizo.core.Operation op) {
        op.query("limit", limit);
        op.query("user_id", userId);
        op.query("external_id", externalId);
        op.query("item_id", itemId);
        op.query("category", category);
    }
}
