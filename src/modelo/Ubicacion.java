/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.Date;

/**
 *
 * @author Usuario iTC
 */
public class Ubicacion {
    
    private Integer id;
    private Integer ID_Ciudad;
    private String Direccion;
    private Date Created_At;

    public Ubicacion(Integer id, Integer ID_Ciudad, String Direccion, Date Created_At) {
        this.id = id;
        this.ID_Ciudad = ID_Ciudad;
        this.Direccion = Direccion;
        this.Created_At = Created_At;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getID_Ciudad() {
        return ID_Ciudad;
    }

    public void setID_Ciudad(Integer ID_Ciudad) {
        this.ID_Ciudad = ID_Ciudad;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }

    public Date getCreated_At() {
        return Created_At;
    }

    public void setCreated_At(Date Created_At) {
        this.Created_At = Created_At;
    }

    @Override
    public String toString() {
        return "Location{" + "id=" + id + ", ID_Ciudad=" + ID_Ciudad + ", Direccion=" + Direccion + ", Created_At=" + Created_At + '}';
    }
    
}
