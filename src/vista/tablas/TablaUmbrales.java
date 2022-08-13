package vista.tablas;

import controlador.tda.lista.ListaEnlazada;
import modelo.Umbral;

import javax.swing.table.AbstractTableModel;
import modelo.RangoAnio;

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
        RangoAnio rangoAnio = new RangoAnio(1000, 0, 9999);
        try{
            umbral = listaUmbrales.obtenerDato(fila);
            //rangoAnio = ControladorAnio.obtenerRango(umbral.getID_RangoAnio());
        }catch (Exception e){
            return null;
        }
        switch (columna) {
            case 0:
                return umbral.getID_Umbral();
            case 1:
                return rangoAnio.getAnioMin();
            case 2:
                return rangoAnio.getAnioMax();
            case 3:
                return umbral.getValorMin();
            case 4:
                return umbral.getValorMax();
            default:
                return null;
        }
    }
}
