/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.util.Date;

/**
 *
 * @author LENOVO LEGION 5
 */
public class Provincia {
    private Integer ID_Provincia;
    private String Nombre;
    private Date Created_At;
    
    public Provincia(){}

    public Provincia(Integer id, String Nombre) {
        this.ID_Provincia = id;
        this.Nombre = Nombre;
    }

    public Integer getID_Provincia() {
        return ID_Provincia;
    }

    public void setID_Provincia(Integer ID_Provincia) {
        this.ID_Provincia = ID_Provincia;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public Date getCreated_At() {
        return Created_At;
    }

    public void setCreated_At(Date Created_At) {
        this.Created_At = Created_At;
    }

    @Override
    public String toString() {
        return "Provincia{" + "id=" + ID_Provincia + ", Nombre=" + Nombre + ", Created_At=" + Created_At + '}';
    }  
}
