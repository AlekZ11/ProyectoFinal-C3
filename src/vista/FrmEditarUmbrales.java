/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vista;

import controlador.dao.RangoAnioDao;
import controlador.dao.UmbralDao;
import controlador.tda.lista.ListaEnlazada;
import modelo.Umbral;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import modelo.RangoAnio;
<<<<<<< HEAD
import vista.tablas.TablaUmbrales;
=======
>>>>>>> d5734bf (Sentencias)

/**
 *
 * @author patob
 */
public class FrmEditarUmbrales extends javax.swing.JFrame {

    ListaEnlazada<Umbral> aux = new ListaEnlazada();
    ListaEnlazada<Umbral> modificaciones = new ListaEnlazada();
    ListaEnlazada<String> cambios = new ListaEnlazada();
    ListaEnlazada<RangoAnio> listaAnios = new ListaEnlazada();
    Umbral auxUmbral = new Umbral();
<<<<<<< HEAD
    int valor = 0;
=======
>>>>>>> d5734bf (Sentencias)
    public static boolean abrio = false;

    /**
     * Creates new form FrmEditarUmbrales
     */
    public FrmEditarUmbrales() {
        initComponents();
        this.setLocationRelativeTo(null);
        cargarLista();
        btnModificar.setEnabled(false);
        cargarcbx();
<<<<<<< HEAD
        cargarTabla();
=======
>>>>>>> d5734bf (Sentencias)
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        txtfUmbralMaximo = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtfUmbralMinimo = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtfClave = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtfDescripcion = new javax.swing.JTextField();
        btnCancelar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        cbxCalificación = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        cbxCategoria = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        cbxAnio = new javax.swing.JComboBox<>();
        btnGestionar = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        btnAniadir = new javax.swing.JButton();
        btnCancelarM = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        modelo = new DefaultListModel();
        listaUmbrales = new javax.swing.JList<>();
        txtfBuscar = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaC = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Editar Umbrales");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(390, 10, 150, 24);

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.setLayout(null);

        txtfUmbralMaximo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtfUmbralMaximoKeyTyped(evt);
            }
        });
        jPanel1.add(txtfUmbralMaximo);
        txtfUmbralMaximo.setBounds(350, 170, 103, 32);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel2.setText("<   X  <");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(250, 170, 93, 32);

        txtfUmbralMinimo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtfUmbralMinimoKeyTyped(evt);
            }
        });
        jPanel1.add(txtfUmbralMinimo);
        txtfUmbralMinimo.setBounds(130, 170, 105, 32);

        jLabel3.setText("Umbrales");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(258, 2, 61, 16);

        jLabel9.setText("Clave valor:");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(8, 37, 73, 30);

        txtfClave.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtfClaveKeyTyped(evt);
            }
        });
        jPanel1.add(txtfClave);
        txtfClave.setBounds(90, 36, 134, 32);

        jLabel10.setText("Descripción:");
        jPanel1.add(jLabel10);
        jLabel10.setBounds(242, 36, 75, 32);
        jPanel1.add(txtfDescripcion);
        txtfDescripcion.setBounds(323, 36, 239, 32);

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });
        jPanel1.add(btnCancelar);
        btnCancelar.setBounds(20, 220, 105, 32);

        jLabel4.setText("Calificación:");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(8, 80, 74, 24);

        jPanel1.add(cbxCalificación);
        cbxCalificación.setBounds(88, 80, 136, 30);

        jLabel5.setText("Categoría:");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(250, 90, 60, 16);

        cbxCategoria.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Todos", "Todos excepto motos", "Motos" }));
        jPanel1.add(cbxCategoria);
        cbxCategoria.setBounds(320, 80, 240, 30);

        jLabel7.setText("Año");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(30, 130, 30, 16);

        jPanel1.add(cbxAnio);
        cbxAnio.setBounds(90, 120, 290, 30);

        btnGestionar.setText("Gestionar años");
        btnGestionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGestionarActionPerformed(evt);
            }
        });
        jPanel1.add(btnGestionar);
        btnGestionar.setBounds(410, 120, 150, 30);

        btnModificar.setText("Modificar");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });
        jPanel1.add(btnModificar);
        btnModificar.setBounds(340, 220, 105, 32);

        btnAniadir.setText("Añadir");
        btnAniadir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAniadirActionPerformed(evt);
            }
        });
        jPanel1.add(btnAniadir);
        btnAniadir.setBounds(460, 220, 105, 32);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(330, 50, 570, 260);

        btnCancelarM.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnCancelarM.setText("Cancelar");
        btnCancelarM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarMActionPerformed(evt);
            }
        });
        getContentPane().add(btnCancelarM);
        btnCancelarM.setBounds(640, 570, 114, 36);

        btnGuardar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });
        getContentPane().add(btnGuardar);
        btnGuardar.setBounds(770, 570, 115, 36);

        btnSalir.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        getContentPane().add(btnSalir);
        btnSalir.setBounds(10, 570, 88, 36);

        jLabel6.setText("Buscar");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(20, 50, 40, 30);

        listaUmbrales.setModel(modelo);
        listaUmbrales.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        listaUmbrales.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                listaUmbralesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(listaUmbrales);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(10, 90, 310, 220);

        txtfBuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtfBuscarKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtfBuscarKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtfBuscarKeyTyped(evt);
            }
        });
        getContentPane().add(txtfBuscar);
        txtfBuscar.setBounds(60, 50, 260, 30);

        tablaC.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1"
            }
        ));
        jScrollPane2.setViewportView(tablaC);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(10, 320, 880, 240);

        setBounds(0, 0, 925, 659);
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnSalirActionPerformed

    private void txtfUmbralMinimoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtfUmbralMinimoKeyTyped
        char car = evt.getKeyChar();
        if ((car < '0' || car > '9') && (car < ',' || car > '.'))
            evt.consume();
    }//GEN-LAST:event_txtfUmbralMinimoKeyTyped

    private void txtfUmbralMaximoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtfUmbralMaximoKeyTyped
        char car = evt.getKeyChar();
        if ((car < '0' || car > '9') && (car < ',' || car > '.'))
            evt.consume();
    }//GEN-LAST:event_txtfUmbralMaximoKeyTyped

    private void txtfClaveKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtfClaveKeyTyped
        char car = evt.getKeyChar();
        if ((car < '0' || car > '9'))
            evt.consume();
    }//GEN-LAST:event_txtfClaveKeyTyped

    private void txtfBuscarKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtfBuscarKeyTyped

    }//GEN-LAST:event_txtfBuscarKeyTyped

    private void txtfBuscarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtfBuscarKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtfBuscarKeyPressed

    private void txtfBuscarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtfBuscarKeyReleased
        cargarLista();
    }//GEN-LAST:event_txtfBuscarKeyReleased

    private void listaUmbralesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listaUmbralesMouseClicked
        if (evt.getClickCount() == 2) {
            btnAniadir.setEnabled(false);
            btnModificar.setEnabled(true);
            cargarDatos();
        }
    }//GEN-LAST:event_listaUmbralesMouseClicked

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        limpiarVista();
    }//GEN-LAST:event_btnCancelarActionPerformed


    private void btnGestionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGestionarActionPerformed
        if (abrio == false) {
            FrmGestionarAnios vga = new FrmGestionarAnios();
            vga.setVisible(true);
            abrio = true;
        }

    }//GEN-LAST:event_btnGestionarActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
