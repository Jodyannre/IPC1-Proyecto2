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
    
//    public Nodo(Object info, int prioridad){
//        setSiguiente(null);
//        setInfo(info); 
//        setPrioridad(prioridad);
//    }
    public Nodo(){
       
    }    

    /**
     * @return the info
     */
    public Object getInfo() {
        return info;
    }

    /**
     * @param info the info to set
     */
    public void setInfo(Object info) {
        this.info = info;
    }

    /**
     * @return the siguiente
     */
    public Nodo getSiguiente() {
        return siguiente;
    }

    /**
     * @param siguiente the siguiente to set
     */
    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }

    /**
     * @return the prioridad
     */
    public int getPrioridad() {
        return prioridad;
    }

    /**
     * @param prioridad the prioridad to set
     */
    public void setPrioridad(int prioridad) {
        this.prioridad = prioridad;
    }
}
