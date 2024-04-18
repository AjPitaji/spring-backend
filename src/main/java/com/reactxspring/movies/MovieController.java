package com.reactxspring.movies;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin(origins="*")
@RequestMapping("/api/v1/movies")
public class MovieController {

    @Autowired
    private MovieService movieService;

    @GetMapping
    public List<Movie> getAllMovies(){
        return movieService.allMovies();
    }

    @GetMapping("/{ImdbId}")
    public Optional<Movie> getSingleMovie(@PathVariable String ImdbId){
        return movieService.singleMovie(ImdbId);
    }

}
