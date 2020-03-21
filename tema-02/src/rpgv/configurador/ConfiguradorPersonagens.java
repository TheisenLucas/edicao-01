package rpgv.configurador;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import rpgv.criador.CriadorBarbaro;
import rpgv.criador.CriadorClerigo;
import rpgv.criador.CriadorDruida;
import rpgv.criador.CriadorFeiticeiro;
import rpgv.criador.CriadorGuerreiro;
import rpgv.criador.CriadorMago;
import rpgv.criador.CriadorPersonagem;
import rpgv.personagens.Personagem;

public class ConfiguradorPersonagens {

    public List<Personagem> configurarPersonagens() {

        List<Personagem> personagens = new ArrayList<>();

        Map<String, CriadorPersonagem> criadores = new HashMap<>();
        criadores.put(CriadorBarbaro.CHAVE, new CriadorBarbaro());
        criadores.put(CriadorGuerreiro.CHAVE, new CriadorGuerreiro());
        criadores.put(CriadorMago.CHAVE, new CriadorMago());
        criadores.put(CriadorFeiticeiro.CHAVE, new CriadorFeiticeiro());
        criadores.put(CriadorClerigo.CHAVE, new CriadorClerigo());
        criadores.put(CriadorDruida.CHAVE, new CriadorDruida());

        Scanner scanner = new Scanner(System.in);
        System.out.println("Quantos heróis entrarão em combate?");
        System.out.print("> ");
        int quantidadeCombatentes = scanner.nextInt();

        for (int i = 0; i < quantidadeCombatentes; i++) {
            System.out.println();
            System.out.println("Selecione a classe do herói " + (i+1) + " de " + quantidadeCombatentes);

            // opções
            for (String chave : criadores.keySet()) {
                System.out.println("[" + chave + "] " + criadores.get(chave).getClasse());
            }

            System.out.print("> ");
            String opcao = scanner.next();

            CriadorPersonagem criador = criadores.get(opcao);
            Personagem personagem = criador.criar();
            personagens.add(personagem);
        }

        return personagens;
    }
}
