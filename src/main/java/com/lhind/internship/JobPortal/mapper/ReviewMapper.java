package com.lhind.internship.JobPortal.mapper;

import com.lhind.internship.JobPortal.model.dto.ReviewDTO;
import com.lhind.internship.JobPortal.model.entity.Review;
import org.springframework.stereotype.Component;

@Component
public class ReviewMapper {

    public ReviewDTO toDTO(Review review) {
        return new ReviewDTO(
                review.getId(),
                review.getRating(),
                review.getReviewTitle(),
                review.getComment(),
                review.getCreatedAt(),
                review.getReviewedBy().getId(),
                review.getJob().getId()
        );
    }

    public Review toEntity(ReviewDTO reviewDTO) {
        Review review = new Review();
        review.setId(reviewDTO.getId());
        review.setRating(reviewDTO.getRating());
        review.setReviewTitle(reviewDTO.getReviewTitle());
        review.setComment(reviewDTO.getComment());
        review.setCreatedAt(reviewDTO.getCreatedAt());

        return review;
    }
}
