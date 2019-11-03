/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases.estructuras;


public class ListaSimple {
    private Nodo cabeza;
    private int tamaño;
    
    public ListaSimple(){
        cabeza=null;
    }


    /**
     * Agrega un objeto a la lista
     * @param info el objeto a agregar en la lista
     */    
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


    /**
     * Elimina un objeto guardado en la lista
     * @param info el objeto a eliminar de la lista
     */    
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
 
    
    /**
     * Determina la existencia de un objeto dentro de la lista
     * @param info el objeto a buscar dentro de la lista
     * @return la existencia del objeto buscado
     */    
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


    /**
     * Busca un objeto dentro de la lista
     * @param info el objeto a buscar en la lista
     * @return el nodo que contiene la información solicitada
     */    
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
     * Retorna el nodo cabeza
     * @return el nodo cabeza
     */
    public Nodo getCabeza() {
        return cabeza;
    }

    /**
     * Retorna el tamaño de la lista
     * @return el tamaño de la lista
     */
    public int getTamaño() {
        return tamaño;
    }

    /**
     * Imprime toda la información guardada en la lista
     */    
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
