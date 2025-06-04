package com.example;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import lombok.Data;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ClassRoom {
    @Id
    private long id;
    private String topic;

    @ManyToMany(mappedBy = "classRooms")
    private List<Student> students;
}
