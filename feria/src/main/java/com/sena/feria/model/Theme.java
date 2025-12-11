package com.sena.feria.model;

import java.util.List;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity(name="theme")
public class Theme {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_theme")
    private int id;

    @Column(name="type", length = 50)
    private String type;

    @OneToMany(mappedBy = "theme") //muchos pabellones tienen una sola tematica
    private List<Pavilion> paivilions;
}
