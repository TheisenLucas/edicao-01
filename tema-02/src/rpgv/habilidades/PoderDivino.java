package rpgv.habilidades;

public class PoderDivino extends Habilidade {

    private double custoFe;

    public PoderDivino(String nome, double poder, double custoFe) {
        super(nome, poder);
        this.custoFe = custoFe;
    }

    public double getCustoFe() {
        return custoFe;
    }

}
