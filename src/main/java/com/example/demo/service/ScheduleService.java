package com.example.demo.service;

import com.example.demo.model.Schedule;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ScheduleService {
    Schedule save(Schedule schedule);

    List<Schedule> getAll(Pageable pageable);

    Schedule getById(int id);
}
