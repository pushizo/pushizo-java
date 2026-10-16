package io.pushizo.core;

import io.pushizo.FileUpload;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/** İç API: üretilmiş kaynak sınıflarının {@code Pushizo.execute}'a verdiği istek tanımı. */
public final class Operation {
    /** Multipart alanı: {@code file} null ise metin alanıdır. */
    public record FormPart(String name, String value, FileUpload file) {
    }

    private final String method;
    private final String path;
    private final Map<String, String> pathParams = new LinkedHashMap<>();
    private final List<Map.Entry<String, String>> query = new ArrayList<>();
    private final List<FormPart> form = new ArrayList<>();
    private boolean queryAppId;
    private boolean bodyAppId;
    private boolean idempotent;
    private boolean multipart;
    private Object body;

    public Operation(String method, String path) {
        this.method = method;
        this.path = path;
    }

    public Operation pathParam(String name, String value) {
        if (value == null || value.isEmpty()) {
            throw new IllegalArgumentException("Pushizo: '" + name + "' yol parametresi boş olamaz.");
        }
        pathParams.put(name, value);
        return this;
    }

    /** Sorgu parametresi; null atlanır, liste tekrarlanan anahtar olur, nesneler JSON'a çevrilir. */
    public Operation query(String name, Object value) {
        if (value == null) {
            return this;
        }
        if (value instanceof Iterable<?> items) {
            for (Object item : items) {
                if (item != null) {
                    query.add(Map.entry(name, scalar(item)));
                }
            }
        } else {
            query.add(Map.entry(name, scalar(value)));
        }
        return this;
    }

    public Operation formField(String name, Object value) {
        multipart = true;
        if (value != null) {
            form.add(new FormPart(name, scalar(value), null));
        }
        return this;
    }

    public Operation formFile(String name, FileUpload file) {
        multipart = true;
        if (file != null) {
            form.add(new FormPart(name, null, file));
        }
        return this;
    }

    public Operation body(Object body) {
        this.body = body;
        return this;
    }

    public Operation queryAppId(boolean v) {
        this.queryAppId = v;
        return this;
    }

    public Operation bodyAppId(boolean v) {
        this.bodyAppId = v;
        return this;
    }

    public Operation idempotent(boolean v) {
        this.idempotent = v;
        return this;
    }

    static String scalar(Object value) {
        if (value instanceof String s) {
            return s;
        }
        if (value instanceof Number || value instanceof Boolean) {
            return String.valueOf(value);
        }
        return Json.stringify(value);
    }

    public String method() {
        return method;
    }

    public String path() {
        return path;
    }

    public Map<String, String> pathParams() {
        return pathParams;
    }

    public List<Map.Entry<String, String>> query() {
        return query;
    }

    public List<FormPart> form() {
        return form;
    }

    public boolean isMultipart() {
        return multipart;
    }

    public boolean isQueryAppId() {
        return queryAppId;
    }

    public boolean isBodyAppId() {
        return bodyAppId;
    }

    public boolean isIdempotent() {
        return idempotent;
    }

    public Object body() {
        return body;
    }
}
