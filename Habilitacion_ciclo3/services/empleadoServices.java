package com.example.Habilitacion_ciclo3.services;

import com.example.Habilitacion_ciclo3.entities.empleado;
import com.example.Habilitacion_ciclo3.repositories.empleadoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class empleadoServices {

    private empleadoRepository repository ;

    public empleadoServices(empleadoRepository repository) {
        this.repository = repository;

    }
    public List<empleado> getempleadoList() {
        return this.repository.findAll();
    }

    public empleado createempleado(empleado newempleado) {
        return this.repository.save(newempleado);
    }
}
