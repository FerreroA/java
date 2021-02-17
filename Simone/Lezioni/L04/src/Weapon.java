public class Weapon {
    public static /*final*/ int MAX_MAGAZINE = 45;
    private float caliber;
    private float power;
    private int magazine;

    public Weapon(float caliber, float power, int magazine) {
        this.caliber = caliber;
        this.power = power;
        this.magazine = MAX_MAGAZINE;
    }

    public boolean shoot() {
        System.out.println("Sparo con " + power + " Newton di potenza.");
        return false;
    }
    public void magazine() {

    }

    @Override
    public String toString() {
        return "Arma: " + power + ", caricatore: " + MAX_MAGAZINE;
    }

    //dentro un metodo statico non posso richiamare proprietà non static, che varieranno all'interno del programma.
    //sono dentro la classe Weapon, non entro nelle singole armi. Accedo a MAX_MAGAZINE perché è una proprietà statica (che vale per tutte le armi).
    public static void MetodoStatico(){

    }
}
