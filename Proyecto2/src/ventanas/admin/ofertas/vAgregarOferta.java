/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventanas.admin.ofertas;

import ventanas.admin.vOferta;

/**
 *
 * @author Jo
 */
public class vAgregarOferta extends javax.swing.JFrame {

    /**
     * Creates new form vAgregarOferta
     */
    public vAgregarOferta() {
        initComponents();
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tBuscar = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        lDescripcion = new javax.swing.JLabel();
        bCrear = new javax.swing.JButton();
        lDescuento = new javax.swing.JLabel();
        bCancelar = new javax.swing.JButton();
        lProductos = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        lPrioridad = new javax.swing.JLabel();
        tPrecio = new javax.swing.JFormattedTextField();
        lAgregar = new javax.swing.JLabel();
        tDescripcion = new javax.swing.JTextField();
        cProductos = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Administrador");

        tBuscar.setBackground(new java.awt.Color(252, 249, 249));
        tBuscar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tBuscar.setDisabledTextColor(new java.awt.Color(252, 249, 249));
        tBuscar.setEnabled(false);
        tBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tBuscarActionPerformed(evt);
            }
        });

        lDescripcion.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lDescripcion.setText("Descripción:");

        bCrear.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        bCrear.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/iconos/crear.png"))); // NOI18N
        bCrear.setText("Crear");
        bCrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bCrearActionPerformed(evt);
            }
        });

        lDescuento.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lDescuento.setText("Descuento: ");

        bCancelar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        bCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/iconos/eliminar.png"))); // NOI18N
        bCancelar.setText("Cancelar");
        bCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bCancelarActionPerformed(evt);
            }
        });

        lProductos.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lProductos.setText("Productos: ");

        lPrioridad.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lPrioridad.setText("Prioridad: ");

        tPrecio.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        lAgregar.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lAgregar.setText("Agregar ofertas");

        tDescripcion.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        cProductos.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cProductos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addComponent(jSeparator2)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(76, 76, 76)
                        .addComponent(bCrear)
                        .addGap(35, 35, 35)
                        .addComponent(bCancelar))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lPrioridad)
                                    .addComponent(lDescuento)
                                    .addComponent(lDescripcion))
                                .addGap(27, 27, 27)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(tPrecio, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
                                    .addComponent(tBuscar, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
                                    .addComponent(tDescripcion, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lProductos)
                                .addGap(27, 27, 27)
                                .addComponent(cProductos, 0, 133, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(104, 104, 104)
                        .addComponent(lAgregar)))
                .addContainerGap(63, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(lAgregar)
                .addGap(7, 7, 7)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lDescripcion))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lDescuento)
                    .addComponent(tPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lProductos)
                    .addComponent(cProductos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lPrioridad))
                .addGap(26, 26, 26)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bCrear)
                    .addComponent(bCancelar))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tBuscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tBuscarActionPerformed

    private void bCrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bCrearActionPerformed
        vOferta ventana = new vOferta();
        ventana.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_bCrearActionPerformed

    private void bCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bCancelarActionPerformed
        vOferta ventana = new vOferta();
        ventana.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_bCancelarActionPerformed

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
            java.util.logging.Logger.getLogger(vAgregarOferta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(vAgregarOferta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(vAgregarOferta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(vAgregarOferta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new vAgregarOferta().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bCancelar;
    private javax.swing.JButton bCrear;
    private javax.swing.JComboBox<String> cProductos;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel lAgregar;
    private javax.swing.JLabel lDescripcion;
    private javax.swing.JLabel lDescuento;
    private javax.swing.JLabel lPrioridad;
    private javax.swing.JLabel lProductos;
    private javax.swing.JTextField tBuscar;
    private javax.swing.JTextField tDescripcion;
    private javax.swing.JFormattedTextField tPrecio;
    // End of variables declaration//GEN-END:variables
}