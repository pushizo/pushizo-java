// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package com.pushizo.params;

/**
 * CampaignsResource.send için isteğe bağlı sorgu parametreleri.
 */
public final class CampaignsSendParams {
    /**
     * Değerler: "true", "false".
     */
    private String force;

    public String getForce() {
        return force;
    }

    public CampaignsSendParams force(String force) {
        this.force = force;
        return this;
    }

    /** Sığ kopya (sayfalama sırasında çağıranın nesnesi değiştirilmez). */
    public CampaignsSendParams copy() {
        CampaignsSendParams c = new CampaignsSendParams();
        c.force = force;
        return c;
    }

    /** İç API: alanları isteğe ekler. */
    public void applyTo(com.pushizo.core.Operation op) {
        op.query("force", force);
    }
}
