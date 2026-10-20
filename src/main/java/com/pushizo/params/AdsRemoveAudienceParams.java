// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package com.pushizo.params;

/**
 * AdsResource.removeAudience için isteğe bağlı sorgu parametreleri.
 */
public final class AdsRemoveAudienceParams {
    /**
     * Değerler: "true", "false".
     */
    private String deleteOnPlatform;

    public String getDeleteOnPlatform() {
        return deleteOnPlatform;
    }

    public AdsRemoveAudienceParams deleteOnPlatform(String deleteOnPlatform) {
        this.deleteOnPlatform = deleteOnPlatform;
        return this;
    }

    /** Sığ kopya (sayfalama sırasında çağıranın nesnesi değiştirilmez). */
    public AdsRemoveAudienceParams copy() {
        AdsRemoveAudienceParams c = new AdsRemoveAudienceParams();
        c.deleteOnPlatform = deleteOnPlatform;
        return c;
    }

    /** İç API: alanları isteğe ekler. */
    public void applyTo(com.pushizo.core.Operation op) {
        op.query("delete_on_platform", deleteOnPlatform);
    }
}
