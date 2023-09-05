package com.example.relationalmappings.service;

import com.example.relationalmappings.model.Zipcode;
import com.example.relationalmappings.repo.ZipcodeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ZipcodeService {
@Autowired
    private ZipcodeRepository zipcodeRepository;

    Zipcode createZipcode(Zipcode zipcode) {
        Zipcode newZipcode = zipcodeRepository.save(zipcode);
        return newZipcode;
    }
}
