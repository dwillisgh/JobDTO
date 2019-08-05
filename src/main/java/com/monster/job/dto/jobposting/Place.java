package com.monster.job.dto.jobposting;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.Builder;
import lombok.Getter;

@Getter
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({"@context","@type"})
public class Place {

    @JsonProperty("@context")
    private String context;

    @JsonProperty("@type")
    private String type;

    private PostalAddress address;

    private GeoCoordinates geo;

    @Builder(builderMethodName = "placeBuilder")
    public Place(PostalAddress address, GeoCoordinates geo) {
        this.address = address;
        this.geo = geo;
    }

    public void setContext(String context) {
        this.context = context;
    }

    public void setType(String type) {
        this.type = type;
    }

}
