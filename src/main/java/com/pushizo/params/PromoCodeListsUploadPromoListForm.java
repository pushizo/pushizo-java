// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package com.pushizo.params;

/**
 * PromoCodeListsResource.uploadPromoList için multipart/form-data alanları.
 */
public final class PromoCodeListsUploadPromoListForm {
    /**
     * Zorunlu. UTF-8 CSV; kodlar ilk sütunda, başlık isteğe bağlı. En fazla 1.000.000 kod, 20 MB.
     */
    private com.pushizo.FileUpload file;

    public com.pushizo.FileUpload getFile() {
        return file;
    }

    public PromoCodeListsUploadPromoListForm file(com.pushizo.FileUpload file) {
        this.file = file;
        return this;
    }

    /** Sığ kopya (sayfalama sırasında çağıranın nesnesi değiştirilmez). */
    public PromoCodeListsUploadPromoListForm copy() {
        PromoCodeListsUploadPromoListForm c = new PromoCodeListsUploadPromoListForm();
        c.file = file;
        return c;
    }

    /** İç API: alanları isteğe ekler. */
    public void applyTo(com.pushizo.core.Operation op) {
        op.formFile("file", file);
    }
}
