package com.monster.job.dto.jobposting;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.Builder;
import lombok.Getter;

import java.util.Date;


@Getter
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({"@context","@type"})
public class JobPosting {

    @JsonProperty("@context")
    private String context;

    @JsonProperty("@type")
    private String type;

    private String title;

    private Date datePosted;

    private String description;

    private Organization hiringOrganization;

    private Place jobLocation;

    private Date validThrough;

    private String jobLocationType;

    private MonetaryAmount baseSalary;

    private MonetaryAmount estimatedSalary;

    private String employmentType;

    private String url;

    private String skills; // todo

    private PropertyValue identifier;

    private Occupation relevantOccupation;

    private String occupationalCategory;

    private String experienceRequirements;

    private String educationalRequirements;

    private String industry;

    private String incentiveCompensation;

    private String salaryCurrency;

    private String jobBenefits;

    private Boolean jobImmediateStart;

    private Date jobStartDate;

    private String responsibilities;

    private String specialCommitments;

    private AdministrativeArea applicantLocationRequirements;

    private String workHours;


    @Builder(builderMethodName = "jobPostingBuilder")
    public JobPosting(String description,
                      Organization hiringOrganization,
                      String title,
                      Place jobLocation,
                      String jobLocationType,
                      MonetaryAmount baseSalary,
                      MonetaryAmount estimatedSalary,
                      Date validThrough,
                      Date datePosted,
                      String url,
                      PropertyValue identifier,
                      Occupation relevantOccupation,
                      String occupationalCategory,
                      String experienceRequirements,
                      String educationalRequirements,
                      String industry,
                      String skills,
                      String employmentType,
                      String incentiveCompensation,
                      String salaryCurrency,
                      String jobBenefits,
                      Boolean jobImmediateStart,
                      Date jobStartDate,
                      String responsibilities,
                      String specialCommitments,
                      AdministrativeArea applicantLocationRequirements,
                      String workHours) {
        this.title = title;
        this.description = description;
        this.hiringOrganization = hiringOrganization;
        this.jobLocation = jobLocation;
        this.jobLocationType = jobLocationType;
        this.baseSalary = baseSalary;
        this.estimatedSalary = estimatedSalary;
        this.validThrough = validThrough;
        this.datePosted = datePosted;
        this.url = url;
        this.identifier = identifier;
        this.relevantOccupation = relevantOccupation;
        this.occupationalCategory = occupationalCategory;
        this.experienceRequirements = experienceRequirements;
        this.educationalRequirements = educationalRequirements;
        this.industry = industry;
        this.skills = skills;
        this.employmentType = employmentType;
        this.incentiveCompensation = incentiveCompensation;
        this.salaryCurrency = salaryCurrency;
        this.jobBenefits = jobBenefits;
        this.jobImmediateStart = jobImmediateStart;
        this.jobStartDate = jobStartDate;
        this.responsibilities = responsibilities;
        this.specialCommitments = specialCommitments;
        this.applicantLocationRequirements = applicantLocationRequirements;
        this.workHours = workHours;
    }


    // Getters and Setters//

    @JsonProperty("@context")
    public void setContext(String context) {
        this.context = context;
    }

    @JsonProperty("@type")
    public void setType(String type) {
        this.type = type;
    }


}
