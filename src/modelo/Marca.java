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
public class Marca {
    private Integer ID_Marca;
    
    private String nombre;
    private Date created_At;

    public Marca(){}
    
    public Marca(Integer ID_Marca, String nombre) {
        this.ID_Marca = ID_Marca;
        this.nombre = nombre;
    }

    public Integer getID_Marca() {
        return ID_Marca;
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public String toString() {
        return "{"+"ID="+ID_Marca+", nombre="+nombre+", Created_At="+created_At+"}";
    }
    
    
}
