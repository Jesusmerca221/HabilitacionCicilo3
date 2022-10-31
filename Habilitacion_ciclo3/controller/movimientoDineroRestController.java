package com.example.Habilitacion_ciclo3.controller;

import com.example.Habilitacion_ciclo3.entities.movimientoDinero;
import com.example.Habilitacion_ciclo3.services.movimientoDineroServices;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class movimientoDineroRestController {

    movimientoDineroServices service;

    public movimientoDineroRestController(movimientoDineroServices service) {
        this.service = service;
    }

    @GetMapping("/movimientoDinero")
    public List<movimientoDinero> movimientoDineroList() {
        return this.service.getmovimientoDineroList();
    }

    @PostMapping("/movimientoDinero")
    public movimientoDinero createmovimientoDinero(@RequestBody movimientoDinero movimientoDinero) {
        return this.service.createmovimientoDinero(movimientoDinero);
    }
}
