package com.accenture.springdata.model;

import javax.persistence.*;

@Entity
public class Animal {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String TipoAnimal;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "zoo_id")
    private Zoo zoo;

    public Animal() {
    }

    public Animal(Long id, String tipoAnimal, Zoo zoo) {
        this.id = id;
        TipoAnimal = tipoAnimal;
        this.zoo = zoo;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTipoAnimal() {
        return TipoAnimal;
    }

    public void setTipoAnimal(String tipoAnimal) {
        TipoAnimal = tipoAnimal;
    }

    public Zoo getZoo() {
        return zoo;
    }

    public void setZoo(Zoo zoo) {
        this.zoo = zoo;
    }
}
