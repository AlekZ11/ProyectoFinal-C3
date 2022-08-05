package modelo;

import java.util.Date;

public class Reporte_1 {
    private Integer id;
    private Integer id_cliente;
    private Integer id_vehiculo;
    private boolean estado;
    private Date fecha;
    private String observacion;

    public Reporte_1(){   }

    public Reporte_1(Integer id, Integer id_cliente, Integer id_vehiculo, boolean estado, String observacion){
        this.id = id;
        this.id_cliente = id_cliente;
        this.id_vehiculo = id_vehiculo;
        this.estado = estado;
        //Asignar la fecha actual
        this.fecha = new Date();
        this.observacion = observacion;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getId_cliente() {
        return id_cliente;
    }

    public void setId_cliente(Integer id_cliente) {
        this.id_cliente = id_cliente;
    }

    public Integer getId_vehiculo() {
        return id_vehiculo;
    }

    public void setId_vehiculo(Integer id_vehiculo) {
        this.id_vehiculo = id_vehiculo;
    }

    public String getEstado() {
        return (estado)?"Aprovado":"Reprobado";
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getObservacion() {
        return observacion;
    }

    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }

    @Override
    public String toString(){
        return "Reporte: " + this.id
                + "\n - Cliente: " + this.id_cliente
                + "\n - Vehiculo: " + this.id_vehiculo
                + "\n - Estado: " + this.estado
                + "\n - Fecha: " + this.fecha
                + "\n - Observacion: " + this.observacion;
    }
}
