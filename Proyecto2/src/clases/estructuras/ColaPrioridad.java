
package clases.estructuras;


public class ColaPrioridad {
    private Nodo inicio, fin;
    private int tamaño;
    private int prioridad;


    public ColaPrioridad(){
        inicio=null;
        fin = null;
    }
    
    /**
     * Retorna un booleano que indica el estado de la lista, ya sea vacia o no
     * @return si la cola esta vacía
     */    
    public boolean estaVacia(){
        return getInicio()==null;
    }
    
    //Prioridades
    //1--Máxima prioridad y 2 mínima prioridad  
    /**
     * Método que agrega un objeto dentro de la cola
     * @param info el objeto a agregar en la cola
     * @param prioridad la prioridad que contiene el objeto a agregar en la cola
     */    
    public void agregar(Object info, boolean prioridad){
        Nodo nuevo = new Nodo(info);
        if(estaVacia()){
            inicio=nuevo;
            fin = nuevo;
        }else if(!prioridad){
            getFin().setSiguiente(nuevo);
            fin=nuevo;
        }else{
            nuevo.setSiguiente(getInicio());
            inicio=nuevo;
            
        }        
        tamaño++;
    }    
  
    /**
     * Método que retorna el último elemento agregado en la cola
     * @return el nodo inicial de la cola
     */    
    public Nodo sacarCola(){
        if(getInicio()!=null){
            Nodo auxiliar = getInicio();
            inicio = getInicio().getSiguiente();
            tamaño--;
            return auxiliar;            
        }else{
            System.out.println("No existe información");
            return null;
        }

    }


    /**
     * Método que imprime la información de todos los nodos en la cola
     */    
    public void mostrarCola(){
        Nodo auxiliar = getInicio();
        while(auxiliar!=null){
            System.out.println(auxiliar.getInfo().toString());
            auxiliar=auxiliar.getSiguiente();    
        }
    }


    /**
     * Retorna el nodo incial
     * @return el nodo inicial
     */    
    public Object inicio(){
        return getInicio().getInfo();
    }
    
    
    /**
     * Retorna el tamaño de la cola
     * @return el tamaño de la cola
     */    
    public int tamaño(){
        return getTamaño();
    }
    
    
    /**
     * Método que evalua la existencia del objeto dentro de la cola
     * @param info el objeto a evaluar
     * @return si el objeto existe dentro de la cola
     */    
    public boolean existe(Object info){
        Nodo auxiliar=getInicio();
        boolean encontrado = false;
        
        if(getInicio()!=null){
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


    /**
     *  Método que elimina un nodo
     * @param info el objeto a guardar en la cola
     */
    
    public void eliminar(Object info){
        Nodo auxiliar=getInicio();
        Nodo anterior=null;
        if(getInicio()!=null){
            while(auxiliar!=null){
                if(auxiliar.getInfo()==info){
                    if(auxiliar ==getInicio() && auxiliar==getFin()){
                        inicio = auxiliar.getSiguiente();
                        fin = auxiliar.getSiguiente();                        
                    }else if(auxiliar==getInicio()){
                        inicio = auxiliar.getSiguiente();
                    }else if(auxiliar==getFin()){
                        fin = anterior;
                        getFin().setSiguiente(null);                        
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

    /**
     * Retorna el nodo inicial
     * @return el nodo inicial
     */
    public Nodo getInicio() {
        return inicio;
    }

    /**
     * Retorna el nodo final
     * @return el nodo final
     */
    public Nodo getFin() {
        return fin;
    }

    /**
     * Retorna el tamaño de la cola
     * @return el tamaño de la cola
     */
    public int getTamaño() {
        return tamaño;
    }

    /**
     * Retorna la prioridad del nodo
     * @return la prioridad del nodo
     */
    public int getPrioridad() {
        return prioridad;
    }
    
}
