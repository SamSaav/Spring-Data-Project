package com.accenture.springdata.service;

import com.accenture.springdata.model.Zoo;
import com.accenture.springdata.model.ZooCliente;
import com.accenture.springdata.model.Cliente;
import com.accenture.springdata.repository.ClienteRepository;
import com.accenture.springdata.repository.ZooClienteRepository;
import com.accenture.springdata.repository.ZooRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
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
        if(!lstZooClient.isEmpty()) zooCliente.setId(lstZooClient.size() + 1);
        else zooCliente.setId(1);
        zooClienteRepository.save(new ZooCliente(
                saveCliente(zooCliente.getCliente(), zooCliente),
                saveZoo(zooCliente.getZoo(), zooCliente)));
        return true;
    }

    public Zoo saveZoo(Zoo zoo, ZooCliente zooCliente){
        List<Zoo> lstZoo = zooRepository.findAll();
        List<ZooCliente> lstZooClientes = getAll();
        if (!lstZoo.isEmpty()) zoo.setId(lstZoo.size() + 1L);
        else zoo.setId(1L);
        zooRepository.save(zoo);
        if (lstZooClientes.isEmpty()){
            zoo.setZooClientes(new ArrayList<>(Arrays.asList(zooCliente)));
        }else{
            zoo.setOneZooCliente(zooCliente);
        }
        return zoo;
    }

    public Cliente saveCliente(Cliente cliente, ZooCliente zooCliente){
        List<Cliente> lstClientes = clienteRepository.findAll();
        if (!lstClientes.isEmpty()) cliente.setId(lstClientes.size() + 1L);
        else cliente.setId(1L);
        clienteRepository.save(cliente);
        if (cliente.getZooClientes().isEmpty()){
            cliente.setZooClientes(new ArrayList<>(Arrays.asList(zooCliente)));
        }else{
            cliente.setOneZooCliente(zooCliente);
        }
        return cliente;
    }

}
