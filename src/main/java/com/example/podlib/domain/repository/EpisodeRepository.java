package com.example.podlib.domain.repository;

import com.example.podlib.domain.model.Episode;
import org.springframework.stereotype.Repository;

public interface EpisodeRepository {
    Episode save(Episode episode);
}
