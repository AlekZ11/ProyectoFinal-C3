/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador.dao;

import modelo.Vehiculo;

/**
 *
 * @author Usuario iTC
 */
public class VehiculoDao extends AdaptadorDao<Vehiculo>{
    private Vehiculo vehiculo;
    
    public VehiculoDao() {
        super(Vehiculo.class);
    }

    /**
     * @return the vehiculo
     */
    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    /**
     * @param vehiculo the vehiculo to set
     */
    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }
    
}
