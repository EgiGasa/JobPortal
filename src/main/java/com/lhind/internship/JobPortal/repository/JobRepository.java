package com.lhind.internship.JobPortal.repository;

import com.lhind.internship.JobPortal.model.entity.Job;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JobRepository extends JpaRepository<Job, Long> {


    Page<Job> findByPostedById(Long employerId, Pageable pageable);

    Page<Job> findByPostedByIdAndTitleContaining(Long employerId, String title, Pageable pageable);

    Page<Job> findByPostedByIdAndLocationCityContaining(Long employerId, String location, Pageable pageable);

    Page<Job> findByPostedByIdAndTitleContainingAndLocationCityContaining(Long employerId, String title, String location, Pageable pageable);

    Page<Job> findByTitleContaining(String title, Pageable pageable);

    Page<Job> findByLocationCityContaining(String location, Pageable pageable);

    Page<Job> findByTitleContainingAndLocationCityContaining(String title, String location, Pageable pageable);

    Page<Job> findByTitleContainingAndPostedById(String title, Long employerId, Pageable pageable);

    Page<Job> findByLocationCityContainingAndPostedById(String location, Long employerId, Pageable pageable);

    Page<Job> findByTitleContainingAndLocationCityContainingAndPostedById(String title, String location, Long employerId, Pageable pageable);
}
