package com.monster.job.dto.jobposting;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.Builder;
import lombok.Getter;

@Getter
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({"@context","@type"})
public class PostalAddress {

    @JsonProperty("@context")
    private String context;

    @JsonProperty("@type")
    private String type;

    private String streetAddress;

    private String addressLocality;

    private String addressRegion;

    private String postalCode;

    private String addressCountry;


    @Builder(builderMethodName = "postalAddressBuilder")
    public PostalAddress(String streetAddress, String addressLocality, String addressRegion, String postalCode, String addressCountry) {
        this.streetAddress = streetAddress;
        this.addressLocality = addressLocality;
        this.addressRegion = addressRegion;
        this.postalCode = postalCode;
        this.addressCountry = addressCountry;
    }

    public void setContext(String context) {
        this.context = context;
    }

    public void setType(String type) {
        this.type = type;
    }




}
