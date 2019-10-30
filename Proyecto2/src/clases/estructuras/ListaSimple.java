/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases.estructuras;

import clases.Cliente;



public class ListaSimple {
    private Nodo cabeza;
    private int tamaño;
    
    public ListaSimple(){
        cabeza=null;
    }
    
    public void agregar(Object info){
        Nodo nuevo = new Nodo(info);
        if(getCabeza()==null){
            cabeza=nuevo;
        }else{
            Nodo auxiliar = getCabeza();
            while(auxiliar.getSiguiente()!=null){
                auxiliar=auxiliar.getSiguiente();    
            }
            auxiliar.setSiguiente(nuevo);
        }
        tamaño++;
    }
    
    public void eliminar(Object info){
        if(getCabeza().getInfo().equals(info)){
            cabeza=getCabeza().getSiguiente();
            tamaño--;
        }else{
            Nodo auxiliar = getCabeza();
            while(!auxiliar.getInfo().equals(info)){
                auxiliar=auxiliar.getSiguiente();
            }
            auxiliar.setSiguiente(auxiliar.getSiguiente().getSiguiente()); 
            tamaño--;
        }
    }
    
    public boolean existe(Object info){
        boolean encontrado = false;
        Nodo auxiliar = getCabeza();
        if(getCabeza()!=null){
            do{
                if(auxiliar.getInfo()==info){
                    encontrado=true;
                    break;
                }
                auxiliar=auxiliar.getSiguiente();
                
            }while(auxiliar!=null);
        }
        
        return encontrado;
    }
    
    public Nodo buscar(Object info){
        Nodo auxiliar = getCabeza();
        Nodo vacio = new Nodo();
        vacio.setInfo("No hay información");
        if(getCabeza()!=null){
            do{
                if(auxiliar.getInfo()==info){
                    return auxiliar;
                }
                auxiliar=auxiliar.getSiguiente();
                
            }while(auxiliar!=null);
        }        
        
        return vacio;
    }

    /**
     * @return the cabeza
     */
    public Nodo getCabeza() {
        return cabeza;
    }

    /**
     * @return the tamaño
     */
    public int getTamaño() {
        return tamaño;
    }
    
    public void mostrar(){
        Nodo auxiliar = cabeza;
        if(cabeza != null){
            while(auxiliar!=null){
                System.out.println(auxiliar.getInfo().toString());
                auxiliar=auxiliar.getSiguiente();
            }
        }else{
            System.out.println("No existe información");
        }
        
    }
    
    
}
