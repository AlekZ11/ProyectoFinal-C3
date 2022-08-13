package controlador.modelos;

import com.google.gson.Gson;
import controlador.dao.CiudadDao;
import controlador.dao.ClienteDao;
import controlador.dao.ProvinciaDao;
import controlador.dao.UbicacionDao;
import controlador.tda.lista.ListaEnlazada;
import modelo.Ciudad;
import modelo.Cliente;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;
import modelo.Provincia;
import modelo.Ubicacion;

public class ControladorClientes {
    private ListaEnlazada<Cliente> listaClientes;
    private ClienteDao cldao;
    private UbicacionDao udao;
    private CiudadDao cidao;
    private ProvinciaDao pdao;

    public ControladorClientes(){
        listaClientes = new ListaEnlazada<>();
        cldao = new ClienteDao();
        udao = new UbicacionDao();
        cidao = new CiudadDao();
        pdao = new ProvinciaDao();
    }

    public ClienteDao getCldao() {
        return cldao;
    }

    public UbicacionDao getUdao() {
        return udao;
    }

    public CiudadDao getCidao() {
        return cidao;
    }

    public ProvinciaDao getPdao() {
        return pdao;
    }

    public Cliente obtenerCliente(Integer id_cliente) throws Exception{
        for (int i = 0; i < listaClientes.getSize(); i++) {
            Cliente cliente = listaClientes.obtenerDato(i);
            if (cliente.getID_Cliente().equals(id_cliente)) {
                return cliente;
            }
        }
        return null;
    }

    public ListaEnlazada<Cliente> getListaClientes() {
        return listaClientes;
    }

    public void setListaClientes(ListaEnlazada<Cliente> listaClientes) {
        this.listaClientes = listaClientes;
    }

    public void insertarCliente(String nombre, String apellido, String identificacion, Integer ID_location, Date Created_At, Date Updated_At ) throws Exception{
        //listaClientes.insertar(new Cliente(listaClientes.getSize()+1, nombre, apellido, identificacion, ID_location, Created_At, Updated_At ));
    }

    public Integer getSize(){
        return listaClientes.getSize();
    }

    public void cargarClientes(){
        listaClientes = cldao.listar();
    }
    
    public Integer existeProvincia(String provincia) throws Exception{
        ListaEnlazada<Provincia> listaProvincia = pdao.listar();
        ListaEnlazada <Provincia> resultado = listaProvincia.buscar("nombre", provincia);
        if(resultado.estaVacia()) {
            pdao.setProvincia(new Provincia(pdao.getNextValue(), provincia));
            pdao.guardar();
            return pdao.getCurrentValue();
        }
        return resultado.obtenerDato(0).getID_Provincia();
    }

    public Integer existeCiudad(String ciudad) throws Exception{
        ListaEnlazada<Ciudad> listaCiudad = cidao.listar();
        ListaEnlazada <Ciudad> resultado = listaCiudad.buscar("nombre", ciudad);
        if(resultado.estaVacia())
            return -1;
        return resultado.obtenerDato(0).getID_Ciudad();
    }

    public Integer existeCliente(String identificacion) throws Exception{
        ListaEnlazada<Cliente> listaCliente = cldao.listar();
        ListaEnlazada <Cliente> resultado = listaCliente.buscar("identificacion", identificacion);
        if(resultado.estaVacia())
            return -1;
        return resultado.obtenerDato(0).getID_Cliente();
    }

    public Integer existeUbiacion(String direccion) throws Exception{
        ListaEnlazada<Ubicacion> listaUbicacion = udao.listar();
        ListaEnlazada <Ubicacion> resultado = listaUbicacion.buscar("Direccion", direccion);
        if(resultado.estaVacia())
            return -1;
        return resultado.obtenerDato(0).getID_Ubicacion();
    }

    public void imprimir(Integer i) throws Exception{
        System.out.println(listaClientes.obtenerDato(i).toString());
    }
}
