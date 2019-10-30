
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
    
    public void agregar(){
        
    }

    @Override
    public void metodo() {
        }

    /**
     * @return the nombreC
     */
    public String getNombreC() {
        return nombreC;
    }

    /**
     * @param nombreC the nombreC to set
     */
    public void setNombreC(String nombreC) {
        this.nombreC = nombreC;
    }

    /**
     * @return the correo
     */
    public String getCorreo() {
        return correo;
    }

    /**
     * @param correo the correo to set
     */
    public void setCorreo(String correo) {
        this.correo = correo;
    }

    /**
     * @return the tarjeta
     */
    public String getTarjeta() {
        return tarjeta;
    }

    /**
     * @param tarjeta the tarjeta to set
     */
    public void setTarjeta(String tarjeta) {
        this.tarjeta = tarjeta;
    }

    /**
     * @return the tipoC
     */
    public boolean isTipoC() {
        return tipoC;
    }

    /**
     * @param tipoC the tipoC to set
     */
    public void setTipoC(boolean tipoC) {
        this.tipoC = tipoC;
    }

    /**
     * @return the contadorCompras
     */
    public int getContadorCompras() {
        return contadorCompras;
    }

    /**
     * @param contadorCompras the contadorCompras to set
     */
    public void setContadorCompras(int contadorCompras) {
        this.contadorCompras = contadorCompras;
    }

    /**
     * @return the carrito
     */
    public Carrito getCarrito() {
        return carrito;
    }

    /**
     * @param carrito the carrito to set
     */
    public void setCarrito(Carrito carrito) {
        this.carrito = carrito;
    }
    
    
}
