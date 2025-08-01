package com.example.springbootproject4.repo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.springbootproject4.model.Job;

@Repository
public class JobRepo {
    public List<Job> getAllJobs() {
        ArrayList<Job> arr = new ArrayList<>();
        Job job1 = new Job(1, "telemarketer", 1000);
        Job job2 = new Job(2, "sales", 1300);
        arr.add(job1);
        arr.add(job2);
        return arr;
    }
}
