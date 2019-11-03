/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases.estructuras;


public final class Nodo {
    private Object info;
    private Nodo siguiente;
    private int prioridad;
    
    public Nodo(Object info){
        setSiguiente(null);
        setInfo(info);
    }
    

    public Nodo(){
       
    }    

    /**
     * Retorna el objeto a guardar dentro del nodo
     * @return el objeto a guardar dentro del nodo
     */
    public Object getInfo() {
        return info;
    }

    /**
     * Configura el objeto a guardar dentro del nodo
     * @param info el objeto a guardar dentro del nodo
     */
    public void setInfo(Object info) {
        this.info = info;
    }

    /**
     * Retorna el nodo siguiente
     * @return el nodo siguiente
     */
    public Nodo getSiguiente() {
        return siguiente;
    }

    /**
     * Configura el nodo siguiente
     * @param siguiente el nodo siguiente
     */
    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }

    /**
     * Retorna la prioridad del nodo
     * @return la prioridad del nodo
     */
    public int getPrioridad() {
        return prioridad;
    }

    /**
     * Configura la prioridad del nodo
     * @param prioridad la prioridad del nodo
     */
    public void setPrioridad(int prioridad) {
        this.prioridad = prioridad;
    }
}
