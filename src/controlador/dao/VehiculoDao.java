/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador.dao;

import controlador.tda.lista.ListaEnlazada;
import modelo.Vehiculo;

/**
 *
 * @author Usuario iTC
 */
public class VehiculoDao extends AdaptadorDao<Vehiculo> {
    private Vehiculo vehiculo;

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Vehiculo persona) {
        this.vehiculo = persona;
    }

    public VehiculoDao() {
        super(Vehiculo.class);
    }
    
    public void guardar() throws Exception{
        super.guardar(vehiculo);
    }
    
    public void modificar() throws Exception{
        super.modificar(vehiculo);
    }
    
    public ListaEnlazada<Vehiculo> listar(){
        return super.listar();
    }
    
    public Vehiculo obtener (String id) throws Exception{
        return super.obtener(id);
    }

    public static void main(String[] args) throws Exception {
    }
}
