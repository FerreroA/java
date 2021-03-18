public class Tavolo {
    private int iD;

    public int getiD() {
        return iD;
    }

    public Tavolo(int iD) {
        this.iD = iD;
    }

    @Override
    public String toString() {
        return "Tavolo" + iD;
    }
}
