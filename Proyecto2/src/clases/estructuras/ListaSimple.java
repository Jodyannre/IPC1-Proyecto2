/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases.estructuras;

import java.util.HashSet;

public class ListaSimple {
    private Nodo cabeza;
    private int tamaño;
    
    public ListaSimple(){
        cabeza=null;
    }
    
    public void insertar(Object info){
        Nodo nuevo = new Nodo(info);
        if(cabeza==null){
            cabeza=nuevo;
        }else{
            Nodo auxiliar = cabeza;
            while(auxiliar.getSiguiente()!=null){
                auxiliar=auxiliar.getSiguiente();    
            }
            auxiliar.setSiguiente(nuevo);
        }
    }
    
    public void eliminar(Object info){
        if(cabeza.getInfo().equals(info)){
            cabeza=cabeza.getSiguiente();
        }else{
            Nodo auxiliar = cabeza;
            while(!auxiliar.getInfo().equals(info)){
                auxiliar=auxiliar.getSiguiente();
            }
            auxiliar.setSiguiente(auxiliar.getSiguiente().getSiguiente());   
        }
    }
    
}
