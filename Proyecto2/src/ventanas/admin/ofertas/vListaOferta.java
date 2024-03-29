/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventanas.admin.ofertas;

import javax.swing.JOptionPane;
import ventanas.admin.vOferta;
import ventanas.vLogin;

/**
 *
 * @author Jo
 */
public class vListaOferta extends javax.swing.JFrame {

    /**
     * Creates new form vListaOferta
     */
    public vListaOferta() {
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

        lDisponibles = new javax.swing.JLabel();
        pDisponibles = new javax.swing.JScrollPane();
        tOfertas = new javax.swing.JTable();
        bEliminar = new javax.swing.JButton();
        bRegresar = new javax.swing.JButton();
        bSalir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Administrador");
        setResizable(false);

        lDisponibles.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lDisponibles.setText("Ofertas disponibles");

        tOfertas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Descuento", "Prioridad"
            }
        ));
        pDisponibles.setViewportView(tOfertas);

        bEliminar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        bEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/iconos/eliminar.png"))); // NOI18N
        bEliminar.setText("Eliminar");
        bEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bEliminarActionPerformed(evt);
            }
        });

        bRegresar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        bRegresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/iconos/regresar.png"))); // NOI18N
        bRegresar.setText("Regresar");
        bRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bRegresarActionPerformed(evt);
            }
        });

        bSalir.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        bSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/iconos/exit.png"))); // NOI18N
        bSalir.setText("Salir");
        bSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lDisponibles)
                .addGap(125, 125, 125))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pDisponibles, javax.swing.GroupLayout.DEFAULT_SIZE, 456, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(bEliminar)
                .addGap(18, 18, 18)
                .addComponent(bRegresar)
                .addGap(18, 18, 18)
                .addComponent(bSalir)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lDisponibles)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pDisponibles, javax.swing.GroupLayout.PREFERRED_SIZE, 317, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bEliminar)
                    .addComponent(bRegresar)
                    .addComponent(bSalir))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bEliminarActionPerformed
        JOptionPane.showConfirmDialog(this, "Esta seguro que desea eliminar la oferta: ", "Eliminar",JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.QUESTION_MESSAGE);
    }//GEN-LAST:event_bEliminarActionPerformed

    private void bRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bRegresarActionPerformed
        vOferta ventana = new vOferta();
        ventana.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_bRegresarActionPerformed

    private void bSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bSalirActionPerformed
        vLogin ventana = new vLogin();
        ventana.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_bSalirActionPerformed

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
            java.util.logging.Logger.getLogger(vListaOferta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(vListaOferta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(vListaOferta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(vListaOferta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new vListaOferta().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bEliminar;
    private javax.swing.JButton bRegresar;
    private javax.swing.JButton bSalir;
    private javax.swing.JLabel lDisponibles;
    private javax.swing.JScrollPane pDisponibles;
    private javax.swing.JTable tOfertas;
    // End of variables declaration//GEN-END:variables
}
