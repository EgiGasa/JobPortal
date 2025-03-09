package com.lhind.internship.JobPortal.controller;

import com.lhind.internship.JobPortal.model.entity.Resume;
import com.lhind.internship.JobPortal.service.ResumeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/resumes")
public class ResumeController {

    private final ResumeService resumeService;

    @Autowired
    public ResumeController(ResumeService resumeService) {
        this.resumeService = resumeService;
    }


    @PostMapping("/uploadResume")
    public ResponseEntity<Resume> uploadResume(@RequestBody Resume resume) {
        return ResponseEntity.ok(resumeService.uploadResume(resume));
    }
}
