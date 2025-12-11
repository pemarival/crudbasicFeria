package com.sena.feria.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity(name="product")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_product")
    private int id;

    @Column(name="name")
    private String name;

    @ManyToOne //muchos productos hacen parte de un stand
    @JoinColumn(name="id_stand")
    private Stand stand;

    @ManyToOne//muchos productos tienen un responsable
    @JoinColumn(name="id_responsible")
    private Responsible responsible;
}
