package com.example.Habilitacion_ciclo3.repositories;

import com.example.Habilitacion_ciclo3.entities.movimientoDinero;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface movimientoDineroRepository extends JpaRepository<movimientoDinero, Long> {
}
