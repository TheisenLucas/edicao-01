package rpgv.configurador;

public class Configurador {

    public Configuracao configurar() {

        System.out.println("Iniciando configuração da simulação...");
        System.out.println();

        ConfiguradorHabilidades habilidades = new ConfiguradorHabilidades();
        ConfiguradorPersonagens personagens = new ConfiguradorPersonagens();

        return new Configuracao(
            personagens.configurarPersonagens(),
            habilidades.configurarHabilidades());
    }
}
