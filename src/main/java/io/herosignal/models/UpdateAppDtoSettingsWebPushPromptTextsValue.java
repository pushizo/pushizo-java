// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.
package io.herosignal.models;

import com.fasterxml.jackson.annotation.JsonProperty;
/** UpdateAppDtoSettingsWebPushPromptTextsValue şeması (api/openapi.yaml). */
public final class UpdateAppDtoSettingsWebPushPromptTextsValue {

    /** "title" alanı. */
    @JsonProperty("title")
    private String title;

    /** "message" alanı. */
    @JsonProperty("message")
    private String message;

    /** "accept" alanı. */
    @JsonProperty("accept")
    private String accept;

    /** "cancel" alanı. */
    @JsonProperty("cancel")
    private String cancel;

    /** @return "title" alanı */
    public String getTitle() {
        return title;
    }

    /**
     * "title" alanını ayarlar.
     *
     * @param title yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public UpdateAppDtoSettingsWebPushPromptTextsValue setTitle(String title) {
        this.title = title;
        return this;
    }

    /** @return "message" alanı */
    public String getMessage() {
        return message;
    }

    /**
     * "message" alanını ayarlar.
     *
     * @param message yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public UpdateAppDtoSettingsWebPushPromptTextsValue setMessage(String message) {
        this.message = message;
        return this;
    }

    /** @return "accept" alanı */
    public String getAccept() {
        return accept;
    }

    /**
     * "accept" alanını ayarlar.
     *
     * @param accept yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public UpdateAppDtoSettingsWebPushPromptTextsValue setAccept(String accept) {
        this.accept = accept;
        return this;
    }

    /** @return "cancel" alanı */
    public String getCancel() {
        return cancel;
    }

    /**
     * "cancel" alanını ayarlar.
     *
     * @param cancel yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public UpdateAppDtoSettingsWebPushPromptTextsValue setCancel(String cancel) {
        this.cancel = cancel;
        return this;
    }
}
