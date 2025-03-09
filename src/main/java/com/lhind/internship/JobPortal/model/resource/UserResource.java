package com.lhind.internship.JobPortal.model.resource;

import com.lhind.internship.JobPortal.model.enums.UserRole;

import java.time.LocalDateTime;

public record UserResource(
        Long id,
        String username,
        String email,
        String firstName,
        String lastName,
        String phoneNumber,
        UserRole role,
        LocalDateTime createdAt,
        LocalDateTime updatedAt
) {

}
