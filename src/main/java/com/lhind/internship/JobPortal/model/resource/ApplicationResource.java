package com.lhind.internship.JobPortal.model.resource;

import com.lhind.internship.JobPortal.model.enums.ApplicationStatusType;

import java.time.LocalDateTime;

public record ApplicationResource(
        Long id,
        String resumeUrl,
        String coverLetterUrl,
        LocalDateTime appliedAt,
        ApplicationStatusType status,
        Long appliedById,
        Long jobId,
        LocalDateTime createdAt,
        LocalDateTime updatedAt
) {

}
