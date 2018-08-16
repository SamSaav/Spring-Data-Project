package com.accenture.springdata.springdata.service;

import com.accenture.springdata.springdata.model.Cliente;
import com.accenture.springdata.springdata.model.Zoo;
import com.accenture.springdata.springdata.model.ZooCliente;
import com.accenture.springdata.springdata.repository.ClienteRepository;
import com.accenture.springdata.springdata.repository.ZooClienteRepository;
import com.accenture.springdata.springdata.repository.ZooRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SpringDataService {

    @Autowired
    ZooClienteRepository zooClienteRepository;

    @Autowired
    ClienteRepository clienteRepository;

    @Autowired
    ZooRepository zooRepository;

    public List<ZooCliente> getAll(){
        return zooClienteRepository.findAll();
    }

    public ZooCliente getById(Integer id){
        return zooClienteRepository.getById(id);
    }

    public boolean saveZooClient(ZooCliente zooCliente){
        List<ZooCliente> lstZooClient = zooClienteRepository.findAll();
        if(!lstZooClient.isEmpty()){
            zooCliente.setId(lstZooClient.size() + 1);
        }else zooCliente.setId(1);
        Cliente cliente = clienteRepository.save(zooCliente.getCliente());
        Zoo zoo = zooRepository.save(zooCliente.getZoo());
        zooClienteRepository.save(new ZooCliente(cliente, zoo));
        return true;
    }

}
