package rpg.menu;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import rpg.criador.CriadorBarbaro;
import rpg.criador.CriadorClerigo;
import rpg.criador.CriadorDruida;
import rpg.criador.CriadorFeiticeiro;
import rpg.criador.CriadorGuerreiro;
import rpg.criador.CriadorMago;
import rpg.personagens.Personagem;

public class MenuPersonagens {

    public List<Personagem> configurarPersonagens() {

        List<Personagem> personagens = new ArrayList<>();

        Scanner scanner =  new Scanner(System.in);
        System.out.println("\nQuantos personagens participarão do combate?");
        int quantidadePersonagens = scanner.nextInt();

        for (int i = 0; i < quantidadePersonagens; i++) {

            System.out.println("\nQual a classe do personagem?");
            System.out.println("[ B ] Bárbaro");
            System.out.println("[ C ] Clérigo");
            System.out.println("[ D ] Druida");
            System.out.println("[ F ] Feiticeiro");
            System.out.println("[ G ] Guerreiro");
            System.out.println("[ M ] Mago");

            char classeSelecionada = scanner.next().charAt(0);

            switch (classeSelecionada) {
                case 'B':
                    CriadorBarbaro criadorBarbaro = new CriadorBarbaro();
                    personagens.add(criadorBarbaro.criar());
                    break;
                case 'C':
                    CriadorClerigo criadorClerigo = new CriadorClerigo();
                    personagens.add(criadorClerigo.criar());
                    break;
                case 'D':
                    CriadorDruida criadorDruida = new CriadorDruida();
                    personagens.add(criadorDruida.criar());
                    break;
                case 'F':
                    CriadorFeiticeiro criadorFeiticeiro = new CriadorFeiticeiro();
                    personagens.add(criadorFeiticeiro.criar());
                    break;
                case 'G':
                    CriadorGuerreiro criadorGuerreiro = new CriadorGuerreiro();
                    personagens.add(criadorGuerreiro.criar());
                    break;
                case 'M':
                    CriadorMago criadorMago = new CriadorMago();
                    personagens.add(criadorMago.criar());
                    break;
            }

        }

        return personagens;
    }
}
