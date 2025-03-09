package com.lhind.internship.JobPortal.model.resource;

import java.time.LocalDateTime;

public record ResumeResource(
        Long id,
        String fileUrl,
        LocalDateTime uploadedAt,
        Long uploadedById
) {

}
