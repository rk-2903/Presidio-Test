package com.presidio.jobposting.service.impl;

import com.presidio.jobposting.JobNotFoundException;
import com.presidio.jobposting.model.JobInfo;
import com.presidio.jobposting.repository.JobRepository;
import com.presidio.jobposting.service.JobService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class JobServiceImpl implements JobService {

    private final JobRepository jobRepository;

    public JobServiceImpl(JobRepository jobRepository) {
        this.jobRepository = jobRepository;
    }


    @Override
    public void createJob(JobInfo jobInfo) {
        jobRepository.save(jobInfo);
    }

    @Override
    public List<JobInfo> fetchJobs() {
        return jobRepository.findAll();
    }

    @Override
    public void deleteJob(String id) {
        jobRepository.deleteById(id);
    }

    @Override
    public JobInfo updateJob(JobInfo jobInfo, String id) throws JobNotFoundException {
        Optional<JobInfo> job = jobRepository.findById(id);
        try {
            jobInfo.setId(job.get().getId());
            jobRepository.save(jobInfo);
            return jobInfo;
        } catch (Exception e) {
            throw new JobNotFoundException("Job not saved");
        }
    }

    @Override
    public Optional<JobInfo> findById(String id) {
        return jobRepository.findById(id);
    }


}
