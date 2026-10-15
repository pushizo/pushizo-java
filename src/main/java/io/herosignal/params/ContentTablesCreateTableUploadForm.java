// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package io.herosignal.params;

/**
 * ContentTablesResource.createTableUpload için multipart/form-data alanları.
 */
public final class ContentTablesCreateTableUploadForm {
    /**
     * Zorunlu. UTF-8 CSV; ilk satır başlık. En fazla 100.000 satır, 20 MB.
     */
    private io.herosignal.FileUpload file;

    /**
     * Zorunlu. Liquid tablo adı (küçük harf, rakam, alt çizgi).
     */
    private String name;

    /**
     * Zorunlu. Satır seçiminde kullanılan anahtar sütunu (değerleri benzersiz).
     */
    private String keyColumn;

    private String description;

    public io.herosignal.FileUpload getFile() {
        return file;
    }

    public ContentTablesCreateTableUploadForm file(io.herosignal.FileUpload file) {
        this.file = file;
        return this;
    }

    public String getName() {
        return name;
    }

    public ContentTablesCreateTableUploadForm name(String name) {
        this.name = name;
        return this;
    }

    public String getKeyColumn() {
        return keyColumn;
    }

    public ContentTablesCreateTableUploadForm keyColumn(String keyColumn) {
        this.keyColumn = keyColumn;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public ContentTablesCreateTableUploadForm description(String description) {
        this.description = description;
        return this;
    }

    /** Sığ kopya (sayfalama sırasında çağıranın nesnesi değiştirilmez). */
    public ContentTablesCreateTableUploadForm copy() {
        ContentTablesCreateTableUploadForm c = new ContentTablesCreateTableUploadForm();
        c.file = file;
        c.name = name;
        c.keyColumn = keyColumn;
        c.description = description;
        return c;
    }

    /** İç API: alanları isteğe ekler. */
    public void applyTo(io.herosignal.core.Operation op) {
        op.formFile("file", file);
        op.formField("name", name);
        op.formField("key_column", keyColumn);
        op.formField("description", description);
    }
}
