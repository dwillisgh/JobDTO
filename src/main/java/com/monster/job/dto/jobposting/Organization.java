package com.monster.job.dto.jobposting;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.Builder;
import lombok.Getter;

import javax.validation.constraints.NotNull;

@Getter
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder("@type")
public class Organization {

    @JsonProperty("@context")
    private String context;

    @JsonProperty("@type")
    private String type;

    private String name;

    private String alternateName;


    @Builder(builderMethodName = "organizationBuilder")
    public Organization(String name, String alternateName) {
        this.name = name;
        this.alternateName = alternateName;
    }

    public void setContext(String context) {
        this.context = context;
    }

    public void setType(String type) {
        this.type = type;
    }

}
