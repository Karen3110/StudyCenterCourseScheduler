package com.example.demo.controller;

import com.example.demo.model.Group;
import com.example.demo.service.GroupService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/api/v1/group")
public class GroupController {
    @Autowired
    private GroupService groupService;

    @GetMapping("/list")
    public ResponseEntity<List<Group>> getAll(Pageable pageable) {
        return ResponseEntity.ok(groupService.getAll(pageable));
    }

    @GetMapping("/{id}")
    public ResponseEntity<Group> getById(@PathVariable("id") int id) {
        return ResponseEntity.ok(groupService.getById(id));
    }

    @PostMapping
    public ResponseEntity<Group> save(@RequestBody Group group) {
        return ResponseEntity.ok(groupService.save(group));
    }
}
