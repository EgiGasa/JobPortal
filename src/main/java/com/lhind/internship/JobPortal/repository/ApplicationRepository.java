package com.lhind.internship.JobPortal.repository;

import com.lhind.internship.JobPortal.model.entity.Application;
import com.lhind.internship.JobPortal.model.enums.ApplicationStatusType;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ApplicationRepository extends JpaRepository<Application, Long> {

    Page<Application> findByJobId(Long jobId, Pageable pageable);

    Page<Application> findByJobIdAndCurrentStatus(Long jobId, ApplicationStatusType currentStatus, Pageable pageable);

    Page<Application> findByAppliedById(Long jobSeekerId, Pageable pageable);

    Page<Application> findByAppliedByIdAndJobTitleContaining(Long jobSeekerId, String title, Pageable pageable);

    Page<Application> findByAppliedByIdAndCurrentStatus(Long jobSeekerId, ApplicationStatusType currentStatus, Pageable pageable);

    Page<Application> findByAppliedByIdAndJobTitleContainingAndCurrentStatus(Long jobSeekerId, String title, ApplicationStatusType currentStatus, Pageable pageable);
}