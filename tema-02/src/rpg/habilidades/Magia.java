package rpg.habilidades;

public class Magia extends Habilidade {

    private double custoMana;

    public Magia(String nome, double poder, double custoMana) {
        super(nome, poder);
        this.custoMana = custoMana;
    }

    public double getCustoMana() {
        return custoMana;
    }

    @Override
    public String toString() {
        return super.toString() + "Custo de Mana: " + custoMana;
    }

}
