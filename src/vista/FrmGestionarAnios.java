/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vista;

import controlador.dao.RangoAnioDao;
import controlador.tda.lista.ListaEnlazada;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import modelo.RangoAnio;
import vista.tablas.TablaAnios;

/**
 *
 * @author patob
 */
public class FrmGestionarAnios extends javax.swing.JFrame {

    ListaEnlazada<RangoAnio> aux = new ListaEnlazada();
    RangoAnioDao rdao = new RangoAnioDao();

    /**
     * Creates new form FrmGestionarAnios
     */
    public FrmGestionarAnios() {
        initComponents();
        this.setLocationRelativeTo(null);
        btnModificar.setEnabled(false);
        cargarTabla();
    }

    public void cargarTabla() {
        RangoAnioDao radao = new RangoAnioDao();
        aux = radao.consultarAnios();
        TablaAnios ta = new TablaAnios(aux);
        jtablaAnios.setModel(ta);
        jtablaAnios.updateUI();
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
        jScrollPane1 = new javax.swing.JScrollPane();
        jtablaAnios = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        txtfId = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtfAnioMin = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtfAnioMax = new javax.swing.JTextField();
        btnCerrar = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        btnAniadir = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Gestión años");

        jtablaAnios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1"
            }
        ));
        jtablaAnios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtablaAniosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jtablaAnios);

        jLabel2.setText("Id:");

        txtfId.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtfIdKeyTyped(evt);
            }
        });

        jLabel3.setText("Año mínimo:");

        txtfAnioMin.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtfAnioMinKeyTyped(evt);
            }
        });

        jLabel4.setText("Año Maximo:");

        txtfAnioMax.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtfAnioMaxKeyTyped(evt);
            }
        });

        btnCerrar.setText("Cerrar");
        btnCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarActionPerformed(evt);
            }
        });

        btnModificar.setText("Modificar");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });

        btnAniadir.setText("Añadir");
        btnAniadir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAniadirActionPerformed(evt);
            }
        });

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtfId, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtfAnioMin, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtfAnioMax, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 12, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnCerrar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnCancelar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnModificar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnAniadir)
                        .addGap(13, 13, 13)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtfId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(txtfAnioMin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(txtfAnioMax, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCerrar)
                    .addComponent(btnModificar)
                    .addComponent(btnAniadir)
                    .addComponent(btnCancelar))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtfIdKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtfIdKeyTyped
        char car = evt.getKeyChar();
        if ((car < '0' || car > '9'))
            evt.consume();
    }//GEN-LAST:event_txtfIdKeyTyped

    private void txtfAnioMinKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtfAnioMinKeyTyped
        char car = evt.getKeyChar();
        if ((car < '0' || car > '9'))
            evt.consume();
    }//GEN-LAST:event_txtfAnioMinKeyTyped

    private void txtfAnioMaxKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtfAnioMaxKeyTyped
        char car = evt.getKeyChar();
        if ((car < '0' || car > '9'))
            evt.consume();
    }//GEN-LAST:event_txtfAnioMaxKeyTyped

    private void btnCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarActionPerformed
        this.dispose();
        FrmEditarUmbrales.abrio = false;
    }//GEN-LAST:event_btnCerrarActionPerformed

    private void limpiar() {
        txtfId.setText("");
        txtfAnioMin.setText("");
        txtfAnioMax.setText("");
        btnAniadir.setEnabled(true);
        btnModificar.setEnabled(false);
        txtfId.setEnabled(true);
        cargarTabla();
    }

    private void jtablaAniosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtablaAniosMouseClicked
        if (evt.getClickCount() == 2) {
            try {
                btnAniadir.setEnabled(false);
                btnModificar.setEnabled(true);
                txtfId.setEnabled(false);
                txtfId.setText(aux.obtenerDato(jtablaAnios.getSelectedRow()).getID_RangoAnio() + "");
                txtfAnioMin.setText(aux.obtenerDato(jtablaAnios.getSelectedRow()).getAnioMin() + "");
                txtfAnioMax.setText(aux.obtenerDato(jtablaAnios.getSelectedRow()).getAnioMax() + "");
            } catch (Exception e) {
            }
        }
    }//GEN-LAST:event_jtablaAniosMouseClicked

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        limpiar();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnAniadirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAniadirActionPerformed
        if (txtfId.getText().trim().length() == 0 || txtfAnioMin.getText().trim().length() == 0 || txtfAnioMax.getText().trim().length() == 0) {
            JOptionPane.showMessageDialog(null, "Llene los campos");
        } else {
            String sentencia = "INSERT into rangoanio(id_rangoanio, aniomin, aniomax, created_at, updated_at)values(" + txtfId.getText() + ", " + txtfAnioMin.getText() + "," + txtfAnioMax.getText() + ", SYSDATE, SYSDATE)";
            rdao.ejecutarSentencias(sentencia);
            cargarTabla();
        }
    }//GEN-LAST:event_btnAniadirActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        if (txtfId.getText().trim().length() == 0 || txtfAnioMin.getText().trim().length() == 0 || txtfAnioMax.getText().trim().length() == 0) {
            JOptionPane.showMessageDialog(null, "Llene los campos");
        } else {
            String sentencia = "UPDATE rangoanio set aniomin = "+txtfAnioMin.getText()+", aniomax = "+txtfAnioMax+", updated_at=SYSDATE, WHERE id_randoanio = "+txtfId.getText()+";";
            System.out.println("esta: "+sentencia);
            rdao.ejecutarSentencias(sentencia);
            cargarTabla();
        }
    }//GEN-LAST:event_btnModificarActionPerformed

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
            java.util.logging.Logger.getLogger(FrmGestionarAnios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmGestionarAnios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmGestionarAnios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmGestionarAnios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmGestionarAnios().setVisible(true);

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAniadir;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnCerrar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jtablaAnios;
    private javax.swing.JTextField txtfAnioMax;
    private javax.swing.JTextField txtfAnioMin;
    private javax.swing.JTextField txtfId;
    // End of variables declaration//GEN-END:variables
}
