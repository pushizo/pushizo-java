// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package io.herosignal.params;

/**
 * IntegrationsResource.samples için isteğe bağlı sorgu parametreleri.
 */
public final class IntegrationsSamplesParams {
    private String eventName;

    public String getEventName() {
        return eventName;
    }

    public IntegrationsSamplesParams eventName(String eventName) {
        this.eventName = eventName;
        return this;
    }

    /** Sığ kopya (sayfalama sırasında çağıranın nesnesi değiştirilmez). */
    public IntegrationsSamplesParams copy() {
        IntegrationsSamplesParams c = new IntegrationsSamplesParams();
        c.eventName = eventName;
        return c;
    }

    /** İç API: alanları isteğe ekler. */
    public void applyTo(io.herosignal.core.Operation op) {
        op.query("event_name", eventName);
    }
}
