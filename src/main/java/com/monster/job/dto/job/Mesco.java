package com.monster.job.dto.job;

import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;

import java.util.List;

@Getter
@EqualsAndHashCode
public class Mesco  implements Comparable<Mesco> {

    private Number id;

    private String alias;

    private String usen;

    private List<String> normalizedTokens;

    @Builder
    public Mesco(Number id,
                 String alias,
                 String usen,
                 List<String> normalizedTokens ) {

        this.id = id;
        this.alias = alias;
        this.usen = usen;
        this.normalizedTokens = normalizedTokens;
    }

    @Override
    public int compareTo(Mesco mescoObj) {
        if (this.getId().equals(mescoObj.getId())) {
            return 0;
        }
        else if (this.getId().longValue() < mescoObj.getId().longValue()) {
            return 1;
        }
        else {
            return -1;
        }
    }



}
