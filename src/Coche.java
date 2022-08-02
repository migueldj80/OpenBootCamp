public class Coche {
    public int puertas;

    public Coche() {
        this.puertas=0;
    }

    public void add_puerta(){
        this.puertas++;
    }

    public static void main(String[] args) {
        Coche miCoche = new Coche();
        miCoche.add_puerta();
        System.out.println("Mi coche tiene " + miCoche.puertas + " puertas.");
    }

}
