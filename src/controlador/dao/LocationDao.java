/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador.dao;

import modelo.Location;

/**
 *
 * @author Usuario iTC
 */
public class LocationDao extends AdaptadorDao<Location>{
    
    private Location location;
    
    public LocationDao() {
        super(Location.class);
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }
    
}
