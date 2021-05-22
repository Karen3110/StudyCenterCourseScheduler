package com.example.demo.controller;

import com.example.demo.model.Schedule;
import com.example.demo.service.ScheduleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/api/v1/schedule")
public class ScheduleController {
    @Autowired
    ScheduleService scheduleService;


    @PostMapping
    public ResponseEntity<Schedule> save(@RequestBody Schedule schedule) {
        return ResponseEntity.ok(scheduleService.save(schedule));
    }

    @GetMapping("/list")
    public ResponseEntity<List<Schedule>> getAll(Pageable pageable) {
        return ResponseEntity.ok(scheduleService.getAll(pageable));
    }

    @GetMapping("/{id}")
    public ResponseEntity<Schedule> getById(@PathVariable("id") int id) {
        return ResponseEntity.ok(scheduleService.getById(id));
    }
}
