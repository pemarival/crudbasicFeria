package com.sena.feria.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;

@Entity(name="pavilion")
public class Pavilion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_pavilion")
    private int id;

    @ManyToOne //muchos pabellones tienen una sola temática
    @JoinColumn(name="id_theme")
    private Theme theme;

    @ManyToOne //muchos pabellones pertenecen a una feria
    @JoinColumn(name="id_fair")
    private Fair fair;

    @OneToOne(mappedBy = "pavilion") //un stand pertenece a un pabellon
    private Stand stand;
}


