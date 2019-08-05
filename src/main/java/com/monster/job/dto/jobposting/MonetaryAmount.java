package com.monster.job.dto.jobposting;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.Builder;
import lombok.Getter;

@Getter
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({"@context","@type"})
public class MonetaryAmount {

    @JsonProperty("@context")
    private String context;

    @JsonProperty("@type")
    private String type;

    private String currency;

    private QuantitativeValue value;


    @Builder(builderMethodName = "monetaryAmountBuilder")
    public MonetaryAmount(String currency, QuantitativeValue value) {
        this.currency = currency;
        this.value = value;
    }

    public void setContext(String context) {
        this.context = context;
    }

    public void setType(String type) {
        this.type = type;
    }

}
