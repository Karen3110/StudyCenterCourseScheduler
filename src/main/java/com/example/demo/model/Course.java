package com.example.demo.model;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
public class Course {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;

    private double durationInMonth;

    private double price;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "course_id")

    private List<CourseLevel> courseLevels;
}
