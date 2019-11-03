
package clases;


public abstract class Usuario {
    protected String nombreU;
    protected String pass;
    

    /**
     * Retorna el nombre del usuario
     * @return el nombre del usuario
     */
    public String getNombreU() {
        return nombreU;
    }

    /**
     * Configura el nombre del usuario
     * @param nombreU el nombre del usuario
     */
    public void setNombreU(String nombreU) {
        this.nombreU = nombreU;
    }

    /**
     * Retorna la contraseña del usuario
     * @return la contraseña del usuario
     */
    public String getPass() {
        return pass;
    }

    /**
     * Configura la contraseña del usuario
     * @param pass la contraseña del usuario
     */
    public void setPass(String pass) {
        this.pass = pass;
    }

    /**
     * Método abstracto sin funcionalidad
     */    
    public abstract void metodo();
}
