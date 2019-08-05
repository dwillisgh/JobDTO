package com.monster.job.dto.job;

import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;

import java.util.List;

@Getter
@EqualsAndHashCode
public class RankedSkill implements Comparable<RankedSkill>{

    private String name;

    private Number score;
    @Builder
    public RankedSkill(String name,
                       Number score) {

        this.name = name;
        this.score = score;
    }

    @Override
    public int compareTo(RankedSkill rsObj) {
        return this.getName().compareTo(rsObj.getName());
    }
}
