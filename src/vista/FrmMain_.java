/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vista;

import controlador.modelos.ControladorClientes;
import controlador.modelos.ControladorUmbral;
import controlador.modelos.ControladorAutomoviles;
import controlador.tda.lista.ListaEnlazada;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.HashMap;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import modelo.TipoCombustible;

/**
 *
 * @author LENOVO LEGION 5
 */
public class FrmMain_ extends javax.swing.JFrame {

    ListaEnlazada<String> resultados = new ListaEnlazada<>();
    ControladorClientes controladorClientes = new ControladorClientes();
    ControladorAutomoviles controladorVehiculos = new ControladorAutomoviles();
    ControladorUmbral controladorUmbral = new ControladorUmbral();

    /**
     * Creates new form FrmMain_
     */
    public FrmMain_() {
        initComponents();
        this.setSize(1155, 720);
        this.setResizable(false);
        this.setLocationRelativeTo(null);
    }

    public void cargarDatos() {
        ListaEnlazada<String> resultado = new ListaEnlazada<>();
        HashMap<Integer, Object> map = new HashMap<>();
        Boolean error = false;
        String linea;
        String[] lineaSeparada;
        while (!error) {
            String archivo = String.valueOf(JOptionPane.showInputDialog(null, "Ingrese la PLACA :"));
            error = true;
            try {
                archivo += ".txt";
                BufferedReader br = new BufferedReader(new FileReader("./Datos/" + archivo.toUpperCase()));
                //Darle al lbl el nombre del archivo que se abrio
                lblNombreArchivo.setText(archivo.toUpperCase());
                boolean saltar = false;
                boolean propietario = false;
                int i = 0;
                String[] atributosP = new String[6];
                boolean vehiculo = false;
                Object[] atributosV = new Object[12];
                int j = 0;
                while ((linea = br.readLine()) != null) {
                    if (linea.contains("Generales") || linea.contains("Documentos") || linea.contains("Datos de Prueba") || linea.contains("Conductor")) {
                        saltar = true;
                        propietario = false;
                        vehiculo = false;
                    } else if (linea.contains("Propietario")) {
                        propietario = true;
                        saltar = false;
                        vehiculo = false;
                    } else if (linea.contains("Datos Vehículo")) {
                        propietario = false;
                        saltar = false;
                        vehiculo = true;
                    } else if (linea.contains("Dato") || linea.contains("Resultado") || linea.contains("Prueba") || linea.contains("Inspección") || linea.contains("Neumaticos") || linea.contains("Parametros")) {
                        saltar = false;
                        propietario = false;
                        vehiculo = false;
                    }
                    if (linea.contains("=") && !linea.endsWith("=") && !saltar) {
                        lineaSeparada = linea.split("=");
                        if (lineaSeparada[1] != null || !lineaSeparada[1].equals("") || !lineaSeparada[1].isEmpty()) {
                            if (propietario) {
                                atributosP[i] = lineaSeparada[1];
                                i++;
                            } else if (vehiculo) {
                                atributosV[j] = lineaSeparada[1];
                                j++;
                            } else {
                                map.put(Integer.parseInt(lineaSeparada[0]), lineaSeparada[1]);
                            }
                        }
                    }
                }
                txtNombre.setText(atributosP[1]);
                txtApellido.setText(atributosP[0]);
                txtIdentificacion.setText(atributosP[2]);
                txtProvincia.setText(atributosP[5]);
                txtCiudad.setText(atributosP[4]);
                txtDireccion.setText(atributosP[3]);
                //controladorClientes.insertarCliente(atributosP[1], atributosP[0], atributosP[2], atributosP[5], atributosP[4], atributosP[3]);
                txtMarca.setText(atributosV[1].toString());
                txtModelo.setText(atributosV[2].toString());
                txtAnio.setText(atributosV[4].toString());
                txtPlaca.setText(atributosV[0].toString());
                txtTipo.setText(atributosV[9].toString());
                txtCombustible.setText(atributosV[8].toString());

                controladorVehiculos.insertarVehiculo(String.valueOf(atributosV[1]), String.valueOf(atributosV[2]), Integer.valueOf(String.valueOf(atributosV[4])), String.valueOf(atributosV[0]), String.valueOf(atributosV[9]), String.valueOf(atributosV[8]), controladorClientes.getSize());
                controladorClientes.imprimir(0);
                controladorVehiculos.imprimir(0);
                map.forEach((key, value) -> {
                    try {
                        if (String.valueOf(value).matches("^-?\\d+(?:,\\d+)?$")) {
                            Double valor;
                            if (String.valueOf(value).contains(",")) {
                                valor = Double.valueOf(String.valueOf(value).replace(",", "."));
                            } else {
                                valor = Double.valueOf(String.valueOf(value));
                            }
                            //resultados.insertar(controladorUmbral.comprobarUmbral(key, controladorVehiculos.getListaVehiculos().obtenerDato(controladorVehiculos.getSize() - 1).getAnio(), valor));
                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                });
                br.close();
            } catch (Exception e) {
                System.out.println("Error al leer el archivo");
                error = false;
            }
        }
        resultados = resultado;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtApellido = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtDireccion = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        btnCancelarP = new javax.swing.JButton();
        btnModificarP = new javax.swing.JButton();
        btnAceptarP = new javax.swing.JButton();
        txtProvincia = new javax.swing.JTextField();
        txtIdentificacion = new javax.swing.JTextField();
        txtCiudad = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jSpinner1 = new javax.swing.JSpinner();
        jSpinner2 = new javax.swing.JSpinner();
        jSpinner3 = new javax.swing.JSpinner();
        jSpinner4 = new javax.swing.JSpinner();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jSpinner5 = new javax.swing.JSpinner();
        jSpinner6 = new javax.swing.JSpinner();
        jSpinner7 = new javax.swing.JSpinner();
        jSpinner8 = new javax.swing.JSpinner();
        jLabel21 = new javax.swing.JLabel();
        jSpinner9 = new javax.swing.JSpinner();
        jSpinner10 = new javax.swing.JSpinner();
        jSpinner11 = new javax.swing.JSpinner();
        jSpinner12 = new javax.swing.JSpinner();
        jLabel22 = new javax.swing.JLabel();
        jSpinner13 = new javax.swing.JSpinner();
        jSpinner14 = new javax.swing.JSpinner();
        jSpinner15 = new javax.swing.JSpinner();
        jSpinner16 = new javax.swing.JSpinner();
        jLabel23 = new javax.swing.JLabel();
        jSpinner17 = new javax.swing.JSpinner();
        jSpinner18 = new javax.swing.JSpinner();
        jSpinner19 = new javax.swing.JSpinner();
        jSpinner20 = new javax.swing.JSpinner();
        jLabel24 = new javax.swing.JLabel();
        jSpinner21 = new javax.swing.JSpinner();
        jSpinner22 = new javax.swing.JSpinner();
        jSpinner23 = new javax.swing.JSpinner();
        jSpinner24 = new javax.swing.JSpinner();
        jSpinner25 = new javax.swing.JSpinner();
        jSpinner26 = new javax.swing.JSpinner();
        jSpinner27 = new javax.swing.JSpinner();
        jSpinner28 = new javax.swing.JSpinner();
        jLabel25 = new javax.swing.JLabel();
        jSpinner29 = new javax.swing.JSpinner();
        jSpinner30 = new javax.swing.JSpinner();
        jSpinner31 = new javax.swing.JSpinner();
        jSpinner32 = new javax.swing.JSpinner();
        jLabel26 = new javax.swing.JLabel();
        jSpinner33 = new javax.swing.JSpinner();
        jLabel27 = new javax.swing.JLabel();
        jSpinner34 = new javax.swing.JSpinner();
        jSpinner35 = new javax.swing.JSpinner();
        jSpinner36 = new javax.swing.JSpinner();
        jLabel28 = new javax.swing.JLabel();
        jSpinner37 = new javax.swing.JSpinner();
        jSpinner38 = new javax.swing.JSpinner();
        jSpinner39 = new javax.swing.JSpinner();
        jSpinner40 = new javax.swing.JSpinner();
        jLabel29 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        btnModificarV = new javax.swing.JButton();
        btnAceptarV = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        btnCancelarV = new javax.swing.JButton();
        txtAnio = new javax.swing.JTextField();
        txtMarca = new javax.swing.JTextField();
        txtTipo = new javax.swing.JTextField();
        txtCombustible = new javax.swing.JTextField();
        txtModelo = new javax.swing.JTextField();
        txtPlaca = new javax.swing.JTextField();
        btnCargarDatos = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        lblNombreArchivo = new javax.swing.JLabel();
        btnInforme = new javax.swing.JButton();
        btnVerificar = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.setLayout(null);

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Datos Propietario"));
        jPanel2.setLayout(null);

        jLabel3.setText("Nombre :");
        jPanel2.add(jLabel3);
        jLabel3.setBounds(50, 40, 60, 16);

        txtNombre.setEditable(false);
        jPanel2.add(txtNombre);
        txtNombre.setBounds(120, 40, 130, 22);

        jLabel4.setText("Apellido :");
        jPanel2.add(jLabel4);
        jLabel4.setBounds(280, 40, 60, 16);

        txtApellido.setEditable(false);
        jPanel2.add(txtApellido);
        txtApellido.setBounds(350, 40, 130, 22);

        jLabel5.setText("Identificacion :");
        jPanel2.add(jLabel5);
        jLabel5.setBounds(30, 90, 80, 16);

        txtDireccion.setEditable(false);
        jPanel2.add(txtDireccion);
        txtDireccion.setBounds(350, 90, 130, 22);

        jLabel6.setText("Direccion:");
        jPanel2.add(jLabel6);
        jLabel6.setBounds(280, 90, 60, 16);

        jLabel7.setText("Ciudad :");
        jPanel2.add(jLabel7);
        jLabel7.setBounds(50, 140, 60, 16);

        jLabel8.setText("Provincia :");
        jPanel2.add(jLabel8);
        jLabel8.setBounds(280, 140, 60, 16);

        btnCancelarP.setText("CANCELAR");
        btnCancelarP.setEnabled(false);
        jPanel2.add(btnCancelarP);
        btnCancelarP.setBounds(360, 200, 130, 30);

        btnModificarP.setText("MODIFICAR");
        jPanel2.add(btnModificarP);
        btnModificarP.setBounds(40, 200, 130, 30);

        btnAceptarP.setText("ACEPTAR");
        btnAceptarP.setEnabled(false);
        jPanel2.add(btnAceptarP);
        btnAceptarP.setBounds(200, 200, 130, 30);

        txtProvincia.setEditable(false);
        jPanel2.add(txtProvincia);
        txtProvincia.setBounds(350, 140, 130, 22);

        txtIdentificacion.setEditable(false);
        jPanel2.add(txtIdentificacion);
        txtIdentificacion.setBounds(120, 90, 130, 22);

        txtCiudad.setEditable(false);
        jPanel2.add(txtCiudad);
        txtCiudad.setBounds(120, 140, 130, 22);

        jPanel1.add(jPanel2);
        jPanel2.setBounds(10, 60, 540, 270);

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Resultados Obtenidos"));
        jPanel3.setLayout(null);

        jLabel15.setText("Tipo 3");
        jPanel3.add(jLabel15);
        jLabel15.setBounds(460, 30, 50, 16);

        jLabel16.setText("OK");
        jPanel3.add(jLabel16);
        jLabel16.setBounds(170, 30, 50, 16);

        jLabel17.setText("Tipo 1");
        jPanel3.add(jLabel17);
        jLabel17.setBounds(260, 30, 50, 16);

        jLabel18.setText("Tipo 2");
        jPanel3.add(jLabel18);
        jLabel18.setBounds(360, 30, 50, 16);
        jPanel3.add(jSpinner1);
        jSpinner1.setBounds(450, 70, 64, 22);
        jPanel3.add(jSpinner2);
        jSpinner2.setBounds(150, 70, 64, 22);
        jPanel3.add(jSpinner3);
        jSpinner3.setBounds(250, 70, 64, 22);
        jPanel3.add(jSpinner4);
        jSpinner4.setBounds(350, 70, 64, 22);

        jLabel19.setText("Holguras :");
        jPanel3.add(jLabel19);
        jLabel19.setBounds(40, 70, 90, 20);

        jLabel20.setText("Luxometro :");
        jPanel3.add(jLabel20);
        jLabel20.setBounds(40, 120, 90, 20);
        jPanel3.add(jSpinner5);
        jSpinner5.setBounds(150, 120, 64, 22);
        jPanel3.add(jSpinner6);
        jSpinner6.setBounds(250, 120, 64, 22);
        jPanel3.add(jSpinner7);
        jSpinner7.setBounds(350, 120, 64, 22);
        jPanel3.add(jSpinner8);
        jSpinner8.setBounds(450, 120, 64, 22);

        jLabel21.setText("Sonometro :");
        jPanel3.add(jLabel21);
        jLabel21.setBounds(40, 170, 90, 20);
        jPanel3.add(jSpinner9);
        jSpinner9.setBounds(150, 170, 64, 22);
        jPanel3.add(jSpinner10);
        jSpinner10.setBounds(250, 170, 64, 22);
        jPanel3.add(jSpinner11);
        jSpinner11.setBounds(350, 170, 64, 22);
        jPanel3.add(jSpinner12);
        jSpinner12.setBounds(450, 170, 64, 22);

        jLabel22.setText("Gases :");
        jPanel3.add(jLabel22);
        jLabel22.setBounds(40, 220, 90, 20);
        jPanel3.add(jSpinner13);
        jSpinner13.setBounds(150, 220, 64, 22);
        jPanel3.add(jSpinner14);
        jSpinner14.setBounds(250, 220, 64, 22);
        jPanel3.add(jSpinner15);
        jSpinner15.setBounds(350, 220, 64, 22);
        jPanel3.add(jSpinner16);
        jSpinner16.setBounds(450, 220, 64, 22);

        jLabel23.setText("Opacimetro :");
        jPanel3.add(jLabel23);
        jLabel23.setBounds(40, 270, 90, 20);
        jPanel3.add(jSpinner17);
        jSpinner17.setBounds(150, 270, 64, 22);
        jPanel3.add(jSpinner18);
        jSpinner18.setBounds(250, 270, 64, 22);
        jPanel3.add(jSpinner19);
        jSpinner19.setBounds(350, 270, 64, 22);
        jPanel3.add(jSpinner20);
        jSpinner20.setBounds(450, 270, 64, 22);

        jLabel24.setText("Alineador :");
        jPanel3.add(jLabel24);
        jLabel24.setBounds(40, 320, 90, 20);
        jPanel3.add(jSpinner21);
        jSpinner21.setBounds(150, 320, 64, 22);
        jPanel3.add(jSpinner22);
        jSpinner22.setBounds(250, 320, 64, 22);
        jPanel3.add(jSpinner23);
        jSpinner23.setBounds(350, 320, 64, 22);
        jPanel3.add(jSpinner24);
        jSpinner24.setBounds(450, 320, 64, 22);
        jPanel3.add(jSpinner25);
        jSpinner25.setBounds(450, 370, 64, 22);
        jPanel3.add(jSpinner26);
        jSpinner26.setBounds(350, 370, 64, 22);
        jPanel3.add(jSpinner27);
        jSpinner27.setBounds(150, 370, 64, 22);
        jPanel3.add(jSpinner28);
        jSpinner28.setBounds(250, 370, 64, 22);

        jLabel25.setText("Suspension :");
        jPanel3.add(jLabel25);
        jLabel25.setBounds(40, 370, 90, 20);
        jPanel3.add(jSpinner29);
        jSpinner29.setBounds(150, 420, 64, 22);
        jPanel3.add(jSpinner30);
        jSpinner30.setBounds(450, 420, 64, 22);
        jPanel3.add(jSpinner31);
        jSpinner31.setBounds(350, 420, 64, 22);
        jPanel3.add(jSpinner32);
        jSpinner32.setBounds(250, 420, 64, 22);

        jLabel26.setText("Frenos :");
        jPanel3.add(jLabel26);
        jLabel26.setBounds(40, 420, 90, 20);
        jPanel3.add(jSpinner33);
        jSpinner33.setBounds(250, 470, 64, 22);

        jLabel27.setText("Rodadura :");
        jPanel3.add(jLabel27);
        jLabel27.setBounds(40, 470, 90, 20);
        jPanel3.add(jSpinner34);
        jSpinner34.setBounds(150, 470, 64, 22);
        jPanel3.add(jSpinner35);
        jSpinner35.setBounds(450, 470, 64, 22);
        jPanel3.add(jSpinner36);
        jSpinner36.setBounds(350, 470, 64, 22);

        jLabel28.setText("Neumaticos");
        jPanel3.add(jLabel28);
        jLabel28.setBounds(40, 520, 90, 20);
        jPanel3.add(jSpinner37);
        jSpinner37.setBounds(150, 520, 64, 22);
        jPanel3.add(jSpinner38);
        jSpinner38.setBounds(450, 520, 64, 22);
        jPanel3.add(jSpinner39);
        jSpinner39.setBounds(350, 520, 64, 22);
        jPanel3.add(jSpinner40);
        jSpinner40.setBounds(250, 520, 64, 22);

        jLabel29.setText("Pruebas");
        jPanel3.add(jLabel29);
        jLabel29.setBounds(50, 30, 42, 16);

        jPanel1.add(jPanel3);
        jPanel3.setBounds(560, 60, 550, 570);

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Datos Vehiculo"));
        jPanel4.setLayout(null);

        jLabel14.setText("Combusitble :");
        jPanel4.add(jLabel14);
        jLabel14.setBounds(30, 150, 80, 16);

        jLabel12.setText("Modelo :");
        jPanel4.add(jLabel12);
        jLabel12.setBounds(280, 50, 60, 16);

        jLabel9.setText("Marca :");
        jPanel4.add(jLabel9);
        jLabel9.setBounds(50, 50, 60, 16);

        btnModificarV.setText("MODIFICAR");
        jPanel4.add(btnModificarV);
        btnModificarV.setBounds(40, 210, 130, 30);

        btnAceptarV.setText("ACEPTAR");
        btnAceptarV.setEnabled(false);
        jPanel4.add(btnAceptarV);
        btnAceptarV.setBounds(200, 210, 130, 30);

        jLabel10.setText("Placa :");
        jPanel4.add(jLabel10);
        jLabel10.setBounds(50, 100, 50, 16);

        jLabel13.setText("Año :");
        jPanel4.add(jLabel13);
        jLabel13.setBounds(280, 100, 60, 16);

        jLabel11.setText("Tipo :");
        jPanel4.add(jLabel11);
        jLabel11.setBounds(280, 150, 60, 16);

        btnCancelarV.setText("CANCELAR");
        btnCancelarV.setEnabled(false);
        jPanel4.add(btnCancelarV);
        btnCancelarV.setBounds(360, 210, 130, 30);

        txtAnio.setEditable(false);
        jPanel4.add(txtAnio);
        txtAnio.setBounds(350, 100, 130, 22);

        txtMarca.setEditable(false);
        jPanel4.add(txtMarca);
        txtMarca.setBounds(120, 50, 130, 22);

        txtTipo.setEditable(false);
        jPanel4.add(txtTipo);
        txtTipo.setBounds(350, 150, 130, 22);

        txtCombustible.setEditable(false);
        jPanel4.add(txtCombustible);
        txtCombustible.setBounds(120, 150, 130, 22);

        txtModelo.setEditable(false);
        jPanel4.add(txtModelo);
        txtModelo.setBounds(350, 50, 130, 22);

        txtPlaca.setEditable(false);
        jPanel4.add(txtPlaca);
        txtPlaca.setBounds(120, 100, 130, 22);

        jPanel1.add(jPanel4);
        jPanel4.setBounds(10, 350, 540, 280);

        btnCargarDatos.setText("Cargar Datos de un Archivo");
        btnCargarDatos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCargarDatosActionPerformed(evt);
            }
        });
        jPanel1.add(btnCargarDatos);
        btnCargarDatos.setBounds(20, 20, 220, 30);

