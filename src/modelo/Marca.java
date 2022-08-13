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
    
    private String name;
    private Date created_At;

    public Marca(String name) {
        this.name = name;
    }

    public Integer getID_Marca() {
        return ID_Marca;
    }

    public String getName() {
        return name;
    }

    public Date getCreated_At() {
        return created_At;
    }
}
