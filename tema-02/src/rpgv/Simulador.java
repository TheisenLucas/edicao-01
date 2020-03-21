package rpgv;

import rpgv.configurador.Configurador;
import rpgv.configurador.Configuracao;

public class Simulador {

    public static void main(String[] args) {

        System.out.println(" ----------------------------------------");
        System.out.println("|  S I M U L A D O R     D E     R P G   |");
        System.out.println(" ----------------------------------------");
        System.out.println();

        Configurador configurador = new Configurador();
        Configuracao simulacao = configurador.configurar();

        simulacao.getPersonagens().forEach(System.out::println);

    }
}
