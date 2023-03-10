package Npolimorfismo.dominio;

public class Tomate extends Produto{
    public static final double IMPOSTO_POR_CENTO = 0.06 ;

    public Tomate(String nome, double valor) {
        super(nome, valor);
    }

    @Override
    public double calculaImposto() {
        System.out.println("Calculando Imposto do tomate...");
        return this.valor * IMPOSTO_POR_CENTO;
    }
    public double dataDeValidade;

    public double getDataDeValidade() {
        return dataDeValidade;
    }

    public void setDataDeValidade(double dataDeValidade) {
        this.dataDeValidade = dataDeValidade;
    }
}
