package rpg.personagens;

import rpg.habilidades.Habilidade;
import rpg.registro.RegistroCombate;

public abstract class Personagem {

    private String nome;

    private double vida;

    private double ataque;

    private double defesa;

    private RegistroCombate registro;

    public Personagem(final String nome, final double vida, final double ataque, final double defesa) {
        this.nome = nome;
        this.vida = vida;
        this.ataque = ataque;
        this.defesa = defesa;
        this.registro = new RegistroCombate();
    }

    private double calcularDano(double defesa, double poder) {
        return ataque * poder - defesa;
    }

    private void registrar(Personagem alvo, String habilidade, double dano) {
        String mensagem = this.nome + " atacou " + alvo.getNome() + " com " + habilidade + " causando " + dano + " de dano";

        if (alvo.estaVivo()) {
            registro.registrar(mensagem);
        } else {
            registro.registrar(mensagem + " e morreu");
        }
    }

    protected boolean atacar(Personagem alvo, Habilidade habilidade) {
        if (estaVivo()) {
            double dano = calcularDano(alvo.getDefesa(), habilidade.getPoder());

            alvo.vida -= dano;
            registrar(alvo, habilidade.getNome(), dano);
        } else {
            registro.registrar(nome + " tentou atacar, mas já estava falecido.");
        }
        return estaVivo();
    }

    @Override
    public String toString() {
        return "Nome: " + nome +
            " | Vida: " + vida +
            " | Ataque: " + ataque +
            " | Defesa: " + defesa;
    }

    public boolean estaVivo() {
        return this.vida > 0;
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
