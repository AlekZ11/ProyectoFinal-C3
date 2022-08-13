/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador.dao;

import controlador.tda.lista.ListaEnlazada;
import modelo.Automovil;

/**
 *
 * @author Usuario iTC
 */
public class VehiculoDao extends AdaptadorDao<Automovil> {
    private Automovil vehiculo;

    public Automovil getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Automovil persona) {
        this.vehiculo = persona;
    }

    public VehiculoDao() {
        super(Automovil.class);
    }
    
    public void guardar() throws Exception{
        super.guardar(vehiculo);
    }
    
    public void modificar() throws Exception{
        super.modificar(vehiculo);
    }
    
    public ListaEnlazada<Automovil> listar(){
        return super.listar();
    }
    
    public Automovil obtener (Integer id) throws Exception{
        return super.obtener(id);
    }

    public static void main(String[] args) throws Exception {
    }
}
