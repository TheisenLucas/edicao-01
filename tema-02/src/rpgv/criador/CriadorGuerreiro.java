package rpgv.criador;

import rpgv.personagens.homensdearmas.Guerreiro;

public class CriadorGuerreiro extends CriadorPersonagem {

    public static final String CHAVE = "G";

    public Guerreiro criar() {

        DadosBasicos dadosBasicos = iniciar();
        finalizar(dadosBasicos.getNome());

        return new Guerreiro(
            dadosBasicos.getNome(),
            dadosBasicos.getVida(),
            dadosBasicos.getAtaque(),
            dadosBasicos.getDefesa());

    }

    public String getClasse() {
        return "Guerreiro";
    }

}
