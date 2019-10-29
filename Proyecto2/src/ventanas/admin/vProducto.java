/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventanas.admin;

import java.io.File;
import javax.swing.JFileChooser;
import ventanas.admin.productos.vVerProducto;
import ventanas.admin.productos.vAgregarProducto;
import ventanas.admin.productos.vModificarProducto;
import javax.swing.JOptionPane;
import ventanas.admin.productos.vListaProducto;
import ventanas.vLogin;

/**
 *
 * @author Jo
 */
public class vProducto extends javax.swing.JFrame {

    /**
     * Creates new form vProducto
     */
    public vProducto() {
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

        lProductos = new javax.swing.JLabel();
        bAgregar = new javax.swing.JButton();
        bModificar = new javax.swing.JButton();
        bMostrar = new javax.swing.JButton();
        bEliminar = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        bRegresar = new javax.swing.JButton();
        bSalir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Administrador");

        lProductos.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lProductos.setText("Productos");

        bAgregar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        bAgregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/iconos/agregar.png"))); // NOI18N
        bAgregar.setText("Agregar");
        bAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bAgregarActionPerformed(evt);
            }
        });

        bModificar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        bModificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/iconos/modificar.png"))); // NOI18N
        bModificar.setText("Modificar");
        bModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bModificarActionPerformed(evt);
            }
        });

        bMostrar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        bMostrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/iconos/mostrar.png"))); // NOI18N
        bMostrar.setText("Mostrar");
        bMostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bMostrarActionPerformed(evt);
            }
        });

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
            .addComponent(jSeparator1)
            .addComponent(jSeparator2)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(151, 151, 151)
                        .addComponent(lProductos))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(bAgregar)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(bEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(bModificar))
                        .addGap(18, 18, 18)
                        .addComponent(bMostrar)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addComponent(bRegresar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(bSalir)
                .addGap(69, 69, 69))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lProductos)
                .addGap(16, 16, 16)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bModificar)
                    .addComponent(bMostrar)
                    .addComponent(bAgregar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(bEliminar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bRegresar)
                    .addComponent(bSalir))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bSalirActionPerformed
        vLogin ventana = new vLogin();
        ventana.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_bSalirActionPerformed

    private void bRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bRegresarActionPerformed
        vAdmin ventana = new vAdmin();
        ventana.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_bRegresarActionPerformed

    private void bAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bAgregarActionPerformed
        int seleccion=0;
        try{
            seleccion=Integer.parseInt(JOptionPane.showInputDialog(null,"Escoja una opción"
            +"\n1. Agregar productos individualmente"
            +"\n2. Agregar productos masivamente"));           
        }catch(Exception e){
        }
        
        try{
            switch(seleccion){
                case 1:
                    vAgregarProducto ventana = new vAgregarProducto();
                    ventana.setVisible(true);
                    this.dispose();                    
                    break;
                case 2:
                    JFileChooser ingreso = new JFileChooser();
                    ingreso.showOpenDialog(this);
                    File ruta = ingreso.getSelectedFile();
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Error, opción no disponible","Error",JOptionPane.ERROR_MESSAGE);                    
                    break;
            }
        }catch(Exception e){
        }
        

    }//GEN-LAST:event_bAgregarActionPerformed

    private void bEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bEliminarActionPerformed
        int seleccion=0;
        try{
            seleccion = Integer.parseInt(JOptionPane.showInputDialog(null,"¿Qué operación desea realizar?"
            +"\n1. Ingresar el código del producto"
            +"\n2. Ver productos existentes"));            
        }catch(Exception e){
            
        }
        
        switch (seleccion) {
            case 1:
                try{
                    seleccion = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese el código del producto a eliminar"));
                }catch(Exception e){
                    JOptionPane.showMessageDialog(null, "Error, opción no disponible", "Error",JOptionPane.ERROR_MESSAGE,null);
                }
                break;
            case 2:
                vListaProducto  ventana = new vListaProducto();
                ventana.setVisible(true);
                this.dispose();
                break;
            default:
                JOptionPane.showMessageDialog(null, "Error, opción no disponible", "Error",JOptionPane.ERROR_MESSAGE,null);
                break;
        }
    }//GEN-LAST:event_bEliminarActionPerformed

    private void bMostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bMostrarActionPerformed
        vVerProducto ventana = new vVerProducto();
        ventana.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_bMostrarActionPerformed

    private void bModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bModificarActionPerformed
        vModificarProducto ventana = new vModificarProducto();
        ventana.setVisible(true);
        this.dispose();        
    }//GEN-LAST:event_bModificarActionPerformed

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
            java.util.logging.Logger.getLogger(vProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(vProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(vProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(vProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new vProducto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bAgregar;
    private javax.swing.JButton bEliminar;
    private javax.swing.JButton bModificar;
    private javax.swing.JButton bMostrar;
    private javax.swing.JButton bRegresar;
    private javax.swing.JButton bSalir;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel lProductos;
    // End of variables declaration//GEN-END:variables
}