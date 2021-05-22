package com.example.demo.controller;

import com.example.demo.model.Teacher;
import com.example.demo.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/api/v1/teacher")
public class TeacherController {
    @Autowired
    private TeacherService teacherService;


    @PostMapping
    public ResponseEntity<Teacher> save(@RequestBody Teacher teacher) {


        return ResponseEntity.ok(teacherService.save(teacher));
    }

    @GetMapping("/list")
    public ResponseEntity<List<Teacher>> getAll(Pageable pageable) {
        return ResponseEntity.ok(teacherService.getAll(pageable));
    }

    @GetMapping("/{id}")
    public ResponseEntity<Teacher> getById(@PathVariable("id") int id) {
        return ResponseEntity.ok(teacherService.getById(id));
    }

}
