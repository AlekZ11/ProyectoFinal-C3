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
public class Automovil {
    private Integer id;
    
    private Integer id_Marca;
    private String modelo;
    private TipoVehiculo tipoVehiculo;
    private TipoCombustible tipoCombustible;
    private Date created_At;

    public Automovil() {
    }

    public Automovil(Integer id, Integer id_Marca, String modelo, TipoVehiculo tipoVehiculo, TipoCombustible tipoCombustible) {
        this.id = id;
        this.id_Marca = id_Marca;
        this.modelo = modelo;
        this.tipoVehiculo = tipoVehiculo;
        this.tipoCombustible = tipoCombustible;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getId_Marca() {
        return id_Marca;
    }

    public void setId_Marca(Integer id_Marca) {
        this.id_Marca = id_Marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public TipoVehiculo getTipoVehiculo() {
        return tipoVehiculo;
    }

    public void setTipoVehiculo(TipoVehiculo tipoVehiculo) {
        this.tipoVehiculo = tipoVehiculo;
    }

    public TipoCombustible getTipoCombustible() {
        return tipoCombustible;
    }

    public void setTipoCombustible(TipoCombustible tipoCombustible) {
        this.tipoCombustible = tipoCombustible;
    }

    public Date getCreated_At() {
        return created_At;
    }

    public void setCreated_At(Date created_At) {
        this.created_At = created_At;
    }
    
    
}
