package com.accenture.springdata.springdata.reposiroty;

import com.accenture.springdata.springdata.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Long> {
}
