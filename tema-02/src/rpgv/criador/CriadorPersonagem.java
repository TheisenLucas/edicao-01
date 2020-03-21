package rpgv.criador;

import java.util.Scanner;

import rpgv.personagens.Personagem;

public abstract class CriadorPersonagem {

    public abstract String getClasse();

    public abstract Personagem criar();

    protected DadosBasicos iniciar() {

        System.out.println("\nCriação de " + getClasse() + "...");
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

    protected void finalizar(String nome) {
        System.out.println("O " + getClasse() + " '" + nome + "' entrou no combate!");
    }

}
