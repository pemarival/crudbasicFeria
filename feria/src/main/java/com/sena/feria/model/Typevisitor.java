package com.sena.feria.model;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity(name="typevisitor")
public class Typevisitor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_typevisitor")
    private int id;

    @Column(name="entrance", length = 50)
    private String entrance;

    @OneToMany(mappedBy = "typevisitor")//muchos visitantes puden tener solo una entrada
    private List<Visitor> visitors;
}
