
package clases.estructuras;


public class Pila {
    private Nodo cima;
    private int tamaño; 
    
    public boolean estaVacia(){
        return cima==null;
    }
    
    public void agregar(Object info){
        Nodo nuevo = new Nodo(info);
        nuevo.setSiguiente(cima);
        cima = nuevo;
        tamaño++;
    }
    
    public Object sacarPila(){
        Object auxiliar = cima.getInfo();
        cima = cima.getSiguiente();
        tamaño--;
        return auxiliar;
    }
    
    public Object obtenerCima(){
        return cima.getInfo();
    }
    
    public void mostrarPila(){
        Nodo recorrer=cima;
        while(recorrer!=null){
            System.out.println(recorrer.getInfo().toString());
            recorrer = recorrer.getSiguiente();
        }
    }

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
     * @return el tamaño de la pila
     */
    public int getTamaño() {
        return tamaño;
    }
}
