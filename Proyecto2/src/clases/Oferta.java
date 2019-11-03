
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
     * Retorna la descrición de la oferta
     * @return la descripción de la oferta
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * Retorna el descuento de la oferta
     * @return el descuento de la oferta
     */
    public float getDescuento() {
        return descuento;
    }

    /**
     * Retorna la lista de productos que contienen la oferta
     * @return la lista con los productos que tiene la ferta
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
     * Retorna la prioridad de la oferta en un booleano
     * @return la prioridad de la oferta
     */
    public boolean isPrioridad() {
        return prioridad;
    }

    /**
     * Configura la prioridad de la oferta con un booleano
     * @param prioridad la prioridad de la oferta
     */
    public void setPrioridad(boolean prioridad) {
        this.prioridad = prioridad;
    }


    /**
     * Genera el id de cada oferta creada
     */    
    private void generarId(){
        id = "ofer"+contador;
        contador++;
    }

    /**
     * Retorna el id de la oferta creada
     * @return el id de la oferta creada
     */
    public String getId() {
        return id;
    }
    
}