<<<<<<< HEAD
        if (comprobarValores()) {
            modificaciones.insertar(new Umbral(auxUmbral.getID_Umbral(), txtfDescripcion.getText(), cbxCategoria.getSelectedItem().toString(), ConseguirAnio(), ConseguirTipo() + "", Double.valueOf(txtfUmbralMinimo.getText()), Double.valueOf(txtfUmbralMaximo.getText()), Integer.valueOf(txtfClave.getText())));
            cambios.insertar("Editar");
        } else {
            JOptionPane.showMessageDialog(null, "Los valores de los humbrales ingresados son incorrectos");
        }
        cargarTabla();
        limpiarVista();
    }//GEN-LAST:event_btnModificarActionPerformed

    private void btnAniadirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAniadirActionPerformed
        if (comprobarValores()) {
            modificaciones.insertar(new Umbral(0, txtfDescripcion.getText(), cbxCategoria.getSelectedItem().toString(), ConseguirAnio(), ConseguirTipo() + "", Double.valueOf(txtfUmbralMinimo.getText()), Double.valueOf(txtfUmbralMaximo.getText()), Integer.valueOf(txtfClave.getText())));
            cambios.insertar("Añadir");
        } else {
            JOptionPane.showMessageDialog(null, "Los valores de los humbrales ingresados son incorrectos");
        }
        cargarTabla();
        limpiarVista();
    }//GEN-LAST:event_btnAniadirActionPerformed
    
    private void limpiarListas(){
        cambios = new ListaEnlazada();
        modificaciones = new ListaEnlazada();
    }
    
    private void btnCancelarMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarMActionPerformed
        limpiarListas();
        cargarTabla();
    }//GEN-LAST:event_btnCancelarMActionPerformed

    private boolean Rangos(double a1, double a2, double b1, double b2) {
        if (a1 >= b1 && a1 <= b2 || a2 >= b1 && a2 <= b2) {
            return true;
        }
        return false;
    }

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        boolean correcto = true;
        limpiarVista();
        cargarLista();
        try {
            for (int i = 0; i < cambios.getSize(); i++) {

                Umbral uma = modificaciones.obtenerDato(i);
                for (int j = 0; j < aux.getSize(); j++) {
                    if (uma.getDescripcion().equals(aux.obtenerDato(j).getDescripcion()) && !uma.getID_Umbral().equals(aux.obtenerDato(j).getID_Umbral())) {
                        double a1 = uma.getValorMin();
                        double a2 = uma.getValorMax();
                        double b1 = aux.obtenerDato(j).getValorMin();
                        double b2 = aux.obtenerDato(j).getValorMax();
                        if (Rangos(a1, a2, b1, b2)) {
                            correcto = false;
                            break;
                        }
                    }
                }
                
                for (int j = 0; j < modificaciones.getSize(); j++) {
                    Umbral comprueb = modificaciones.obtenerDato(j);
                    if (uma.getDescripcion().equals(modificaciones.obtenerDato(j).getDescripcion()) && !comprueb.getID_Umbral().equals(aux.obtenerDato(j).getID_Umbral())) {
                        double a1 = comprueb.getValorMin();
                        double a2 = comprueb.getValorMax();
                        double b1 = aux.obtenerDato(j).getValorMin();
                        double b2 = aux.obtenerDato(j).getValorMax();
                        if (Rangos(a1, a2, b1, b2)) {
                            correcto = false;
                            break;
                        }
                    }
                }
                
                if (!correcto) {
                    break;
                }
            }
        } catch (Exception e) {
        }
        if (correcto) {
            ejecutarSentencias();
            cargarLista();
            limpiarListas();
            cargarTabla();
        }else{
            JOptionPane.showMessageDialog(null, "Los umbrales creado o editados tienen interferencias en los rangos");
        }
    }//GEN-LAST:event_btnGuardarActionPerformed

    public int ConseguirAnio() {
        try {
            return listaAnios.obtenerDato(cbxAnio.getSelectedIndex()).getID_RangoAnio();
        } catch (Exception e) {
            return -1;
        }
    }

    public int ConseguirTipo() {
        return Integer.valueOf(cbxCalificación.getSelectedItem().toString().substring(5));
    }

    public void cargarTabla() {
        TablaUmbrales tu = new TablaUmbrales(modificaciones, cambios);
        tablaC.setModel(tu);
        tablaC.updateUI();
    }

    public void cargarcbx() {
        RangoAnioDao radao = new RangoAnioDao();

        try {
            listaAnios = radao.consultarAnios();
            cbxAnio.removeAllItems();
            for (int i = 0; i < listaAnios.getSize(); i++) {
                cbxAnio.addItem(listaAnios.obtenerDato(i).getAnioMin() + " - " + listaAnios.obtenerDato(i).getAnioMax());
            }
            for (int i = 0; i <= 4; i++) {
                cbxCalificación.addItem("Tipo " + i);
            }

        } catch (Exception e) {
        }
    }

