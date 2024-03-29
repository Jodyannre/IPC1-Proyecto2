/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventanas.admin.productos;

import clases.Producto;
import clases.estructuras.Dato;
import clases.estructuras.Nodo;
import java.io.File;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import ventanas.admin.vProducto;

/**
 *
 * @author Jo
 */
public class vAgregarProducto extends javax.swing.JFrame {

    /**
     * Creates new form vAgregarProducto
     */
    public vAgregarProducto() {
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

        jFileChooser1 = new javax.swing.JFileChooser();
        lNombre = new javax.swing.JLabel();
        lDescripcion = new javax.swing.JLabel();
        lPrecio = new javax.swing.JLabel();
        lExistencia = new javax.swing.JLabel();
        lImagen = new javax.swing.JLabel();
        lAgregar = new javax.swing.JLabel();
        tNombre = new javax.swing.JTextField();
        tDescripcion = new javax.swing.JTextField();
        tImagen = new javax.swing.JTextField();
        bBuscar = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        bCrear = new javax.swing.JButton();
        bCancelar = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        tExistencia = new javax.swing.JTextField();
        tPrecio = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Administrador");
        setResizable(false);

        lNombre.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lNombre.setText("Nombre: ");

        lDescripcion.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lDescripcion.setText("Descripción: ");

        lPrecio.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lPrecio.setText("Precio: ");

        lExistencia.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lExistencia.setText("Existencia: ");

        lImagen.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lImagen.setText("Imagen: ");

        lAgregar.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lAgregar.setText("Agregar productos");

        tNombre.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                verificarString(evt);
            }
        });

        tDescripcion.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tDescripcion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                verificarString(evt);
            }
        });

        tImagen.setBackground(new java.awt.Color(252, 249, 249));
        tImagen.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tImagen.setDisabledTextColor(new java.awt.Color(252, 249, 249));
        tImagen.setEnabled(false);
        tImagen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tImagenActionPerformed(evt);
            }
        });
        tImagen.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                verificarDireccion(evt);
            }
        });

        bBuscar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        bBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/iconos/buscar.png"))); // NOI18N
        bBuscar.setText("Buscar");
        bBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bBuscarActionPerformed(evt);
            }
        });

        bCrear.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        bCrear.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/iconos/crear.png"))); // NOI18N
        bCrear.setText("Crear");
        bCrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bCrearActionPerformed(evt);
            }
        });

        bCancelar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        bCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/iconos/eliminar.png"))); // NOI18N
        bCancelar.setText("Cancelar");
        bCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bCancelarActionPerformed(evt);
            }
        });

        tExistencia.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tExistencia.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tExistenciaKeyTyped(evt);
            }
        });

        tPrecio.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tPrecio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tPrecioKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lExistencia)
                            .addComponent(lNombre)
                            .addComponent(lImagen)
                            .addComponent(lPrecio))
                        .addGap(28, 28, 28))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lDescripcion)
                        .addGap(18, 18, 18)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tPrecio, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(tExistencia, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(tImagen, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(tDescripcion)
                                .addComponent(tNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                .addComponent(bBuscar)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lAgregar)
                .addGap(85, 85, 85))
            .addComponent(jSeparator1)
            .addGroup(layout.createSequentialGroup()
                .addGap(76, 76, 76)
                .addComponent(bCrear)
                .addGap(35, 35, 35)
                .addComponent(bCancelar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jSeparator2)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(lAgregar)
                .addGap(7, 7, 7)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(tNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lNombre))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lDescripcion))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lPrecio)
                    .addComponent(tPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lExistencia)
                    .addComponent(tExistencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tImagen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lImagen)
                    .addComponent(bBuscar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bCrear)
                    .addComponent(bCancelar))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bBuscarActionPerformed
        JFileChooser imagen = new JFileChooser();
        imagen.showOpenDialog(this);
        File ruta = imagen.getSelectedFile();
        if(ruta!=null) try {
            tImagen.setText(ruta.getCanonicalPath());
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Error, dirección incorrecta");
        }
        else tImagen.setText(" ");
    }//GEN-LAST:event_bBuscarActionPerformed

    private void bCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bCancelarActionPerformed
        vProducto ventana = new vProducto();
        ventana.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_bCancelarActionPerformed

    private void bCrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bCrearActionPerformed
        if("".equals(tNombre.getText())
         ||"".equals(tDescripcion.getText())
         ||"".equals(tExistencia.getText())
         ||"".equals(tPrecio.getText())
         ||"".equals(tImagen.getText())
         ||" ".equals(tImagen.getText())
         ||validarRepetido()){
            if(validarRepetido()){
                JOptionPane.showMessageDialog(null, "El producto ya existe", "Error en el ingreso de datos", JOptionPane.ERROR_MESSAGE);    
            }else{
                JOptionPane.showMessageDialog(null, "Error, rellene todos los campos solicitados", "Error en el ingreso de datos", JOptionPane.ERROR_MESSAGE);    
            }
            
        }else{
            String nombre = tNombre.getText();
            String descripcion = tDescripcion.getText();
            String imagen = tImagen.getText();
            float precio = Float.parseFloat(tPrecio.getText());
            int existencia = Integer.parseInt(tExistencia.getText());
            Producto nuevo = new Producto(nombre,descripcion,imagen,precio,existencia);
            Dato datos = new Dato();
            datos.getProductos().agregar(nuevo);
            JOptionPane.showMessageDialog(null, "Producto creado con éxito","Creación exitosa",JOptionPane.INFORMATION_MESSAGE);
            vProducto ventana = new vProducto();
            ventana.setVisible(true);
            this.dispose();         
        } 
        

    }//GEN-LAST:event_bCrearActionPerformed

    private void tImagenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tImagenActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tImagenActionPerformed

    private void verificarString(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_verificarString
      char caracter = evt.getKeyChar();

      // Verificar dígitos
      if((((int)caracter < 97) ||
         ((int)caracter > 122)) &&
         ((int)caracter != 32 )){
           evt.consume();  // ignorar
      }else{
          
      }
    }//GEN-LAST:event_verificarString

    private void verificarDireccion(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_verificarDireccion
//      char caracter = evt.getKeyChar();
//
//      // Verificar dígitos
//      if((((int)caracter < 97) ||
//         ((int)caracter > 122)) &&
//         ((int)caracter != 32 ) &&
//         ((int)caracter != 47 ) &&
//         ((int)caracter != 58 ) &&
//         ((int)caracter != 92 ) ){
//           evt.consume();  // ignorar
//      }else{
//          
//      }
    }//GEN-LAST:event_verificarDireccion

    private void tExistenciaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tExistenciaKeyTyped
        char t = evt.getKeyChar();
        int tecla = (int) t;
        System.out.println(tecla);
        if((tecla>=48 && tecla<=57)){
            
        }else{
            evt.consume();
        } 
    }//GEN-LAST:event_tExistenciaKeyTyped

    private void tPrecioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tPrecioKeyTyped
      char caracter = evt.getKeyChar();

      // Verificar dígitos
      if((((int)caracter >= 48) && ((int)caracter <= 57)) ||         
         ((int)caracter == 46 )){            
      }else{
          evt.consume();  // ignorar 
      }
    }//GEN-LAST:event_tPrecioKeyTyped

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
            java.util.logging.Logger.getLogger(vAgregarProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(vAgregarProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(vAgregarProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(vAgregarProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new vAgregarProducto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bBuscar;
    private javax.swing.JButton bCancelar;
    private javax.swing.JButton bCrear;
    private javax.swing.JFileChooser jFileChooser1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel lAgregar;
    private javax.swing.JLabel lDescripcion;
    private javax.swing.JLabel lExistencia;
    private javax.swing.JLabel lImagen;
    private javax.swing.JLabel lNombre;
    private javax.swing.JLabel lPrecio;
    private javax.swing.JTextField tDescripcion;
    private javax.swing.JTextField tExistencia;
    private javax.swing.JTextField tImagen;
    private javax.swing.JTextField tNombre;
    private javax.swing.JTextField tPrecio;
    // End of variables declaration//GEN-END:variables
    private Dato datos = new Dato();
    private Nodo auxiliar = new Nodo();
    private Producto producto = new Producto();

    
    /**
     * Valida si el producto a agregar ya existe dentro de la base de datos de productos creados
     */    
    private boolean validarRepetido(){
        boolean validar=false;
        try{

            auxiliar = datos.getProductos().getPrimero();
            producto = (Producto)auxiliar.getInfo();
            for(int i=0; i<datos.getProductos().getTamaño();i++){
                if(producto.getNombre().equalsIgnoreCase(tNombre.getText())){
                    validar=true; 
                    break;
                } 
                auxiliar = auxiliar.getSiguiente();
                producto = (Producto)auxiliar.getInfo();
            }
            
        }catch(Exception e){
            
        }
        return validar;
    }

}
