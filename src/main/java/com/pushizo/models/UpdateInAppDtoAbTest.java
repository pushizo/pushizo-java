// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package com.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * UpdateInAppDtoAbTest şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class UpdateInAppDtoAbTest {
    @JsonProperty("winner")
    private UpdateInAppDtoAbTestWinner winner;

    public UpdateInAppDtoAbTestWinner getWinner() {
        return winner;
    }

    public UpdateInAppDtoAbTest winner(UpdateInAppDtoAbTestWinner winner) {
        this.winner = winner;
        return this;
    }

    @Override
    public String toString() {
        return com.pushizo.core.Json.stringify(this);
    }
}
