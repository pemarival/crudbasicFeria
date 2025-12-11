package com.sena.feria.model;

import java.time.LocalDate;
import java.util.List;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity(name="fair")
public class Fair {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_fair")
    private int id;

    @Column(name="name", length = 50)
    private String name;

    @Column(name="city", length = 100)
    private String city;

    @Column(name="start_date")
    private LocalDate start_date;

    @Column(name="end_date")
    private LocalDate end_date;

    @OneToMany(mappedBy = "fair") //una feria tiene muchos pabellones
    private List<Pavilion> paivilions;
}
