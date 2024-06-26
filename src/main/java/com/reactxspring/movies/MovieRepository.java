package com.reactxspring.movies;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import org.bson.types.ObjectId;

import java.util.Optional;

@Repository
public interface MovieRepository extends MongoRepository<Movie,ObjectId> {

Optional<Movie> findMovieByImdbId(String imdbId);
}
