package Npolimorfismo.Test;

import Npolimorfismo.dominio.Computador;
import Npolimorfismo.dominio.Televisao;
import Npolimorfismo.dominio.Tomate;
import Npolimorfismo.servico.CalculadoraImposto;

public class ProdutoTest01 {
    public static void main(String[] args) {
        Computador computador = new Computador("MACm2", 14000);
        Tomate tomate = new Tomate("Tomate grandao", 15);
        Televisao tv = new Televisao("Samsung 60\" ",5000);
        CalculadoraImposto.CalcularImposto (computador);
        System.out.println("-----------------------");
        CalculadoraImposto.CalcularImposto (tomate);
        System.out.println("------------------------- ");
        CalculadoraImposto.CalcularImposto(tv);

    }
}
