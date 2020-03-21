package rpg.personagens.arcanos;

import java.util.List;

import rpg.habilidades.Magia;
import rpg.habilidades.TipoMagia;
import rpg.personagens.Personagem;

public abstract class Arcano extends Personagem {

    private int mana;

    public Arcano(final String nome, final double vida, final double ataque, final double defesa, int mana) {
        super(nome, vida, ataque, defesa);
        this.mana = mana;
    }

    public boolean atacar(List<Personagem> alvos, Magia magia) {

        if (magia.getTipoMagia() == TipoMagia.EM_AREA) {
            for (Personagem alvo : alvos) {
                this.atacarSemGastarMana(alvo, magia);
            }

            this.mana -= magia.getCustoMana();
        }

        return true;
    }

    public boolean atacar(Personagem alvo, Magia magia) {

        atacarSemGastarMana(alvo, magia);

        this.mana -= magia.getCustoMana();

        return true;
    }

    private void atacarSemGastarMana(Personagem alvo, Magia magia) {
        if (this.mana >= magia.getCustoMana()) {
            super.atacar(alvo, magia);
        }
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
