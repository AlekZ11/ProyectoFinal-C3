package vista.tablas;

import controlador.tda.lista.ListaEnlazada;
import modelo.Umbral;

import javax.swing.table.AbstractTableModel;

public class TablaUmbrales extends AbstractTableModel {
    private ListaEnlazada<Umbral> listaUmbrales;

    public TablaUmbrales(ListaEnlazada<Umbral> listaUmbrales){
        this.listaUmbrales = listaUmbrales;
    }

    @Override
    public int getRowCount() {
        return listaUmbrales.getSize();
    }

    @Override
    public int getColumnCount() {
        return 5;
    }

    @Override
    public String getColumnName(int column) {
        switch (column){
            case 0:
                return "ID";
            case 1:
                return "Año Min";
            case 2:
                return "Año Max";
            case 3:
                return "Valor Min";
            case 4:
                return "Valor Max";
            default:
                return "";
        }
    }

    @Override
    public Object getValueAt(int fila, int columna) {
        Umbral umbral;
        try{
            umbral = listaUmbrales.obtenerDato(fila);
        }catch (Exception e){
            return null;
        }
        switch (columna) {
            case 0:
                return umbral.getId();
            case 1:
                return umbral.getAnioMin();
            case 2:
                return umbral.getAnioMax();
            case 3:
                return umbral.getValorMin();
            case 4:
                return umbral.getValorMax();
            default:
                return null;
        }
    }
}
