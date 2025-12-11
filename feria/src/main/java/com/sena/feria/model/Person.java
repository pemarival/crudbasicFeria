package com.sena.feria.model;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity(name="person")
public class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_person")
    private int id;

    @Column(name="name", length = 50)
    private String name;

    @Column(name="lastname", length =50)
    private String lastname;

    @Column(name="dni", length = 50)
    private String dni;

    @Column(name="gmail", length = 50)
    private String gmail;

    @Column(name="phone", length = 50)
    private String phone;

    @OneToMany(mappedBy = "person")//de una persona salen muchos responsables
    private List<Responsible> responsibles;

    @OneToMany(mappedBy = "person") //de una persona salen muchos ponentes
    private List<Speaker> speakers;

    @OneToMany(mappedBy = "person") //de una persona salen muchos visitantes
    private List<Visitor> visitors;
}
