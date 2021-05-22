package com.example.demo.service;

import com.example.demo.model.Teacher;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface TeacherService {

    Teacher save(Teacher teacher);

    List<Teacher> getAll(Pageable pageable);

    Teacher getById(int id);
}
