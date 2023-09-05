package com.example.relationalmappings;

import com.example.relationalmappings.model.City;
import com.example.relationalmappings.model.Course;
import com.example.relationalmappings.model.Trainer;
import com.example.relationalmappings.model.Zipcode;
import com.example.relationalmappings.service.CityService;
import com.example.relationalmappings.service.CourseService;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.AutoConfigurationPackage;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.logging.Logger;

@SpringBootApplication
public class RelationalMappingsApplication implements CommandLineRunner {
    @Autowired
    CityService cityService;

    @Autowired
    CourseService courseService;

    public static void main(String[] args) {
        SpringApplication.run(RelationalMappingsApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

        City linz = new City(1L, "Linz");
        Zipcode zipcode = new Zipcode(1L, "4020");
        cityService.createCity(linz,zipcode);

        Trainer trainer = new Trainer("Max");
        Course course = new Course("Java");

        courseService.create(course, trainer);

    }
}
