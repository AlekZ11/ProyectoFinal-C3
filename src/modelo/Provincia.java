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
    private Integer id;
    private String Nombre;
    private Date Created_At;

    public Provincia(Integer id, String Nombre, Date Created_At) {
        this.id = id;
        this.Nombre = Nombre;
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

    public Date getCreated_At() {
        return Created_At;
    }

    public void setCreated_At(Date Created_At) {
        this.Created_At = Created_At;
    }

    @Override
    public String toString() {
        return "Provincia{" + "id=" + id + ", Nombre=" + Nombre + ", Created_At=" + Created_At + '}';
    }  
}
