package com.example.relationalmappings.model;

import jakarta.persistence.*;



@Entity
public class City {

    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    private Long id;

    private String name;

    @OneToOne
    private Zipcode zipcode;

    public City(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public City() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Zipcode getZipcode() {
        return zipcode;
    }

    public void setZipcode(Zipcode zipcode) {
        this.zipcode = zipcode;
    }

    // private Zipcode zipcode;
}
