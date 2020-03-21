package rpgv.criador;

import java.util.Scanner;

import rpgv.personagens.sacerdotes.Druida;

public class CriadorDruida extends CriadorPersonagem {

    public static final String CHAVE = "D";

    public Druida criar() {

        DadosBasicos dadosBasicos = iniciar();

        Scanner scanner = new Scanner(System.in);
        System.out.print("Fé: ");
        int fe = scanner.nextInt();

        finalizar(dadosBasicos.getNome());

        return new Druida(
            dadosBasicos.getNome(),
            dadosBasicos.getVida(),
            dadosBasicos.getAtaque(),
            dadosBasicos.getDefesa(),
            fe);

    }

    public String getClasse() {
        return "Druida";
    }

}
