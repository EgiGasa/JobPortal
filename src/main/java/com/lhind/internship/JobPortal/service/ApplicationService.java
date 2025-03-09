package com.lhind.internship.JobPortal.service;

import com.lhind.internship.JobPortal.model.entity.Application;
import com.lhind.internship.JobPortal.model.enums.ApplicationStatusType;
import com.lhind.internship.JobPortal.repository.ApplicationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ApplicationService {

    private final ApplicationRepository applicationRepository;

    @Autowired
    public ApplicationService(ApplicationRepository applicationRepository) {
        this.applicationRepository = applicationRepository;
    }


    @Transactional
    public Application applyForJob(Application application) {
        return applicationRepository.save(application);
    }


    public Page<Application> getApplicationsForJob(Long jobId, ApplicationStatusType status, Pageable pageable) {
        if (status != null) {
            return applicationRepository.findByJobIdAndCurrentStatus(jobId, status, pageable);
        }
        return applicationRepository.findByJobId(jobId, pageable);
    }


    @Transactional
    public Application updateApplicationStatus(Long applicationId, ApplicationStatusType status) {
        Application application = applicationRepository.findById(applicationId)
                .orElseThrow(() -> new RuntimeException("Application not found with ID: " + applicationId));
        application.setCurrentStatus(status); // Use setCurrentStatus
        return applicationRepository.save(application);
    }


    public Page<Application> getApplicationsByJobSeeker(Long jobSeekerId, String title, ApplicationStatusType status, Pageable pageable) {
        if (title != null && status != null) {
            return applicationRepository.findByAppliedByIdAndJobTitleContainingAndCurrentStatus(jobSeekerId, title, status, pageable);
        } else if (title != null) {
            return applicationRepository.findByAppliedByIdAndJobTitleContaining(jobSeekerId, title, pageable);
        } else if (status != null) {
            return applicationRepository.findByAppliedByIdAndCurrentStatus(jobSeekerId, status, pageable);
        }
        return applicationRepository.findByAppliedById(jobSeekerId, pageable);
    }
}