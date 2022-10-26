public class movimientoDinero {

    private Double montoMovimiento;
    private String conceptoMovimiento;
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
