package com.accenture.springdata.springdata.controller;

import com.accenture.springdata.springdata.model.Zoo;
import com.accenture.springdata.springdata.model.ZooCliente;
import com.accenture.springdata.springdata.service.SpringDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class SpringDataController {

    @Autowired
    SpringDataService springDataService;

    @GetMapping("/zoo")
    @ResponseBody
    public List<ZooCliente> getAllZooClient(){
        return springDataService.getAll();
    }

    @GetMapping("/zoo/{id}")
    @ResponseBody
    public ZooCliente getZooClient(@PathVariable("id") Long id){
        return springDataService.getById(id);
    }

    @PostMapping("/zoo")
    @ResponseBody
    public ZooCliente saveZooClient(@RequestBody ZooCliente zooCliente){
        springDataService.saveZooClient(zooCliente);
        return springDataService.getById(zooCliente.getId());
    }

}
