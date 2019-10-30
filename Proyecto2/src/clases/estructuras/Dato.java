
package clases.estructuras;


public class Dato {
    private static final ListaSimple usuarios = new ListaSimple();
    private static final ListaCircularSimple productos = new ListaCircularSimple();

    /**
     * @return the usuarios
     */
    public ListaSimple getUsuarios() {
        return usuarios;
    }

    /**
     * @return the productos
     */
    public ListaCircularSimple getProductos() {
        return productos;
    }
  
}