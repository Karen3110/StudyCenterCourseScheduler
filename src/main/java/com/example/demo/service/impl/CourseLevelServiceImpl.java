package com.example.demo.service.impl;

import com.example.demo.model.CourseLevel;
import com.example.demo.repository.CourseLevelRepository;
import com.example.demo.service.CourseLevelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

public class CourseLevelServiceImpl implements CourseLevelService {
    @Autowired
    private CourseLevelRepository courseLevelRepository;

    @Override
    public CourseLevel save(CourseLevel courseLevel) {
        return courseLevelRepository.save(courseLevel);
    }

    @Override
    public List<CourseLevel> getAll(Pageable pageable) {
        return courseLevelRepository.findAll(pageable).getContent();
    }

    @Override
    public CourseLevel getById(int id) {
        return courseLevelRepository.findById(id).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND));
    }
}
