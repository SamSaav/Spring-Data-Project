package com.accenture.springdata.repository;

import com.accenture.springdata.model.ZooCliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ZooClienteRepository extends JpaRepository<ZooCliente, Integer> {

    ZooCliente getById(Integer id);

}
