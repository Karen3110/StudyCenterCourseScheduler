package com.example.demo.service;

import com.example.demo.model.Student;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface StudentService {


    Student save(Student student);

    List<Student> getAll(Pageable pageable);

    Student getById(int id);
}
