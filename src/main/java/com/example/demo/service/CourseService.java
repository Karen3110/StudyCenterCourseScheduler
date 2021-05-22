package com.example.demo.service;

import com.example.demo.model.Course;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface CourseService {

    Course save(Course course);

    List<Course> getAll(Pageable pageable);

    Course getById(int id);
}
