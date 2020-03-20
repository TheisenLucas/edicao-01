package rpg.criador;

import java.util.Scanner;

import rpg.personagens.arcanos.Feiticeiro;

public class CriadorFeiticeiro extends CriadorPersonagem {

    public Feiticeiro criar() {

        System.out.println("Criação de Feiticeiro...");

        DadosBasicos dadosBasicos = super.iniciar();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Mana: ");
        int mana = scanner.nextInt();

        System.out.println("O feiticeiro '" + dadosBasicos.getNome() + "' entrou no combate!");

        return new Feiticeiro(
            dadosBasicos.getNome(),
            dadosBasicos.getVida(),
            dadosBasicos.getAtaque(),
            dadosBasicos.getDefesa(),
            mana);

    }

}
