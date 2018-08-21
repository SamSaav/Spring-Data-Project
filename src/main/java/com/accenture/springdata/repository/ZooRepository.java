package com.accenture.springdata.repository;

import com.accenture.springdata.model.Zoo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ZooRepository extends JpaRepository<Zoo, Long> {

}
