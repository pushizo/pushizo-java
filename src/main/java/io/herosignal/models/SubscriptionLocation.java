// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package io.herosignal.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * SubscriptionLocation şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class SubscriptionLocation {
    /**
     * Zorunlu.
     */
    @JsonProperty("lat")
    private Double lat;

    /**
     * Zorunlu.
     */
    @JsonProperty("lng")
    private Double lng;

    /**
     * Zorunlu.
     */
    @JsonProperty("accuracy_m")
    private Double accuracyM;

    /**
     * Zorunlu.
     */
    @JsonProperty("geohash")
    private String geohash;

    /**
     * Zorunlu.
     */
    @JsonProperty("updated_at")
    private String updatedAt;

    /**
     * Zorunlu.
     */
    @JsonProperty("consent_at")
    private String consentAt;

    public Double getLat() {
        return lat;
    }

    public SubscriptionLocation lat(Double lat) {
        this.lat = lat;
        return this;
    }

    public Double getLng() {
        return lng;
    }

    public SubscriptionLocation lng(Double lng) {
        this.lng = lng;
        return this;
    }

    public Double getAccuracyM() {
        return accuracyM;
    }

    public SubscriptionLocation accuracyM(Double accuracyM) {
        this.accuracyM = accuracyM;
        return this;
    }

    public String getGeohash() {
        return geohash;
    }

    public SubscriptionLocation geohash(String geohash) {
        this.geohash = geohash;
        return this;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }

    public SubscriptionLocation updatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    public String getConsentAt() {
        return consentAt;
    }

    public SubscriptionLocation consentAt(String consentAt) {
        this.consentAt = consentAt;
        return this;
    }

    @Override
    public String toString() {
        return io.herosignal.core.Json.stringify(this);
    }
}
