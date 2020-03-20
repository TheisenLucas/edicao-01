package rpg;

import java.util.List;
import java.util.Scanner;

import rpg.habilidades.Habilidade;
import rpg.menu.MenuHabilidades;
import rpg.menu.MenuPersonagens;
import rpg.personagens.Personagem;

public class Simulador {

    public static void main(String[] args) {

        Scanner scanner =  new Scanner(System.in);
        System.out.println(" ----------------------------------------");
        System.out.println("|  S I M U L A D O R     D E     R P G   |");
        System.out.println(" ----------------------------------------");

        MenuPersonagens menuPersonagens = new MenuPersonagens();
        List<Personagem> personagens = menuPersonagens.configurarPersonagens();

        MenuHabilidades menuHabilidades = new MenuHabilidades();
        List<Habilidade> habilidades = menuHabilidades.configurarHabilidades();

        habilidades.forEach(System.out::println);
        personagens.forEach(System.out::println);

    }
}
