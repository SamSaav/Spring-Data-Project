package com.accenture.springdata.springdata.model;

import javax.persistence.*;

@Entity
public class Empleado {

    @Id
<<<<<<< HEAD
    @GeneratedValue(strategy = GenerationType.IDENTITY)
=======
    @GeneratedValue(strategy = GenerationType.AUTO)
>>>>>>> 81bbf8ed29742d9d95193b52826c80635e999220
    private Long id;

    private String nombre;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "zoo_id")
    private Zoo zoo;

    public Empleado() {
    }

    public Empleado(Long id, String nombre, Zoo zoo) {
        this.id = id;
        this.nombre = nombre;
        this.zoo = zoo;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Zoo getZoo() {
        return zoo;
    }

    public void setZoo(Zoo zoo) {
        this.zoo = zoo;
    }
}
