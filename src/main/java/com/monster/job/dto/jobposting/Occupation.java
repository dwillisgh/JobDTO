package com.monster.job.dto.jobposting;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.Builder;
import lombok.Getter;

@Getter
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({"@context","@type"})
public class Occupation {

    @JsonProperty("@context")
    private String context;

    @JsonProperty("@type")
    private String type;

    private String name;

    private CategoryCode occupationalCategory;

    @Builder(builderMethodName = "OccupationBuilder")
    public Occupation(String name, CategoryCode occupationalCategory) {
        this.name = name;
        this.occupationalCategory = occupationalCategory;
    }

    public void setContext(String context) {
        this.context = context;
    }

    public void setType(String type) {
        this.type = type;
    }
}
