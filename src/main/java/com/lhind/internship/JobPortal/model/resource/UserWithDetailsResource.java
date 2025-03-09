package com.lhind.internship.JobPortal.model.resource;

public record UserWithDetailsResource(
        String username,
        String role,
        String firstName,
        String lastName,
        String email,
        String phoneNumber,
        String password
) {

}
