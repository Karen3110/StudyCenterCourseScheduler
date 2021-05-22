package com.example.demo.service;

import com.example.demo.model.Group;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface GroupService {
    Group save(Group group);

    List<Group> getAll(Pageable pageable);

    Group getById(int id);


}
