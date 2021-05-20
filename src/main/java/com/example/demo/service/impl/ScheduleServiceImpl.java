package com.example.demo.service.impl;

import com.example.demo.model.Schedule;
import com.example.demo.repository.ScheduleRepository;
import com.example.demo.service.ScheduleService;
import org.springframework.beans.factory.annotation.Autowired;

public class ScheduleServiceImpl implements ScheduleService {
    @Autowired
    ScheduleRepository scheduleRepository;

    @Override
    public Schedule save(Schedule schedule){
        return scheduleRepository.save(schedule);
    }
}
