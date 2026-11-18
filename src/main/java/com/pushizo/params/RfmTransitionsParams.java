// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package com.pushizo.params;

/**
 * RfmResource.transitions için isteğe bağlı sorgu parametreleri.
 */
public final class RfmTransitionsParams {
    private String from;

    private String to;

    public String getFrom() {
        return from;
    }

    public RfmTransitionsParams from(String from) {
        this.from = from;
        return this;
    }

    public String getTo() {
        return to;
    }

    public RfmTransitionsParams to(String to) {
        this.to = to;
        return this;
    }

    /** Sığ kopya (sayfalama sırasında çağıranın nesnesi değiştirilmez). */
    public RfmTransitionsParams copy() {
        RfmTransitionsParams c = new RfmTransitionsParams();
        c.from = from;
        c.to = to;
        return c;
    }

    /** İç API: alanları isteğe ekler. */
    public void applyTo(com.pushizo.core.Operation op) {
        op.query("from", from);
        op.query("to", to);
    }
}
