package com.accenture.springdata.springdata.model;

import javax.persistence.*;
import java.util.List;

@Entity
public class ZooCliente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "cliente_id")
    private Cliente cliente;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "zoo_id")
    private Zoo zoo;

    public ZooCliente() {
    }

    public ZooCliente(Cliente cliente, Zoo zoo) {
        this.cliente = cliente;
        this.zoo = zoo;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Zoo getZoo() {
        return zoo;
    }

    public void setZoo(Zoo zoo) {
        this.zoo = zoo;
    }
}
