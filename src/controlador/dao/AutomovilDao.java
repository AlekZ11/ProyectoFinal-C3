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
public class AutomovilDao extends AdaptadorDao<Vehiculo> {
    private Vehiculo automovil;

    public Vehiculo getAutomovil() {
        return automovil;
    }

    public void setAutomovil(Vehiculo automovil) {
        this.automovil = automovil;
    }

    public AutomovilDao() {
        super(Vehiculo.class);
    }
    
    public void guardar() throws Exception{
        super.guardar(automovil);
    }
    
    public void modificar() throws Exception{
        super.modificar(automovil);
    }
    
    public ListaEnlazada<Vehiculo> listar(){
        return super.listar();
    }
    
    public Vehiculo obtener (Integer id) throws Exception{
        return super.obtener(id);
    }

    public static void main(String[] args) throws Exception {
    }
}
