package com.sena.feria.model;

import java.util.List;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity(name="company")
public class Company {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_company")
    private int id;

    @Column(name="name", length = 50)
    private String name;

    @OneToMany(mappedBy = "company") //una empresa tiene muchos stands
    private List<Stand> stands;


}
