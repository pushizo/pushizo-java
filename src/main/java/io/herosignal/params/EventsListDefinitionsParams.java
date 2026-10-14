// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package io.herosignal.params;

/**
 * EventsResource.listDefinitions için isteğe bağlı sorgu parametreleri.
 */
public final class EventsListDefinitionsParams {
    private Long limit;

    private String cursor;

    public Long getLimit() {
        return limit;
    }

    public EventsListDefinitionsParams limit(Long limit) {
        this.limit = limit;
        return this;
    }

    public String getCursor() {
        return cursor;
    }

    public EventsListDefinitionsParams cursor(String cursor) {
        this.cursor = cursor;
        return this;
    }

    /** Sığ kopya (sayfalama sırasında çağıranın nesnesi değiştirilmez). */
    public EventsListDefinitionsParams copy() {
        EventsListDefinitionsParams c = new EventsListDefinitionsParams();
        c.limit = limit;
        c.cursor = cursor;
        return c;
    }

    /** İç API: alanları isteğe ekler. */
    public void applyTo(io.herosignal.core.Operation op) {
        op.query("limit", limit);
        op.query("cursor", cursor);
    }
}
