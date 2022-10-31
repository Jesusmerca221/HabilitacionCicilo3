package com.example.Habilitacion_ciclo3.controller;


import com.example.Habilitacion_ciclo3.entities.empresa;
import com.example.Habilitacion_ciclo3.services.empresaServices;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class empresaRestController {
  empresaServices service;

  public empresaRestController(empresaServices service) {
    this.service = service;
  }

  @GetMapping("/empresa")
  public List<empresa> empresaList() {
    return this.service.getempresaList();
  }


  @PostMapping("/empresa")
  public empresa createempresa(@RequestBody empresa empresa) {
    return this.service.createempresa(empresa);
  }
    
}

