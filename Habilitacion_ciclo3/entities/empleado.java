package com.example.Habilitacion_ciclo3.entities;

import javax.persistence.*;

@Entity
@Table(name = "empleado")
public class empleado {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @Column(name = "nombre")
    private String nombreEmpleado;
    @Column(name = "correo")
    private String correo;
    @Column(name = "rol")
    private String rolEmpleado;


    public empleado() {
    }

    public empleado(String nombreEmpleado, String correo, String rolEmpleado ) {
        this.nombreEmpleado = nombreEmpleado;
        this.correo = correo;
        this.rolEmpleado = rolEmpleado;
    }

    public String getNombreEmpleado() {
        return nombreEmpleado;
    }
    public void setNombreEmpleado(String nombreEmpleado) {
        this.nombreEmpleado = nombreEmpleado;
    }
    public String getCorreo() {
        return correo;
    }
    public void setCorreo(String correo) {
        this.correo = correo;
    }
    public String getRolEmpleado() {
        return rolEmpleado;
    }
    public void setRolEmpleado(String rolEmpleado) {
        this.rolEmpleado = rolEmpleado;
    }

    
}
