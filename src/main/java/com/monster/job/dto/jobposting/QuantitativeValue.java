package com.monster.job.dto.jobposting;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.Builder;
import lombok.Getter;

@Getter
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({"@context","@type"})
public class QuantitativeValue {

    @JsonProperty("@context")
    private String context;

    @JsonProperty("@type")
    private String type;

    private String minValue;

    private String maxValue;

    private String unitText;


    @Builder(builderMethodName = "QuantitativeValueBuilder")
    public QuantitativeValue(String minValue, String maxValue, String unitText) {
        this.minValue = minValue;
        this.maxValue = maxValue;
        this.unitText = unitText;
    }

    public void setContext(String context) {
        this.context = context;
    }

    public void setType(String type) {
        this.type = type;
    }
}
