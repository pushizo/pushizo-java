package io.herosignal.core;

import com.fasterxml.jackson.core.type.TypeReference;
import io.herosignal.RequestOptions;

/**
 * Üretilmiş kaynak sınıflarının istek gönderdiği arayüz (SDK içi kullanım içindir; doğrudan çağırmanız gerekmez).
 */
public interface ApiExecutor {
    /**
     * İsteği yeniden deneme politikasıyla gönderir ve yanıtı çözer.
     *
     * @param request istek tanımı
     * @param options çağrı seçenekleri (null olabilir)
     * @param responseType yanıt tipi; null ise gövde yok sayılır
     * @param <T> yanıt tipi
     * @return çözülmüş yanıt (gövde boşsa veya responseType null ise null)
     * @throws io.herosignal.HeroSignalException API veya ağ hatasında
     */
    <T> T execute(ApiRequest request, RequestOptions options, TypeReference<T> responseType);
}
