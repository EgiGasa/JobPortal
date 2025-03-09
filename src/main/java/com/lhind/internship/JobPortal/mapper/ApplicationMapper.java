package com.lhind.internship.JobPortal.mapper;

import com.lhind.internship.JobPortal.model.dto.ApplicationDTO;
import com.lhind.internship.JobPortal.model.entity.Application;
import org.springframework.stereotype.Component;

@Component
public class ApplicationMapper {

    public ApplicationDTO toDTO(Application application) {
        return new ApplicationDTO(
                application.getId(),
                application.getResumeUrl(),
                application.getCoverLetterUrl(),
                application.getAppliedAt(),
                application.getCurrentStatus(),
                application.getAppliedBy().getId(),
                application.getJob().getId()
        );
    }

    public Application toEntity(ApplicationDTO applicationDTO) {
        Application application = new Application();
        application.setId(applicationDTO.getId());
        application.setResumeUrl(applicationDTO.getResumeUrl());
        application.setCoverLetterUrl(applicationDTO.getCoverLetterUrl());
        application.setAppliedAt(applicationDTO.getAppliedAt());
        application.setCurrentStatus(applicationDTO.getStatus());

        return application;
    }
}
