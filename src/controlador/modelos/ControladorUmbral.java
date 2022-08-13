package controlador.modelos;

import com.google.gson.Gson;
import controlador.dao.RangoAnioDao;
import controlador.dao.UmbralDao;
import controlador.tda.lista.ListaEnlazada;
import modelo.RangoAnio;
import modelo.Umbral;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;

public class ControladorUmbral {
    private ListaEnlazada<Umbral> listaUmbrales;
    private UmbralDao udao;
    private RangoAnioDao rdao;

    public ControladorUmbral(){
        listaUmbrales = new ListaEnlazada<>();
        udao = new UmbralDao();
        rdao = new RangoAnioDao();
    }

    public ListaEnlazada<Umbral> getListaUmbrales() {
        return listaUmbrales;
    }

    public void setListaUmbrales(ListaEnlazada<Umbral> listaUmbrales) {
        this.listaUmbrales = listaUmbrales;
    }

    /*public void insertarUmbral(Integer id_valor, Integer anioMin, Integer anioMax, Double [] valoresMin, Double [] valoresMax){
        listaUmbrales.insertar(new Umbral(listaUmbrales.getSize()+1, anioMin, anioMax, valoresMin, valoresMax, id_valor));
    }*/

    public ListaEnlazada<Umbral> obtenerUmbral(Integer id_valor) throws Exception{
        cargarUmbrales();
        ListaEnlazada<Umbral> listaAux = new ListaEnlazada<>();
        for (int i = 0; i < listaUmbrales.getSize(); i++) {
            if(listaUmbrales.obtenerDato(i).getClave_Umbral().equals(id_valor)){
                listaAux.insertar(listaUmbrales.obtenerDato(i));
            }
        }
        return listaAux;
    }

    public void cargarUmbrales(){
        listaUmbrales = udao.listar();
    }

    public Integer obtenerRangoAnio(Integer anioMin, Integer anioMax) throws Exception{
        ListaEnlazada<RangoAnio> listaAux = rdao.listar();
        ListaEnlazada<RangoAnio> resultado1 = listaAux.buscar("anioMin", anioMin);
        ListaEnlazada<RangoAnio> resultado2 = resultado1.buscar("anioMax", anioMax);
        return resultado2.obtenerDato(0).getID_RangoAnio();
    }

    public void guardarUmbrales(Double valorMin, Double valorMax, String tipo, Integer anioMin, Integer anioMax, Integer clave_valor) throws Exception {
        Integer id_rangoAnio = obtenerRangoAnio(anioMin, anioMax);
        udao.setUmbral(new Umbral(udao.getNextValue(), id_rangoAnio, tipo, valorMin, valorMax, clave_valor ));
        udao.guardar();
    }

    public String comprobarUmbral(Integer clave_valor, Integer anio, Double valor) throws Exception{
        ListaEnlazada<Umbral> umbrales = obtenerUmbral(clave_valor);
        for (int i = 0; i < umbrales.getSize(); i++) {
            Umbral umbral = umbrales.obtenerDato(i);
            RangoAnio rangoAnio = rdao.obtener(umbral.getID_RangoAnio().toString());
            if(umbral != null){
                if(anio >= rangoAnio.getAnioMin() && anio < rangoAnio.getAnioMax()){
                        if(umbral.getValorMin() <= valor && umbral.getValorMax() > valor){
                            System.out.println("(" + umbral.getValorMin() + " <= " + valor + " < " + umbral.getValorMax() + ")" + " = " + umbral.getTipo());
                            return umbral.getTipo();
                        }
                }
            }
        }
        return "Error no se encuentro un umbral asignado para el valor ingresado";
    }
}
