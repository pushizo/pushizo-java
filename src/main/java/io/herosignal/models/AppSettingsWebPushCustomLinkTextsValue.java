// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package io.herosignal.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * AppSettingsWebPushCustomLinkTextsValue şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class AppSettingsWebPushCustomLinkTextsValue {
    @JsonProperty("subscribe")
    private String subscribe;

    @JsonProperty("unsubscribe")
    private String unsubscribe;

    @JsonProperty("explanation")
    private String explanation;

    public String getSubscribe() {
        return subscribe;
    }

    public AppSettingsWebPushCustomLinkTextsValue subscribe(String subscribe) {
        this.subscribe = subscribe;
        return this;
    }

    public String getUnsubscribe() {
        return unsubscribe;
    }

    public AppSettingsWebPushCustomLinkTextsValue unsubscribe(String unsubscribe) {
        this.unsubscribe = unsubscribe;
        return this;
    }

    public String getExplanation() {
        return explanation;
    }

    public AppSettingsWebPushCustomLinkTextsValue explanation(String explanation) {
        this.explanation = explanation;
        return this;
    }

    @Override
    public String toString() {
        return io.herosignal.core.Json.stringify(this);
    }
}
