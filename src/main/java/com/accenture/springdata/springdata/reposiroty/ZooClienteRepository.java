package com.accenture.springdata.springdata.reposiroty;

import com.accenture.springdata.springdata.model.ZooCliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ZooClienteRepository extends JpaRepository<ZooCliente, Long> {

    ZooCliente getById(Long id);

}
