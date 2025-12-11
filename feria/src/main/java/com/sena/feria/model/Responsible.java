package com.sena.feria.model;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;

@Entity(name="responsible")
public class Responsible {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_responsible")
    private int id;

    @OneToMany(mappedBy = "responsible")//un responsable tiene muchos productos
    private List<Product> products;

    @ManyToOne//muchos responsables hacen parte de una persona
    @JoinColumn(name="id_person")
    private Person person;
}
