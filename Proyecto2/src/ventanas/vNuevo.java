/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventanas;

import clases.Cliente;
import clases.estructuras.Dato;
import clases.estructuras.Nodo;
import javax.swing.JOptionPane;

/**
 *
 * @author Jo
 */
public class vNuevo extends javax.swing.JFrame {

    /**
     * Creates new form vNuevo
     */
    public vNuevo() {
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
        jPanel1 = new javax.swing.JPanel();
        lUsuario = new javax.swing.JLabel();
        lContraseña = new javax.swing.JLabel();
        lNombre = new javax.swing.JLabel();
        lCorreo = new javax.swing.JLabel();
        lTarjeta = new javax.swing.JLabel();
        tContraseña = new javax.swing.JPasswordField();
        tUsuario = new javax.swing.JTextField();
        tNombre = new javax.swing.JTextField();
        tCorreo = new javax.swing.JTextField();
        tTarjeta = new javax.swing.JFormattedTextField();
        bCrear = new javax.swing.JButton();
        bSalir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Crear nueva cuenta");
        setResizable(false);

        lCrear.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lCrear.setText("Crear nuevo usuario");

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lUsuario.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lUsuario.setText("Usuario: ");

        lContraseña.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lContraseña.setText("Contraseña: ");

        lNombre.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lNombre.setText("Nombre completo: ");

        lCorreo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lCorreo.setText("Correo electrónico: ");

        lTarjeta.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lTarjeta.setText("No. Tarjeta: ");

        tContraseña.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        tUsuario.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        tNombre.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tNombreActionPerformed(evt);
            }
        });
        tNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tNombreKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tNombreKeyTyped(evt);
            }
        });

        tCorreo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        try {
            tTarjeta.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("####-####-####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        tTarjeta.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tTarjeta.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tTarjetaKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lContraseña)
                    .addComponent(lUsuario)
                    .addComponent(lNombre)
                    .addComponent(lCorreo)
                    .addComponent(lTarjeta))
                .addGap(72, 72, 72)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tContraseña, javax.swing.GroupLayout.DEFAULT_SIZE, 258, Short.MAX_VALUE)
                    .addComponent(tUsuario)
                    .addComponent(tCorreo)
                    .addComponent(tNombre)
                    .addComponent(tTarjeta))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lUsuario))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lContraseña)
                    .addComponent(tContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lNombre))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lCorreo)
                    .addComponent(tCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lTarjeta)
                    .addComponent(tTarjeta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(30, Short.MAX_VALUE))
        );

        bCrear.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        bCrear.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/iconos/crear.png"))); // NOI18N
        bCrear.setText("Crear");
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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(144, 144, 144)
                        .addComponent(lCrear)
                        .addGap(0, 135, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(133, 133, 133)
                .addComponent(bCrear)
                .addGap(37, 37, 37)
                .addComponent(bSalir)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lCrear)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bCrear)
                    .addComponent(bSalir))
                .addGap(24, 24, 24))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bCrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bCrearActionPerformed
        if("".equals(tUsuario.getText()) || "".equals(String.valueOf(tContraseña.getPassword()))
         ||"".equals(tNombre.getText())||"".equals(tCorreo.getText())||"    -    -    -    ".equals(tTarjeta.getText())){
            JOptionPane.showMessageDialog(null, "Error, rellene todos los campos solicitados", "Error en el ingreso de datos", JOptionPane.ERROR_MESSAGE);
        }else{
            String usuario = tUsuario.getText();
            String nombre = tNombre.getText();
            String correo = tCorreo.getText();
            char pass[] = tContraseña.getPassword();
            String tarjeta = tTarjeta.getText();
            
            if(comprobar(usuario)){
                JOptionPane.showMessageDialog(null, "El nombre de usuario ya existe","Error en ingreso de datos",JOptionPane.ERROR_MESSAGE);
            }else{
                Cliente nuevo = new Cliente(usuario,pass,nombre,correo,tarjeta);
                Dato datos = new Dato();
                datos.getUsuarios().agregar(nuevo);
                JOptionPane.showMessageDialog(null, "Usuario creado con éxito","Creación de usuario",JOptionPane.INFORMATION_MESSAGE);
                vLogin ventana = new vLogin();
                ventana.setVisible(true);
                this.dispose();                   
            }
         
        }     
    }//GEN-LAST:event_bCrearActionPerformed

    private void bSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bSalirActionPerformed
        vLogin ventana = new vLogin();
        ventana.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_bSalirActionPerformed

    private void tNombreKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tNombreKeyPressed

    }//GEN-LAST:event_tNombreKeyPressed

    private void tNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tNombreActionPerformed

    private void tNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tNombreKeyTyped
        char t = evt.getKeyChar();
        int tecla = (int) t;
        System.out.println(tecla);
        if(((tecla>=65 && tecla<=90) || (tecla>=97 && tecla<=122)) || tecla==32){
            
        }else{
            evt.consume();
        }
    }//GEN-LAST:event_tNombreKeyTyped

    private void tTarjetaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tTarjetaKeyTyped
        char t = evt.getKeyChar();
        int tecla = (int) t;
        System.out.println(tecla);
        if((tecla>=48 && tecla<=57)){
            
        }else{
            evt.consume();
        } 
    }//GEN-LAST:event_tTarjetaKeyTyped

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
            java.util.logging.Logger.getLogger(vNuevo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(vNuevo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(vNuevo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(vNuevo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new vNuevo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bCrear;
    private javax.swing.JButton bSalir;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lContraseña;
    private javax.swing.JLabel lCorreo;
    private javax.swing.JLabel lCrear;
    private javax.swing.JLabel lNombre;
    private javax.swing.JLabel lTarjeta;
    private javax.swing.JLabel lUsuario;
    private javax.swing.JPasswordField tContraseña;
    private javax.swing.JTextField tCorreo;
    private javax.swing.JTextField tNombre;
    private javax.swing.JFormattedTextField tTarjeta;
    private javax.swing.JTextField tUsuario;
    // End of variables declaration//GEN-END:variables
    Nodo auxiliar = new Nodo();
    Dato dato = new Dato();
    Cliente cliente = new Cliente();
    

    /**
     * Comprueba que los datos ingresados sean correctos 
     */    
    private boolean comprobar(String usuario){
        boolean validar = false;
        try{
            auxiliar = dato.getUsuarios().getCabeza();
            cliente = (Cliente)auxiliar.getInfo();
            for(int i=0;i<dato.getUsuarios().getTamaño();i++){
                if(usuario.equalsIgnoreCase(cliente.getNombreU())){
                    validar=true;
                    break;
                }
                auxiliar=auxiliar.getSiguiente();
                cliente=(Cliente)auxiliar.getInfo();
        }            
        }catch(Exception e){
            
        }
        
        return validar;
    }
}
