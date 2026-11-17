// Bu dosya api/openapi.yaml'dan sdk/scripts/generate-server-sdks.mjs ile üretilmiştir; elle düzenlemeyin.

package com.pushizo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * CreateDataSourceDtoMapping şeması.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public final class CreateDataSourceDtoMapping {
    @JsonProperty("records_path")
    private String recordsPath;

    @JsonProperty("event_name")
    private String eventName;

    @JsonProperty("event_name_path")
    private String eventNamePath;

    @JsonProperty("external_id_path")
    private String externalIdPath;

    @JsonProperty("occurred_at_path")
    private String occurredAtPath;

    @JsonProperty("value_path")
    private String valuePath;

    @JsonProperty("event_id_path")
    private String eventIdPath;

    @JsonProperty("properties_path")
    private String propertiesPath;

    @JsonProperty("tags_path")
    private String tagsPath;

    public String getRecordsPath() {
        return recordsPath;
    }

    public CreateDataSourceDtoMapping recordsPath(String recordsPath) {
        this.recordsPath = recordsPath;
        return this;
    }

    public String getEventName() {
        return eventName;
    }

    public CreateDataSourceDtoMapping eventName(String eventName) {
        this.eventName = eventName;
        return this;
    }

    public String getEventNamePath() {
        return eventNamePath;
    }

    public CreateDataSourceDtoMapping eventNamePath(String eventNamePath) {
        this.eventNamePath = eventNamePath;
        return this;
    }

    public String getExternalIdPath() {
        return externalIdPath;
    }

    public CreateDataSourceDtoMapping externalIdPath(String externalIdPath) {
        this.externalIdPath = externalIdPath;
        return this;
    }

    public String getOccurredAtPath() {
        return occurredAtPath;
    }

    public CreateDataSourceDtoMapping occurredAtPath(String occurredAtPath) {
        this.occurredAtPath = occurredAtPath;
        return this;
    }

    public String getValuePath() {
        return valuePath;
    }

    public CreateDataSourceDtoMapping valuePath(String valuePath) {
        this.valuePath = valuePath;
        return this;
    }

    public String getEventIdPath() {
        return eventIdPath;
    }

    public CreateDataSourceDtoMapping eventIdPath(String eventIdPath) {
        this.eventIdPath = eventIdPath;
        return this;
    }

    public String getPropertiesPath() {
        return propertiesPath;
    }

    public CreateDataSourceDtoMapping propertiesPath(String propertiesPath) {
        this.propertiesPath = propertiesPath;
        return this;
    }

    public String getTagsPath() {
        return tagsPath;
    }

    public CreateDataSourceDtoMapping tagsPath(String tagsPath) {
        this.tagsPath = tagsPath;
        return this;
    }

    @Override
    public String toString() {
        return com.pushizo.core.Json.stringify(this);
    }
}
