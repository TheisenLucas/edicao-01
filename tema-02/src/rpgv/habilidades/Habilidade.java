package rpgv.habilidades;

public class Habilidade {

    private String nome;

    private double poder;

    public Habilidade(final String nome, final double poder) {
        this.nome = nome;
        this.poder = poder;
    }

    public double getPoder() {
        return poder;
    }

    public String getNome() {
        return nome;
    }

}
