package io.herosignal.core;

import io.herosignal.FileUpload;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/**
 * Üretilmiş kaynak metotlarının doldurduğu istek tanımı (SDK içi kullanım içindir).
 */
public final class ApiRequest {
    private final String method;
    private final String path;
    private final Map<String, String> pathParams = new LinkedHashMap<>();
    private final List<Map.Entry<String, Object>> query = new ArrayList<>();
    private final List<Map.Entry<String, Object>> formFields = new ArrayList<>();
    private final List<Map.Entry<String, FileUpload>> formFiles = new ArrayList<>();
    private Object body;
    private boolean multipart;
    private boolean appIdInPath;
    private boolean queryAppId;
    private boolean bodyAppId;
    private boolean idempotent;

    /**
     * @param method HTTP metodu
     * @param path {@code {appId}} gibi yer tutucular içerebilen yol
     */
    public ApiRequest(String method, String path) {
        this.method = method;
        this.path = path;
    }

    /**
     * Yol parametresi ekler; değer URL kodlanır.
     *
     * @param name yer tutucu adı
     * @param value değer (boş olamaz)
     * @return bu istek
     */
    public ApiRequest pathParam(String name, String value) {
        if (value == null || value.isEmpty()) {
            throw new IllegalArgumentException("HeroSignal: '" + name + "' yol parametresi boş olamaz.");
        }
        pathParams.put(name, value);
        return this;
    }

    /**
     * Sorgu parametresi ekler; null değerler atlanır, koleksiyonlar tekrarlanan anahtar olur.
     *
     * @param name parametre adı
     * @param value değer
     * @return bu istek
     */
    public ApiRequest query(String name, Object value) {
        if (value != null) query.add(new AbstractMap.SimpleImmutableEntry<>(name, value));
        return this;
    }

    /**
     * JSON gövdesini ayarlar.
     *
     * @param body gövde (model, Map veya null)
     * @return bu istek
     */
    public ApiRequest body(Object body) {
        this.body = body;
        return this;
    }

    /**
     * Multipart metin alanı ekler (null atlanır).
     *
     * @param name alan adı
     * @param value değer
     * @return bu istek
     */
    public ApiRequest multipartField(String name, Object value) {
        if (value != null) formFields.add(new AbstractMap.SimpleImmutableEntry<>(name, value));
        return this;
    }

    /**
     * Multipart dosya alanı ekler (null atlanır).
     *
     * @param name alan adı
     * @param file dosya
     * @return bu istek
     */
    public ApiRequest multipartFile(String name, FileUpload file) {
        if (file != null) formFiles.add(new AbstractMap.SimpleImmutableEntry<>(name, file));
        return this;
    }

    /** @return bu istek; gövde multipart/form-data olarak gönderilir */
    public ApiRequest multipart() {
        this.multipart = true;
        return this;
    }

    /** @return bu istek; yoldaki {@code {appId}} istemcinin app'i ile doldurulur */
    public ApiRequest appIdInPath() {
        this.appIdInPath = true;
        return this;
    }

    /** @return bu istek; {@code app_id} sorgu parametresi otomatik eklenir */
    public ApiRequest queryAppId() {
        this.queryAppId = true;
        return this;
    }

    /** @return bu istek; gövdede {@code app_id} yoksa eklenir */
    public ApiRequest bodyAppId() {
        this.bodyAppId = true;
        return this;
    }

    /** @return bu istek; uç {@code Idempotency-Key} başlığını destekler */
    public ApiRequest idempotent() {
        this.idempotent = true;
        return this;
    }

    /** @return HTTP metodu */
    public String getMethod() {
        return method;
    }

    /** @return yol şablonu */
    public String getPath() {
        return path;
    }

    /** @return yol parametreleri */
    public Map<String, String> getPathParams() {
        return Collections.unmodifiableMap(pathParams);
    }

    /** @return sorgu parametreleri (sıralı) */
    public List<Map.Entry<String, Object>> getQuery() {
        return Collections.unmodifiableList(query);
    }

    /** @return multipart metin alanları */
    public List<Map.Entry<String, Object>> getFormFields() {
        return Collections.unmodifiableList(formFields);
    }

    /** @return multipart dosya alanları */
    public List<Map.Entry<String, FileUpload>> getFormFiles() {
        return Collections.unmodifiableList(formFiles);
    }

    /** @return JSON gövdesi */
    public Object getBody() {
        return body;
    }

    /** @return multipart gövde mi */
    public boolean isMultipart() {
        return multipart;
    }

    /** @return yolda {@code {appId}} var mı */
    public boolean isAppIdInPath() {
        return appIdInPath;
    }

    /** @return {@code app_id} sorgu parametresi eklenecek mi */
    public boolean isQueryAppId() {
        return queryAppId;
    }

    /** @return gövdeye {@code app_id} eklenecek mi */
    public boolean isBodyAppId() {
        return bodyAppId;
    }

    /** @return uç idempotency anahtarını destekliyor mu */
    public boolean isIdempotent() {
        return idempotent;
    }
}
