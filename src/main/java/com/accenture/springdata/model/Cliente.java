package com.accenture.springdata.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.List;

@Entity
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;

    @OneToMany(fetch = FetchType.EAGER, mappedBy = "cliente")
    private List<ZooCliente> zooClientes;

    public Cliente() {
    }

    public Cliente(String nombre) {
        this.nombre = nombre;
    }

    public void setOneZooCliente(ZooCliente zooCliente){
        zooClientes.add(zooCliente);
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

    @JsonIgnore
    public List<ZooCliente> getZooClientes() {
        return zooClientes;
    }

    public void setZooClientes(List<ZooCliente> zooClientes) {
        this.zooClientes = zooClientes;
    }
}
