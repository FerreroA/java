public abstract class Verdura extends Cibo {
    public Verdura(int cal) {
        super(cal);
    }

    @Override
    public void consuma(int cal) {
        this.setCal(this.getCal()-cal);
    }
}
