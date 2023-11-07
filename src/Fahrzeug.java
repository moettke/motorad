public class Fahrzeug {
    private int ps;
    private int speed;

    public Fahrzeug(int ps, int speed){
        this.ps = ps;
        this.speed = speed;
        System.out.println("Ich bin der Konstruktor aus Fahrzeug");
    }


    public int getPs() {
        return ps;
    }
    public void setPs(int ps) {
        this.ps = ps;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }
}
