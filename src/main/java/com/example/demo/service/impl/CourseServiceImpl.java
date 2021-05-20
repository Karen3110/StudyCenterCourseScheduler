package com.example.demo.service.impl;

import com.example.demo.model.Course;
import com.example.demo.repository.CourseRepository;
import com.example.demo.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;

public class CourseServiceImpl implements CourseService {

    @Autowired
    CourseRepository courseRepository;


    @Override
    public Course save(Course course){
        return courseRepository.save(course);
    }
}
