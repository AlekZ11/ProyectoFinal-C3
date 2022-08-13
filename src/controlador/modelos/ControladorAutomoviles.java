package controlador.modelos;

import com.google.gson.Gson;
import controlador.dao.AutomovilDao;
import controlador.dao.MarcaDao;
import controlador.dao.TipoAutoDao;
import controlador.dao.TipoCombustibleDao;
import controlador.dao.VehiculoDao;
import controlador.tda.lista.ListaEnlazada;
import modelo.TipoCombustible;
import modelo.Automovil;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import modelo.Vehiculo;

public class ControladorAutomoviles {
    private ListaEnlazada<Automovil> listaAutomoviles;
    private AutomovilDao adao;
    private VehiculoDao vdao;
    private MarcaDao mdao;
    private TipoCombustibleDao tcdao;
    private TipoAutoDao tadao;

    public ControladorAutomoviles(){
        listaAutomoviles = new AutomovilDao().listar();
    }
   
    public ListaEnlazada<Automovil> getListaAutomoviles() {
        return listaAutomoviles;
    }

    public void setListaVehiculos(ListaEnlazada<Automovil> listaVehiculos) {
        this.listaAutomoviles = listaVehiculos;
    }

    public Automovil obtenerVehiculo(Integer id_vehiculo) throws Exception{
        for (int i = 0; i < listaAutomoviles.getSize(); i++) {
            Automovil vehiculo = listaAutomoviles.obtenerDato(i);
            if (vehiculo.getID_Vehiculo().equals(id_vehiculo)) {
                return vehiculo;
            }
        }
        return null;
    }
    
    public Automovil obtenerAutomovil(Integer id_Automovil) throws Exception{
        return adao.obtener(id_Automovil);
    }

    public void insertarVehiculo(String marca, String modelo, Integer anio, String placa, String tipoVehiculo, String tipoCombustible, Integer id_cliente) throws Exception{
        //listaVehiculos.insertar(new Automovil(listaVehiculos.getSize()+1, marca, modelo, anio, placa, tipoVehiculo, tipoCombustible, id_cliente));
    }

    public Integer getSize(){
        return listaAutomoviles.getSize();
    }

    public void cargarVehiculos(){
        listaAutomoviles = adao.listar();
    }

    public void imprimir(Integer i) throws Exception{
        System.out.println(listaAutomoviles.obtenerDato(i).toString());
    }
}
