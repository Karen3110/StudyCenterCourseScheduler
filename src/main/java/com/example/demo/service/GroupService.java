package com.example.demo.service;

import com.example.demo.model.Group;
import org.springframework.stereotype.Service;

@Service
public interface GroupService {
    Group save(Group group);
}
