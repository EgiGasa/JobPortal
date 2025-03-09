package com.lhind.internship.JobPortal.service;

import com.lhind.internship.JobPortal.model.entity.Job;
import com.lhind.internship.JobPortal.repository.JobRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class JobService {

    private final JobRepository jobRepository;

    @Autowired
    public JobService(JobRepository jobRepository) {
        this.jobRepository = jobRepository;
    }


    @Transactional
    public Job postJob(Job job) {
        return jobRepository.save(job);
    }


    public Page<Job> getJobsByEmployer(Long employerId, String title, String location, Pageable pageable) {
        if (title != null && location != null) {
            return jobRepository.findByPostedByIdAndTitleContainingAndLocationCityContaining(employerId, title, location, pageable);
        } else if (title != null) {
            return jobRepository.findByPostedByIdAndTitleContaining(employerId, title, pageable);
        } else if (location != null) {
            return jobRepository.findByPostedByIdAndLocationCityContaining(employerId, location, pageable);
        }
        return jobRepository.findByPostedById(employerId, pageable);
    }


    public Page<Job> getAllJobs(String title, String location, Long employerId, Pageable pageable) {
        if (title != null && location != null && employerId != null) {
            return jobRepository.findByTitleContainingAndLocationCityContainingAndPostedById(title, location, employerId, pageable);
        } else if (title != null && location != null) {
            return jobRepository.findByTitleContainingAndLocationCityContaining(title, location, pageable);
        } else if (title != null && employerId != null) {
            return jobRepository.findByTitleContainingAndPostedById(title, employerId, pageable);
        } else if (location != null && employerId != null) {
            return jobRepository.findByLocationCityContainingAndPostedById(location, employerId, pageable);
        } else if (title != null) {
            return jobRepository.findByTitleContaining(title, pageable);
        } else if (location != null) {
            return jobRepository.findByLocationCityContaining(location, pageable);
        } else if (employerId != null) {
            return jobRepository.findByPostedById(employerId, pageable);
        }
        return jobRepository.findAll(pageable);
    }
}
