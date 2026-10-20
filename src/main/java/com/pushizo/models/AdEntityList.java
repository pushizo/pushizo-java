// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package com.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * AdEntityList şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class AdEntityList {
    /**
     * Zorunlu.
     */
    @JsonProperty("data")
    private java.util.List<AdEntity> data;

    /**
     * Zorunlu.
     */
    @JsonProperty("from")
    private String from;

    /**
     * Zorunlu.
     */
    @JsonProperty("to")
    private String to;

    /**
     * Zorunlu.
     */
    @JsonProperty("accounts")
    private java.util.List<AdEntityListAccountsItem> accounts;

    public java.util.List<AdEntity> getData() {
        return data;
    }

    public AdEntityList data(java.util.List<AdEntity> data) {
        this.data = data;
        return this;
    }

    public String getFrom() {
        return from;
    }

    public AdEntityList from(String from) {
        this.from = from;
        return this;
    }

    public String getTo() {
        return to;
    }

    public AdEntityList to(String to) {
        this.to = to;
        return this;
    }

    public java.util.List<AdEntityListAccountsItem> getAccounts() {
        return accounts;
    }

    public AdEntityList accounts(java.util.List<AdEntityListAccountsItem> accounts) {
        this.accounts = accounts;
        return this;
    }

    @Override
    public String toString() {
        return com.pushizo.core.Json.stringify(this);
    }
}
