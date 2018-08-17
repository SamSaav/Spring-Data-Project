package com.accenture.springdata.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.List;

@Entity
public class Zoo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;

    @OneToMany( mappedBy = "zoo")
    private List<Animal> animals;

    @OneToMany( mappedBy = "zoo")
    private List<Empleado> empleados;

    @OneToMany( mappedBy = "zoo")
    private List<ZooCliente> zooClientes;

    public Zoo(){}

    public Zoo(String nombre, List<Animal> animals, List<Empleado> empleados) {
        this.nombre = nombre;
        this.animals = animals;
        this.empleados = empleados;
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

    public List<Animal> getAnimals() {
        return animals;
    }

    public void setAnimals(List<Animal> animals) {
        this.animals = animals;
    }

    public List<Empleado> getEmpleados() {
        return empleados;
    }

    public void setEmpleados(List<Empleado> empleados) {
        this.empleados = empleados;
    }

    @JsonIgnore
    public List<ZooCliente> getZooClientes() {
        return zooClientes;
    }

    public void setZooClientes(List<ZooCliente> zooClientes) {
        this.zooClientes = zooClientes;
    }
}
