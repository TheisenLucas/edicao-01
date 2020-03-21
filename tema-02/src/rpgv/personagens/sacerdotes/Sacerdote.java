package rpgv.personagens.sacerdotes;

import rpgv.habilidades.PoderDivino;
import rpgv.personagens.Personagem;

public abstract class Sacerdote extends Personagem {

    private int fe;

    public Sacerdote(String nome, double vida, double ataque, double defesa, int fe) {
        super(nome, vida, ataque, defesa);
        this.fe = fe;
    }

    public boolean atacar(Personagem alvo, PoderDivino poderDivino) {
        boolean sucesso = this.fe >= poderDivino.getCustoFe() && super.atacar(alvo, poderDivino);

        if (sucesso) {
            this.fe -= poderDivino.getCustoFe();
        }

        return sucesso;
    }

    public int getFe() {
        return fe;
    }

    @Override
    public String toString() {
        return super.toString() +
            " | Fé: " + fe;
    }

}
