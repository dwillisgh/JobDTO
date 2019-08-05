package com.monster.job.dto.job;

import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;

import java.util.List;

@Getter
@EqualsAndHashCode
public class NormalizedTitle implements Comparable<NormalizedTitle> {

    private String title;

    @Builder
    public NormalizedTitle(String title) {
        this.title = title;
    }

    @Override
    public int compareTo(NormalizedTitle rsObj) {
        return this.getTitle().compareTo(rsObj.getTitle());
    }
}
