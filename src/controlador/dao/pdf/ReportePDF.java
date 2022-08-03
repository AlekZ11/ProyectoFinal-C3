/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador.dao.pdf;

import com.itextpdf.text.Document;
import com.itextpdf.text.Font;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import controlador.dao.ClienteDao;
import controlador.dao.VehiculoDao;
import controlador.tda.lista.ListaEnlazada;
import java.io.FileOutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import modelo.Cliente;
import modelo.Reporte;
import modelo.Vehiculo;

/**
 *
 * @author Usuario iTC
 */
public class ReportePDF {

    private Reporte reporte;
    private final  ClienteDao cliente = new ClienteDao();
    private final  VehiculoDao vehiculo = new VehiculoDao();

    public ReportePDF(Reporte reporte) {
        this.reporte = reporte;
    }
    
    
    public void setReporte(Reporte reporte) {
        this.reporte = reporte;
    }
    
    public void generarPDF() {
        Document documento = new Document();
        obtenerDatos();
        Cliente c = cliente.getCliente();
        Vehiculo v = vehiculo.getVehiculo();
        //Cliente c = new Cliente(1, "Maria", "Rivas", "1150498580", "Loja", "Gonzanama", "Calle loja entre 10 de Agosto y Sucre");
        //Vehiculo v = new Vehiculo(4, "Datsun", "1600-t", 2011, "LBC-123", "Camioneta", "Diesel", 1);
        
        try {
            String ruta = System.getProperty("user.home");
            PdfWriter.getInstance(documento, new FileOutputStream(ruta + "/Desktop/Reporte_Umbrales" + reporte.getId() + ".pdf"));
            documento.open();
            
            Font font = new Font();
            font.setStyle(Font.BOLD);
            
            Paragraph parrafo = new Paragraph("Reporte " + reporte.getId());
            parrafo.setAlignment(1);
            documento.add(parrafo);
            
            documento.add(new Paragraph("\n\nFecha: " + reporte.getFecha().toString()));
            documento.add(new Paragraph("\n"));
            
            documento.add(new Paragraph("Datos Cliente", font));
            documento.add(new Paragraph("Nombres: " + c.getNombre() + " " + c.getApellido()));
            documento.add(new Paragraph("Identificación: " + c.getIdentificacion()));
            documento.add(new Paragraph("Ciudad: " + c.getCiudad()));
            documento.add(new Paragraph("Direccion: " + c.getDireccion()));
            documento.add(new Paragraph("Provincia: " + c.getProvincia()));
            documento.add(new Paragraph("\n"));
            
            documento.add(new Paragraph("Datos Vehículo", font));
            documento.add(new Paragraph("Marca: " + v.getMarca()));
            documento.add(new Paragraph("Modelo: " + v.getModelo()));
            documento.add(new Paragraph("Año: " + v.getAnio()));
            documento.add(new Paragraph("Combustible: " + v.getTipoCombustible()));
            documento.add(new Paragraph("Placa: " + v.getPlaca()));
            documento.add(new Paragraph("Tipo de Vehiculo: " + v.getTipoVehiculo()));
            documento.add(new Paragraph("\n"));
            
            documento.add(new Paragraph("Observaciones", font));
            documento.add(new Paragraph(reporte.getObservacion()));
            
//            PdfPTable tabla = new PdfPTable(3);
//            tabla.addCell("Código");
//            tabla.addCell("Nombre del Alumno");
//            tabla.addCell("Grupo");
//            
//            tabla.addCell("BolitasQueso02");
//            tabla.addCell("Pepe el Mago");
//            tabla.addCell("04");
//            
//            documento.add(tabla);            
            documento.close();
            
        } catch (Exception e) {
        }
    }
    
    private void obtenerDatos() {
        try {
            ListaEnlazada<Cliente> clientes = cliente.listar();
            ListaEnlazada<Vehiculo> vehiculos = vehiculo.listar();
            clientes = clientes.buscar("id", reporte.getId_cliente());
            vehiculos = vehiculos.buscar("id", reporte.getId_vehiculo());
            cliente.setCliente(clientes.obtenerDato(0));
            vehiculo.setVehiculo(vehiculos.obtenerDato(0));
            
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Datos no coinciden \n" + ex, "DataBaseError", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public static void main(String[] args) {
        ReportePDF pdf = new ReportePDF(new Reporte(2, 2, 3, true, "El chasis esta un ligeramente aboyado"));
        pdf.generarPDF();
    }
}
