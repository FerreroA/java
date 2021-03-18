public abstract class Frutta extends Cibo {

    private int minCal;
    public Frutta(int cal) {
        super(cal);
    }

    @Override
    public void consuma(int cal) {
        int tempCal = this.getCal() - cal;
        if (tempCal > 100)
            this.setCal(tempCal);
        else
            this.setCal(getMinCal());
    }

    protected abstract int getMinCal();
}
