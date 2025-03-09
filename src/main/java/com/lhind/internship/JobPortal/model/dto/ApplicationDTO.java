package com.lhind.internship.JobPortal.model.dto;

import com.lhind.internship.JobPortal.model.enums.ApplicationStatusType;

import java.time.LocalDateTime;

public class ApplicationDTO {
    private Long id;
    private String resumeUrl;
    private String coverLetterUrl;
    private LocalDateTime appliedAt;
    private ApplicationStatusType status;
    private Long appliedById;
    private Long jobId;


    public ApplicationDTO(Long id, String resumeUrl, String coverLetterUrl, LocalDateTime appliedAt, ApplicationStatusType status, Long appliedById, Long jobId) {
        this.id = id;
        this.resumeUrl = resumeUrl;
        this.coverLetterUrl = coverLetterUrl;
        this.appliedAt = appliedAt;
        this.status = status;
        this.appliedById = appliedById;
        this.jobId = jobId;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getResumeUrl() {
        return resumeUrl;
    }

    public void setResumeUrl(String resumeUrl) {
        this.resumeUrl = resumeUrl;
    }

    public String getCoverLetterUrl() {
        return coverLetterUrl;
    }

    public void setCoverLetterUrl(String coverLetterUrl) {
        this.coverLetterUrl = coverLetterUrl;
    }

    public LocalDateTime getAppliedAt() {
        return appliedAt;
    }

    public void setAppliedAt(LocalDateTime appliedAt) {
        this.appliedAt = appliedAt;
    }

    public ApplicationStatusType getStatus() {
        return status;
    }

    public void setStatus(ApplicationStatusType status) {
        this.status = status;
    }

    public Long getAppliedById() {
        return appliedById;
    }

    public void setAppliedById(Long appliedById) {
        this.appliedById = appliedById;
    }

    public Long getJobId() {
        return jobId;
    }

    public void setJobId(Long jobId) {
        this.jobId = jobId;
    }
}
