package com.monster.job.dto.jobposting;

import java.util.Date;

public class CategoryCodeSet {

    private String name;

    private Date dateModified;

    private String url;

    public CategoryCodeSet(String name, Date dateModified, String url) {
        this.name = name;
        this.dateModified = dateModified;
        this.url = url;
    }
}
