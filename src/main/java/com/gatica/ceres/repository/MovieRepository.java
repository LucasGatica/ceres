package com.gatica.ceres.repository;

import com.gatica.ceres.model.MovieItem;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MovieRepository extends MongoRepository<MovieItem, String> {
    List<MovieItem> findByUser(String name);

}
