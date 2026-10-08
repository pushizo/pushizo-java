// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.
package io.herosignal.models;

import com.fasterxml.jackson.annotation.JsonProperty;
/** AppSettingsOnboarding şeması (api/openapi.yaml). */
public final class AppSettingsOnboarding {

    /** "step" alanı. Zorunlu. */
    @JsonProperty("step")
    private Long step;

    /** "simulation" alanı. */
    @JsonProperty("simulation")
    private Boolean simulation;

    /** "completed_at" alanı. */
    @JsonProperty("completed_at")
    private String completedAt;

    /** @return "step" alanı */
    public Long getStep() {
        return step;
    }

    /**
     * "step" alanını ayarlar.
     *
     * @param step yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public AppSettingsOnboarding setStep(Long step) {
        this.step = step;
        return this;
    }

    /** @return "simulation" alanı */
    public Boolean getSimulation() {
        return simulation;
    }

    /**
     * "simulation" alanını ayarlar.
     *
     * @param simulation yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public AppSettingsOnboarding setSimulation(Boolean simulation) {
        this.simulation = simulation;
        return this;
    }

    /** @return "completed_at" alanı */
    public String getCompletedAt() {
        return completedAt;
    }

    /**
     * "completed_at" alanını ayarlar.
     *
     * @param completedAt yeni değer
     * @return bu nesne (zincirleme kullanım için)
     */
    public AppSettingsOnboarding setCompletedAt(String completedAt) {
        this.completedAt = completedAt;
        return this;
    }
}
