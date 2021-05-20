package com.example.demo.controller;

import com.example.demo.service.LessonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api/v1/lesson")
public class LessonController {
    @Autowired
    LessonService lessonService;
}
