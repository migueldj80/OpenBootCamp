
package openbootcamp;

/**
 *
 * @author Miguel Ledesma Palacios
 */
public class Cliente extends Persona {

     double credito;
    
    
    public Cliente(String nombre, String telefono, int edad, double credito) {
        this.nombre = nombre;
        this.edad = edad;
        this.credito = credito;
        this.telefono = telefono;
    }
    
}
