package controlador.modelos;

import com.google.gson.Gson;
import controlador.tda.lista.ListaEnlazada;
import modelo.Cliente;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;

public class ControladorClientes {
    private ListaEnlazada<Cliente> listaClientes;

    public ControladorClientes(){
        listaClientes = new ListaEnlazada<>();
    }
    public Cliente obtenerCliente(Integer id_cliente) throws Exception{
        for (int i = 0; i < listaClientes.getSize(); i++) {
            Cliente cliente = listaClientes.obtenerDato(i);
            if (cliente.getId().equals(id_cliente)) {
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

    public void insertarCliente(Integer ID_location, Date Created_At, Date Updated_At ) throws Exception{
        listaClientes.insertar(new Cliente(listaClientes.getSize()+1, ID_location, Created_At, Updated_At));
    }

    public Integer getSize(){
        return listaClientes.getSize();
    }

    public void cargarClientes(){
        Gson gson = new Gson();
        try {
            Cliente [] arrayClientes = gson.fromJson(new FileReader("clientes.json"), Cliente[].class);
            for (Cliente cliente : arrayClientes) {
                listaClientes.insertar(cliente);
            }
        } catch (FileNotFoundException e) {
            System.out.println("No se encontro el archivo");
        }
    }

    public void guardarClientes() {
        Gson gson = new Gson();
        try {
            Cliente[] arrayClientes = new Cliente[listaClientes.getSize()];
            for (int i = 0; i < listaClientes.getSize(); i++) {
                arrayClientes[i] = listaClientes.obtenerDato(i);
            }
            String json = gson.toJson(arrayClientes);
            System.out.println(json);
            FileWriter fw = new FileWriter("clientes.json");
            fw.write(json);
            fw.flush();
            System.out.println("Se guardo el archivo");
        } catch (Exception e) {
            System.out.println("No se pudo guardar el archivo");
        }
    }

    public void imprimir(Integer i) throws Exception{
        System.out.println(listaClientes.obtenerDato(i).toString());
    }
}
