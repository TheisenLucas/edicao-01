package rpg.criador;


import rpg.personagens.homensdearmas.Guerreiro;

public class CriadorGuerreiro extends CriadorPersonagem {

    public Guerreiro criar() {

        System.out.println("Criação de Guerreiro...");

        DadosBasicos dadosBasicos = super.iniciar();

        System.out.println("O guerreiro '" + dadosBasicos.getNome() + "' entrou no combate!");

        return new Guerreiro(
            dadosBasicos.getNome(),
            dadosBasicos.getVida(),
            dadosBasicos.getAtaque(),
            dadosBasicos.getDefesa());

    }

}
