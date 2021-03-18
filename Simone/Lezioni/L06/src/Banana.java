public final class Banana extends Frutta {

    public Banana(int cal) {
        super(cal);
    }

    @Override
    protected int getMinCal() {
        return 100;
    }
}
