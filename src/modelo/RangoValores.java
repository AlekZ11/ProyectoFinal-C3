/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author LENOVO LEGION 5
 */
public class RangoValores {
    private Integer ID;
    private Integer valorMin;
    private Integer valorMax;

    public RangoValores(Integer ID, Integer valorMin, Integer valorMax) {
        this.ID = ID;
        this.valorMin = valorMin;
        this.valorMax = valorMax;
    }

    public RangoValores() {    }

    public Integer getID() {
        return ID;
    }

    public void setID(Integer ID) {
        this.ID = ID;
    }

    public Integer getValorMin() {
        return valorMin;
    }

    public void setValorMin(Integer valorMin) {
        this.valorMin = valorMin;
    }

    public Integer getValorMax() {
        return valorMax;
    }

    public void setValorMax(Integer valorMax) {
        this.valorMax = valorMax;
    }
    
    
}
