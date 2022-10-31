package com.example.Habilitacion_ciclo3.entities;


import javax.persistence.*;

@Entity
@Table(name = "movimiento")
public class movimientoDinero {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @Column(name = "monto")
    private Double montoMovimiento;
    @Column(name = "concepto")
    private String conceptoMovimiento;
    @Column(name = "usuario")
    private String usuario;

    public movimientoDinero(Double montoMovimiento, String conceptoMovimiento, String usuario) {
        this.montoMovimiento = montoMovimiento;
        this.conceptoMovimiento = conceptoMovimiento;
        this.usuario = usuario;
    }

    public movimientoDinero(){
    }

    public Double getMontoMovimiento() {
        return montoMovimiento;
    }

    public void setMontoMovimiento(Double montoMovimiento) {
        this.montoMovimiento = montoMovimiento;
    }

    public String getConceptoMovimiento() {
        return conceptoMovimiento;
    }

    public void setConceptoMovimiento(String conceptoMovimiento) {
        this.conceptoMovimiento = conceptoMovimiento;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }
    
}
