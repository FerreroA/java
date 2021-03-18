public class Compito {
    protected int iD;
    private static int nextID = 0;

    public Compito() {
        this.iD = nextID;
        nextID++;
    }

    public static int getNextID(){
        return nextID;
    }

    @Override
    public String toString() {
        return "Compito{" +
                "iD=" + iD +
                '}';
    }
}
