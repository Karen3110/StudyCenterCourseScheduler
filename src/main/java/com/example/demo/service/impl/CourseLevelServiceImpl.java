package com.example.demo.service.impl;

import com.example.demo.model.CourseLevel;
import com.example.demo.repository.CourseLevelRepository;
import com.example.demo.service.CourseLevelService;
import org.springframework.beans.factory.annotation.Autowired;

public class CourseLevelServiceImpl implements CourseLevelService {
    @Autowired
    CourseLevelRepository courseLevelRepository;

    @Override
    public CourseLevel save(CourseLevel courseLevel){
        return  courseLevelRepository.save(courseLevel);
    }
}
