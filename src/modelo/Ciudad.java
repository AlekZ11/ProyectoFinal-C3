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
public class Ciudad {
    private Integer id;
    private String Nombre;
    private Integer ID_Provincia;
    private Date Created_At;

    public Ciudad(Integer id, String Nombre, Integer ID_Provincia, Date Created_At) {
        this.id = id;
        this.Nombre = Nombre;
        this.ID_Provincia = ID_Provincia;
        this.Created_At = Created_At;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public Integer getID_Provincia() {
        return ID_Provincia;
    }

    public void setID_Provincia(Integer ID_Provincia) {
        this.ID_Provincia = ID_Provincia;
    }

    public Date getCreated_At() {
        return Created_At;
    }

    public void setCreated_At(Date Created_At) {
        this.Created_At = Created_At;
    }

    @Override
    public String toString() {
        return "Ciudad{" + "id=" + id + ", Nombre=" + Nombre + ", ID_Provincia=" + ID_Provincia + ", Created_At=" + Created_At + '}';
    }
    
}
