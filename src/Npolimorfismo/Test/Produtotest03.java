package Npolimorfismo.Test;

import Npolimorfismo.dominio.Computador;
import Npolimorfismo.dominio.Produto;
import Npolimorfismo.dominio.Tomate;
import Npolimorfismo.servico.CalculadoraImposto;

public class Produtotest03 {
    public static void main(String[] args) {
        Produto produto = new Computador("MacPROm2", 16000);


        Tomate tomate = new Tomate("italiano", 25);
        tomate.setDataDeValidade(11);

        CalculadoraImposto.CalcularImposto(tomate);

    }





}
