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
import controlador.modelos.ControladorReporte;
import controlador.tda.lista.ListaEnlazada;
import controlador.tda.lista.exception.PosicionException;
import java.io.FileOutputStream;
import java.time.LocalDate;
import java.util.logging.Level;
import java.util.logging.Logger;
import vista.FrmReporte;

/**
 *
 * @author Usuario iTC
 */
public class ReportePDF {

    private ControladorReporte CR = new ControladorReporte();

    public ReportePDF(ControladorReporte controladorReporte) {
        this.CR = controladorReporte;
    }

    public void generarPDF() {
        Document documento = new Document();

        //Cliente c = new Cliente(1, "Maria", "Rivas", "1150498580", "Loja", "Gonzanama", "Calle loja entre 10 de Agosto y Sucre");
        //Vehiculo v = new Automovil(4, "Datsun", "1600-t", 2011, "LBC-123", "Camioneta", "Diesel", 1);
        try {
            String ruta = System.getProperty("user.home");
            PdfWriter.getInstance(documento, new FileOutputStream(ruta + "/Desktop/Reporte_Umbrales" + "Aqui ID" + ".pdf"));
            documento.open();

            Font font = new Font();
            font.setStyle(Font.BOLD);

            Paragraph parrafo = new Paragraph("Reporte " + "01");
            parrafo.setAlignment(1);
            documento.add(parrafo);

            documento.add(new Paragraph("\n\nFecha: " + LocalDate.now()));
            documento.add(new Paragraph("\n"));

            documento.add(new Paragraph("Datos Cliente", font));
            documento.add(new Paragraph("Nombres: " + CR.getC().getNombre() + " " + CR.getC().getApellido()));
            documento.add(new Paragraph("Identificación: " + CR.getC().getIdentificacion()));
            documento.add(new Paragraph("Ciudad: " + CR.getCd().getNombre()));
            documento.add(new Paragraph("Direccion: " + CR.getL().getDireccion()));
            documento.add(new Paragraph("Provincia: " + CR.getP().getNombre()));
            documento.add(new Paragraph("\n"));

            documento.add(new Paragraph("Datos Vehículo", font));
            documento.add(new Paragraph("Marca: " + CR.getM().getNombre()));
            documento.add(new Paragraph("Modelo: " + CR.getV().getModelo()));
            documento.add(new Paragraph("Año: " + CR.getA().getAnio()));
            documento.add(new Paragraph("Combustible: " + CR.getT_c().getID_TIPOCOMBUSTIBLE()));
            documento.add(new Paragraph("Placa: " + CR.getA().getPlaca()));
            documento.add(new Paragraph("Tipo de Vehiculo: " + CR.getT_v().getID_TIPOVEHICULO()));
            documento.add(new Paragraph("\n"));

            documento.add(new Paragraph("Observaciones", font));
            
            documento.add(new Paragraph("\n\nEstado: " + CR.getEstado()));

            StringBuffer resultados = new StringBuffer();
            for (int i = 0; i < CR.getResultados().getSize(); i++) {
                try {
                    resultados.append(CR.getResultados().obtenerDato(i)).append("\n");
                } catch (PosicionException ex) {
                    Logger.getLogger(FrmReporte.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            documento.add(new Paragraph(String.valueOf(resultados)));

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

    public static void main(String[] args) {
        //ReportePDF pdf = new ReportePDF(new Reporte(2, 2, 3, true, "El chasis esta un ligeramente aboyado"));
        //pdf.generarPDF();
        ListaEnlazada lista = new ListaEnlazada<>();
        lista.insertarCabecera("NO APRUEBA");
        lista.insertarCabecera("RINES DAÑADOS");
        lista.insertarCabecera("LLANTAS DESGASTADAS");
        lista.insertarCabecera("CAPO ABOLLADO");
        
        
        try {
            ControladorReporte reportController = new ControladorReporte(true, "GLS1960", lista);
            ReportePDF pdf = new ReportePDF(reportController);
            pdf.generarPDF();
        } catch (Exception ex) {
            Logger.getLogger(ReportePDF.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
}
