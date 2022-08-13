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

public class ControladorVehiculos {
    private ListaEnlazada<Automovil> listaVehiculos;
    private VehiculoDao vdao;
    private AutomovilDao adao;
    private MarcaDao mdao;
    private TipoCombustibleDao tcdao;
    private TipoAutoDao tadao;

    public ControladorVehiculos(){
        listaVehiculos = new VehiculoDao().listar();
    }
   
    public ListaEnlazada<Automovil> getListaVehiculos() {
        return listaVehiculos;
    }

    public void setListaVehiculos(ListaEnlazada<Automovil> listaVehiculos) {
        this.listaVehiculos = listaVehiculos;
    }

    public Automovil obtenerVehiculo(Integer id_vehiculo) throws Exception{
        for (int i = 0; i < listaVehiculos.getSize(); i++) {
            Automovil vehiculo = listaVehiculos.obtenerDato(i);
            /*if (vehiculo.getId().equals(id_vehiculo)) {
                return vehiculo;
            }*/
        }
        return null;
    }

    public void insertarVehiculo(String marca, String modelo, Integer anio, String placa, String tipoVehiculo, String tipoCombustible, Integer id_cliente) throws Exception{
        //listaVehiculos.insertar(new Automovil(listaVehiculos.getSize()+1, marca, modelo, anio, placa, tipoVehiculo, tipoCombustible, id_cliente));
    }

    public Integer getSize(){
        return listaVehiculos.getSize();
    }

    public void cargarVehiculos(){
        Gson gson = new Gson();
        try {
            Automovil [] arrayVehiculos = gson.fromJson(new FileReader("vehiculos.json"), Automovil[].class);
            for (Automovil vehiculo : arrayVehiculos) {
                listaVehiculos.insertar(vehiculo);
            }
        } catch (FileNotFoundException e) {
            System.out.println("No se encontro el archivo");
        }
    }

    public void guardarVehiculos(){
        Gson gson = new Gson();
        try {
            Automovil[] arrayVehiculos = new Automovil[listaVehiculos.getSize()];
            for (int i = 0; i < listaVehiculos.getSize(); i++) {
                arrayVehiculos[i] = listaVehiculos.obtenerDato(i);
            }
            String json = gson.toJson(arrayVehiculos);
            System.out.println(json);
            FileWriter fw = new FileWriter("vehiculos.json");
            fw.write(json);
            fw.flush();
            System.out.println("Se guardo el archivo");
        } catch (Exception e) {
            System.out.println("No se pudo guardar el archivo");
        }
    }

    public void imprimir(Integer i) throws Exception{
        System.out.println(listaVehiculos.obtenerDato(i).toString());
    }
}
