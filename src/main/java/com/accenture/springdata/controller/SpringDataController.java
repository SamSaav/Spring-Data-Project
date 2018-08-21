package com.accenture.springdata.controller;

import com.accenture.springdata.model.ZooCliente;
import com.accenture.springdata.service.SpringDataService;
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
    public ZooCliente getZooClient(@PathVariable("id") Integer id){
        return springDataService.getById(id);
    }


    @PostMapping("/zoo")
    @ResponseBody
    public ZooCliente saveZooClient(@RequestBody ZooCliente zooCliente){
        springDataService.saveZooClient(zooCliente);
        return zooCliente;
    }

}
