
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
        return getInicio()==null;
    }
    
    //Prioridades
    //1--Máxima prioridad y 2 mínima prioridad  
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
    
    public void mostrarCola(){
        Nodo auxiliar = getInicio();
        while(auxiliar!=null){
            System.out.println(auxiliar.getInfo().toString());
            auxiliar=auxiliar.getSiguiente();    
        }
    }
    
    public Object inicio(){
        return getInicio().getInfo();
    }
    
    public int tamaño(){
        return getTamaño();
    }
    
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
     * @return the inicio
     */
    public Nodo getInicio() {
        return inicio;
    }

    /**
     * @return the fin
     */
    public Nodo getFin() {
        return fin;
    }

    /**
     * @return the tamaño
     */
    public int getTamaño() {
        return tamaño;
    }

    /**
     * @return the prioridad
     */
    public int getPrioridad() {
        return prioridad;
    }
    
}
