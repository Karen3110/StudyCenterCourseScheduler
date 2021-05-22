package com.example.demo.controller;

import com.example.demo.model.Lesson;
import com.example.demo.service.LessonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/api/v1/lesson")
public class LessonController {
    @Autowired
    LessonService lessonService;


    @PostMapping
    public ResponseEntity<Lesson> save(@RequestBody Lesson lesson) {
        return ResponseEntity.ok(lessonService.save(lesson));
    }

    @GetMapping("/list")
    public ResponseEntity<List<Lesson>> getAll(Pageable pageable) {
        return ResponseEntity.ok(lessonService.getAll(pageable));
    }

    @GetMapping("/{id}")
    public ResponseEntity<Lesson> getById(@PathVariable("id") int id) {
        return ResponseEntity.ok(lessonService.getById(id));
    }
}
