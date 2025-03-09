package com.lhind.internship.JobPortal.model.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.lhind.internship.JobPortal.model.enums.ApplicationStatusType;
import jakarta.persistence.*;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "application")
public class Application {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", unique = true, nullable = false)
    private Long id;

    @Column(name = "resume_url", nullable = false)
    private String resumeUrl;

    @Column(name = "cover_letter_url")
    private String coverLetterUrl;

    @Column(name = "applied_at")
    @CreationTimestamp
    private LocalDateTime appliedAt;

    @Enumerated(EnumType.STRING)
    @Column(name = "current_status", nullable = false)
    private ApplicationStatusType currentStatus;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "job_seeker_id")
    private JobSeeker appliedBy;

    @ManyToOne
    @JoinColumn(name = "job_id", nullable = false)
    private Job job;

    @OneToMany(mappedBy = "application", cascade = CascadeType.ALL)
    private List<ApplicationStatus> statusHistory;


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

    public ApplicationStatusType getCurrentStatus() {
        return currentStatus;
    }

    public void setCurrentStatus(ApplicationStatusType currentStatus) {
        this.currentStatus = currentStatus;
    }

    public JobSeeker getAppliedBy() {
        return appliedBy;
    }

    public void setAppliedBy(JobSeeker appliedBy) {
        this.appliedBy = appliedBy;
    }

    public Job getJob() {
        return job;
    }

    public void setJob(Job job) {
        this.job = job;
    }

    public List<ApplicationStatus> getStatusHistory() {
        return statusHistory;
    }

    public void setStatusHistory(List<ApplicationStatus> statusHistory) {
        this.statusHistory = statusHistory;
    }
}