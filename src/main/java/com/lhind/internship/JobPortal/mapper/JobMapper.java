package com.lhind.internship.JobPortal.mapper;

import com.lhind.internship.JobPortal.model.dto.JobDTO;
import com.lhind.internship.JobPortal.model.entity.Job;
import org.springframework.stereotype.Component;

@Component
public class JobMapper {

    public JobDTO toDTO(Job job) {
        return new JobDTO(
                job.getId(),
                job.getTitle(),
                job.getDescription(),
                job.getSalary(),
                job.getDeadline(),
                job.getStatus(),
                job.getWorkModel(),
                job.getJobType(),
                job.getLocation().getId(),
                job.getJobCategory().getId(),
                job.getPostedBy().getId()
        );
    }

    public Job toEntity(JobDTO jobDTO) {
        Job job = new Job();
        job.setId(jobDTO.getId());
        job.setTitle(jobDTO.getTitle());
        job.setDescription(jobDTO.getDescription());
        job.setSalary(jobDTO.getSalary());
        job.setDeadline(jobDTO.getDeadline());
        job.setStatus(jobDTO.getStatus());
        job.setWorkModel(jobDTO.getWorkModel());
        job.setJobType(jobDTO.getJobType());

        return job;
    }
}