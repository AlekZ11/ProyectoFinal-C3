/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author LENOVO LEGION 5
 */
public class RangoAnio {
    private Integer ID;
    private Integer anioMin;
    private Integer anioMax;

    public RangoAnio(Integer ID, Integer anioMin, Integer anioMax) {
        this.ID = ID;
        this.anioMin = anioMin;
        this.anioMax = anioMax;
    }

    public RangoAnio() {    }

    public Integer getID() {
        return ID;
    }

    public void setID(Integer ID) {
        this.ID = ID;
    }

    public Integer getAnioMin() {
        return anioMin;
    }

    public void setAnioMin(Integer anioMin) {
        this.anioMin = anioMin;
    }

    public Integer getAnioMax() {
        return anioMax;
    }

    public void setAnioMax(Integer anioMax) {
        this.anioMax = anioMax;
    }
    
    
}
