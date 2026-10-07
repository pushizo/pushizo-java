// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package io.herosignal.params;

/**
 * ImportsResource.create için multipart/form-data alanları.
 */
public final class ImportsCreateForm {
    /**
     * Zorunlu. Değerler: "eski sağlayıcı_players", "csv_users".
     */
    private String type;

    /**
     * Zorunlu. CSV dosyası (UTF-8, en fazla 50 MB)
     */
    private io.herosignal.FileUpload file;

    public String getType() {
        return type;
    }

    public ImportsCreateForm type(String type) {
        this.type = type;
        return this;
    }

    public io.herosignal.FileUpload getFile() {
        return file;
    }

    public ImportsCreateForm file(io.herosignal.FileUpload file) {
        this.file = file;
        return this;
    }

    /** Sığ kopya (sayfalama sırasında çağıranın nesnesi değiştirilmez). */
    public ImportsCreateForm copy() {
        ImportsCreateForm c = new ImportsCreateForm();
        c.type = type;
        c.file = file;
        return c;
    }

    /** İç API: alanları isteğe ekler. */
    public void applyTo(io.herosignal.core.Operation op) {
        op.formField("type", type);
        op.formFile("file", file);
    }
}
