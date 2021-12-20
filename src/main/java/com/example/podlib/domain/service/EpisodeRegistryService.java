package com.example.podlib.domain.service;

import com.example.podlib.domain.model.Episode;
import com.example.podlib.domain.repository.EpisodeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EpisodeRegistryService {

    @Autowired
    private EpisodeRepository repository;

    public void save(Episode episode) {
        repository.save(episode);
    }
}
