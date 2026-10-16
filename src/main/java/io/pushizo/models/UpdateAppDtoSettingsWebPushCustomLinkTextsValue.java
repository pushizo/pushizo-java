// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package io.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * UpdateAppDtoSettingsWebPushCustomLinkTextsValue şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class UpdateAppDtoSettingsWebPushCustomLinkTextsValue {
    @JsonProperty("subscribe")
    private String subscribe;

    @JsonProperty("unsubscribe")
    private String unsubscribe;

    @JsonProperty("explanation")
    private String explanation;

    public String getSubscribe() {
        return subscribe;
    }

    public UpdateAppDtoSettingsWebPushCustomLinkTextsValue subscribe(String subscribe) {
        this.subscribe = subscribe;
        return this;
    }

    public String getUnsubscribe() {
        return unsubscribe;
    }

    public UpdateAppDtoSettingsWebPushCustomLinkTextsValue unsubscribe(String unsubscribe) {
        this.unsubscribe = unsubscribe;
        return this;
    }

    public String getExplanation() {
        return explanation;
    }

    public UpdateAppDtoSettingsWebPushCustomLinkTextsValue explanation(String explanation) {
        this.explanation = explanation;
        return this;
    }

    @Override
    public String toString() {
        return io.pushizo.core.Json.stringify(this);
    }
}
