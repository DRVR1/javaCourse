package com.example;

import java.util.List;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import lombok.Data;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student {

    @Id
    private long id;

    private String sname;
    private int sage;

    @OneToOne
    private Passport passport;

    @OneToMany
    private List<Laptop> laptops;

    @ManyToMany
    private List<ClassRoom> classRooms;

}
