package com.example.demo.controller;

import com.example.demo.model.CourseLevel;
import com.example.demo.service.CourseLevelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api/v1/course-level")
public class CourseLevelController {
    @Autowired
    CourseLevelService courseLevelService;

    @PostMapping
    public ResponseEntity<CourseLevel> save(@RequestBody CourseLevel courseLevel){
        return ResponseEntity.ok(courseLevelService.save(courseLevel));
    }

}
