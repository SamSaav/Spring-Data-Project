package com.accenture.springdata.springdata.model;

import javax.persistence.*;
import java.util.List;

@Entity
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String nombre;

    @OneToMany(fetch = FetchType.EAGER, mappedBy = "cliente")
    private List<ZooCliente> zooClientes;

    public Cliente() {
    }

    public Cliente(Long id, String nombre, List<ZooCliente> zooClientes) {
        this.id = id;
        this.nombre = nombre;
        this.zooClientes = zooClientes;
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

    public List<ZooCliente> getZooClientes() {
        return zooClientes;
    }

    public void setZooClientes(List<ZooCliente> zooClientes) {
        this.zooClientes = zooClientes;
    }
}
