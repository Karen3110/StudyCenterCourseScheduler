package com.example.demo.service;

import com.example.demo.model.Course;
import org.springframework.stereotype.Service;

@Service
public interface CourseService {

    Course save(Course course);
}
