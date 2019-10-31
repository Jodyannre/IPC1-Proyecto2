
package clases;

import clases.estructuras.ListaCircularSimple;


public class Oferta {
    private String descripcion, id;
    private boolean prioridad;
    private float descuento;
    private ListaCircularSimple productos;
    private static int contador=0;
    
    
    public Oferta(String descripcion, float descuento, ListaCircularSimple productos,boolean prioridad){
        this.descripcion=descripcion;
        this.descuento=descuento;
        this.productos=productos;
        this.prioridad=prioridad;
        generarId();
    }
    
    public Oferta(){
        
    }
    
    /**
     * @return the descripcion
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * @return the descuento
     */
    public float getDescuento() {
        return descuento;
    }

    /**
     * @return the productos
     */
    public ListaCircularSimple getProductos() {
        return productos;
    }
    
    /**
     * Método que actualiza el descuento en los productos asignados
     */
    public void actualizarDescuento(){
        
    }

    /**
     * @return the prioridad
     */
    public boolean isPrioridad() {
        return prioridad;
    }

    /**
     * @param prioridad the prioridad to set
     */
    public void setPrioridad(boolean prioridad) {
        this.prioridad = prioridad;
    }
    
    private void generarId(){
        id = "ofer"+contador;
        contador++;
    }

    /**
     * @return the id
     */
    public String getId() {
        return id;
    }
    
}
