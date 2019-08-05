package com.monster.job.dto.job;


// holds search engine optimization location data
// for Now Jobads these are generally the things we tagged on the Now Jobad related to location
import lombok.Builder;
import lombok.Getter;


@Getter
public class SeoLocation {
    private String country;
    private Number countryId;
    private String stateName;
    private Number locationId;
    private Number monsLocationId;
    private Number monsCountryLocationId;
    private Number monsStateLocationId;
    private String monsCityLocationId;

    @Builder
    public SeoLocation(String country,
               String stateName,
               Number countryId,
               Number locationId,
               Number monsLocationId,
               Number monsCountryLocationId,
               Number monsStateLocationId,
               String monsCityLocationId) {
        this.country = country;
        this.stateName = stateName;
        this.countryId = countryId;
        this.locationId = locationId;
        this.monsLocationId = monsLocationId;
        this.monsCountryLocationId = monsCountryLocationId;
        this.monsStateLocationId = monsStateLocationId;
        this.monsCityLocationId = monsCityLocationId;
    }
}
