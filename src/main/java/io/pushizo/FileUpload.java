package io.pushizo;

import java.io.IOException;
import java.io.UncheckedIOException;
import java.nio.file.Files;
import java.nio.file.Path;

/**
 * Multipart dosya alanı. İçerik bellekte tutulur ki yeniden denemeler aynı gövdeyi göndersin.
 *
 * @param filename    dosya adı
 * @param content     dosya baytları
 * @param contentType içerik tipi (null ise {@code application/octet-stream})
 */
public record FileUpload(String filename, byte[] content, String contentType) {
    public FileUpload {
        if (content == null) {
            throw new IllegalArgumentException("Pushizo: dosya içeriği null olamaz.");
        }
        if (filename == null || filename.isEmpty()) {
            filename = "upload";
        }
        if (contentType == null || contentType.isEmpty()) {
            contentType = "application/octet-stream";
        }
    }

    /** Diskteki dosyayı okur; içerik tipi dosya uzantısından tahmin edilir. */
    public static FileUpload of(Path path) {
        try {
            String type = Files.probeContentType(path);
            if (type == null && path.getFileName().toString().endsWith(".csv")) {
                type = "text/csv";
            }
            return new FileUpload(path.getFileName().toString(), Files.readAllBytes(path), type);
        } catch (IOException e) {
            throw new UncheckedIOException(e);
        }
    }
}
