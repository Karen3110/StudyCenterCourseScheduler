package com.example.demo.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class Teacher {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;

    private String surname;

    private String email;

    private String phone;

    private String dob;

    @ManyToOne
    @JoinColumn(name = "course_id")
    private Course course;


}
