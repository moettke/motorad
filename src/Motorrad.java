public class Motorrad extends Fahrzeug {

    // Attribute, Eigenschaften, Instanzvariablen

    private int tankvolumen;

    public Motorrad(int ps, int speed, int tankvolumen) {
        // super() ruft Konstruktor der Oberklasse(Fahrzeug) auf
        super(ps, speed);
        this.tankvolumen = tankvolumen;
        System.out.println("Ich bin der Konstruktor aus Motorrad");
    }






    public int getTankvolumen() {
        return tankvolumen;
    }

    public void setTankvolumen(int tankvolumen) {
        this.tankvolumen = tankvolumen;
    }
}
