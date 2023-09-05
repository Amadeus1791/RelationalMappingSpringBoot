package com.example.relationalmappings.repo;

import com.example.relationalmappings.model.City;
import com.example.relationalmappings.model.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseRepo extends JpaRepository<Course,Long> {
}
