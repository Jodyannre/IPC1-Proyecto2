
package clases;


public class Producto {
    private String id, nombre, descripcion, imagen;
    private float precio, precioAnterior;
    private int existencia;
    private boolean prioridad;
    private static int contador;
    
    public Producto(String nombre, String descripcion, String imagen, float precio, int existencia){
        setId();
        this.nombre=nombre;
        this.descripcion=descripcion;
        this.imagen=imagen;
        this.precio=precio;
        this.existencia=existencia;
        precioAnterior=precio;
        prioridad=false;        
    }
    public Producto(){
        
    }

    /**
     * Retorna el id del producto
     * @return el Id del producto
     */
    public String getId() {
        return id;
    }

    /**
     * Método que genera el id de cada producto creado
     */
    private void setId() {
       this.id = "prod"+contador;
       contador++;
    }

    /**
     * Retorna el nombre del producto
     * @return el nombre del producto
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Configura el nombre del producto
     * @param nombre el nombre del producto
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Retorna la descripción del producto
     * @return la descripción del producto
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * Configura la descripción del producto
     * @param descripcion la descripción del producto
     */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    /**
     * Retorna la dirección de la imagen del producto
     * @return la dirección de la imagen del producto
     */
    public String getImagen() {
        return imagen;
    }

    /**
     * Configura la dirección de la imagen del producto
     * @param imagen la dirección de la imagen del producto
     */
    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    /**
     * Retorna el precio del producto
     * @return el precio del producto
     */
    public float getPrecio() {
        return precio;
    }

    /**
     * Configura el precio del producto
     * @param precio el precio del producto
     */
    public void setPrecio(float precio) {
        this.precio = precio;
    }

    /**
     * Retorna el descuento aplicado al producto
     * @return el descuento apliado al producto
     */
    public float getPrecioAnterior() {
        return precioAnterior;
    }

    /**
     * Configura el descuento aplicado al producto
     * @param descuento el descuento aplicado al producto
     */
    public void setPrecioAnterior(float descuento) {
        this.precioAnterior = descuento;
    }

    /**
     * Retorna el total de productos en existencia
     * @return el total de productos en existencia
     */
    public int getExistencia() {
        return existencia;
    }

    /**
     * Configura el total de productos en existencia
     * @param existencia el total de productos en existencia
     */
    public void setExistencia(int existencia) {
        this.existencia = existencia;
    }

    /**
     * Retorna la prioridad del producto
     * @return la prioridad del producto
     */
    public boolean isPrioridad() {
        return prioridad;
    }

    /**
     * Configura la prioridad del producto
     * @param prioridad la prioridad del producto
     */
    public void setPrioridad(boolean prioridad) {
        this.prioridad = prioridad;
    }
    
    
}
