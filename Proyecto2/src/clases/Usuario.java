
package clases;


public abstract class Usuario {
    protected String nombreU;
    protected String pass;
    

    /**
     * @return the nombreU
     */
    public String getNombreU() {
        return nombreU;
    }

    /**
     * @param nombreU the nombreU to set
     */
    public void setNombreU(String nombreU) {
        this.nombreU = nombreU;
    }

    /**
     * @return the pass
     */
    public String getPass() {
        return pass;
    }

    /**
     * @param pass the pass to set
     */
    public void setPass(String pass) {
        this.pass = pass;
    }
    
    public abstract void metodo();
}
