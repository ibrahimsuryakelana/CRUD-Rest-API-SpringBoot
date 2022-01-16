package com.domain.models.repos;

import com.domain.models.entities.Youtube;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface YoutubeRepo extends CrudRepository<Youtube, Long> {
    List<Youtube> findByContains(String name);
}
