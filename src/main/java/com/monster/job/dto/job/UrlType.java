package com.monster.job.dto.job;

import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;

import java.util.List;


@Getter
@EqualsAndHashCode
public class UrlType implements Comparable<UrlType>{
    private String type;
    private String url;

    @Builder
    public UrlType(String type,
                 String url) {

        this.type = type;
        this.url = url;
    }

    @Override
    public int compareTo(UrlType urlObj) {
        return this.getType().compareTo(urlObj.getType());
    }
}
