package com.pushizo;

/**
 * Webhook imza doğrulama sonucu.
 *
 * @param ok        imza geçerli mi
 * @param timestamp geçerliyse başlıktaki {@code t} (Unix saniye), değilse 0
 * @param reason    geçersizse neden: {@code missing_header}, {@code malformed_header},
 *                  {@code timestamp_out_of_tolerance}, {@code signature_mismatch}; geçerliyse null
 */
public record WebhookVerifyResult(boolean ok, long timestamp, String reason) {
}
