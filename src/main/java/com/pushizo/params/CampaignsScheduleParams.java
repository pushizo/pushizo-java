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

    /**
     * Değerler: "true", "false".
     */
    private String preflightAck;

    public String getForce() {
        return force;
    }

    public CampaignsScheduleParams force(String force) {
        this.force = force;
        return this;
    }

    public String getPreflightAck() {
        return preflightAck;
    }

    public CampaignsScheduleParams preflightAck(String preflightAck) {
        this.preflightAck = preflightAck;
        return this;
    }

    /** Sığ kopya (sayfalama sırasında çağıranın nesnesi değiştirilmez). */
    public CampaignsScheduleParams copy() {
        CampaignsScheduleParams c = new CampaignsScheduleParams();
        c.force = force;
        c.preflightAck = preflightAck;
        return c;
    }

    /** İç API: alanları isteğe ekler. */
    public void applyTo(com.pushizo.core.Operation op) {
        op.query("force", force);
        op.query("preflight_ack", preflightAck);
    }
}
