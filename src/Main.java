public class Main {
    public static void main(String[] args) {
        // Array für Motorrad-Objekte
        Fahrzeug[] mA = new Fahrzeug[3];
        Motorrad m = new Motorrad(125, 100, 15);
        Pkw p = new Pkw(100, 150, 4);
        System.out.println("BLALALALALLALA");

        mA[0] = m;
        mA[1] = p;
    }
}