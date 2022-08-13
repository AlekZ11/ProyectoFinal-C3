package controlador.modelos;

import com.google.gson.Gson;
import controlador.dao.AutomovilDao;
import controlador.dao.MarcaDao;
import controlador.dao.TipoAutoDao;
import controlador.dao.TipoCombustibleDao;
import controlador.dao.VehiculoDao;
import controlador.tda.lista.ListaEnlazada;
import modelo.Marca;
import modelo.TipoCombustible;
import modelo.Automovil;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

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
        adao = new AutomovilDao();
        vdao = new VehiculoDao();
        mdao = new MarcaDao();
        tcdao = new TipoCombustibleDao();
        tadao = new TipoAutoDao();
    }

    public AutomovilDao getAdao() {
        return adao;
    }

    public VehiculoDao getVdao() {
        return vdao;
    }

    public MarcaDao getMdao() {
        return mdao;
    }

    public TipoCombustibleDao getTcdao() {
        return tcdao;
    }

    public TipoAutoDao getTadao() {
        return tadao;
    }

    public ListaEnlazada<Automovil> getListaAutomoviles() {
        return listaAutomoviles;
    }

    public void setListaVehiculos(ListaEnlazada<Automovil> listaVehiculos) {
        this.listaAutomoviles = listaVehiculos;
    }
    
    public Automovil obtenerAutomovil(String id_Automovil) throws Exception{
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

    public void guardarAutomovil(String placa, Integer anio, String marca, String modelo, String tipoVehiculo, String tipoCombustible, Integer id_cliente) throws Exception{
        Automovil automovil = obtenerAutomovil(placa);
        if (automovil == null){
            Integer id_Vehiculo = existeVehiculo(marca, modelo, tipoVehiculo, tipoCombustible);
            adao.setAutomovil(new Automovil(placa, anio, id_Vehiculo, id_cliente));
            adao.guardar();
        }
    }

    public Integer existeVehiculo(String marca, String modelo, String tipoVehiculo, String tipoCombustible) throws Exception{
        ListaEnlazada<Vehiculo> listaVehiculos = vdao.listar();
        Integer id_marca = existeMarca(marca);
        ListaEnlazada <Vehiculo> resultado1 = listaVehiculos.buscar("ID_Marca", id_marca);
        ListaEnlazada <Vehiculo> resultado2 = resultado1.buscar("Modelo", modelo);
        ListaEnlazada <Vehiculo> resultado3 = resultado2.buscar("TipoVehiculo", tipoVehiculo);
        ListaEnlazada <Vehiculo> resultado4 = resultado3.buscar("TipoCombustible", tipoCombustible);
        if(resultado4.getSize() > 0){
            return resultado4.obtenerDato(0).getID_Vehiculo();
        }else {
            vdao.setVehiculo(new Vehiculo(vdao.getNextValue(), id_marca, modelo, tipoVehiculo, tipoCombustible));
            vdao.guardar();
            return vdao.getCurrentValue();
        }
    }

    public Integer existeMarca(String marca) throws Exception{
        ListaEnlazada<Marca> listaMarcas = mdao.listar();
        ListaEnlazada <Marca> resultado = listaMarcas.buscar("Marca", marca);
        if(resultado.getSize() > 0){
            return resultado.obtenerDato(0).getID_Marca();
        }else {
            mdao.setMarca(new Marca(mdao.getNextValue() , marca));
            mdao.guardar();
            return mdao.getCurrentValue();
        }
    }

    public void imprimir(Integer i) throws Exception{
        System.out.println(listaAutomoviles.obtenerDato(i).toString());
    }
}
