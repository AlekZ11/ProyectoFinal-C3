/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import controlador.dao.AutomovilDao;
import controlador.dao.CiudadDao;
import controlador.dao.ClienteDao;
import controlador.dao.UbicacionDao;
import controlador.dao.MarcaDao;
import controlador.dao.ProvinciaDao;
import controlador.dao.VehiculoDao;
import controlador.dao.pdf.ReportePDF;
import controlador.tda.lista.ListaEnlazada;
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
public class FrmReporte extends javax.swing.JFrame {

    private Reporte reporte;
    private final ClienteDao cliente = new ClienteDao();
    private final VehiculoDao vehiculo = new VehiculoDao();
    private final AutomovilDao automovil = new AutomovilDao();
    private final MarcaDao marca = new MarcaDao();
    private final UbicacionDao location = new UbicacionDao();
    private final CiudadDao ciudad = new CiudadDao();
    private final ProvinciaDao provincia = new ProvinciaDao();

    /**
     * Creates new form FrmReporte
     *
     * @param reporte
     */
    public FrmReporte(Reporte reporte) {
        initComponents();
        this.reporte = reporte;
        obtenerDatos();
        cargar();
    }

    private FrmReporte() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setText("Generar PDF");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Reporte");

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Datos Vehiculo"));
        jPanel2.setLayout(null);

        jLabel3.setText("Marca:");
        jPanel2.add(jLabel3);
        jLabel3.setBounds(20, 30, 60, 16);

        jLabel5.setText("Modelo:");
        jPanel2.add(jLabel5);
        jLabel5.setBounds(20, 60, 50, 16);

        jLabel6.setText("Placa:");
        jPanel2.add(jLabel6);
        jLabel6.setBounds(240, 60, 60, 16);

        jLabel7.setText("Año:");
        jPanel2.add(jLabel7);
        jLabel7.setBounds(20, 90, 30, 16);

        jLabel8.setText("Tipo Vehiculo:");
        jPanel2.add(jLabel8);
        jLabel8.setBounds(240, 90, 80, 16);

        jLabel20.setText("Combustible:");
        jPanel2.add(jLabel20);
        jLabel20.setBounds(240, 30, 70, 16);

        jLabel21.setText("jLabel21");
        jPanel2.add(jLabel21);
        jLabel21.setBounds(100, 30, 130, 16);

        jLabel22.setText("jLabel22");
        jPanel2.add(jLabel22);
        jLabel22.setBounds(100, 60, 130, 16);

        jLabel23.setText("jLabel23");
        jPanel2.add(jLabel23);
        jLabel23.setBounds(100, 90, 130, 16);

        jLabel24.setText("jLabel24");
        jPanel2.add(jLabel24);
        jLabel24.setBounds(330, 30, 130, 16);

        jLabel26.setText("jLabel26");
        jPanel2.add(jLabel26);
        jLabel26.setBounds(330, 60, 130, 16);

        jLabel27.setText("jLabel27");
        jPanel2.add(jLabel27);
        jLabel27.setBounds(330, 90, 130, 16);

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Datos Cliente"));
        jPanel3.setLayout(null);

        jLabel9.setText("Nombre :");
        jPanel3.add(jLabel9);
        jLabel9.setBounds(30, 30, 60, 16);

        jLabel10.setText("Apellido :");
        jPanel3.add(jLabel10);
        jLabel10.setBounds(250, 30, 60, 16);

        jLabel11.setText("Identificacion :");
        jPanel3.add(jLabel11);
        jLabel11.setBounds(30, 60, 80, 16);

        jLabel12.setText("Direccion:");
        jPanel3.add(jLabel12);
        jLabel12.setBounds(250, 60, 60, 16);

        jLabel13.setText("Ciudad :");
        jPanel3.add(jLabel13);
        jLabel13.setBounds(30, 90, 60, 16);

        jLabel14.setText("Provincia :");
        jPanel3.add(jLabel14);
        jLabel14.setBounds(250, 90, 60, 16);

        jLabel2.setText("jLabel2");
        jPanel3.add(jLabel2);
        jLabel2.setBounds(120, 30, 120, 16);

        jLabel15.setText("jLabel15");
        jPanel3.add(jLabel15);
        jLabel15.setBounds(120, 60, 120, 16);

        jLabel16.setText("jLabel16");
        jPanel3.add(jLabel16);
        jLabel16.setBounds(120, 90, 120, 16);

        jLabel17.setText("jLabel17");
        jPanel3.add(jLabel17);
        jLabel17.setBounds(320, 30, 120, 16);

        jLabel18.setText("jLabel18");
        jPanel3.add(jLabel18);
        jLabel18.setBounds(320, 60, 130, 16);

        jLabel19.setText("jLabel19");
        jPanel3.add(jLabel19);
        jLabel19.setBounds(320, 90, 130, 16);

        jLabel28.setText("Fecha:");

        jLabel29.setText("MM/DD/AAAA");

        jLabel30.setText("Reporte ID:");

        jLabel31.setText("0");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Observaciones"));

        jTextArea1.setEditable(false);
        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 983, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 227, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGap(35, 35, 35))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(483, 483, 483))))
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 498, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 498, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(32, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel28)
                    .addComponent(jLabel29)
                    .addComponent(jLabel30)
                    .addComponent(jLabel31))
                .addGap(55, 55, 55)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(35, 35, 35))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        ReportePDF pdf = new ReportePDF(reporte);
        pdf.generarPDF();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void cargar() {
        obtenerDatos();
        Cliente c = cliente.getCliente();
        Automovil a = automovil.getAutomovil();
        Vehiculo v = vehiculo.getVehiculo();
        Marca m = marca.getMarca();
        Ubicacion l = location.getLocation();
        Ciudad cd = ciudad.getCiudad();
        Provincia p = provincia.getProvincia();

        jLabel29.setText(reporte.getFecha().toString());
        jLabel31.setText(String.valueOf(reporte.getID_Reporte()));

        jLabel2.setText(c.getNombre());
        jLabel15.setText(c.getIdentificacion());
        jLabel16.setText(cd.getNombre());
        jLabel17.setText(c.getApellido());
        jLabel18.setText(l.getDireccion());
        jLabel19.setText(p.getNombre());

        jLabel21.setText(m.getName());
        jLabel22.setText(v.getModelo());
        //jLabel23.setText(String.valueOf(a.getAnio()));
        jLabel24.setText(v.getTipoCombustible());
        jLabel26.setText(a.getPlaca());
        jLabel27.setText(v.getTipoVehiculo());

        jTextArea1.setText(reporte.getObservacion());

    }

    private void obtenerDatos() {
        try {
            ListaEnlazada<Cliente> clientes = cliente.listar();
            ListaEnlazada<Automovil> automoviles = automovil.listar();
            ListaEnlazada<Vehiculo> vehiculos = vehiculo.listar();
            ListaEnlazada<Marca> marcas = marca.listar();
            ListaEnlazada<Ubicacion> locations = location.listar();
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
            location.setLocation(locations.obtenerDato(0));
            ciudad.setCiudad(ciudades.obtenerDato(0));
            provincia.setProvincia(provincias.obtenerDato(0));

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Datos no coinciden \n" + ex, "DataBaseError", JOptionPane.ERROR_MESSAGE);
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FrmReporte.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmReporte.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmReporte.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmReporte.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmReporte().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
}
