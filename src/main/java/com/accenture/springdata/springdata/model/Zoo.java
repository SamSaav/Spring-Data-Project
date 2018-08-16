package com.accenture.springdata.springdata.model;

import javax.persistence.*;
import java.util.List;

@Entity
public class Zoo {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String nombre;

    @OneToMany(mappedBy = "zoo")
    private List<Animal> animals;

    @OneToMany(mappedBy = "zoo")
    private List<Empleado> empleados;

    @OneToMany(mappedBy = "zoo")
    private List<ZooCliente> zooClientes;

    public Zoo(){}

    public Zoo(Long id, String nombre, List<Animal> animals, List<Empleado> empleados, List<ZooCliente> zooClientes) {
        this.id = id;
        this.nombre = nombre;
        this.animals = animals;
        this.empleados = empleados;
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

    public List<ZooCliente> getZooClientes() {
        return zooClientes;
    }

    public void setZooClientes(List<ZooCliente> zooClientes) {
        this.zooClientes = zooClientes;
    }
}
