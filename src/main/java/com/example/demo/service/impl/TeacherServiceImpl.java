package com.example.demo.service.impl;

import com.example.demo.model.Teacher;
import com.example.demo.repository.TeacherRepository;
import com.example.demo.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;

public class TeacherServiceImpl implements TeacherService {
    @Autowired
    TeacherRepository teacherRepository;


    @Override
    public Teacher save(Teacher teacher){
        return teacherRepository.save(teacher);
    }

}
