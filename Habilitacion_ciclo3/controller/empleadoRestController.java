package com.example.Habilitacion_ciclo3.controller;

import com.example.Habilitacion_ciclo3.entities.empleado;
import com.example.Habilitacion_ciclo3.services.empleadoServices;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class empleadoRestController {

    empleadoServices service;

    public empleadoRestController(empleadoServices service) {
        this.service = service;
    }

    @GetMapping("/empleado")
    public List<empleado> empleadoList() {
        return this.service.getempleadoList();
    }

    @PostMapping("/empleado")
    public empleado createempleado(@RequestBody empleado empleado) {
        return this.service.createempleado(empleado);
    }
}


