package com.example.relationalmappings.service;

import com.example.relationalmappings.model.City;
import com.example.relationalmappings.model.Zipcode;
import com.example.relationalmappings.repo.CityRepository;
import com.example.relationalmappings.repo.ZipcodeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CityService {
    @Autowired
    private CityRepository cityRepository;

    @Autowired
    private ZipcodeRepository zipcodeRepository;

    public City createCity(City city, Zipcode zipcode) {
        zipcodeRepository.save(zipcode);
        city.setZipcode(zipcode);
        City newCity = cityRepository.save(city);
        return newCity;
    }





}
