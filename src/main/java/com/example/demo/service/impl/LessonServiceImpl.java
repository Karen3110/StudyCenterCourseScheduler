package com.example.demo.service.impl;

import com.example.demo.model.Lesson;
import com.example.demo.repository.LessonRepository;
import com.example.demo.service.LessonService;
import org.springframework.beans.factory.annotation.Autowired;

public class LessonServiceImpl implements LessonService {
    @Autowired
    LessonRepository lessonRepository;

    @Override
    public Lesson save(Lesson lesson){
        return lessonRepository.save(lesson);
    }
}
