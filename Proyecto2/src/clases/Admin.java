
package clases;


public class Admin extends Usuario {

    public Admin(String nombreU, char pass[]){
        this.nombreU = nombreU;
        this.pass = String.valueOf(pass);
    }

    /**
     * Método heredado sin funcionalidad
     */
    @Override
    public void metodo() {
        }
    
}
