// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package io.herosignal.params;

/**
 * ContentTablesResource.replaceTableUpload için multipart/form-data alanları.
 */
public final class ContentTablesReplaceTableUploadForm {
    /**
     * Zorunlu. Yeni CSV (tablonun tüm satırları değiştirilir, sürüm artar).
     */
    private io.herosignal.FileUpload file;

    /**
     * İsteğe bağlı yeni anahtar sütunu.
     */
    private String keyColumn;

    public io.herosignal.FileUpload getFile() {
        return file;
    }

    public ContentTablesReplaceTableUploadForm file(io.herosignal.FileUpload file) {
        this.file = file;
        return this;
    }

    public String getKeyColumn() {
        return keyColumn;
    }

    public ContentTablesReplaceTableUploadForm keyColumn(String keyColumn) {
        this.keyColumn = keyColumn;
        return this;
    }

    /** Sığ kopya (sayfalama sırasında çağıranın nesnesi değiştirilmez). */
    public ContentTablesReplaceTableUploadForm copy() {
        ContentTablesReplaceTableUploadForm c = new ContentTablesReplaceTableUploadForm();
        c.file = file;
        c.keyColumn = keyColumn;
        return c;
    }

    /** İç API: alanları isteğe ekler. */
    public void applyTo(io.herosignal.core.Operation op) {
        op.formFile("file", file);
        op.formField("key_column", keyColumn);
    }
}
