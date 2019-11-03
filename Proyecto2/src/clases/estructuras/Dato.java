
package clases.estructuras;


public class Dato {
    private static final ListaSimple usuarios = new ListaSimple();
    private static final ListaCircularSimple productos = new ListaCircularSimple();
    private static final ColaPrioridad ofertas = new ColaPrioridad();

    /**
     * Retorna la lista simple de usuario
     * @return la lista simple de usuarios
     */
    public ListaSimple getUsuarios() {
        return usuarios;
    }

    /**
     * Retorna la lista circular simple de productos
     * @return la lista circular simple de productos
     */
    public ListaCircularSimple getProductos() {
        return productos;
    }

    /**
     * Retorna la cola de prioridad de las ofertas
     * @return la cola de prioridad de las ofertas
     */
    public ColaPrioridad getOfertas() {
        return ofertas;
    }
  
}
