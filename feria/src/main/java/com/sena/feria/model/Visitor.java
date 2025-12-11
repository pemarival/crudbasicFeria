package com.sena.feria.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity(name="visitor")
public class Visitor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_visitor")
    private int id;

    @ManyToOne //muchos visitantes hacen parte de una persona
    @JoinColumn(name="id_person")
    private Person person;

    @ManyToOne//mucho visitantes tienen solo tienen un tipo de entrada
    @JoinColumn(name="id_typevisitor")
    private Typevisitor typevisitor;

}
