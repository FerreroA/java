public class Coda {
    private Ordine[] ordini;
    private int nextOrdine;
    private int nextDaCucinare;

    public Coda(Ordine[] ordine) {
        this.ordini = new Ordine[100];
        this.nextOrdine = 0;
        this.nextDaCucinare = 0;
    }

    public void aggiungiOrdine(Ordine ordine){
        this.ordini[this.nextOrdine] = ordine;
        this.nextOrdine++;
    }
@Override
    public String toString(){

        String = "";
        for (int i = nextDaCucinare; i < nextOrdine; i++){

        }
}

}