        jLabel1.setText("Archivo Seleccionado :");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(260, 30, 120, 16);

        lblNombreArchivo.setText("Ejemplo.txt");
        jPanel1.add(lblNombreArchivo);
        lblNombreArchivo.setBounds(400, 30, 90, 16);

        btnInforme.setText("Generar Informe");
        jPanel1.add(btnInforme);
        btnInforme.setBounds(850, 20, 220, 30);

        btnVerificar.setText("Verificar Valores Obtenidos");
        jPanel1.add(btnVerificar);
        btnVerificar.setBounds(600, 20, 220, 30);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(10, 10, 1120, 640);

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        setBounds(0, 0, 1154, 689);
    }// </editor-fold>//GEN-END:initComponents

    private void btnCargarDatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCargarDatosActionPerformed
        cargarDatos();        // TODO add your handling code here:
    }//GEN-LAST:event_btnCargarDatosActionPerformed

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
            java.util.logging.Logger.getLogger(FrmMain_.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmMain_.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmMain_.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmMain_.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmMain_().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAceptarP;
    private javax.swing.JButton btnAceptarV;
    private javax.swing.JButton btnCancelarP;
    private javax.swing.JButton btnCancelarV;
    private javax.swing.JButton btnCargarDatos;
    private javax.swing.JButton btnInforme;
    private javax.swing.JButton btnModificarP;
    private javax.swing.JButton btnModificarV;
    private javax.swing.JButton btnVerificar;
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
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JSpinner jSpinner10;
    private javax.swing.JSpinner jSpinner11;
    private javax.swing.JSpinner jSpinner12;
    private javax.swing.JSpinner jSpinner13;
    private javax.swing.JSpinner jSpinner14;
    private javax.swing.JSpinner jSpinner15;
    private javax.swing.JSpinner jSpinner16;
    private javax.swing.JSpinner jSpinner17;
    private javax.swing.JSpinner jSpinner18;
    private javax.swing.JSpinner jSpinner19;
    private javax.swing.JSpinner jSpinner2;
    private javax.swing.JSpinner jSpinner20;
    private javax.swing.JSpinner jSpinner21;
    private javax.swing.JSpinner jSpinner22;
    private javax.swing.JSpinner jSpinner23;
    private javax.swing.JSpinner jSpinner24;
    private javax.swing.JSpinner jSpinner25;
    private javax.swing.JSpinner jSpinner26;
    private javax.swing.JSpinner jSpinner27;
    private javax.swing.JSpinner jSpinner28;
    private javax.swing.JSpinner jSpinner29;
    private javax.swing.JSpinner jSpinner3;
    private javax.swing.JSpinner jSpinner30;
    private javax.swing.JSpinner jSpinner31;
    private javax.swing.JSpinner jSpinner32;
    private javax.swing.JSpinner jSpinner33;
    private javax.swing.JSpinner jSpinner34;
    private javax.swing.JSpinner jSpinner35;
    private javax.swing.JSpinner jSpinner36;
    private javax.swing.JSpinner jSpinner37;
    private javax.swing.JSpinner jSpinner38;
    private javax.swing.JSpinner jSpinner39;
    private javax.swing.JSpinner jSpinner4;
    private javax.swing.JSpinner jSpinner40;
    private javax.swing.JSpinner jSpinner5;
    private javax.swing.JSpinner jSpinner6;
    private javax.swing.JSpinner jSpinner7;
    private javax.swing.JSpinner jSpinner8;
    private javax.swing.JSpinner jSpinner9;
    private javax.swing.JLabel lblNombreArchivo;
    private javax.swing.JTextField txtAnio;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtCiudad;
    private javax.swing.JTextField txtCombustible;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtIdentificacion;
    private javax.swing.JTextField txtMarca;
    private javax.swing.JTextField txtModelo;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtPlaca;
    private javax.swing.JTextField txtProvincia;
    private javax.swing.JTextField txtTipo;
    // End of variables declaration//GEN-END:variables
}
