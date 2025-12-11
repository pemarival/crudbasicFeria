package com.sena.feria.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;


@Entity(name="chat")
public class Chat {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_chat")
    private int id;

    @Column(name="name", length = 50)
    private String name;
 
    @OneToOne(mappedBy = "chat") //una charla tiene un solo registro
    private Record record;

}
