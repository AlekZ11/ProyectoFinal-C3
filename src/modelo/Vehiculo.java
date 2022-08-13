/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.sql.Date;

/**
 *
 * @author LENOVO LEGION 5
 */
public class Vehiculo {
    private Integer ID_Vehiculo;
    
    private Integer ID_Marca;
    private String modelo;
    private String tipoVehiculo;
    private String tipoCombustible;
    private Date created_At;

    public Vehiculo() {
    }

    public Vehiculo(Integer ID_Vehiculo, Integer ID_Marca, String modelo, String tipoVehiculo, String tipoCombustible) {
        this.ID_Vehiculo = ID_Vehiculo;
        this.ID_Marca = ID_Marca;
        this.modelo = modelo;
        this.tipoVehiculo = tipoVehiculo;
        this.tipoCombustible = tipoCombustible;
    }

    public Integer getID_Vehiculo() {
        return ID_Vehiculo;
    }

    public void setID_Vehiculo(Integer ID_Vehiculo) {
        this.ID_Vehiculo = ID_Vehiculo;
    }

    public Integer getID_Marca() {
        return ID_Marca;
    }

    public void setID_Marca(Integer ID_Marca) {
        this.ID_Marca = ID_Marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getTipoVehiculo() {
        return tipoVehiculo;
    }

    public void setTipoVehiculo(String tipoVehiculo) {
        this.tipoVehiculo = tipoVehiculo;
    }

    public String getTipoCombustible() {
        return tipoCombustible;
    }

    public void setTipoCombustible(String tipoCombustible) {
        this.tipoCombustible = tipoCombustible;
    }

    public Date getCreated_At() {
        return created_At;
    }

    public void setCreated_At(Date created_At) {
        this.created_At = created_At;
    }
    
    
}
