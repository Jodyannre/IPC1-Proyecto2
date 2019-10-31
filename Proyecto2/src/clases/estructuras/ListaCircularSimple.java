/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases.estructuras;

import clases.Producto;
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
        if(getPrimero()==null){
            primero=nuevo;
            ultimo=getPrimero();
            getPrimero().setSiguiente(getUltimo());
        }else{
            getUltimo().setSiguiente(nuevo);
            nuevo.setSiguiente(getPrimero());
            ultimo = nuevo;
        }
        tamaño++;
    }

    /**
    * Imprime la información dentro de todos los nodos
     * @return 
    */    
    public String mostrar(){
        Nodo auxiliar= getPrimero();
        Producto producto = new Producto();
        String p="";
        if(getPrimero()!=null){
            do{
               System.out.println(auxiliar.getInfo().toString());
               producto = (Producto)auxiliar.getInfo();
               p = p+producto.getNombre()+",";
               auxiliar = auxiliar.getSiguiente();
            }while(auxiliar!=getPrimero());            
        }else{
            System.out.println("No existe información");
        }
        return p;
    }

    /**
    * Método que retorna el nodo buscado.
     * @param info información del nodo a buscar
     * @return el nodo buscado
    */    
    public Nodo buscar(Object info){
        Nodo auxiliar = getPrimero();
        Nodo vacio = new Nodo();
        vacio.setInfo("Valor inexistente");
        
        boolean encontrado=false;
        if(getPrimero()!=null){
            do{
                if(auxiliar.getInfo()==info){
                    encontrado=true;
                    break;
                }

               auxiliar = auxiliar.getSiguiente();
            }while(auxiliar!=getPrimero());             
        }else{
            System.out.println("No existe información");
        }
        
        if(!encontrado)return vacio;
        else return auxiliar;

    }
    
    /**
    * Este método modifica la información dentro de un nodo.
     * @param info la información del nodo actual
     * @param nueva la nueva información que tendrá el nodo
    */    
    public void modificar(Object info, Object nueva){
        Nodo auxiliar = getPrimero();
        
        do{
            if(auxiliar.getInfo()==info){
                auxiliar.setInfo(nueva);
                return;
            }
            auxiliar = auxiliar.getSiguiente();
            
        }while(auxiliar!=getPrimero());       
    }
    
    /**
    * Este método determinar si existe el producto ingresado.
     * @param info la información guardada en el nodo
     * @return un booleano que determina la existencia del nodo
    */
    public boolean existe(Object info){
        
        Nodo auxiliar = getPrimero();
        boolean existe=false;
        if(getPrimero()!=null){
            do{
                if(auxiliar.getInfo()==info){
                    existe=true;
                    break;
                }
                auxiliar = auxiliar.getSiguiente();

            }while(auxiliar!=getPrimero());             
        } else{
            System.out.println("No existe información");
        }        
        return existe;
    }
    

    /**
    * Determina si la lista esta vacia.
     * @return un booleano que determina si la lista esta vacia
    */    
    public boolean estaVacia(){
        return getPrimero()==null;
    }
    
    public void eliminar(Object info){
        Nodo auxiliar = getPrimero();
        Nodo anterior = getUltimo();
        
        if(getPrimero()!=null){
            do{
                if(auxiliar.getInfo()==info){   
                    if(auxiliar==getPrimero()){
                        primero = getPrimero().getSiguiente();
                        anterior.setSiguiente(getPrimero());
                    }else if(auxiliar == getUltimo()){
                        anterior.setSiguiente(getUltimo().getSiguiente());
                        ultimo = anterior;
                    }else{
                        anterior.setSiguiente(auxiliar.getSiguiente());
                    }
                    tamaño--;
                }
               anterior = auxiliar; 
               auxiliar = auxiliar.getSiguiente();

            }while(auxiliar!=getPrimero());            
        }else{
            System.out.println("No existe información");
        }
        
    }

    /**
     * @return el tamaño de la lista
     */
    public int getTamaño() {
        return tamaño;
    }

    /**
     * @return the primero
     */
    public Nodo getPrimero() {
        return primero;
    }

    /**
     * @return the ultimo
     */
    public Nodo getUltimo() {
        return ultimo;
    }
    
}
