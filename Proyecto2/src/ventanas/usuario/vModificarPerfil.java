/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventanas.usuario;

import ventanas.vLogin;

/**
 *
 * @author Jo
 */
public class vModificarPerfil extends javax.swing.JFrame {

    /**
     * Creates new form vModificarPerfil
     */
    public vModificarPerfil() {
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

        lCrear = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        tTarjeta = new javax.swing.JTextField();
        lUsuario1 = new javax.swing.JLabel();
        lContraseña1 = new javax.swing.JLabel();
        lNombre1 = new javax.swing.JLabel();
        lCorreo1 = new javax.swing.JLabel();
        lTarjeta1 = new javax.swing.JLabel();
        tContraseña = new javax.swing.JPasswordField();
        tUsuario = new javax.swing.JTextField();
        tNombre = new javax.swing.JTextField();
        tCorreo = new javax.swing.JTextField();
        bCrear = new javax.swing.JButton();
        bSalir = new javax.swing.JButton();
        lNombreBarra = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Modificar perfil");
        setPreferredSize(new java.awt.Dimension(528, 400));
        setResizable(false);

        lCrear.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lCrear.setText("Modificar datos");

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        tTarjeta.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        lUsuario1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lUsuario1.setText("Usuario: ");

        lContraseña1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lContraseña1.setText("Contraseña: ");

        lNombre1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lNombre1.setText("Nombre completo: ");

        lCorreo1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lCorreo1.setText("Correo electrónico: ");

        lTarjeta1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lTarjeta1.setText("No. Tarjeta: ");

        tContraseña.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        tUsuario.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        tNombre.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        tCorreo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lContraseña1)
                    .addComponent(lUsuario1)
                    .addComponent(lNombre1)
                    .addComponent(lCorreo1)
                    .addComponent(lTarjeta1))
                .addGap(72, 72, 72)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tContraseña)
                    .addComponent(tUsuario)
                    .addComponent(tCorreo)
                    .addComponent(tNombre)
                    .addComponent(tTarjeta))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lUsuario1))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lContraseña1)
                    .addComponent(tContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lNombre1))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lCorreo1)
                    .addComponent(tCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lTarjeta1)
                    .addComponent(tTarjeta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(27, Short.MAX_VALUE))
        );

        bCrear.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        bCrear.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/iconos/guardar.png"))); // NOI18N
        bCrear.setText("Actualizar");
        bCrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bCrearActionPerformed(evt);
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

        lNombreBarra.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lNombreBarra.setText("Nombre usuario");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(133, 133, 133)
                                .addComponent(bCrear)
                                .addGap(37, 37, 37)
                                .addComponent(bSalir))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(lNombreBarra)
                                .addGap(69, 69, 69)
                                .addComponent(lCrear)))
                        .addGap(0, 120, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(39, Short.MAX_VALUE)
                        .addComponent(lCrear))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lNombreBarra)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bCrear)
                    .addComponent(bSalir))
                .addGap(24, 24, 24))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bCrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bCrearActionPerformed
        vInicio ventana = new vInicio();
        ventana.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_bCrearActionPerformed

    private void bSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bSalirActionPerformed
        vInicio ventana = new vInicio();
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
            java.util.logging.Logger.getLogger(vModificarPerfil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(vModificarPerfil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(vModificarPerfil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(vModificarPerfil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new vModificarPerfil().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bCrear;
    private javax.swing.JButton bSalir;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lContraseña1;
    private javax.swing.JLabel lCorreo1;
    private javax.swing.JLabel lCrear;
    private javax.swing.JLabel lNombre1;
    private javax.swing.JLabel lNombreBarra;
    private javax.swing.JLabel lTarjeta1;
    private javax.swing.JLabel lUsuario1;
    private javax.swing.JPasswordField tContraseña;
    private javax.swing.JTextField tCorreo;
    private javax.swing.JTextField tNombre;
    private javax.swing.JTextField tTarjeta;
    private javax.swing.JTextField tUsuario;
    // End of variables declaration//GEN-END:variables
}
