package rpg.criador;

import rpg.personagens.homensdearmas.Barbaro;

public class CriadorBarbaro extends CriadorPersonagem {

    public Barbaro criar() {

        System.out.println("Criação de Bárbaro...");

        DadosBasicos dadosBasicos = super.iniciar();

        System.out.println("O bárbaro '" + dadosBasicos.getNome() + "' entrou no combate!");

        return new Barbaro(
            dadosBasicos.getNome(),
            dadosBasicos.getVida(),
            dadosBasicos.getAtaque(),
            dadosBasicos.getDefesa());

    }

}
