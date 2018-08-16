package com.accenture.springdata.springdata.repository;

import com.accenture.springdata.springdata.model.ZooCliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ZooClienteRepository extends JpaRepository<ZooCliente, Integer> {

    ZooCliente getById(Integer id);

}
