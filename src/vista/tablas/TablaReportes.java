package vista.tablas;

import controlador.modelos.ControladorClientes;
import controlador.modelos.ControladorAutomoviles;
import controlador.tda.lista.ListaEnlazada;
import modelo.Cliente;
import modelo.Reporte;
import modelo.Automovil;

import javax.swing.table.AbstractTableModel;

public class TablaReportes extends AbstractTableModel {
    private String[] columnas = {"ID", "Nombres", "PLaca", "Estado", "Fecha"};
    ListaEnlazada<Reporte> listaReportes;
    ControladorClientes controladorClientes;
    ControladorAutomoviles controladorAutomoviles;

    public TablaReportes() {

    }

    public TablaReportes(ListaEnlazada<Reporte> listaReportes) {
        this.listaReportes = listaReportes;
    }

    @Override
    public int getColumnCount() {
        return columnas.length;
    }

    @Override
    public int getRowCount() {
        return listaReportes.getSize();
    }

    @Override
    public String getColumnName(int columna) {
        return columnas[columna];
    }

    @Override
    public Object getValueAt(int fila, int columna) {
        Reporte reporte;
        Cliente cliente;
        Automovil automovil;
        try{
            reporte = listaReportes.obtenerDato(fila);
            automovil = controladorAutomoviles.obtenerAutomovil(reporte.getID_Vehiculo().toString());
            cliente = controladorClientes.obtenerCliente(automovil.getID_Cliente());
        }catch (Exception e){
            return null;
        }
        switch (columna) {
            case 0:
                return reporte.getID_Reporte();
            case 1:
                return cliente.getNombre() + " " + cliente.getApellido();
            case 2:
                return automovil.getPlaca();
            case 3:
                return reporte.getEstado();
            case 4:
                return reporte.getFecha();
            default:
                return null;
        }
    }
}
