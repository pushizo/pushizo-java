// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package io.herosignal.params;

/**
 * JourneysResource.stats için isteğe bağlı sorgu parametreleri.
 */
public final class JourneysStatsParams {
    private Long version;

    public Long getVersion() {
        return version;
    }

    public JourneysStatsParams version(Long version) {
        this.version = version;
        return this;
    }

    /** Sığ kopya (sayfalama sırasında çağıranın nesnesi değiştirilmez). */
    public JourneysStatsParams copy() {
        JourneysStatsParams c = new JourneysStatsParams();
        c.version = version;
        return c;
    }

    /** İç API: alanları isteğe ekler. */
    public void applyTo(io.herosignal.core.Operation op) {
        op.query("version", version);
    }
}
