package com.monster.job.dto.job;

import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;

import java.util.List;

@Getter
@EqualsAndHashCode
public class Niche implements Comparable<Niche>{

    private Number id;

    private String alias;

    @Builder
    public Niche(Number id,
                 String alias) {

        this.id = id;
        this.alias = alias;
    }

    @Override
    public int compareTo(Niche nicheObj) {
        if (this.getId().equals(nicheObj.getId())) {
            return 0;
        }
        else if (this.getId().longValue() < nicheObj.getId().longValue()) {
            return 1;
        }
        else {
            return -1;
        }
    }

}
