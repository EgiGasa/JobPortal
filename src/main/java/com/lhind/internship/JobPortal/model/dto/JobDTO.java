package com.lhind.internship.JobPortal.model.dto;

import com.lhind.internship.JobPortal.model.enums.JobStatus;
import com.lhind.internship.JobPortal.model.enums.JobType;
import com.lhind.internship.JobPortal.model.enums.WorkModel;

import java.time.LocalDateTime;

public class JobDTO {
    private Long id;
    private String title;
    private String description;
    private Double salary;
    private LocalDateTime deadline;
    private JobStatus status;
    private WorkModel workModel;
    private JobType jobType;
    private Long locationId;
    private Long jobCategoryId;
    private Long postedById;


    public JobDTO(Long id, String title, String description, Double salary, LocalDateTime deadline, JobStatus status, WorkModel workModel, JobType jobType, Long locationId, Long jobCategoryId, Long postedById) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.salary = salary;
        this.deadline = deadline;
        this.status = status;
        this.workModel = workModel;
        this.jobType = jobType;
        this.locationId = locationId;
        this.jobCategoryId = jobCategoryId;
        this.postedById = postedById;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public LocalDateTime getDeadline() {
        return deadline;
    }

    public void setDeadline(LocalDateTime deadline) {
        this.deadline = deadline;
    }

    public JobStatus getStatus() {
        return status;
    }

    public void setStatus(JobStatus status) {
        this.status = status;
    }

    public WorkModel getWorkModel() {
        return workModel;
    }

    public void setWorkModel(WorkModel workModel) {
        this.workModel = workModel;
    }

    public JobType getJobType() {
        return jobType;
    }

    public void setJobType(JobType jobType) {
        this.jobType = jobType;
    }

    public Long getLocationId() {
        return locationId;
    }

    public void setLocationId(Long locationId) {
        this.locationId = locationId;
    }

    public Long getJobCategoryId() {
        return jobCategoryId;
    }

    public void setJobCategoryId(Long jobCategoryId) {
        this.jobCategoryId = jobCategoryId;
    }

    public Long getPostedById() {
        return postedById;
    }

    public void setPostedById(Long postedById) {
        this.postedById = postedById;
    }
}