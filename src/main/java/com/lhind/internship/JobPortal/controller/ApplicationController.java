package com.lhind.internship.JobPortal.controller;
import com.lhind.internship.JobPortal.model.entity.Application;
import com.lhind.internship.JobPortal.model.enums.ApplicationStatusType;
import com.lhind.internship.JobPortal.service.ApplicationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/applications")
public class ApplicationController {

    private final ApplicationService applicationService;

    @Autowired
    public ApplicationController(ApplicationService applicationService) {
        this.applicationService = applicationService;
    }


    @PostMapping("/applyForJob")
    public ResponseEntity<Application> applyForJob(@RequestBody Application application) {
        return ResponseEntity.ok(applicationService.applyForJob(application));
    }


    @GetMapping("/getApplicationsForJob/{jobId}")
    public ResponseEntity<Page<Application>> getApplicationsForJob(
            @PathVariable Long jobId,
            @RequestParam(required = false) ApplicationStatusType status,
            Pageable pageable) {
        return ResponseEntity.ok(applicationService.getApplicationsForJob(jobId, status, pageable));
    }


    @PutMapping("/updateApplicationStatus/{applicationId}")
    public ResponseEntity<Application> updateApplicationStatus(
            @PathVariable Long applicationId,
            @RequestParam ApplicationStatusType status) {
        return ResponseEntity.ok(applicationService.updateApplicationStatus(applicationId, status));
    }


    @GetMapping("/getApplicationsByJobSeeker/{jobSeekerId}")
    public ResponseEntity<Page<Application>> getApplicationsByJobSeeker(
            @PathVariable Long jobSeekerId,
            @RequestParam(required = false) String title,
            @RequestParam(required = false) ApplicationStatusType status,
            Pageable pageable) {
        return ResponseEntity.ok(applicationService.getApplicationsByJobSeeker(jobSeekerId, title, status, pageable));
    }
}
