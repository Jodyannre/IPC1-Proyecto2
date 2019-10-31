/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventanas.admin;

import clases.Cliente;
import clases.estructuras.Dato;
import clases.estructuras.Nodo;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import ventanas.vLogin;

/**
 *
 * @author Jo
 */
public class vVerUsuario extends javax.swing.JFrame {

    /**
     * Creates new form vVerUsuarios
     */
    public vVerUsuario() {
        initComponents();
        rellenarTabla();
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

        lUsuarios = new javax.swing.JLabel();
        sUsuarios = new javax.swing.JScrollPane();
        tUsuarios = new javax.swing.JTable();
        bRegresar = new javax.swing.JButton();
        bSalir = new javax.swing.JButton();
        bDetalle = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Administrador");

        lUsuarios.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lUsuarios.setText("Usuarios");

        tUsuarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Usuario", "Tipo", "Compras"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        sUsuarios.setViewportView(tUsuarios);

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

        bDetalle.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        bDetalle.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/iconos/mostrar.png"))); // NOI18N
        bDetalle.setText("Ver detalle");
        bDetalle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bDetalleActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(sUsuarios, javax.swing.GroupLayout.DEFAULT_SIZE, 523, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(211, 211, 211)
                                .addComponent(lUsuarios))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(76, 76, 76)
                                .addComponent(bDetalle)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(bRegresar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(bSalir)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(lUsuarios)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(sUsuarios, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bRegresar)
                    .addComponent(bSalir)
                    .addComponent(bDetalle))
                .addGap(28, 28, 28))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bRegresarActionPerformed
        vAdmin ventana = new vAdmin();
        ventana.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_bRegresarActionPerformed

    private void bSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bSalirActionPerformed
        vLogin ventana = new vLogin();
        ventana.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_bSalirActionPerformed

    private void bDetalleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bDetalleActionPerformed
        try{
            int fila = tUsuarios.getSelectedRow();
            String seleccion=tUsuarios.getValueAt(fila, 0).toString();
            auxiliar = datos.getUsuarios().getCabeza(); 
            cliente = (Cliente)auxiliar.getInfo();
            while(!cliente.getNombreU().equals(seleccion)){
                auxiliar=auxiliar.getSiguiente();
                cliente = (Cliente)auxiliar.getInfo();
            }
            JOptionPane.showMessageDialog(null, 
                    "Nombre: "+cliente.getNombreC()+"\n"
                    +"Usuario: "+cliente.getNombreU()+"\n"
                    +"Tarjeta: "+cliente.getTarjeta()+"\n"
                    +"Correo: "+cliente.getCorreo(),"Detalle",JOptionPane.INFORMATION_MESSAGE);            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "No hay información para mostrar","Error",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_bDetalleActionPerformed

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
            java.util.logging.Logger.getLogger(vVerUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(vVerUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(vVerUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(vVerUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new vVerUsuario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bDetalle;
    private javax.swing.JButton bRegresar;
    private javax.swing.JButton bSalir;
    private javax.swing.JLabel lUsuarios;
    private javax.swing.JScrollPane sUsuarios;
    private javax.swing.JTable tUsuarios;
    // End of variables declaration//GEN-END:variables
    Dato datos = new Dato();
    Nodo auxiliar = new Nodo();
    Cliente cliente = new Cliente();
    private void rellenarTabla(){
//        datos = new Dato();
        DefaultTableModel modelo = (DefaultTableModel) tUsuarios.getModel();
        Object fila[]= new Object[3];
        auxiliar = datos.getUsuarios().getCabeza();        
        for (int i=0; i<datos.getUsuarios().getTamaño();i++){

                cliente = (Cliente) auxiliar.getInfo();
                fila[0]= cliente.getNombreU();
                if(cliente.isTipoC()){
                    fila[1]= "Frecuente";
                }else{
                    fila[1]= "Normal";
                }                
                fila[2]= cliente.getContadorCompras();
                modelo.addRow(fila);
                auxiliar=auxiliar.getSiguiente();                

        }
        tUsuarios.setModel(modelo);
    }
}
