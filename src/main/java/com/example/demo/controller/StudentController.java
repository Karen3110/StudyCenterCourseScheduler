package com.example.demo.controller;

import com.example.demo.model.Student;
import com.example.demo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/api/v1/student")
public class StudentController {

    @Autowired
    StudentService studentService;

    @PostMapping
    public ResponseEntity<Student> save(@RequestBody Student student) {
        return ResponseEntity.ok( studentService.save(student));
    }
}
