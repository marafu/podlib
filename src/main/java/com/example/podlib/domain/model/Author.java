package com.example.podlib.domain.model;

import lombok.Data;

import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import java.util.ArrayList;
import java.util.List;

@Data
public class Author {
    private String name;
    private String description;
    private String category;

    @OneToMany
    private List<Episode> episodes = new ArrayList<>();

}
