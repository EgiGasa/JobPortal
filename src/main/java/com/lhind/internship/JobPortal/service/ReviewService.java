package com.lhind.internship.JobPortal.service;

import com.lhind.internship.JobPortal.model.entity.Review;
import com.lhind.internship.JobPortal.repository.ReviewRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ReviewService {

    private final ReviewRepository reviewRepository;

    @Autowired
    public ReviewService(ReviewRepository reviewRepository) {
        this.reviewRepository = reviewRepository;
    }


    @Transactional
    public Review addReview(Review review) {
        return reviewRepository.save(review);
    }


    public Page<Review> getReviewsForJob(Long jobId, Integer rating, Pageable pageable) {
        if (rating != null) {
            return reviewRepository.findByJobIdAndRating(jobId, rating, pageable);
        }
        return reviewRepository.findByJobId(jobId, pageable);
    }
}