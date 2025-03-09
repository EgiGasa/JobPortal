package com.lhind.internship.JobPortal.controller;

import com.lhind.internship.JobPortal.model.entity.Job;
import com.lhind.internship.JobPortal.service.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/jobs")
public class JobController {

    private final JobService jobService;

    @Autowired
    public JobController(JobService jobService) {
        this.jobService = jobService;
    }


    @PostMapping("/postJob")
    public ResponseEntity<Job> postJob(@RequestBody Job job) {
        return ResponseEntity.ok(jobService.postJob(job));
    }


    @GetMapping("/getJobsByEmployer/{employerId}")
    public ResponseEntity<Page<Job>> getJobsByEmployer(
            @PathVariable Long employerId,
            @RequestParam(required = false) String title,
            @RequestParam(required = false) String location,
            Pageable pageable) {
        return ResponseEntity.ok(jobService.getJobsByEmployer(employerId, title, location, pageable));
    }


    @GetMapping("/getAllJobs")
    public ResponseEntity<Page<Job>> getAllJobs(
            @RequestParam(required = false) String title,
            @RequestParam(required = false) String location,
            @RequestParam(required = false) Long employerId,
            Pageable pageable) {
        return ResponseEntity.ok(jobService.getAllJobs(title, location, employerId, pageable));
    }
}