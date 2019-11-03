
package clases.estructuras;


public class Pila {
    private Nodo cima;
    private int tamaño; 


    /**
     * Determina si la pila esta vacía
     * @return si la pila esta vacía
     */    
    public boolean estaVacia(){
        return cima==null;
    }


    /**
     * Agrega un elemento a la pila
     * @param info el elemento a agregar en la pila
     */    
    public void agregar(Object info){
        Nodo nuevo = new Nodo(info);
        nuevo.setSiguiente(cima);
        cima = nuevo;
        tamaño++;
    }


    /**
     * Retorna el último elemento ingresado en la pila
     * @return el último elemento ingresao en la pila
     */    
    public Object sacarPila(){
        Object auxiliar = cima.getInfo();
        cima = cima.getSiguiente();
        tamaño--;
        return auxiliar;
    }

    /**
     * Retorna la cima de la pila
     * @return la cima de la pila
     */    
    public Object obtenerCima(){
        return cima.getInfo();
    }
    
    
    /**
     * Imprime toda la información guardada dentro de la pila
     */    
    public void mostrarPila(){
        Nodo recorrer=cima;
        while(recorrer!=null){
            System.out.println(recorrer.getInfo().toString());
            recorrer = recorrer.getSiguiente();
        }
    }

    
    /**
     * Busca y retorna un nodo con el objeto buscado
     * @param info el objeto a buscar dentro de la pila
     * @return el nodo que contiene el objeto buscado
     */
    public Nodo buscar(Object info){
        Nodo auxiliar = cima;
        Nodo vacio = new Nodo();
        boolean encontrado = false;
        vacio.setInfo("Esta información no existe");
        if(cima !=null){
            while(auxiliar!=null){
                if(auxiliar.getInfo()==info){
                    encontrado = true;
                    break;
                }
                auxiliar = auxiliar.getSiguiente();
            }
        }else{
            encontrado = false;
        }
        if(encontrado) {
            System.out.println("Encontrado");      
            return auxiliar;
        } else{
            System.out.println("No encontrado");
            return vacio;
        }
 
    }


    /**
     * Elmina un objeto guardado en la pila
     * @param info el objeto a elminar
     */    
    public void eliminar(Object info){
        Nodo auxiliar = cima;
        Nodo anterior = null;
        boolean encontrado = false;
        
        if(cima!=null){
            while(auxiliar!=null &&!encontrado){
                if(auxiliar.getInfo()==info){
                    if(auxiliar==cima){
                        cima=cima.getSiguiente();
                    }else{
                        anterior.setSiguiente(auxiliar.getSiguiente());
                    }
                    encontrado = true;
                    tamaño--;
                }
                anterior = auxiliar;
                auxiliar = auxiliar.getSiguiente();
            }
        } 
        
    }


    /**
     * Devuelve un booleano que determina la existencia del objeto
     * @param info el objeto a verificar dentro la pila
     * @return el nodo a evaluar 
     */    
    public boolean existe(Object info){
        Nodo auxiliar = cima;
        boolean encontrado = false;
        if(cima !=null){
            while(auxiliar!=null){
                if(auxiliar.getInfo()==info){
                    encontrado = true;
                    break;
                }
                auxiliar = auxiliar.getSiguiente();
            }
        }else{
            encontrado = false;
        }
        return encontrado;
    }

    /**
     * Retorna el tamaño de la pila
     * @return el tamaño de la pila
     */
    public int getTamaño() {
        return tamaño;
    }
}
