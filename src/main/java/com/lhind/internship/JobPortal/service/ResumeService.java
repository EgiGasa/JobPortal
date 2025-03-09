package com.lhind.internship.JobPortal.service;

import com.lhind.internship.JobPortal.model.entity.JobSeeker;
import com.lhind.internship.JobPortal.model.entity.Resume;
import com.lhind.internship.JobPortal.model.entity.User;
import com.lhind.internship.JobPortal.repository.JobSeekerRepository;
import com.lhind.internship.JobPortal.repository.ResumeRepository;
import com.lhind.internship.JobPortal.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ResumeService {

    private final ResumeRepository resumeRepository;

    private final JobSeekerRepository jobSeekerRepository;

    @Autowired
    public ResumeService(ResumeRepository resumeRepository, JobSeekerRepository jobSeekerRepository) {
        this.resumeRepository = resumeRepository;
        this.jobSeekerRepository = jobSeekerRepository;
    }


    @Transactional
    public Resume uploadResume(Resume resume) {
        JobSeeker jobSeeker = jobSeekerRepository.findByUsername(resume.getUploadedBy().getUsername());
        if(jobSeeker != null) {
           resume.getUploadedBy().setId(jobSeeker.getId());
        }
        return resumeRepository.save(resume);
    }
}
