package com.example.demo.service;

import com.example.demo.model.Student;
import org.springframework.stereotype.Service;

@Service
public interface StudentService {


    Student save(Student student);
}
