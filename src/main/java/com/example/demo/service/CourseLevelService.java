package com.example.demo.service;

import com.example.demo.model.CourseLevel;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface CourseLevelService {

    CourseLevel save(CourseLevel courseLevel);

    List<CourseLevel> getAll(Pageable pageable);

    CourseLevel getById(int id);
}
