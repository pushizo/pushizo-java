// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package com.pushizo.params;

/**
 * CampaignsResource.schedule için isteğe bağlı sorgu parametreleri.
 */
public final class CampaignsScheduleParams {
    /**
     * Değerler: "true", "false".
     */
    private String force;

    public String getForce() {
        return force;
    }

    public CampaignsScheduleParams force(String force) {
        this.force = force;
        return this;
    }

    /** Sığ kopya (sayfalama sırasında çağıranın nesnesi değiştirilmez). */
    public CampaignsScheduleParams copy() {
        CampaignsScheduleParams c = new CampaignsScheduleParams();
        c.force = force;
        return c;
    }

    /** İç API: alanları isteğe ekler. */
    public void applyTo(com.pushizo.core.Operation op) {
        op.query("force", force);
    }
}
