package com.example.relationalmappings.repo;

import com.example.relationalmappings.model.Trainer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TrainerRepo extends JpaRepository<Trainer,Long> {

}
