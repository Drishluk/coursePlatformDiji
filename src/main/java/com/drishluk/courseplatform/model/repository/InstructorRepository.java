package com.drishluk.courseplatform.model.repository;

import com.drishluk.courseplatform.model.Instructor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InstructorRepository extends JpaRepository<Instructor, Long> {
}