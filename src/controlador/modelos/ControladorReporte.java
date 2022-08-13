/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador.modelos;

import controlador.dao.CiudadDao;
import controlador.dao.MarcaDao;
import controlador.dao.ProvinciaDao;
import controlador.dao.UbicacionDao;
import controlador.dao.VehiculoDao;
import controlador.tda.lista.ListaEnlazada;
import modelo.Automovil;
import modelo.Ciudad;
import modelo.Cliente;
import modelo.Marca;
import modelo.Provincia;
import modelo.Ubicacion;
import modelo.Vehiculo;

/**
 *
 * @author LENOVO LEGION 5
 */
public class ControladorReporte {

    private Cliente c;
    private Automovil a;
    private Vehiculo v;
    private Marca m;
    private Ubicacion l;
    private Ciudad cd;
    private Provincia p;
    private ListaEnlazada<String> resultados;

    public ControladorReporte(Cliente c, Automovil a, ListaEnlazada<String> resultados) throws Exception {
        this.c = c;
        this.a = a;
        this.v = ObtenerVehiculo();
        this.m = ObtenerMarca();
        this.l = ObtenerUbicacion();
        this.cd = ObtenerCiudad();
        this.p = ObtenerProvincia();

        this.resultados = resultados;
    }

    public ControladorReporte() {

    }

    /**
     * @return the c
     */
    public Cliente getC() {
        return c;
    }

    /**
     * @param c the c to set
     */
    public void setC(Cliente c) {
        this.c = c;
    }

    /**
     * @return the a
     */
    public Automovil getA() {
        return a;
    }

    /**
     * @param a the a to set
     */
    public void setA(Automovil a) {
        this.a = a;
    }

    /**
     * @return the v
     */
    public Vehiculo getV() {
        return v;
    }

    /**
     * @param v the v to set
     */
    public void setV(Vehiculo v) {
        this.v = v;
    }

    /**
     * @return the resultados
     */
    public ListaEnlazada<String> getResultados() {
        return resultados;
    }

    /**
     * @param resultados the resultados to set
     */
    public void setResultados(ListaEnlazada<String> resultados) {
        this.resultados = resultados;
    }

    /**
     * @return the m
     */
    public Marca getM() {
        return m;
    }

    /**
     * @param m the m to set
     */
    public void setM(Marca m) {
        this.m = m;
    }

    /**
     * @return the l
     */
    public Ubicacion getL() {
        return l;
    }

    /**
     * @param l the l to set
     */
    public void setL(Ubicacion l) {
        this.l = l;
    }

    /**
     * @return the cd
     */
    public Ciudad getCd() {
        return cd;
    }

    /**
     * @param cd the cd to set
     */
    public void setCd(Ciudad cd) {
        this.cd = cd;
    }

    /**
     * @return the p
     */
    public Provincia getP() {
        return p;
    }

    /**
     * @param p the p to set
     */
    public void setP(Provincia p) {
        this.p = p;
    }

    private Vehiculo ObtenerVehiculo() throws Exception {
        VehiculoDao vehiculo = new VehiculoDao();
        //ListaEnlazada<Vehiculo> vehiculos = vehiculo.listar();
        //vehiculos = vehiculos.buscar("ID_Vehiculo", a.getID_Vehiculo());
        
        return vehiculo.obtener(a.getID_Vehiculo() + "");
        
        //return vehiculos.obtenerDato(0);
    }

    private Marca ObtenerMarca() throws Exception {
        MarcaDao marca = new MarcaDao();
        //ListaEnlazada<Marca> marcas = marca.listar();
        //marcas = marcas.buscar("ID_Marca", v.getID_Marca());
        
        return marca.obtener(v.getID_Marca() + "");
        
        //return marcas.obtenerDato(0);
    }

    private Ubicacion ObtenerUbicacion() throws Exception {
        UbicacionDao ubicacion = new UbicacionDao();
        //ListaEnlazada<Ubicacion> ubicaciones = ubicacion.listar();
        //ubicaciones = ubicaciones.buscar("ID_Ubicacion", c.getID_Ubicacion());
        
        return ubicacion.obtener(c.getID_Ubicacion() + "");
        
        //return ubicaciones.obtenerDato(0);
    }

    private Ciudad ObtenerCiudad() throws Exception {
        CiudadDao ciudad = new CiudadDao();
        //ListaEnlazada<Ciudad> ciudades = ciudad.listar();
        //ciudades = ciudades.buscar("ID_Ciudad", l.getID_Ciudad());
        
        return ciudad.obtener(l.getID_Ciudad() + "");
        
        //return ciudades.obtenerDato(0);
    }

    private Provincia ObtenerProvincia() throws Exception {
        ProvinciaDao provincia = new ProvinciaDao();
        //ListaEnlazada<Provincia> provincias = provincia.listar();
        //provincias = provincias.buscar("ID_Provincia", cd.getID_Provincia());
        
        return provincia.obtener(cd.getID_Provincia() + "");
        
        //return provincias.obtenerDato(0);
    }

}
