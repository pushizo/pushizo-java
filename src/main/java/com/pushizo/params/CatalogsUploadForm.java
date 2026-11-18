// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package com.pushizo.params;

/**
 * CatalogsResource.upload için multipart/form-data alanları.
 */
public final class CatalogsUploadForm {
    /**
     * Zorunlu. UTF-8 CSV. Zorunlu sütunlar: id, title. Bilinen: description, image_url, url, price, sale_price, currency, category, brand, in_stock. Diğerleri özellik olur. En fazla 100.000 satır, 20 MB.
     */
    private com.pushizo.FileUpload file;

    public com.pushizo.FileUpload getFile() {
        return file;
    }

    public CatalogsUploadForm file(com.pushizo.FileUpload file) {
        this.file = file;
        return this;
    }

    /** Sığ kopya (sayfalama sırasında çağıranın nesnesi değiştirilmez). */
    public CatalogsUploadForm copy() {
        CatalogsUploadForm c = new CatalogsUploadForm();
        c.file = file;
        return c;
    }

    /** İç API: alanları isteğe ekler. */
    public void applyTo(com.pushizo.core.Operation op) {
        op.formFile("file", file);
    }
}
