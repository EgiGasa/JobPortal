package com.lhind.internship.JobPortal.model.dto;

import java.time.LocalDateTime;

public class ReviewDTO {
    private Long id;
    private Integer rating;
    private String reviewTitle;
    private String comment;
    private LocalDateTime createdAt;
    private Long reviewedById;
    private Long jobId;


    public ReviewDTO(Long id, Integer rating, String reviewTitle, String comment, LocalDateTime createdAt, Long reviewedById, Long jobId) {
        this.id = id;
        this.rating = rating;
        this.reviewTitle = reviewTitle;
        this.comment = comment;
        this.createdAt = createdAt;
        this.reviewedById = reviewedById;
        this.jobId = jobId;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getRating() {
        return rating;
    }

    public void setRating(Integer rating) {
        this.rating = rating;
    }

    public String getReviewTitle() {
        return reviewTitle;
    }

    public void setReviewTitle(String reviewTitle) {
        this.reviewTitle = reviewTitle;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public Long getReviewedById() {
        return reviewedById;
    }

    public void setReviewedById(Long reviewedById) {
        this.reviewedById = reviewedById;
    }

    public Long getJobId() {
        return jobId;
    }

    public void setJobId(Long jobId) {
        this.jobId = jobId;
    }
}