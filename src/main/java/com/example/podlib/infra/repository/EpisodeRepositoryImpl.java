package com.example.podlib.infra.repository;


import com.example.podlib.domain.model.Episode;
import com.example.podlib.domain.repository.EpisodeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;

@Repository
public class EpisodeRepositoryImpl implements EpisodeRepository {

    @Autowired
    private EntityManager entityManager;

    @Override
    public Episode save(Episode episode) {
        return entityManager.merge(episode);
    }
}
