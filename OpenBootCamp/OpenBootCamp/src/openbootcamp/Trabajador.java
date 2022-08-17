
package openbootcamp;

/**
 *
 * @author Miguel Ledesma Palacios
 */
public class Trabajador extends Persona {
    
    double salario;
    
    public Trabajador(String nombre, String telefono, int edad, double salario) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.edad = edad;
        this.salario = salario;
    }
}
