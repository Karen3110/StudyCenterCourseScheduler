package com.example.demo.model;

import com.sun.istack.NotNull;
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
    @NotNull
    @JoinColumn(name = "teacher_id")
    private Teacher teacher;

    @OneToOne
    @NotNull
    @JoinColumn("course_id")
    private Course course;


    ManyToMany
    @NotNull
    @JoinTable(name = "group_student")
    private List<Student> students;


}
