package com.monster.job.dto.jobposting;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.Builder;
import lombok.Getter;

@Getter
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder("@type")
public class AdministrativeArea {

    @JsonProperty("@context")
    private String context;

    @JsonProperty("@type")
    private String type;

    private PostalAddress address;

    private GeoCoordinates geo;

    private String name;

    @Builder
    public AdministrativeArea(PostalAddress address, GeoCoordinates geo, String name) {
        this.address = address;
        this.geo = geo;
        this.name = name;
    }

    public void setContext(String context) {
        this.context = context;
    }

    public void setType(String type) {
        this.type = type;
    }
}
