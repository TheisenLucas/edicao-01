package rpg.menu;

import java.util.ArrayList;
import java.util.List;

import rpg.habilidades.Arma;
import rpg.habilidades.Habilidade;
import rpg.habilidades.Magia;
import rpg.habilidades.PoderDivino;

public class MenuHabilidades {

    public List<Habilidade> configurarHabilidades() {

        List<Habilidade> habilidades = new ArrayList<>();

        habilidades.add(new Arma("Espada Longa", 12));
        habilidades.add(new Arma("Machado de Guerra", 20));

        habilidades.add(new Magia("Míssel Mágico", 10, 1));
        habilidades.add(new Magia("Raio Congelante", 15, 2));
        habilidades.add(new Magia("Bola de Fogo", 15, 3));

        habilidades.add(new PoderDivino("Arma Espiritual", 5, 1));
        habilidades.add(new PoderDivino("Relâmpagos", 25, 5));
        habilidades.add(new PoderDivino("Lâmina Flamejante", 30, 3));

        return habilidades;

    }

}
