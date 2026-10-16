// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package io.pushizo.params;

/**
 * SegmentsResource.estimate için isteğe bağlı sorgu parametreleri.
 */
public final class SegmentsEstimateParams {
    /**
     * true: önbelleği atla, tam sayım Değerler: "true", "false".
     */
    private String force;

    public String getForce() {
        return force;
    }

    public SegmentsEstimateParams force(String force) {
        this.force = force;
        return this;
    }

    /** Sığ kopya (sayfalama sırasında çağıranın nesnesi değiştirilmez). */
    public SegmentsEstimateParams copy() {
        SegmentsEstimateParams c = new SegmentsEstimateParams();
        c.force = force;
        return c;
    }

    /** İç API: alanları isteğe ekler. */
    public void applyTo(io.pushizo.core.Operation op) {
        op.query("force", force);
    }
}
