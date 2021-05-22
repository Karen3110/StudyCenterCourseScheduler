package com.example.demo.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class Schedule {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne
    @JoinColumn(name = "course_level_id")
    private CourseLevel courseLevel;


    @ManyToOne
    @JoinColumn(name = "group_id")
    private Group group;


}
