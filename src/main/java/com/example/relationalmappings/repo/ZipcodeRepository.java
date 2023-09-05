package com.example.relationalmappings.repo;



import com.example.relationalmappings.model.Zipcode;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ZipcodeRepository extends JpaRepository<Zipcode,Long> {
}
