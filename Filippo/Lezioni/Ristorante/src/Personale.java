public class Personale {
    private String nome;
    private Coda coda;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Personale(String nome, Coda coda) {
        this.nome = nome;
        this.coda = coda;
    }
}
