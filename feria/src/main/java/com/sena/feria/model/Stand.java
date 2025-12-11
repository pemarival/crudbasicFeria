package com.sena.feria.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;

@Entity(name="stand")
public class Stand {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_stand")
    private int id;

    @ManyToOne //muchos stands pertenecen a una empresa
    @JoinColumn (name="id_company")
    private Company company;

    @OneToOne //un stand pertenece a un pabellon
    @JoinColumn(name = "id_pavilion") // un pabellon tiene solo un stand y asegura que siempre exista un pabellon para cada stand
    private Pavilion pavilion;
}
