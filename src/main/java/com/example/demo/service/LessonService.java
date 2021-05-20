package com.example.demo.service;

import com.example.demo.model.Lesson;
import org.springframework.stereotype.Service;

@Service
public interface LessonService {
    Lesson save(Lesson lesson);
}
