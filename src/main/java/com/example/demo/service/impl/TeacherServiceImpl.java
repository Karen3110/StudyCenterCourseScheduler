package com.example.demo.service.impl;

import com.example.demo.model.Course;
import com.example.demo.model.Teacher;
import com.example.demo.repository.CourseRepository;
import com.example.demo.repository.TeacherRepository;
import com.example.demo.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

public class TeacherServiceImpl implements TeacherService {
    @Autowired
    private TeacherRepository teacherRepository;

    @Autowired
    private CourseRepository courseRepository;


    @Override
    public Teacher save(Teacher teacher) {

        if (teacher.getCourse() != null) {
            Course course = courseRepository.findById(teacher.getCourse().getId()).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND));
            teacher.setCourse(course);

        }
        return teacherRepository.save(teacher);
    }

    @Override
    public List<Teacher> getAll(Pageable pageable) {
        return teacherRepository.findAll(pageable).getContent();
    }

    @Override
    public Teacher getById(int id) {
        return teacherRepository.findById(id).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND));
    }


}
