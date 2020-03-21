package rpg.habilidades;

public class Magia extends Habilidade {

    private final double custoMana;

    private final TipoMagia tipoMagia;

    public Magia(String nome, double poder, double custoMana, TipoMagia tipoMagia) {
        super(nome, poder);
        this.custoMana = custoMana;
        this.tipoMagia = tipoMagia;
    }

    public double getCustoMana() {
        return custoMana;
    }

    public TipoMagia getTipoMagia() {
        return tipoMagia;
    }

    @Override
    public String toString() {
        return super.toString() + "Custo de Mana: " + custoMana;
    }

}
