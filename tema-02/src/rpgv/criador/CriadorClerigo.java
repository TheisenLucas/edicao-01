package rpgv.criador;

import java.util.Scanner;

import rpgv.personagens.sacerdotes.Clerigo;

public class CriadorClerigo extends CriadorPersonagem {

    public static final String CHAVE = "C";

    public Clerigo criar() {

        DadosBasicos dadosBasicos = iniciar();

        Scanner scanner = new Scanner(System.in);
        System.out.print("Fé: ");
        int fe = scanner.nextInt();

        finalizar(dadosBasicos.getNome());

        return new Clerigo(
            dadosBasicos.getNome(),
            dadosBasicos.getVida(),
            dadosBasicos.getAtaque(),
            dadosBasicos.getDefesa(),
            fe);

    }

    public String getClasse() {
        return "Clérigo";
    }

}
