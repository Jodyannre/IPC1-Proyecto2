
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
     * @return the id
     */
    public String getId() {
        return id;
    }


    private void setId() {
       this.id = "prod"+contador;
       contador++;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the descripcion
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * @param descripcion the descripcion to set
     */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    /**
     * @return the imagen
     */
    public String getImagen() {
        return imagen;
    }

    /**
     * @param imagen the imagen to set
     */
    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    /**
     * @return the precio
     */
    public float getPrecio() {
        return precio;
    }

    /**
     * @param precio the precio to set
     */
    public void setPrecio(float precio) {
        this.precio = precio;
    }

    /**
     * @return the descuento
     */
    public float getPrecioAnterior() {
        return precioAnterior;
    }

    /**
     * @param descuento the descuento to set
     */
    public void setPrecioAnterior(float descuento) {
        this.precioAnterior = descuento;
    }

    /**
     * @return the existencia
     */
    public int getExistencia() {
        return existencia;
    }

    /**
     * @param existencia the existencia to set
     */
    public void setExistencia(int existencia) {
        this.existencia = existencia;
    }

    /**
     * @return the prioridad
     */
    public boolean isPrioridad() {
        return prioridad;
    }

    /**
     * @param prioridad the prioridad to set
     */
    public void setPrioridad(boolean prioridad) {
        this.prioridad = prioridad;
    }
    
    
}
