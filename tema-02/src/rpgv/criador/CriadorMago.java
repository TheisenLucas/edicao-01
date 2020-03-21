package rpgv.criador;

import java.util.Scanner;

import rpgv.personagens.arcanos.Mago;

public class CriadorMago extends CriadorPersonagem {

    public static final String CHAVE = "M";

    public Mago criar() {

        DadosBasicos dadosBasicos = iniciar();

        Scanner scanner = new Scanner(System.in);
        System.out.print("Mana: ");
        int mana = scanner.nextInt();

        finalizar(dadosBasicos.getNome());

        return new Mago(
            dadosBasicos.getNome(),
            dadosBasicos.getVida(),
            dadosBasicos.getAtaque(),
            dadosBasicos.getDefesa(),
            mana);

    }

    public String getClasse() {
        return "Mago";
    }

}
