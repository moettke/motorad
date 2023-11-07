public class Pkw extends Fahrzeug {

    private int anzahlSitze;

    public Pkw(int ps, int speed,int anzahlSitze){
        super(ps, speed);
        this.anzahlSitze = anzahlSitze;
        System.out.println("Ich bin der Konstruktor aus Pkw");
    }

    public int getAnzahlSitze() {
        return anzahlSitze;
    }

    public void setAnzahlSitze(int anzahlSitze) {
        this.anzahlSitze = anzahlSitze;
    }
}
