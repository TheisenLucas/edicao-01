package rpg.criador;

import java.util.Scanner;

import rpg.personagens.Personagem;

public abstract class CriadorPersonagem {

    protected DadosBasicos iniciar() {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Nome: ");
        String nome = scanner.next();

        System.out.print("Vida: ");
        double vida = scanner.nextDouble();

        System.out.print("Ataque: ");
        double ataque = scanner.nextDouble();

        System.out.print("Defesa: ");
        double defesa = scanner.nextDouble();

        return new DadosBasicos(nome, vida, ataque, defesa);

    }

}
