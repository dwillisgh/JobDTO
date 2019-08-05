package com.monster.job.dto.job;

import lombok.Builder;
import lombok.Getter;


@Getter
public class Video {

    private String brightcoveid;

    @Builder
    public Video(String brightcoveid) {

        this.brightcoveid = brightcoveid;
    }
}
