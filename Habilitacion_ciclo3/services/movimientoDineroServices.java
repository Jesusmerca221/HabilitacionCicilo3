package com.example.Habilitacion_ciclo3.services;

import com.example.Habilitacion_ciclo3.entities.movimientoDinero;
import com.example.Habilitacion_ciclo3.repositories.movimientoDineroRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class movimientoDineroServices {

    private movimientoDineroRepository repository ;

    public movimientoDineroServices(movimientoDineroRepository repository) {
        this.repository = repository;

    }
    public List<movimientoDinero> getmovimientoDineroList() {
        return this.repository.findAll();
    }

    public movimientoDinero createmovimientoDinero(movimientoDinero newmovimientoDinero) {
        return this.repository.save(newmovimientoDinero);
    }

}
