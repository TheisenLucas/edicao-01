package rpgv.criador;

public class DadosBasicos {

    private String nome;

    private double vida;

    private double ataque;

    private double defesa;

    public DadosBasicos(final String nome, final double vida, final double ataque, final double defesa) {
        this.nome = nome;
        this.vida = vida;
        this.ataque = ataque;
        this.defesa = defesa;
    }

    public String getNome() {
        return nome;
    }

    public double getVida() {
        return vida;
    }

    public double getAtaque() {
        return ataque;
    }

    public double getDefesa() {
        return defesa;
    }

}
