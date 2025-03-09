package com.lhind.internship.JobPortal.model.resource;

import com.lhind.internship.JobPortal.model.enums.JobStatus;
import com.lhind.internship.JobPortal.model.enums.JobType;
import com.lhind.internship.JobPortal.model.enums.WorkModel;

import java.time.LocalDateTime;

public record JobResource(
        Long id,
        String title,
        String description,
        Double salary,
        LocalDateTime deadline,
        JobStatus status,
        WorkModel workModel,
        JobType jobType,
        Long locationId,
        Long jobCategoryId,
        Long postedById,
        LocalDateTime createdAt,
        LocalDateTime updatedAt
) {

}
