package com.example.podlib.domain.model;

import lombok.Data;

@Data
public class Episode {
    private String title;
    private String description;
    private Long duration;
    private String path;
    private String thumbnail;
    private Author author;

}
