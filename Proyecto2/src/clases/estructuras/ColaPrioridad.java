
package clases.estructuras;


public class ColaPrioridad {
    private Nodo inicio, fin;
    private int tamaño;
    private int prioridad;
    
    public ColaPrioridad(){
        inicio=null;
        fin = null;
    }
    public boolean estaVacia(){
        return inicio==null;
    }
    
    //Prioridades
    //1--Máxima prioridad y 2 mínima prioridad  
    public void agregar(Object info, boolean prioridad){
        Nodo nuevo = new Nodo(info);
        if(estaVacia()){
            inicio=nuevo;
            fin = nuevo;
        }else if(!prioridad){
            fin.setSiguiente(nuevo);
            fin=nuevo;
        }else{
            nuevo.setSiguiente(inicio);
            inicio=nuevo;
            
        }        
        tamaño++;
    }    
  
    
    public Object sacarCola(){
        if(inicio!=null){
            Object auxiliar = inicio.getInfo();
            inicio = inicio.getSiguiente();
            tamaño--;
            return auxiliar;            
        }else{
            System.out.println("No existe información");
            return null;
        }

    }
    
    public void mostrarCola(){
        Nodo auxiliar = inicio;
        while(auxiliar!=null){
            System.out.println(auxiliar.getInfo().toString());
            auxiliar=auxiliar.getSiguiente();    
        }
    }
    
    public Object inicio(){
        return inicio.getInfo();
    }
    
    public int tamaño(){
        return tamaño;
    }
    
    public boolean existe(Object info){
        Nodo auxiliar=inicio;
        boolean encontrado = false;
        
        if(inicio!=null){
            while(auxiliar!=null){
                if(auxiliar.getInfo()==info){
                    encontrado=true;
                    break;
                }
                auxiliar=auxiliar.getSiguiente();
            }
        }
        
        
        return encontrado;
    }
    
    public void eliminar(Object info){
        Nodo auxiliar=inicio;
        Nodo anterior=null;
        if(inicio!=null){
            while(auxiliar!=null){
                if(auxiliar.getInfo()==info){
                    if(auxiliar ==inicio && auxiliar==fin){
                        inicio = auxiliar.getSiguiente();
                        fin = auxiliar.getSiguiente();                        
                    }else if(auxiliar==inicio){
                        inicio = auxiliar.getSiguiente();
                    }else if(auxiliar==fin){
                        fin = anterior;
                        fin.setSiguiente(null);                        
                    }else{
                        
                    }
                    tamaño--;
                    return;
                }
                anterior=auxiliar;
                auxiliar=auxiliar.getSiguiente();
            }
        } 
        
    }
    
}
