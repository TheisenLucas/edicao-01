package rpgv.criador;

import rpgv.personagens.homensdearmas.Barbaro;

public class CriadorBarbaro extends CriadorPersonagem {

    public static final String CHAVE = "B";

    public Barbaro criar() {

        DadosBasicos dadosBasicos = iniciar();
        finalizar(dadosBasicos.getNome());

        return new Barbaro(
            dadosBasicos.getNome(),
            dadosBasicos.getVida(),
            dadosBasicos.getAtaque(),
            dadosBasicos.getDefesa());

    }

    public String getClasse() {
        return "Bárbaro";
    }

}
