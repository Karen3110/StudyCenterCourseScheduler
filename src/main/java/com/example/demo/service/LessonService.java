package com.example.demo.service;

import com.example.demo.model.Lesson;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface LessonService {
    Lesson save(Lesson lesson);

    List<Lesson> getAll(Pageable pageable);

    Lesson getById(int id);
}
