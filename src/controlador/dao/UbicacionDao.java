/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador.dao;

import modelo.Ubicacion;

/**
 *
 * @author Usuario iTC
 */
public class UbicacionDao extends AdaptadorDao<Ubicacion>{
    
    private Ubicacion location;
    
    public UbicacionDao() {
        super(Ubicacion.class);
    }

    public Ubicacion getLocation() {
        return location;
    }

    public void setLocation(Ubicacion location) {
        this.location = location;
    }
    
}
