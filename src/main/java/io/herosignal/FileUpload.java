package io.herosignal;

import java.io.IOException;
import java.io.UncheckedIOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Objects;

/** Multipart dosya alanı (ör. içe aktarma CSV'si). İçerik bellekte tutulur; yeniden denemeler aynı baytları gönderir. */
public final class FileUpload {
    private final String filename;
    private final String contentType;
    private final byte[] content;

    private FileUpload(String filename, String contentType, byte[] content) {
        this.filename = filename == null || filename.isEmpty() ? "upload" : filename;
        this.contentType = contentType == null || contentType.isEmpty() ? "application/octet-stream" : contentType;
        this.content = Objects.requireNonNull(content, "content").clone();
    }

    /**
     * @param filename dosya adı
     * @param contentType içerik tipi (null ise application/octet-stream)
     * @param content içerik
     * @return dosya alanı
     */
    public static FileUpload of(String filename, String contentType, byte[] content) {
        return new FileUpload(filename, contentType, content);
    }

    /**
     * Diskteki dosyayı okur; içerik tipi dosya uzantısından tahmin edilir.
     *
     * @param path dosya yolu
     * @return dosya alanı
     * @throws UncheckedIOException dosya okunamazsa
     */
    public static FileUpload of(Path path) {
        try {
            String type = Files.probeContentType(path);
            String name = path.getFileName() == null ? "upload" : path.getFileName().toString();
            if (type == null && name.toLowerCase(java.util.Locale.ROOT).endsWith(".csv")) type = "text/csv";
            return new FileUpload(name, type, Files.readAllBytes(path));
        } catch (IOException e) {
            throw new UncheckedIOException("HeroSignal: dosya okunamadı: " + path, e);
        }
    }

    /** @return dosya adı */
    public String getFilename() {
        return filename;
    }

    /** @return içerik tipi */
    public String getContentType() {
        return contentType;
    }

    /** @return içerik (kopya) */
    public byte[] getContent() {
        return content.clone();
    }
}
