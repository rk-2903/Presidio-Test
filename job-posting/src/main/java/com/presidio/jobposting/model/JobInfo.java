package com.presidio.jobposting.model;

import com.presidio.jobposting.enumeration.JobType;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class JobInfo {

    @Id
    private String id;
    private String title;
    private String description;
    private int noOfOpenings;
    private String companyName;
    private String location;
    private String role;
    private JobType jobType;
    private int workHours;

    public JobInfo() {
    }

    public JobInfo(String title, String description, int noOfOpenings, String companyName, String location, String role, JobType jobType, int workHours) {
        this.title = title;
        this.description = description;
        this.noOfOpenings = noOfOpenings;
        this.companyName = companyName;
        this.location = location;
        this.role = role;
        this.jobType = jobType;
        this.workHours = workHours;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getNoOfOpenings() {
        return noOfOpenings;
    }

    public void setNoOfOpenings(int noOfOpenings) {
        this.noOfOpenings = noOfOpenings;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public JobType getJobType() {
        return jobType;
    }

    public void setJobType(JobType jobType) {
        this.jobType = jobType;
    }

    public int getWorkHours() {
        return workHours;
    }

    public void setWorkHours(int workHours) {
        this.workHours = workHours;
    }
}
