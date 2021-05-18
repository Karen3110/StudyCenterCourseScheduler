package com.example.demo.model;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
public class Group {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;

    @OneToOne
    @JoinColumn(name = "teacher_id")
    private Teacher teacher;

    @OneToOne
    @JoinColumn("course_id")
    private Course course;


    ManyToMany
    @JoinTable(name = "group_student")
    private List<Student> students;

    @OneToMany
    @JoinColumn(name = "group_id")
    private List<Schedule> schedules;


}
