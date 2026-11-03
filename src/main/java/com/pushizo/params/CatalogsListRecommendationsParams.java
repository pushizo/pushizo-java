// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package com.pushizo.params;

/**
 * CatalogsResource.listRecommendations için isteğe bağlı sorgu parametreleri.
 */
public final class CatalogsListRecommendationsParams {
    private Long limit;

    private String userId;

    private String externalId;

    private String itemId;

    private String category;

    public Long getLimit() {
        return limit;
    }

    public CatalogsListRecommendationsParams limit(Long limit) {
        this.limit = limit;
        return this;
    }

    public String getUserId() {
        return userId;
    }

    public CatalogsListRecommendationsParams userId(String userId) {
        this.userId = userId;
        return this;
    }

    public String getExternalId() {
        return externalId;
    }

    public CatalogsListRecommendationsParams externalId(String externalId) {
        this.externalId = externalId;
        return this;
    }

    public String getItemId() {
        return itemId;
    }

    public CatalogsListRecommendationsParams itemId(String itemId) {
        this.itemId = itemId;
        return this;
    }

    public String getCategory() {
        return category;
    }

    public CatalogsListRecommendationsParams category(String category) {
        this.category = category;
        return this;
    }

    /** Sığ kopya (sayfalama sırasında çağıranın nesnesi değiştirilmez). */
    public CatalogsListRecommendationsParams copy() {
        CatalogsListRecommendationsParams c = new CatalogsListRecommendationsParams();
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
