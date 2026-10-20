// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package com.pushizo.params;

/**
 * SurveysResource.responses için isteğe bağlı sorgu parametreleri.
 */
public final class SurveysResponsesParams {
    private Long limit;

    private String cursor;

    private String textQuestion;

    /**
     * Değerler: "promoter", "passive", "detractor".
     */
    private String npsCategory;

    public Long getLimit() {
        return limit;
    }

    public SurveysResponsesParams limit(Long limit) {
        this.limit = limit;
        return this;
    }

    public String getCursor() {
        return cursor;
    }

    public SurveysResponsesParams cursor(String cursor) {
        this.cursor = cursor;
        return this;
    }

    public String getTextQuestion() {
        return textQuestion;
    }

    public SurveysResponsesParams textQuestion(String textQuestion) {
        this.textQuestion = textQuestion;
        return this;
    }

    public String getNpsCategory() {
        return npsCategory;
    }

    public SurveysResponsesParams npsCategory(String npsCategory) {
        this.npsCategory = npsCategory;
        return this;
    }

    /** Sığ kopya (sayfalama sırasında çağıranın nesnesi değiştirilmez). */
    public SurveysResponsesParams copy() {
        SurveysResponsesParams c = new SurveysResponsesParams();
        c.limit = limit;
        c.cursor = cursor;
        c.textQuestion = textQuestion;
        c.npsCategory = npsCategory;
        return c;
    }

    /** İç API: alanları isteğe ekler. */
    public void applyTo(com.pushizo.core.Operation op) {
        op.query("limit", limit);
        op.query("cursor", cursor);
        op.query("text_question", textQuestion);
        op.query("nps_category", npsCategory);
    }
}
