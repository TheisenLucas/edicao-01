package rpgv.criador;

import java.util.Scanner;

import rpgv.personagens.arcanos.Feiticeiro;

public class CriadorFeiticeiro extends CriadorPersonagem {

    public static final String CHAVE = "F";

    public Feiticeiro criar() {

        DadosBasicos dadosBasicos = iniciar();

        Scanner scanner = new Scanner(System.in);
        System.out.print("Mana: ");
        int mana = scanner.nextInt();

        finalizar(dadosBasicos.getNome());

        return new Feiticeiro(
            dadosBasicos.getNome(),
            dadosBasicos.getVida(),
            dadosBasicos.getAtaque(),
            dadosBasicos.getDefesa(),
            mana);

    }

    public String getClasse() {
        return "Feiticeiro";
    }

}
