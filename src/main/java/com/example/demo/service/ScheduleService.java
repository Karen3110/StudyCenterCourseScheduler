package com.example.demo.service;

import com.example.demo.model.Schedule;
import org.springframework.stereotype.Service;

@Service
public interface ScheduleService {
    Schedule save(Schedule schedule);
}
