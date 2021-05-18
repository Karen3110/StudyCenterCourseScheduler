package com.example.demo.model;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
public class Schedule {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne
    @JoinColumn(name = "course_level_id")
    private CourseLevel courseLevel;

    @OneToMany
    @JoinColumn(name = "schedule_id")
    private List<Lesson> lessons;


}
