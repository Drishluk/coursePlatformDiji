package com.drishluk.courseplatform.service;

import com.drishluk.courseplatform.model.Instructor;
import com.drishluk.courseplatform.model.repository.InstructorRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InstructorService {

    private final InstructorRepository instructorRepository;

    public InstructorService(InstructorRepository instructorRepository) {
        this.instructorRepository = instructorRepository;
    }

    public List<Instructor> getAllInstructors() {
        return instructorRepository.findAll();
    }

    public Instructor createInstructor(Instructor instructor) {
        return instructorRepository.save(instructor);
    }
}
