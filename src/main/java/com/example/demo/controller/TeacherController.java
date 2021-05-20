package com.example.demo.controller;

import com.example.demo.model.Teacher;
import com.example.demo.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api/v1/teacher")
public class TeacherController {
    @Autowired
    private TeacherService teacherService;

    @PostMapping
    public ResponseEntity<Teacher> save(@RequestBody Teacher teacher){
        return ResponseEntity.ok(teacherService.save(teacher));
    }

}
