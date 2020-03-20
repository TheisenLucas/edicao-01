package rpg.criador;

import java.util.Scanner;

import rpg.personagens.sacerdotes.Druida;

public class CriadorDruida extends CriadorPersonagem {

    public Druida criar() {

        System.out.println("Criação de Druida...");

        DadosBasicos dadosBasicos = super.iniciar();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Fé: ");
        int fe = scanner.nextInt();

        System.out.println("O druida '" + dadosBasicos.getNome() + "' entrou no combate!");

        return new Druida(
            dadosBasicos.getNome(),
            dadosBasicos.getVida(),
            dadosBasicos.getAtaque(),
            dadosBasicos.getDefesa(),
            fe);

    }

}
