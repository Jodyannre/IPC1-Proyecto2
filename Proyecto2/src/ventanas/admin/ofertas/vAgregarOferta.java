/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventanas.admin.ofertas;

import clases.Oferta;
import clases.Producto;
import clases.estructuras.Dato;
import clases.estructuras.ListaCircularSimple;
import clases.estructuras.Nodo;
import javax.swing.JOptionPane;
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

        tPrioridad = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        lDescripcion = new javax.swing.JLabel();
        bCrear = new javax.swing.JButton();
        lDescuento = new javax.swing.JLabel();
        bCancelar = new javax.swing.JButton();
        lProductos = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        lPrioridad = new javax.swing.JLabel();
        lAgregar = new javax.swing.JLabel();
        tDescripcion = new javax.swing.JTextField();
        tProductos = new javax.swing.JTextField();
        tPrecio = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Administrador");
        setResizable(false);

        tPrioridad.setBackground(new java.awt.Color(252, 249, 249));
        tPrioridad.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tPrioridad.setDisabledTextColor(new java.awt.Color(252, 249, 249));
        tPrioridad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tPrioridadActionPerformed(evt);
            }
        });
        tPrioridad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                verificarString(evt);
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

        lAgregar.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lAgregar.setText("Agregar ofertas");

        tDescripcion.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tDescripcion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                verificarString(evt);
            }
        });

        tProductos.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tProductos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tProductosKeyTyped(evt);
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
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lPrioridad)
                            .addComponent(lDescuento)
                            .addComponent(lDescripcion)
                            .addComponent(lProductos))
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tPrioridad, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
                            .addComponent(tDescripcion)
                            .addComponent(tProductos)
                            .addComponent(tPrecio)))
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
                    .addComponent(lDescripcion)
                    .addComponent(tDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lDescuento)
                    .addComponent(tPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lProductos)
                    .addComponent(tProductos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tPrioridad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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

    private void tPrioridadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tPrioridadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tPrioridadActionPerformed

    private void bCrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bCrearActionPerformed
        String descripcion = tDescripcion.getText(); 
        boolean prioridad;
        if(tPrioridad.getText().equalsIgnoreCase("alta")){
            prioridad = true;
        }else{
            prioridad = false;
        }
        descuento = Float.parseFloat(tPrecio.getText());
        
        if(tDescripcion.getText().equals("")||tPrecio.getText().equals("")||tProductos.getText().equals("")||tPrioridad.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Error, rellene todos los campos solicitados", "Error en el ingreso de datos", JOptionPane.ERROR_MESSAGE);
            
        }else{
            if(validarProductos()&&(tPrioridad.getText().equals("alta")||tPrioridad.getText().equals("baja"))){
                Oferta nueva = new Oferta(descripcion,descuento, new ListaCircularSimple(),prioridad);
                agregarProductos(nueva);
                dato.getOfertas().agregar(nueva, nueva.isPrioridad());
                JOptionPane.showMessageDialog(null, "Oferta credad con éxito","Creación de oferta",JOptionPane.INFORMATION_MESSAGE);
                vOferta ventana = new vOferta();
                ventana.setVisible(true);
                this.dispose();                
                
            }else if(!validarProductos()){
                JOptionPane.showMessageDialog(null, "Error, algún producto está mal escrito o no existe", "Error en el ingreso de datos", JOptionPane.ERROR_MESSAGE);
            }else{
                JOptionPane.showMessageDialog(null, "Error, prioridad mal ingresada o no existe", "Error en el ingreso de datos", JOptionPane.ERROR_MESSAGE);
            }
            
            
        }
        
    }//GEN-LAST:event_bCrearActionPerformed

    private void bCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bCancelarActionPerformed
        vOferta ventana = new vOferta();
        ventana.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_bCancelarActionPerformed

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

    private void tProductosKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tProductosKeyTyped
      char caracter = evt.getKeyChar();

      // Verificar dígitos
      if((((int)caracter < 97) || ((int)caracter > 122))
          && ((int)caracter!=44)){
          evt.consume();  // ignorar
                      
      }else{
           
      }
    }//GEN-LAST:event_tProductosKeyTyped

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
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel lAgregar;
    private javax.swing.JLabel lDescripcion;
    private javax.swing.JLabel lDescuento;
    private javax.swing.JLabel lPrioridad;
    private javax.swing.JLabel lProductos;
    private javax.swing.JTextField tDescripcion;
    private javax.swing.JTextField tPrecio;
    private javax.swing.JTextField tPrioridad;
    private javax.swing.JTextField tProductos;
    // End of variables declaration//GEN-END:variables
    private Nodo auxiliar = new Nodo();
    private Dato dato = new Dato();
    private Producto producto = new Producto();
    private float descuento;
    
    
    /**
     * Valida productos que los productos a aplicarles una oferta existan
     */    
    private boolean validarProductos(){
        descuento = Float.parseFloat(tPrecio.getText());
        boolean validar = false;
        boolean existe = true;
        String p = tProductos.getText();
        String m[]=p.split(",");
        int tamaño=m.length;
        int contador=0;
        int contador2=0;        
        try{

            auxiliar = dato.getProductos().getPrimero();
            contador = dato.getProductos().getTamaño();
            producto = (Producto) auxiliar.getInfo();
            for(int i=0;i<tamaño;i++){
                while(contador2<=contador){
                    System.out.println(m[i]);
                    if(m[i].equalsIgnoreCase(producto.getNombre())){
                        validar=true;
                        break;
                    }else{
                        validar=false;
                    }
                    contador2++;
                    auxiliar=auxiliar.getSiguiente();
                    producto= (Producto) auxiliar.getInfo(); 
                    if(contador2==5 &&validar==false){
                        existe=false;
                    }
                }
                if(!existe){
                    break;
                }
                contador2=0;

            }
            
        }catch(Exception e){
            validar = false;
            
        }       
        return validar;
    }

    /**
     * Agrega los productos existentes a la lista de la oferta a crear
     */    
    private void agregarProductos(Oferta oferta){
        String m[]=tProductos.getText().split(",");
        int tamaño=m.length;
        int contador=0;
        int contador2=0;        
        try{
            auxiliar = dato.getProductos().getPrimero();
            contador = dato.getProductos().getTamaño();
            producto = (Producto) auxiliar.getInfo();
            for(int i=0;i<tamaño;i++){
                while(contador2<contador){
                    System.out.println(m[i]);
                    if(m[i].equalsIgnoreCase(producto.getNombre())){
                        producto.setPrecioAnterior(producto.getPrecio());
                        producto.setPrecio(producto.getPrecio()-(producto.getPrecio()*(descuento*0.01f)));
                        System.out.println(producto.getPrecio());
                        System.out.println(producto.getPrecioAnterior());                        
                        oferta.getProductos().agregar(producto);

                    }else{
                    }
                    contador2++;
                    auxiliar=auxiliar.getSiguiente();
                    producto= (Producto) auxiliar.getInfo(); 

                }
                contador2=0;
            }            
        }catch(Exception e){            
        }
        System.out.println(oferta.getProductos().mostrar());
       
    }
}
