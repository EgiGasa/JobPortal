package com.lhind.internship.JobPortal.repository;


import com.lhind.internship.JobPortal.model.entity.Review;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReviewRepository extends JpaRepository<Review, Long> {


    Page<Review> findByJobId(Long jobId, Pageable pageable);


    Page<Review> findByJobIdAndRating(Long jobId, Integer rating, Pageable pageable);
}
