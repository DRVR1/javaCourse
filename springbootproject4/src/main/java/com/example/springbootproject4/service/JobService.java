package com.example.springbootproject4.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.springbootproject4.model.Job;
import com.example.springbootproject4.repo.JobRepo;

@Service
public class JobService {
    @Autowired
    JobRepo jobRepo;

    public List<Job> getAllJobs() {
        return jobRepo.getAllJobs();
    }

    public Job getJob(long id) {
        return jobRepo.getJob(id);
    }
}
