package com.drishluk.courseplatform.model.repository;

import com.drishluk.courseplatform.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {
}