package com.example.springbootproject4.repo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.springbootproject4.model.Job;

@Repository
public class JobRepo {
    public List<Job> jobs = new ArrayList<>();

    public JobRepo() {
        Job job1 = new Job(1, "telemarketer", 1000);
        Job job2 = new Job(2, "sales", 1300);
        jobs.add(job1);
        jobs.add(job2);
    }

    public List<Job> getAllJobs() {
        return jobs;
    }

    public Job getJob(long id) {
        for (Job job : jobs) {
            if (job.getId() == id) {
                return job;
            }
        }
        return null;
    }
}
