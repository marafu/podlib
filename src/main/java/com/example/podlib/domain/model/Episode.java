package com.example.podlib.domain.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class Episode {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String description;
    private Long duration;
    private String path;
    private String thumbnail;

    @ManyToOne
    private Author author;

}
