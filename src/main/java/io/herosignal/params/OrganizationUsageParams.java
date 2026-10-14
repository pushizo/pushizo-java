// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package io.herosignal.params;

/**
 * OrganizationResource.usage için isteğe bağlı sorgu parametreleri.
 */
public final class OrganizationUsageParams {
    private Long days;

    public Long getDays() {
        return days;
    }

    public OrganizationUsageParams days(Long days) {
        this.days = days;
        return this;
    }

    /** Sığ kopya (sayfalama sırasında çağıranın nesnesi değiştirilmez). */
    public OrganizationUsageParams copy() {
        OrganizationUsageParams c = new OrganizationUsageParams();
        c.days = days;
        return c;
    }

    /** İç API: alanları isteğe ekler. */
    public void applyTo(io.herosignal.core.Operation op) {
        op.query("days", days);
    }
}
