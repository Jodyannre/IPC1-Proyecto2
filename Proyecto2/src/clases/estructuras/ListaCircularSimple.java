/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases.estructuras;

import java.util.HashSet;
import java.util.Set;

public class ListaCircularSimple {
    private Nodo primero;
    private Nodo ultimo;
    private int tamaño;
    
    public ListaCircularSimple(){
        primero = null;
        ultimo = null;
    }

    /**
    * Agrega un nuevo nodo
     * @param info la información que contendrá el nodo a crear
    */    
    public void agregar(Object info){
        Nodo nuevo = new Nodo();
        nuevo.setInfo(info);
        if(primero==null){
            primero=nuevo;
            ultimo=primero;
            primero.setSiguiente(ultimo);
        }else{
            ultimo.setSiguiente(nuevo);
            nuevo.setSiguiente(primero);
            ultimo = nuevo;
        }
        tamaño++;
    }

    /**
    * Imprime la información dentro de todos los nodos
    */    
    public void mostrar(){
        Nodo auxiliar= primero;
        do{
           System.out.println(auxiliar.getInfo().toString());
           auxiliar = auxiliar.getSiguiente();
        }while(auxiliar!=primero);
    }

    /**
    * Método que retorna el nodo buscado.
     * @param info información del nodo a buscar
     * @return el nodo buscado
    */    
    public Nodo buscar(Object info){
        Nodo auxiliar = primero;
        Nodo vacio = new Nodo();
        vacio.setInfo("Valor inexistente");
        
        boolean encontrado=false;
        do{
            if(auxiliar.getInfo()==info){
                encontrado=true;
                break;
            }
            
           auxiliar = auxiliar.getSiguiente();
        }while(auxiliar!=primero); 
        
        if(!encontrado)return vacio;
        else return auxiliar;

    }
    
    /**
    * Este método modifica la información dentro de un nodo.
     * @param info la información del nodo actual
     * @param nueva la nueva información que tendrá el nodo
    */    
    public void modificar(Object info, Object nueva){
        Nodo auxiliar = primero;
        
        do{
            if(auxiliar.getInfo()==info){
                auxiliar.setInfo(nueva);
                return;
            }
            auxiliar = auxiliar.getSiguiente();
            
        }while(auxiliar!=primero);       
    }
    
    /**
    * Este método determinar si existe el producto ingresado.
     * @param info la información guardada en el nodo
     * @return un booleano que determina la existencia del nodo
    */
    public boolean existe(Object info){
        
        Nodo auxiliar = primero;
        boolean existe=false;
        do{
            if(auxiliar.getInfo()==info){
                existe=true;
                break;
            }
            auxiliar = auxiliar.getSiguiente();
            
        }while(auxiliar!=primero);         
        return existe;
    }
    

    /**
    * Determina si la lista esta vacia.
     * @return un booleano que determina si la lista esta vacia
    */    
    public boolean estaVacia(){
        return primero==null;
    }
    
    public void eliminar(Object info){
        Nodo auxiliar = primero;
        Nodo anterior = ultimo;
        
        do{
            if(auxiliar.getInfo()==info){   
                if(auxiliar==primero){
                    primero = primero.getSiguiente();
                    anterior.setSiguiente(primero);
                }else if(auxiliar == ultimo){
                    anterior.setSiguiente(ultimo.getSiguiente());
                    ultimo = anterior;
                }else{
                    anterior.setSiguiente(auxiliar.getSiguiente());
                }
                tamaño--;
            }
           anterior = auxiliar; 
           auxiliar = auxiliar.getSiguiente();

        }while(auxiliar!=primero);
        
    }

    /**
     * @return el tamaño de la lista
     */
    public int getTamaño() {
        return tamaño;
    }
    
}
