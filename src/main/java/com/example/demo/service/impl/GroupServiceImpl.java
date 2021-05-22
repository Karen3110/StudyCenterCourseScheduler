package com.example.demo.service.impl;

import com.example.demo.model.Course;
import com.example.demo.model.Group;
import com.example.demo.model.Student;
import com.example.demo.model.Teacher;
import com.example.demo.repository.CourseRepository;
import com.example.demo.repository.GroupRepository;
import com.example.demo.repository.StudentRepository;
import com.example.demo.repository.TeacherRepository;
import com.example.demo.service.GroupService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.stream.Collectors;

public class GroupServiceImpl implements GroupService {
    @Autowired
    private GroupRepository groupRepository;

    @Autowired
    private TeacherRepository teacherRepository;

    @Autowired
    private CourseRepository courseRepository;

    @Autowired
    private StudentRepository studentRepository;


    @Override
    public Group save(Group group) {

        validate(group);
        return groupRepository.save(group);
    }

    @Override
    public List<Group> getAll(Pageable pageable) {
        return groupRepository.findAll(pageable).getContent();
    }

    @Override
    public Group getById(int id) {
        return groupRepository.findById(id).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND));
    }


    private void validate(Group group) {
        Teacher teacher = teacherRepository.findById(group.getTeacher().getId())
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_ACCEPTABLE));
        group.setTeacher(teacher);

        Course course = courseRepository.findById(teacher.getCourse().getId())
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_ACCEPTABLE));
        group.setCourse(course);

        List<Student> students = studentRepository
                .findAllById(group.getStudents()
                        .stream().map(Student::getId).collect(Collectors.toList()));
        if (students.size() != group.getStudents().size()) {
            throw new ResponseStatusException(HttpStatus.NOT_ACCEPTABLE);
        }
        group.setStudents(students);

    }
}
