package rpgv.personagens.homensdearmas;

import rpgv.habilidades.Arma;
import rpgv.personagens.Personagem;

public abstract class HomemDeArmas extends Personagem {

    public HomemDeArmas(String nome, double vida, double ataque, double defesa) {
        super(nome, vida, ataque, defesa);
    }

    public boolean atacar(Personagem alvo, Arma arma) {
        return super.atacar(alvo, arma);
    }
}
