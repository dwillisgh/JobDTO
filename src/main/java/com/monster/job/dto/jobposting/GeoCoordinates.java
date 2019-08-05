package com.monster.job.dto.jobposting;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.Builder;
import lombok.Getter;

@Getter
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({"@context","@type"})
public class GeoCoordinates {

    @JsonProperty("@context")
    private String context;

    @JsonProperty("@type")
    private String type;
    private String latitude;
    private String longitude;

    @Builder(builderMethodName = "geoCoordinatesBuilder")
    public GeoCoordinates(String latitude, String longitude) {
        this.latitude = latitude;
        this.longitude = longitude;
    }

    public void setContext(String context) {
        this.context = context;
    }

    public void setType(String type) {
        this.type = type;
    }
}
