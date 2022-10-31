package com.example.Habilitacion_ciclo3.services;

import com.example.Habilitacion_ciclo3.entities.empresa;
import com.example.Habilitacion_ciclo3.repositories.empresaRepository;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class empresaServices {
    private empresaRepository repository ;

  public empresaServices(empresaRepository repository) {
        this.repository = repository;
    
  }
   public List<empresa> getempresaList() {
      return this.repository.findAll();
  }

  public empresa createempresa(empresa empresa) {
      return this.repository.save(empresa);
  }




}
