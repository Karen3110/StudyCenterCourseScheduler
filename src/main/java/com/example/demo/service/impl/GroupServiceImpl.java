package com.example.demo.service.impl;

import com.example.demo.model.Group;
import com.example.demo.repository.GroupRepository;
import com.example.demo.service.GroupService;
import org.springframework.beans.factory.annotation.Autowired;

public class GroupServiceImpl implements GroupService {
    @Autowired
    GroupRepository groupRepository;

    @Override
    public Group save(Group group){
        return groupRepository.save(group);
    }
}
