package com.accenture.springdata.springdata.service;

import com.accenture.springdata.springdata.model.ZooCliente;
import com.accenture.springdata.springdata.reposiroty.ZooClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SpringDataService {

    @Autowired
    ZooClienteRepository zooClienteRepository;

    public List<ZooCliente> getAll(){
        return zooClienteRepository.findAll();
    }

    public ZooCliente getById(Long id){
        return zooClienteRepository.getById(id);
    }

    public boolean saveZooClient(ZooCliente zooCliente){
        zooClienteRepository.save(zooCliente);
        return true;
    }
}
