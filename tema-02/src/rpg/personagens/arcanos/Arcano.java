package rpg.personagens.arcanos;

import rpg.habilidades.Magia;
import rpg.personagens.Personagem;

public abstract class Arcano extends Personagem {

    private int mana;

    public Arcano(final String nome, final double vida, final double ataque, final double defesa, int mana) {
        super(nome, vida, ataque, defesa);
        this.mana = mana;
    }

    public boolean atacar(Personagem alvo, Magia magia) {
        boolean sucesso = this.mana >= magia.getCustoMana() && super.atacar(alvo, magia);

        if (sucesso) {
            this.mana -= magia.getCustoMana();
        }

        return sucesso;
    }

    public int getMana() {
        return mana;
    }

    @Override
    public String toString() {
        return super.toString() +
            " | Mana: " + this.getMana();
    }

}
