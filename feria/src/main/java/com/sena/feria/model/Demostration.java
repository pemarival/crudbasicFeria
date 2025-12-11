package com.sena.feria.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity(name="demostration")
public class Demostration {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_demostration")
    private int id;

    @Column(name="name", length = 50)
    private String type;

    @OneToOne(mappedBy = "demostration")//una demostracion tiene un solo registro
    private Record record;
}
