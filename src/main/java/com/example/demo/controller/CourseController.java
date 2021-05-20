package com.example.demo.controller;

import com.example.demo.model.Course;
import com.example.demo.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api/v1/course")
public class CourseController {
    @Autowired
    CourseService courseService;

    @PostMapping
    public ResponseEntity<Course> save(@RequestBody Course course){
        return ResponseEntity.ok(courseService.save(course));
    }

}
