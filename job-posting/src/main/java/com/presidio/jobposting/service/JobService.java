package com.presidio.jobposting.service;

import com.presidio.jobposting.JobNotFoundException;
import com.presidio.jobposting.model.JobInfo;

import java.util.List;
import java.util.Optional;

public interface JobService {

    void createJob(JobInfo jobInfo);

    List<JobInfo> fetchJobs();

    void deleteJob(String id);

    JobInfo updateJob(JobInfo jobInfo, String id) throws JobNotFoundException;

    Optional<JobInfo> findById(String id);
}
