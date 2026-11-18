// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package com.pushizo.params;

/**
 * EventsResource.recent için isteğe bağlı sorgu parametreleri.
 */
public final class EventsRecentParams {
    private String name;

    private Long limit;

    private String since;

    public String getName() {
        return name;
    }

    public EventsRecentParams name(String name) {
        this.name = name;
        return this;
    }

    public Long getLimit() {
        return limit;
    }

    public EventsRecentParams limit(Long limit) {
        this.limit = limit;
        return this;
    }

    public String getSince() {
        return since;
    }

    public EventsRecentParams since(String since) {
        this.since = since;
        return this;
    }

    /** Sığ kopya (sayfalama sırasında çağıranın nesnesi değiştirilmez). */
    public EventsRecentParams copy() {
        EventsRecentParams c = new EventsRecentParams();
        c.name = name;
        c.limit = limit;
        c.since = since;
        return c;
    }

    /** İç API: alanları isteğe ekler. */
    public void applyTo(com.pushizo.core.Operation op) {
        op.query("name", name);
        op.query("limit", limit);
        op.query("since", since);
    }
}
