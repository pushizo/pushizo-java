// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.
package io.herosignal.resources;

import io.herosignal.FileUpload;
/**
 * ImportsResource.create için multipart form alanları.
 */
public final class ImportsCreateParams {

    /** "type" form alanı. Zorunlu. Değerler: "eski sağlayıcı_players", "csv_users". */
    private String type;

    /** "file" form alanı. Zorunlu. CSV dosyası (UTF-8, en fazla 50 MB) */
    private FileUpload file;

    /** @return "type" değeri */
    public String getType() {
        return type;
    }

    /**
     * "type" değerini ayarlar.
     *
     * @param type yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public ImportsCreateParams setType(String type) {
        this.type = type;
        return this;
    }

    /** @return "file" değeri */
    public FileUpload getFile() {
        return file;
    }

    /**
     * "file" değerini ayarlar.
     *
     * @param file yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public ImportsCreateParams setFile(FileUpload file) {
        this.file = file;
        return this;
    }

    /** @return bu parametrelerin sığ kopyası */
    public ImportsCreateParams copy() {
        ImportsCreateParams copy = new ImportsCreateParams();
        copy.type = type;
        copy.file = file;
        return copy;
    }
}
