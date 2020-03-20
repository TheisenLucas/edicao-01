package rpg.criador;

import java.util.Scanner;

import rpg.personagens.arcanos.Mago;

public class CriadorMago extends CriadorPersonagem {

    public Mago criar() {

        System.out.println("Criação de Mago...");

        DadosBasicos dadosBasicos = super.iniciar();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Mana: ");
        int mana = scanner.nextInt();

        System.out.println("O mago '" + dadosBasicos.getNome() + "' entrou no combate!");

        return new Mago(
            dadosBasicos.getNome(),
            dadosBasicos.getVida(),
            dadosBasicos.getAtaque(),
            dadosBasicos.getDefesa(),
            mana);

    }

}
