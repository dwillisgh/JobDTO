package com.monster.job.dto.jobposting;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.Builder;
import lombok.Getter;

@Getter
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({"@context","@type"})
public class CategoryCode {

    @JsonProperty("@context")
    private String context;

    @JsonProperty("@type")
    private String type;

    private CategoryCodeSet inCodeSet;

    private String codeValue;

    private String name;

    private String url;


    @Builder(builderMethodName = "CategoryCodeBuilder")
    public CategoryCode(CategoryCodeSet inCodeSet, String codeValue, String name, String url) {
        this.inCodeSet = inCodeSet;
        this.codeValue = codeValue;
        this.name = name;
        this.url = url;
    }

    public void setContext(String context) {
        this.context = context;
    }

    public void setType(String type) {
        this.type = type;
    }
}
