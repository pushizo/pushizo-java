// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package com.pushizo.params;

/**
 * DataPipelinesResource.listTransforms için isteğe bağlı sorgu parametreleri.
 */
public final class DataPipelinesListTransformsParams {
    /**
     * Değerler: "event", "person".
     */
    private String target;

    public String getTarget() {
        return target;
    }

    public DataPipelinesListTransformsParams target(String target) {
        this.target = target;
        return this;
    }

    /** Sığ kopya (sayfalama sırasında çağıranın nesnesi değiştirilmez). */
    public DataPipelinesListTransformsParams copy() {
        DataPipelinesListTransformsParams c = new DataPipelinesListTransformsParams();
        c.target = target;
        return c;
    }

    /** İç API: alanları isteğe ekler. */
    public void applyTo(com.pushizo.core.Operation op) {
        op.query("target", target);
    }
}
