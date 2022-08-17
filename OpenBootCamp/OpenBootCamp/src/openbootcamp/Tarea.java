
package openbootcamp;

/**
 *
 * @author Miguel Ledesma Palacios
 */
public class Tarea {


    public static void main(String args[]) {

        Cliente cliente1 = new Cliente("Miguel Ledesma", "600989898", 41, 25000.0);
        
        System.out.println("Nombre del cliente : "+ cliente1.nombre);
        System.out.println("Telefono : " + cliente1.telefono);
        System.out.println("Edad : " + cliente1.edad);
        System.out.println("Credito : " + cliente1.credito);
        
        
        Trabajador trabajador1 = new Trabajador("Pepito Grillo", "900123123", 54, 1200.0);
        System.out.println("Nombre del trabajador : " + trabajador1.nombre);
        System.out.println("Telefono : " + trabajador1.telefono);
        System.out.println("Edad : " + trabajador1.edad);
        System.out.println("Salario : " + trabajador1.salario);
        
        
    }
}
