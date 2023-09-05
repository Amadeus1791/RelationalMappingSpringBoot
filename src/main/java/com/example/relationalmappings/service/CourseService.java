package com.example.relationalmappings.service;

import com.example.relationalmappings.model.Course;
import com.example.relationalmappings.model.Trainer;
import com.example.relationalmappings.repo.CourseRepo;
import com.example.relationalmappings.repo.TrainerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CourseService {
    @Autowired
    private CourseRepo courseRepo;

    @Autowired
    private TrainerRepo trainerRepo;

    public Course create (Course course, Trainer trainer) {
        trainer.addTrainerToCourse(course);
        course.setTrainer(trainer);
        trainerRepo.save(trainer);
        return courseRepo.save(course);
    }
}
