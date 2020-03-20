package rpg.habilidades;

public abstract class Habilidade {

    private String nome;

    private double poder;

    protected Habilidade(final String nome, final double poder) {
        this.nome = nome;
        this.poder = poder;
    }

    public double getPoder() {
        return poder;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public String toString() {
        return "Nome: " + nome +
            " | Poder:" + poder;
    }
}
