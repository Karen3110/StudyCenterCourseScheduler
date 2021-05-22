package com.example.demo.service.impl;

import com.example.demo.model.CourseLevel;
import com.example.demo.model.Group;
import com.example.demo.model.Schedule;
import com.example.demo.repository.CourseLevelRepository;
import com.example.demo.repository.GroupRepository;
import com.example.demo.repository.ScheduleRepository;
import com.example.demo.service.ScheduleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

public class ScheduleServiceImpl implements ScheduleService {
    @Autowired
    private ScheduleRepository scheduleRepository;

    @Autowired
    private GroupRepository groupRepository;

    @Autowired
    private CourseLevelRepository courseLevelRepository;

    @Override
    public Schedule save(Schedule schedule) {

        validate(schedule);
        return scheduleRepository.save(schedule);
    }

    @Override
    public List<Schedule> getAll(Pageable pageable) {
        return scheduleRepository.findAll(pageable).getContent();
    }

    @Override
    public Schedule getById(int id) {
        return scheduleRepository.findById(id).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND));
    }


    private void validate(Schedule schedule) {
        CourseLevel courseLevel = courseLevelRepository.findById(schedule.getId()).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND));
        schedule.setCourseLevel(courseLevel);

        Group group = groupRepository.findById(schedule.getId()).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND));
        schedule.setGroup(group);


    }
}
