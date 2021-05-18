package com.example.demo.model;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
public class Lesson {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String date;

    @ManyToMany
    @JoinTable(name = "lesson_student")
    private List<Student> students;


}
