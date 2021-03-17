package com.presidio.jobposting.controller;

import com.presidio.jobposting.JobNotFoundException;
import com.presidio.jobposting.model.JobInfo;
import com.presidio.jobposting.service.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = {"http://localhost:4200", "http://localhost:8083"} )
public class JobController {

    @Autowired
    private JobService jobService;

    @PostMapping("/job")
    public void createJob(@RequestBody JobInfo jobInfo){
        jobService.createJob(jobInfo);
    }

    @GetMapping("/job")
    public ResponseEntity<List<JobInfo>> fetchAllJob(){
        return ResponseEntity.ok().body(jobService.fetchJobs());
    }

    @GetMapping("/job/{id}")
    public ResponseEntity<JobInfo> getById(@PathVariable String id){
        return ResponseEntity.ok().body(jobService.findById(id).get());
    }

    @DeleteMapping("/job/{id}")
    public void deleteJob(@PathVariable String id){
        jobService.deleteJob(id);
    }

    @PatchMapping("/job/{id}")
    public ResponseEntity<JobInfo> updateJob(@RequestBody JobInfo jobInfo,
                                             @PathVariable String id) throws JobNotFoundException {
        return ResponseEntity.ok().body(jobService.updateJob(jobInfo, id));
    }
}
