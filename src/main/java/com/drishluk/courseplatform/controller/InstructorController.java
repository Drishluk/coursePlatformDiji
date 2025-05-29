package com.drishluk.courseplatform.controller;

import com.drishluk.courseplatform.model.Instructor;
import com.drishluk.courseplatform.service.InstructorService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/instructors")
public class InstructorController {

    private final InstructorService instructorService;

    public InstructorController(InstructorService instructorService) {
        this.instructorService = instructorService;
    }

    @GetMapping
    public ResponseEntity<List<Instructor>> getAllInstructors() {
        return ResponseEntity.ok(instructorService.getAllInstructors());
    }

    @PostMapping
    public ResponseEntity<Instructor> createInstructor(@RequestBody Instructor instructor) {
        Instructor savedInstructor = instructorService.createInstructor(instructor);
        return ResponseEntity.ok(savedInstructor);
    }
}
