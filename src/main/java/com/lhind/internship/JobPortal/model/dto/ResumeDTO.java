package com.lhind.internship.JobPortal.model.dto;

import java.time.LocalDateTime;

public class ResumeDTO {
    private Long id;
    private String fileUrl;
    private LocalDateTime uploadedAt;
    private Long uploadedById;


    public ResumeDTO(Long id, String fileUrl, LocalDateTime uploadedAt, Long uploadedById) {
        this.id = id;
        this.fileUrl = fileUrl;
        this.uploadedAt = uploadedAt;
        this.uploadedById = uploadedById;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFileUrl() {
        return fileUrl;
    }

    public void setFileUrl(String fileUrl) {
        this.fileUrl = fileUrl;
    }

    public LocalDateTime getUploadedAt() {
        return uploadedAt;
    }

    public void setUploadedAt(LocalDateTime uploadedAt) {
        this.uploadedAt = uploadedAt;
    }

    public Long getUploadedById() {
        return uploadedById;
    }

    public void setUploadedById(Long uploadedById) {
        this.uploadedById = uploadedById;
    }
}