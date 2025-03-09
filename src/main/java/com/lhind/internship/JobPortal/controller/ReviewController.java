package com.lhind.internship.JobPortal.controller;

import com.lhind.internship.JobPortal.model.entity.Review;
import com.lhind.internship.JobPortal.service.ReviewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/reviews")
public class ReviewController {

    private final ReviewService reviewService;

    @Autowired
    public ReviewController(ReviewService reviewService) {
        this.reviewService = reviewService;
    }


    @PostMapping("/addReview")
    public ResponseEntity<Review> addReview(@RequestBody Review review) {
        return ResponseEntity.ok(reviewService.addReview(review));
    }


    @GetMapping("/getReviewsForJob/{jobId}")
    public ResponseEntity<Page<Review>> getReviewsForJob(
            @PathVariable Long jobId,
            @RequestParam(required = false) Integer rating,
            Pageable pageable) {
        return ResponseEntity.ok(reviewService.getReviewsForJob(jobId, rating, pageable));
    }
}
