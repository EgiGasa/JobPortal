package com.lhind.internship.JobPortal.model.resource;

import java.time.LocalDateTime;

public record ReviewResource(
        Long id,
        Integer rating,
        String reviewTitle,
        String comment,
        LocalDateTime createdAt,
        Long reviewedById,
        Long jobId
) {

}
