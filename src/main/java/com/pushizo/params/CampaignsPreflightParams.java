// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package com.pushizo.params;

/**
 * CampaignsResource.preflight için isteğe bağlı sorgu parametreleri.
 */
public final class CampaignsPreflightParams {
    /**
     * Değerler: "true", "false".
     */
    private String checkLinks;

    public String getCheckLinks() {
        return checkLinks;
    }

    public CampaignsPreflightParams checkLinks(String checkLinks) {
        this.checkLinks = checkLinks;
        return this;
    }

    /** Sığ kopya (sayfalama sırasında çağıranın nesnesi değiştirilmez). */
    public CampaignsPreflightParams copy() {
        CampaignsPreflightParams c = new CampaignsPreflightParams();
        c.checkLinks = checkLinks;
        return c;
    }

    /** İç API: alanları isteğe ekler. */
    public void applyTo(com.pushizo.core.Operation op) {
        op.query("check_links", checkLinks);
    }
}
