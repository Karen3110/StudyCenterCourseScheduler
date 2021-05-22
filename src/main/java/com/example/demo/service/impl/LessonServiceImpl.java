package com.example.demo.service.impl;

import com.example.demo.model.Lesson;
import com.example.demo.model.Schedule;
import com.example.demo.model.Student;
import com.example.demo.repository.LessonRepository;
import com.example.demo.repository.ScheduleRepository;
import com.example.demo.repository.StudentRepository;
import com.example.demo.service.LessonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.stream.Collectors;

public class LessonServiceImpl implements LessonService {
    @Autowired
    private LessonRepository lessonRepository;

    @Autowired
    private StudentRepository studentRepository;

    @Autowired
    private ScheduleRepository scheduleRepository;

    @Override
    public Lesson save(Lesson lesson) {
        validate(lesson);
        return lessonRepository.save(lesson);
    }

    @Override
    public List<Lesson> getAll(Pageable pageable) {
        return lessonRepository.findAll(pageable).getContent();
    }

    @Override
    public Lesson getById(int id) {
        return lessonRepository.findById(id).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND));
    }

    private void validate(Lesson lesson) {
        Schedule schedule = scheduleRepository.findById(lesson.getSchedule().getId()).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND));
        lesson.setSchedule(schedule);

        List<Student> students = studentRepository
                .findAllById(lesson.getStudents()
                        .stream()
                        .map(Student::getId)
                        .collect(Collectors.toList())
                );
    }
}
