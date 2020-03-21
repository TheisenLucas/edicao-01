package rpg;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import rpg.criador.CriadorBarbaro;
import rpg.criador.CriadorClerigo;
import rpg.criador.CriadorDruida;
import rpg.criador.CriadorFeiticeiro;
import rpg.criador.CriadorGuerreiro;
import rpg.criador.CriadorMago;
import rpg.habilidades.Arma;
import rpg.habilidades.Habilidade;
import rpg.habilidades.Magia;
import rpg.habilidades.TipoMagia;
import rpg.menu.MenuHabilidades;
import rpg.menu.MenuPersonagens;
import rpg.personagens.Personagem;
import rpg.personagens.arcanos.Mago;
import rpg.personagens.homensdearmas.Barbaro;
import rpg.personagens.homensdearmas.Guerreiro;
import rpg.personagens.sacerdotes.Clerigo;
import rpg.registro.RegistroCombate;

public class Simulador {

    public static void main(String[] args) {

        System.out.println(" ----------------------------------------");
        System.out.println("|  S I M U L A D O R     D E     R P G   |");
        System.out.println(" ----------------------------------------");

//        Guerreiro g1 = new Guerreiro("G1", 100, 100, 100);
//
//        g1.equipar(new Arma("facão", 0));
//        g1.atacar(g1);
//
//        g1.equipar(new Arma("foice", 0));
//        g1.atacar(g1);
//        g1.atacar(g1);
//        g1.atacar(g1);
//        g1.atacar(g1);
//        g1.atacar(g1);
//
//        List<Personagem> personagens = new ArrayList<>();
//
//        Mago mago1 = new Mago("Teste", 10, 10, 10, 10);
//        Mago mago11 = new Mago("Teste", 10, 10, 10, 10);
//        Mago mago12 = new Mago("Teste", 10, 10, 10, 10);
//        Mago mago13 = new Mago("Teste", 10, 10, 10, 10);
//        Mago mago14 = new Mago("Teste", 10, 10, 10, 10);
//        Mago mago15 = new Mago("Teste", 10, 10, 10, 10);
//        Mago mago16 = new Mago("Teste", 10, 10, 10, 10);
//        Mago mago17 = new Mago("Teste", 10, 10, 10, 10);
//        Mago mago18 = new Mago("Teste", 10, 10, 10, 10);
//        Mago mago19 = new Mago("Teste", 10, 10, 10, 10);
//
//        Magia emArea = new Magia("teste", 10, 2, TipoMagia.EM_AREA);
//        Magia individual = new Magia("teste", 10, 2, TipoMagia.INDIVIDUAL);
//
//        mago.atacar(personagens, emArea);
//        mago.atacar(personagens, individual);
//
//        Guerreiro guerreiro;
//
//        Scanner scanner =  new Scanner(System.in);
//        System.out.println("\nQuantos personagens participarão do combate?");
//        int quantidadePersonagens = scanner.nextInt();
//
//
//        for (int i = 0; i < quantidadePersonagens; i++) {
//
//            System.out.println("\nQual a classe do personagem?");
//            System.out.println("[ B ] Bárbaro");
//            System.out.println("[ C ] Clérigo");
//            System.out.println("[ D ] Druida");
//            System.out.println("[ F ] Feiticeiro");
//            System.out.println("[ G ] Guerreiro");
//            System.out.println("[ M ] Mago");
//
//            char classeSelecionada = scanner.next().charAt(0);
//
//            switch (classeSelecionada) {
//                case 'B':
//                    Barbaro barbaro = new Barbaro("regre", 1, 1, 1);
//                    personagens.add(barbaro);
//                    break;
//                case 'C':
//                    Clerigo clerigo = new Clerigo("fe", 1, 1, 1, 10);
//                    personagens.add(clerigo);
//                    break;
//                case 'D':
//
//                    break;
//                case 'F':
//
//                    break;
//                case 'G':
//
//                    break;
//                case 'M':
//
//                    break;
//            }
//        }

        new RegistroCombate().registrar("ABC1");
        new RegistroCombate().registrar("ABC2");
        new RegistroCombate().registrar("ABC3");
        new RegistroCombate().registrar("ABC4");
        new RegistroCombate().registrar("ABC5");
        new RegistroCombate().imprimir();


//        MenuHabilidades menuHabilidades = new MenuHabilidades();
//        List<Habilidade> habilidades = menuHabilidades.configurarHabilidades();
//
//        MenuPersonagens menuPersonagens = new MenuPersonagens();
//        List<Personagem> personagens = menuPersonagens.configurarPersonagens();
//
//        habilidades.forEach(System.out::println);
//        personagens.forEach(System.out::println);

    }
}
