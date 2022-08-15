/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vista;

import com.sun.java.swing.plaf.motif.MotifLookAndFeel;
import com.sun.java.swing.plaf.windows.WindowsLookAndFeel;
import controlador.dao.UmbralDao;
import controlador.tda.lista.ListaEnlazada;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.plaf.metal.MetalLookAndFeel;
import javax.swing.plaf.multi.MultiLookAndFeel;
import javax.swing.plaf.nimbus.NimbusLookAndFeel;
import modelo.Umbral;
import javax.swing.DefaultListModel;

/**
 *
 * @author patob
 */
public class FrmEditarUmbrales extends javax.swing.JFrame {

    ListaEnlazada<Umbral> aux = new ListaEnlazada();
    ListaEnlazada<String> cambios = new ListaEnlazada();
    public static boolean abrio=false;
    /**
     * Creates new form FrmEditarUmbrales
     */
    public FrmEditarUmbrales() {
        initComponents();
        this.setLocationRelativeTo(null);
        cargarLista();
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
        jTable1 = new javax.swing.JTable();

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
        jLabel2.setText("<= X <");
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
        jPanel1.add(btnModificar);
        btnModificar.setBounds(340, 220, 105, 32);

        btnAniadir.setText("Añadir");
        jPanel1.add(btnAniadir);
        btnAniadir.setBounds(460, 220, 105, 32);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(330, 50, 570, 260);

        btnCancelarM.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnCancelarM.setText("Cancelar");
        getContentPane().add(btnCancelarM);
        btnCancelarM.setBounds(640, 570, 114, 36);

        btnGuardar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnGuardar.setText("Guardar");
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

        jScrollPane2.setViewportView(jTable1);

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
            cargarDatos();
            btnAniadir.setEnabled(false);
        }
    }//GEN-LAST:event_listaUmbralesMouseClicked

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        limpiarVista();
    }//GEN-LAST:event_btnCancelarActionPerformed
    
    
    private void btnGestionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGestionarActionPerformed
        if (abrio==false) {
            FrmGestionarAnios vga = new FrmGestionarAnios();
            vga.setVisible(true);
            abrio=true;
        }
        
    }//GEN-LAST:event_btnGestionarActionPerformed
    
    private void limpiarVista(){
        cargarDatos();
        txtfClave.setText("");
        txtfDescripcion.setText("");
        txtfUmbralMaximo.setText("");
        txtfUmbralMinimo.setText("");
        btnAniadir.setEnabled(true);
        btnModificar.setEnabled(true);
        try {
            listaUmbrales.setSelectedIndices(null);
        } catch (Exception e) {
        }
    }
    
    private void cargarDatos() {
        try {
            int seleccion = listaUmbrales.getSelectedIndex();
            Umbral umbralModificar = aux.obtenerDato(seleccion);
            txtfClave.setText(umbralModificar.getClave_Umbral()+"");
            txtfDescripcion.setText(umbralModificar.getDescripcion());
            txtfUmbralMinimo.setText(umbralModificar.getValorMin()+"");
            txtfUmbralMaximo.setText(umbralModificar.getValorMax()+"");
            cbxCalificación.removeAllItems();
            cbxCalificación.addItem("Tipo: "+umbralModificar.getTipo()); //revisar consulta tipos calificacion
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
            }
        } catch (Exception e) {
            System.out.println("Error en cargar lista");
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
    private javax.swing.JTable jTable1;
    private javax.swing.JList<String> listaUmbrales;
    private DefaultListModel modelo;
    private javax.swing.JTextField txtfBuscar;
    private javax.swing.JTextField txtfClave;
    private javax.swing.JTextField txtfDescripcion;
    private javax.swing.JTextField txtfUmbralMaximo;
    private javax.swing.JTextField txtfUmbralMinimo;
    // End of variables declaration//GEN-END:variables
}
