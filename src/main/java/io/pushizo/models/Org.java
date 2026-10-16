// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package io.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Org şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class Org {
    /**
     * Zorunlu.
     */
    @JsonProperty("id")
    private String id;

    /**
     * Zorunlu.
     */
    @JsonProperty("name")
    private String name;

    /**
     * Zorunlu.
     */
    @JsonProperty("slug")
    private String slug;

    /**
     * Zorunlu.
     */
    @JsonProperty("plan_code")
    private String planCode;

    /**
     * Zorunlu. Değerler: "active", "suspended", "deleted".
     */
    @JsonProperty("status")
    private String status;

    /**
     * Zorunlu.
     */
    @JsonProperty("settings")
    private OrgSettings settings;

    /**
     * Zorunlu.
     */
    @JsonProperty("created_at")
    private String createdAt;

    /**
     * Zorunlu.
     */
    @JsonProperty("region")
    private String region;

    /**
     * Zorunlu.
     */
    @JsonProperty("managed_by_reseller")
    private Boolean managedByReseller;

    public String getId() {
        return id;
    }

    public Org id(String id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public Org name(String name) {
        this.name = name;
        return this;
    }

    public String getSlug() {
        return slug;
    }

    public Org slug(String slug) {
        this.slug = slug;
        return this;
    }

    public String getPlanCode() {
        return planCode;
    }

    public Org planCode(String planCode) {
        this.planCode = planCode;
        return this;
    }

    public String getStatus() {
        return status;
    }

    public Org status(String status) {
        this.status = status;
        return this;
    }

    public OrgSettings getSettings() {
        return settings;
    }

    public Org settings(OrgSettings settings) {
        this.settings = settings;
        return this;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public Org createdAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    public String getRegion() {
        return region;
    }

    public Org region(String region) {
        this.region = region;
        return this;
    }

    public Boolean getManagedByReseller() {
        return managedByReseller;
    }

    public Org managedByReseller(Boolean managedByReseller) {
        this.managedByReseller = managedByReseller;
        return this;
    }

    @Override
    public String toString() {
        return io.pushizo.core.Json.stringify(this);
    }
}
