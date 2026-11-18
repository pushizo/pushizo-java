// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package com.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * CompanyMemberBatchResultNotFoundItem şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class CompanyMemberBatchResultNotFoundItem {
    /**
     * Zorunlu.
     */
    @JsonProperty("index")
    private Long index;

    /**
     * Zorunlu.
     */
    @JsonProperty("user_id")
    private String userId;

    /**
     * Zorunlu.
     */
    @JsonProperty("external_id")
    private String externalId;

    public Long getIndex() {
        return index;
    }

    public CompanyMemberBatchResultNotFoundItem index(Long index) {
        this.index = index;
        return this;
    }

    public String getUserId() {
        return userId;
    }

    public CompanyMemberBatchResultNotFoundItem userId(String userId) {
        this.userId = userId;
        return this;
    }

    public String getExternalId() {
        return externalId;
    }

    public CompanyMemberBatchResultNotFoundItem externalId(String externalId) {
        this.externalId = externalId;
        return this;
    }

    @Override
    public String toString() {
        return com.pushizo.core.Json.stringify(this);
    }
}
