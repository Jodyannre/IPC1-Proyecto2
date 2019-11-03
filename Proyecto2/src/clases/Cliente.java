
package clases;


public class Cliente extends Usuario {
    private String nombreC,correo,tarjeta;
    private boolean tipoC;
    private int contadorCompras;
    private Carrito carrito;
    
    public Cliente(String nombreU, char pass[], String nombreC, String correo, String tarjeta){
        this.nombreU=nombreU;
        this.pass=String.valueOf(pass);
        this.nombreC=nombreC;
        this.correo=correo;
        this.tarjeta=tarjeta;
        contadorCompras=0;
        tipoC = false;
        carrito= new Carrito();
    }
    public Cliente(){
        
    }
    
    /**
     * Método heredado sin funcionalidad
     */   
    @Override 
    public void metodo() {
        }

    /**
     * Retorna el nombre del cliente
     * @return el nombre del cliente
     */
    public String getNombreC() {
        return nombreC;
    }

    /**
     * Configura el nombre del cliente
     * @param nombreC el nombre del cliente
     */
    public void setNombreC(String nombreC) {
        this.nombreC = nombreC;
    }

    /**
     * Retorna la dirección de correo del cliente
     * @return el correo del usuario
     */
    public String getCorreo() {
        return correo;
    }

    /**
     * Configura la dirección de correo del cliente
     * @param correo el correo del usuario
     */
    public void setCorreo(String correo) {
        this.correo = correo;
    }

    /**
     * Retorna el número de tarjeta del cliente
     * @return el número de tarjeta de crédito del cliente
     */
    public String getTarjeta() {
        return tarjeta;
    }

    /**
     * Configura el número de tarjeta del cliente
     * @param tarjeta el número de tarjeta de crédito del cliente
     */
    public void setTarjeta(String tarjeta) {
        this.tarjeta = tarjeta;
    }

    /**
     * Retorna el tipo del cliente
     * @return el tipo de cliente, normal o frecuente
     */
    public boolean isTipoC() {
        return tipoC;
    }

    /**
     * Configura el tipo del cliente
     * @param tipoC el tipo de cliente, normal o frecuente
     */
    public void setTipoC(boolean tipoC) {
        this.tipoC = tipoC;
    }

    /**
     * Retorna el contador de compras del cliente
     * @return el contador del total de compras del cliente
     */
    public int getContadorCompras() {
        return contadorCompras;
    }

    /**
     * Configura el contador de compras del cliente
     * @param contadorCompras el contador del total de compras del cliente
     */
    public void setContadorCompras(int contadorCompras) {
        this.contadorCompras = contadorCompras;
    }

    /**
     * Retorna el carrito único del cliente
     * @return el carrito del cliente
     */
    public Carrito getCarrito() {
        return carrito;
    }

    /**
     * Configura el carrito único del cliente
     * @param carrito el carrito propio de cada cliente
     */
    public void setCarrito(Carrito carrito) {
        this.carrito = carrito;
    }
    
    
}
