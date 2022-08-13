package modelo;

import java.sql.Date;


public class Vehiculo {
    private String placa;
    
    private Integer anio;
    private Integer id_Automovil;
    private Integer id_cliente;
    private Date created_At;
    private Date updated_At;

    public Vehiculo(){   }

    public Vehiculo(String placa, Integer anio, Integer id_Automovil, Integer id_cliente) {
        this.placa = placa;
        this.anio = anio;
        this.id_Automovil = id_Automovil;
        this.id_cliente = id_cliente;
    }
    
    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public Integer getAnio() {
        return anio;
    }

    public void setAnio(Integer anio) {
        this.anio = anio;
    }

    public Integer getId_Automovil() {
        return id_Automovil;
    }

    public void setId_Automovil(Integer id_Automovil) {
        this.id_Automovil = id_Automovil;
    }

    public Integer getId_cliente() {
        return id_cliente;
    }

    public void setId_cliente(Integer id_cliente) {
        this.id_cliente = id_cliente;
    }

    public Date getCreated_At() {
        return created_At;
    }

    public void setCreated_At(Date created_At) {
        this.created_At = created_At;
    }

    public Date getUpdated_At() {
        return updated_At;
    }

    public void setUpdated_At(Date updated_At) {
        this.updated_At = updated_At;
    }
    
    

}
