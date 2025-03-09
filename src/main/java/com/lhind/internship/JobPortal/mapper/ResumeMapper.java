package com.lhind.internship.JobPortal.mapper;

import com.lhind.internship.JobPortal.model.dto.ResumeDTO;
import com.lhind.internship.JobPortal.model.entity.Resume;
import org.springframework.stereotype.Component;

@Component
public class ResumeMapper {

    public ResumeDTO toDTO(Resume resume) {
        return new ResumeDTO(
                resume.getId(),
                resume.getFileUrl(),
                resume.getUploadedAt(),
                resume.getUploadedBy().getId()
        );
    }

    public Resume toEntity(ResumeDTO resumeDTO) {
        Resume resume = new Resume();
        resume.setId(resumeDTO.getId());
        resume.setFileUrl(resumeDTO.getFileUrl());
        resume.setUploadedAt(resumeDTO.getUploadedAt());

        return resume;
    }
}