package com.example.Habilitacion_ciclo3.entities;

import javax.persistence.*;

@Entity 
@Table(name = "empresa")
public class empresa {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name = "nombre")
    private String nombreEmpresa;
    @Column(name = "direccion")
    private String direccion;
    @Column(name = "telefono")
    private int telefono;
    @Column(name = "NIT")
    private int NIT;


    public empresa() {
    }

    public empresa(String nombreEmpresa, String direccion, int telefono, int NIT) {
        this.nombreEmpresa = nombreEmpresa;
        this.direccion = direccion;
        this.telefono = telefono;
        this.NIT = NIT;
    }

    public String getNombreEmpresa() {
        return nombreEmpresa;
    }

    public void setNombreEmpresa(String nombreEmpresa) {
        this.nombreEmpresa = nombreEmpresa;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public int getNIT() {
        return NIT;
    }

    public void setNIT(int NIT) {
        this.NIT = NIT;
    }
}
