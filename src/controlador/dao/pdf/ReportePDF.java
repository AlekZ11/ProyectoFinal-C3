/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador.dao.pdf;

import com.itextpdf.text.Document;
import com.itextpdf.text.Font;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;
import controlador.dao.AutomovilDao;
import controlador.dao.CiudadDao;
import controlador.dao.ClienteDao;
import controlador.dao.UbicacionDao;
import controlador.dao.MarcaDao;
import controlador.dao.ProvinciaDao;
import controlador.dao.VehiculoDao;
import controlador.tda.lista.ListaEnlazada;
import java.io.FileOutputStream;
import javax.swing.JOptionPane;
import modelo.Vehiculo;
import modelo.Ciudad;
import modelo.Cliente;
import modelo.Ubicacion;
import modelo.Marca;
import modelo.Provincia;
import modelo.Reporte;
import modelo.Automovil;

/**
 *
 * @author Usuario iTC
 */
public class ReportePDF {

    private Reporte reporte;
    private final ClienteDao cliente = new ClienteDao();
    private final VehiculoDao vehiculo = new VehiculoDao();
    private final AutomovilDao automovil = new AutomovilDao();
    private final MarcaDao marca = new MarcaDao();
    private final UbicacionDao ubicacion = new UbicacionDao();
    private final CiudadDao ciudad = new CiudadDao();
    private final ProvinciaDao provincia = new ProvinciaDao();

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
        Automovil a = automovil.getAutomovil();
        Marca m = marca.getMarca();
        Ubicacion l = ubicacion.getUbicacion();
        Ciudad cd = ciudad.getCiudad();
        Provincia p = provincia.getProvincia();
        
        //Cliente c = new Cliente(1, "Maria", "Rivas", "1150498580", "Loja", "Gonzanama", "Calle loja entre 10 de Agosto y Sucre");
        //Vehiculo v = new Automovil(4, "Datsun", "1600-t", 2011, "LBC-123", "Camioneta", "Diesel", 1);
        
        try {
            String ruta = System.getProperty("user.home");
            PdfWriter.getInstance(documento, new FileOutputStream(ruta + "/Desktop/Reporte_Umbrales" + reporte.getID_Reporte() + ".pdf"));
            documento.open();
            
            Font font = new Font();
            font.setStyle(Font.BOLD);
            
            Paragraph parrafo = new Paragraph("Reporte " + reporte.getID_Reporte());
            parrafo.setAlignment(1);
            documento.add(parrafo);
            
            documento.add(new Paragraph("\n\nFecha: " + reporte.getFecha().toString()));
            documento.add(new Paragraph("\n"));
            
            documento.add(new Paragraph("Datos Cliente", font));
            documento.add(new Paragraph("Nombres: " + c.getNombre() + " " + c.getApellido()));
            documento.add(new Paragraph("Identificación: " + c.getIdentificacion()));
            documento.add(new Paragraph("Ciudad: " + cd.getNombre()));
            documento.add(new Paragraph("Direccion: " + l.getDireccion()));
            documento.add(new Paragraph("Provincia: " + p.getNombre()));
            documento.add(new Paragraph("\n"));
            
            documento.add(new Paragraph("Datos Vehículo", font));
            documento.add(new Paragraph("Marca: " + m.getMarca()));
            documento.add(new Paragraph("Modelo: " + v.getModelo()));
            documento.add(new Paragraph("Año: " + a.getAnio()));
            documento.add(new Paragraph("Combustible: " + v.getID_TipoCombustible()));
            documento.add(new Paragraph("Placa: " + a.getPlaca()));
            documento.add(new Paragraph("Tipo de Vehiculo: " + v.getID_TipoVehiculo()));
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
            ListaEnlazada<Automovil> automoviles = automovil.listar();
            ListaEnlazada<Marca> marcas = marca.listar();
            ListaEnlazada<Ubicacion> locations = ubicacion.listar();
            ListaEnlazada<Ciudad> ciudades = ciudad.listar();
            ListaEnlazada<Provincia> provincias = provincia.listar();
            
            vehiculos = vehiculos.buscar("id", reporte.getID_Vehiculo());
            clientes = clientes.buscar("id", automoviles.obtenerDato(0).getID_Cliente());
            automoviles = automoviles.buscar("id", automoviles.obtenerDato(0).getID_Vehiculo());
            marcas = marcas.buscar("id", vehiculos.obtenerDato(0).getID_Marca());
            locations = locations.buscar("id", clientes.obtenerDato(0).getID_Ubicacion());
            ciudades = ciudades.buscar("id", locations.obtenerDato(0).getID_Ciudad());
            provincias = provincias.buscar("id", ciudades.obtenerDato(0).getID_Provincia());
            
            cliente.setCliente(clientes.obtenerDato(0));
            vehiculo.setVehiculo(vehiculos.obtenerDato(0));
            automovil.setAutomovil(automoviles.obtenerDato(0));
            marca.setMarca(marcas.obtenerDato(0));
            ubicacion.setUbicacion(locations.obtenerDato(0));
            ciudad.setCiudad(ciudades.obtenerDato(0));
            provincia.setProvincia(provincias.obtenerDato(0));
            
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Datos no coinciden \n" + ex, "DataBaseError", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public static void main(String[] args) {
        //ReportePDF pdf = new ReportePDF(new Reporte(2, 2, 3, true, "El chasis esta un ligeramente aboyado"));
        //pdf.generarPDF();
    }
}
