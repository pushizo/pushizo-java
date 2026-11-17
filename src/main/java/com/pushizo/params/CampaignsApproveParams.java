// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package com.pushizo.params;

/**
 * CampaignsResource.approve için isteğe bağlı sorgu parametreleri.
 */
public final class CampaignsApproveParams {
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

    public CampaignsApproveParams force(String force) {
        this.force = force;
        return this;
    }

    public String getPreflightAck() {
        return preflightAck;
    }

    public CampaignsApproveParams preflightAck(String preflightAck) {
        this.preflightAck = preflightAck;
        return this;
    }

    /** Sığ kopya (sayfalama sırasında çağıranın nesnesi değiştirilmez). */
    public CampaignsApproveParams copy() {
        CampaignsApproveParams c = new CampaignsApproveParams();
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