=======
        UmbralDao udao = new UmbralDao();
        try {
            if (comprobarValores()) {
                ListaEnlazada<Umbral> comprobador = new ListaEnlazada();
                int valor = 0;
                comprobador = udao.consultarUmbrales(null);

                String sentencia = "Update umbral set id_rangoanio = " + ConseguirAnio() + ", tipo = '" + ConseguirTipo() + "', valormin = " + txtfUmbralMinimo.getText() + ", valormax=" + txtfUmbralMaximo.getText() + ", clave_umbral=" + txtfClave.getText()
                        + ", Updated_at = sysdate, descripcion = '" + txtfDescripcion.getText() + "', categoria='" + cbxCategoria.getSelectedItem().toString() + "' where id_umbral = " + auxUmbral.getID_Umbral();
                udao.ejecutarSentencias(sentencia);
            } else {
                JOptionPane.showMessageDialog(null, "Los valores de los humbrales ingresados son incorrectos");
            }
        } catch (Exception e) {
        }
    }//GEN-LAST:event_btnModificarActionPerformed

    private void btnAniadirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAniadirActionPerformed
        UmbralDao udao = new UmbralDao();
        try {
            if (comprobarValores()) {
                ListaEnlazada<Umbral> comprobador = new ListaEnlazada();
                int valor = 0;
                comprobador = udao.consultarUmbrales(null);
                for (int i = 0; i < comprobador.getSize(); i++) {
                    if (comprobador.obtenerDato(i).getID_Umbral() > valor) {
                        valor = comprobador.obtenerDato(i).getID_Umbral();
                    }
                }
                String sentencia = "Insert into umbral (Id_umbral, Id_rangoanio, Tipo, Valormin, valormax, clave_umbral, created_at, updated_at, descripcion, categoria)values("
                        + valor + 1 + ", " + ConseguirAnio() + ", '" + ConseguirTipo() + "', " + txtfUmbralMinimo.getText() + ", " + txtfUmbralMaximo.getText() + ", " + txtfClave.getText() + ", SYSDATE, SYSDATE, '" + txtfDescripcion + "', '" + cbxCategoria.getSelectedItem().toString() + "'";
                udao.ejecutarSentencias(sentencia);
            } else {
                JOptionPane.showMessageDialog(null, "Los valores de los humbrales ingresados son incorrectos");
            }
        } catch (Exception e) {
        }
    }//GEN-LAST:event_btnAniadirActionPerformed

    public int ConseguirAnio() {
        try {
            return listaAnios.obtenerDato(cbxAnio.getSelectedIndex()).getID_RangoAnio();
        } catch (Exception e) {
            return -1;
        }
    }

    public int ConseguirTipo() {
        return Integer.valueOf(cbxCalificación.getSelectedItem().toString().trim().substring(4));
    }

    public void cargarcbx() {
        RangoAnioDao radao = new RangoAnioDao();
        
        try {
            listaAnios = radao.consultarAnios();
            cbxAnio.removeAllItems();
            for (int i = 0; i < listaAnios.getSize(); i++) {
                cbxAnio.addItem(listaAnios.obtenerDato(i).getAnioMin() + " - " + listaAnios.obtenerDato(i).getAnioMax());
            }
                for (int i = 0; i <= 4; i++) {
                    cbxCalificación.addItem("Tipo "+i);
                }
            
        } catch (Exception e) {
        }
    }
    
    
    
