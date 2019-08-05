package com.monster.job.dto.job;

import com.monster.job.dto.jobposting.*;

import java.util.Date;
import java.util.List;

import lombok.Builder;
import lombok.Getter;

@Getter
public class Job extends JobPosting {

    private List<Mesco> mescos;
    private Integer openings;
    private Seo seo;
    private List<UrlType> urlTypes;
    private Video video;

    // holds non content data
    private JobAd jobAd;

    @Builder(builderMethodName = "monsterJobPostingBuilder")
    public Job( // Job Posting properties
                              MonetaryAmount baseSalary,
                              MonetaryAmount estimatedSalary,
                              Date datePosted,
                              String description,
                              Organization hiringOrganization,
                              PropertyValue identifier,
                              Place jobLocation,
                              String jobLocationType,
                              String occupationalCategory,
                              Occupation relevantOccupation,
                              String title,
                              String url,
                              Date validThrough,
                              String experienceRequirements,
                              String educationalRequirements,
                              String industry,
                              String skills,
                              String employmentType,
                              // Monster Job Posting properties
                              List<Mesco> mescos,
                              Integer openings,
                              Seo seo,
                              List<UrlType> urlTypes,
                              Video video,
                              String incentiveCompensation,
                              String salaryCurrency,
                              String jobBenefits,
                              Boolean jobImmediateStart,
                              Date jobStartDate,
                              String responsibilities,
                              String specialCommitments,
                              AdministrativeArea applicantLocationRequirements,
                              String workHours) {
        super(description,
                hiringOrganization,
                title,
                jobLocation,
                jobLocationType,
                baseSalary,
                estimatedSalary,
                validThrough,
                datePosted,
                url,
                identifier,
                relevantOccupation,
                occupationalCategory,
                experienceRequirements,
                educationalRequirements,
                industry,
                skills,
                employmentType,
                incentiveCompensation,
                salaryCurrency,
                jobBenefits,
                jobImmediateStart,
                jobStartDate,
                responsibilities,
                specialCommitments,
                applicantLocationRequirements,
                workHours);

        this.mescos = mescos;
        this.urlTypes = urlTypes;
        this.seo = seo;
        this.openings = openings;
        this.video =  video;
    }
}
