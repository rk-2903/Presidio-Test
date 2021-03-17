package com.presidio.jobposting.repository;

import com.presidio.jobposting.model.JobInfo;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface JobRepository extends MongoRepository<JobInfo, String> {
}
