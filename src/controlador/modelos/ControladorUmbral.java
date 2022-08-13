package controlador.modelos;

import com.google.gson.Gson;
import controlador.dao.UmbralDao;
import controlador.tda.lista.ListaEnlazada;
import modelo.*;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;

public class ControladorUmbral {
    private ListaEnlazada<Umbral> listaUmbrales;
    private ListaEnlazada<RangoAnio> listaRangosAnio;

    public ControladorUmbral(){
        listaUmbrales = new ListaEnlazada<>();
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
        ListaEnlazada<Umbral> listaAux = new ListaEnlazada<>();
        for (int i = 0; i < listaUmbrales.getSize(); i++) {
            if(listaUmbrales.obtenerDato(i).getClave_Umbral().equals(id_valor)){
                listaAux.insertar(listaUmbrales.obtenerDato(i));
            }
        }
        return listaAux;
    }
    
    public RangoAnio obtenerRangoAnio(Integer id_rangoAnio)throws Exception{
        RangoAnio Aux = new RangoAnio();
            if(listaRangosAnio.obtenerDato(id_rangoAnio).getID_RangoAnio().equals(id_rangoAnio)){
                Aux = listaRangosAnio.obtenerDato(id_rangoAnio);
            }
        return Aux;
    }

    public void cargarUmbrales(){
        Gson gson = new Gson();
        try {
            Umbral [] arrayUmbrales = gson.fromJson(new FileReader("umbrales.json"), Umbral[].class);
            for (Umbral umbral : arrayUmbrales) {
                listaUmbrales.insertar(umbral);
            }
        } catch (FileNotFoundException e) {
            System.out.println("No se encontro el archivo");
        }
    }

    public void guardarUmbrales(){
        Gson gson = new Gson();
        try {
            Umbral[] arrayUmbrales = new Umbral[listaUmbrales.getSize()];
            arrayUmbrales = listaUmbrales.toArray();
            String json = gson.toJson(arrayUmbrales);
            System.out.println(json);
            FileWriter fw = new FileWriter("umbrales.json");
            fw.write(json);
            fw.flush();
            System.out.println("Se guardo el archivo");
        } catch (Exception e) {
            System.out.println("No se pudo guardar el archivo");
        }
    }

    public String comprobarUmbral(Integer id_valor, Integer anio, Double valor) throws Exception{
        ListaEnlazada<Umbral> umbrales = obtenerUmbral(id_valor);
        String [] resultado = {"OK","Tipo 1", "Tipo 2", "Tipo 3"};
        for (int i = 0; i < umbrales.getSize(); i++) {
            Umbral umbral = umbrales.obtenerDato(i);
            RangoAnio ra = obtenerRangoAnio(umbrales.obtenerDato(i).getID_RangoAnio());
            if(umbral != null){
                if(anio >= ra.getAnioMin() && anio < ra.getAnioMax()){
                    if(umbral.getValorMin() <= valor && umbral.getValorMax() > valor){
                        System.out.println("(" + umbral.getValorMin() + " <= " + valor + " < " + umbral.getValorMax() + ")" + " = " + umbral.getTipo());
                        return umbral.getTipo();
                    }
                }
            }
        }
        return "Error no se encuentra dentro de los rangos de los umbrales";
    }
}