>>>>>>> d5734bf (Sentencias)
    public boolean comprobarValores() {
        if (Double.valueOf(txtfUmbralMinimo.getText()) >= Double.valueOf(txtfUmbralMaximo.getText())) {
            return false;
        } else {
            return true;
        }
    }

    private void limpiarVista() {
        cargarDatos();
        txtfClave.setText("");
        txtfDescripcion.setText("");
        txtfUmbralMaximo.setText("");
        txtfUmbralMinimo.setText("");
        txtfBuscar.setText("");
        btnAniadir.setEnabled(true);
        btnModificar.setEnabled(false);
        try {
            listaUmbrales.setSelectedIndices(null);
        } catch (Exception e) {
        }
    }

    private void cargarDatos() {
        try {
            int seleccion = listaUmbrales.getSelectedIndex();
            auxUmbral = aux.obtenerDato(seleccion);
            txtfClave.setText(auxUmbral.getClave_Umbral() + "");
            txtfDescripcion.setText(auxUmbral.getDescripcion());
            txtfUmbralMinimo.setText(auxUmbral.getValorMin() + "");
            txtfUmbralMaximo.setText(auxUmbral.getValorMax() + "");
            cbxCalificación.removeAllItems();
            cargarcbx();
<<<<<<< HEAD
            cbxCalificación.setSelectedItem("Tipo " + auxUmbral.getTipo());

=======
            cbxCalificación.setSelectedItem("Tipo "+auxUmbral.getTipo());
           
>>>>>>> d5734bf (Sentencias)
        } catch (Exception e) {
        }
    }

    private void cargarLista() {
        modelo.clear();
        UmbralDao umdao = new UmbralDao();
        try {
            if (txtfBuscar.getText().trim().length() == 0) {
                aux = umdao.buscar(null);
            } else {
                aux = umdao.buscar(txtfBuscar.getText());
            }

            for (int i = 0; i < aux.getSize(); i++) {
                modelo.addElement(aux.obtenerDato(i).getDescripcion() + " - Tipo " + aux.obtenerDato(i).getTipo());
                if (aux.obtenerDato(i).getID_Umbral() > valor) {
                    valor = aux.obtenerDato(i).getID_Umbral();
                }
            }
        } catch (Exception e) {
            System.out.println("Error en cargar lista");
        }
    }

    private void ejecutarSentencias() {
        try {
            UmbralDao umbdao = new UmbralDao();
            for (int i = 0; i < modificaciones.getSize(); i++) {
                Umbral u = new Umbral();
                u = modificaciones.obtenerDato(i);
                if (cambios.obtenerDato(i) == "Editar") {
                    String sentencia = "Update umbral set id_rangoanio = " + u.getID_RangoAnio() + ", tipo = '" + u.getTipo() + "', valormin = " + u.getValorMin() + ", valormax=" + u.getValorMax() + ", clave_umbral=" + u.getClave_Umbral()
                            + ", Updated_at = sysdate, descripcion = '" + u.getDescripcion().toUpperCase() + "', categoria='" + u.getCategoria().toUpperCase() + "' where id_umbral = " + u.getID_Umbral();
                    umbdao.ejecutarSentencias(sentencia);
                } else {
                    cargarLista();
                    String sentencia = "Insert into umbral (Id_umbral, Id_rangoanio, Tipo, Valormin, valormax, clave_umbral, created_at, updated_at, descripcion, categoria)values("
                            + "Umbral_ID_Seq.NextVal" + ", " + u.getID_RangoAnio() + ", '" + u.getTipo() + "', " + u.getValorMin() + ", " + u.getValorMax() + ", " + u.getClave_Umbral() + ", SYSDATE, SYSDATE, '" + u.getDescripcion().toUpperCase() + "', '" + u.getCategoria().toUpperCase() + "')";
                    umbdao.ejecutarSentencias(sentencia);
                }
            }
        } catch (Exception e) {
            System.out.println(e);
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
            java.util.logging.Logger.getLogger(FrmEditarUmbrales.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmEditarUmbrales.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmEditarUmbrales.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmEditarUmbrales.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmEditarUmbrales().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAniadir;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnCancelarM;
    private javax.swing.JButton btnGestionar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JComboBox<String> cbxAnio;
    private javax.swing.JComboBox<String> cbxCalificación;
    private javax.swing.JComboBox<String> cbxCategoria;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JList<String> listaUmbrales;
    private DefaultListModel modelo;
    private javax.swing.JTable tablaC;
    private javax.swing.JTextField txtfBuscar;
    private javax.swing.JTextField txtfClave;
    private javax.swing.JTextField txtfDescripcion;
    private javax.swing.JTextField txtfUmbralMaximo;
    private javax.swing.JTextField txtfUmbralMinimo;
    // End of variables declaration//GEN-END:variables
}
