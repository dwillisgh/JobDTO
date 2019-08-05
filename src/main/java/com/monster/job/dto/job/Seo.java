package com.monster.job.dto.job;

import java.util.List;

// holds search engine optimization data
// for Now Jobads these are generally the things we tagged on the Now Jobad.
import lombok.Builder;
import lombok.Getter;


@Getter
public class Seo {
    private List<RankedSkill> rankedSkills;

    private List<Niche> niches;

    private List<NormalizedTitle> normalizedTitles;

    private SeoLocation location;

    private String jobCategory;

    @Builder
    public Seo(List<RankedSkill> rankedSkills,
               List<Niche> niches,
               List<NormalizedTitle> normalizedTitles,
               SeoLocation location,
               String jobCategory) {
        this.rankedSkills = rankedSkills;
        this.niches = niches;
        this.normalizedTitles = normalizedTitles;
        this.location = location;
        this.jobCategory = jobCategory;
    }
}
