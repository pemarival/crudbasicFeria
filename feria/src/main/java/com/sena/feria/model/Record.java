package com.sena.feria.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

@Entity(name="record")
public class Record {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_record")
    private int id;

    @Column(name="online")
    private String online;

    @OneToOne//una feria tiene un unico registro
    @JoinColumn(name = "id_fair", unique = true, nullable = false)
    private Fair fair;
    
    @OneToOne//una charla tiene un unico registro
    @JoinColumn(name = "id_chat", unique = true, nullable = false)
    private Chat chat;

    @OneToOne//un visitante tiene un unico registro
    @JoinColumn(name = "id_visitor", unique = true, nullable = false)
    private Visitor visitor;

    @OneToOne//un ponente tiene un unico registro
    @JoinColumn(name="id_speaker", unique = true, nullable = false)
    private Speaker speaker;

    @OneToOne//una empresa tiene un unico registro
    @JoinColumn(name = "id_company", unique = true, nullable = false)
    private Company company;

    @OneToOne//una demostracion tiene un unico registro
    @JoinColumn(name = "id_demostration", unique = true, nullable = false)
    private Demostration demostration;
}
