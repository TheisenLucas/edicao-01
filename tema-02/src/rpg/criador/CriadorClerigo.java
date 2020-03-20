package rpg.criador;

import java.util.Scanner;

import rpg.personagens.sacerdotes.Clerigo;

public class CriadorClerigo extends CriadorPersonagem {

    public Clerigo criar() {

        System.out.println("Criação de Clérigo...");

        DadosBasicos dadosBasicos = super.iniciar();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Fé: ");
        int fe = scanner.nextInt();

        System.out.println("O clérigo '" + dadosBasicos.getNome() + "' entrou no combate!");

        return new Clerigo(
            dadosBasicos.getNome(),
            dadosBasicos.getVida(),
            dadosBasicos.getAtaque(),
            dadosBasicos.getDefesa(),
            fe);

    }

}
