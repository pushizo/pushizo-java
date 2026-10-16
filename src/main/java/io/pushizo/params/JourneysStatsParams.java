// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package io.pushizo.params;

/**
 * JourneysResource.stats için isteğe bağlı sorgu parametreleri.
 */
public final class JourneysStatsParams {
    private Long version;

    /**
     * Değerler: "true", "false".
     */
    private String allVersions;

    public Long getVersion() {
        return version;
    }

    public JourneysStatsParams version(Long version) {
        this.version = version;
        return this;
    }

    public String getAllVersions() {
        return allVersions;
    }

    public JourneysStatsParams allVersions(String allVersions) {
        this.allVersions = allVersions;
        return this;
    }

    /** Sığ kopya (sayfalama sırasında çağıranın nesnesi değiştirilmez). */
    public JourneysStatsParams copy() {
        JourneysStatsParams c = new JourneysStatsParams();
        c.version = version;
        c.allVersions = allVersions;
        return c;
    }

    /** İç API: alanları isteğe ekler. */
    public void applyTo(io.pushizo.core.Operation op) {
        op.query("version", version);
        op.query("all_versions", allVersions);
    }
}
