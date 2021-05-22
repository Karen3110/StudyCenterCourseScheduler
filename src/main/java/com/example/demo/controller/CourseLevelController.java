package com.example.demo.controller;

import com.example.demo.model.CourseLevel;
import com.example.demo.service.CourseLevelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/api/v1/course-level")
public class CourseLevelController {
    @Autowired
    CourseLevelService courseLevelService;

    @PostMapping
    public ResponseEntity<CourseLevel> save(@RequestBody CourseLevel courseLevel) {
        return ResponseEntity.ok(courseLevelService.save(courseLevel));
    }

    @GetMapping("/list")
    public ResponseEntity<List<CourseLevel>> getAll(Pageable pageable) {
        return ResponseEntity.ok(courseLevelService.getAll(pageable));
    }

    @GetMapping("/{id}")
    public ResponseEntity<CourseLevel> getById(@PathVariable("id") int id) {
        return ResponseEntity.ok(courseLevelService.getById(id));
    }


}
