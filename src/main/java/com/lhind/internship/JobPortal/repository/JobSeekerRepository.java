package com.lhind.internship.JobPortal.repository;

import com.lhind.internship.JobPortal.model.entity.JobSeeker;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JobSeekerRepository extends JpaRepository<JobSeeker, Long> {
    JobSeeker findByUsername(String username);
}
