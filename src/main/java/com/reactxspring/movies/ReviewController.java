package com.reactxspring.movies;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/api/v1/reviews")
public class ReviewController {
     @Autowired
    private ReviewService reviewService;

    @PostMapping
    public Review createReview(@RequestBody Map<String,String> payload){
        return reviewService.createReview(payload.get("reviewBody"),payload.get("imdbId"));
    }
}
