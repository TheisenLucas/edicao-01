package rpgv.configurador;

import java.util.List;

import rpgv.habilidades.Habilidade;
import rpgv.personagens.Personagem;

public class Configuracao {

    private List<Personagem> personagens;

    private List<Habilidade> habilidades;

    public Configuracao(List<Personagem> personagens, List<Habilidade> habilidades) {
        this.personagens = personagens;
        this.habilidades = habilidades;
    }

    public List<Personagem> getPersonagens() {
        return personagens;
    }

    public List<Habilidade> getHabilidades() {
        return habilidades;
    }

}

