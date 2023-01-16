package Npolimorfismo.servico;

import Npolimorfismo.dominio.Computador;
import Npolimorfismo.dominio.Produto;
import Npolimorfismo.dominio.Tomate;

public class CalculadoraImposto {

    public static void CalcularImposto(Produto produto){
        System.out.println("Relatorio do imposto ");
        double imposto = produto.calculaImposto();
        System.out.println("Produto: "+produto.getNome());
        System.out.println("Preço do produto: "+produto.getValor());
        System.out.println("Valor a ser pago: "+ imposto);
        Tomate tomate = (Tomate) produto;
        System.out.println(tomate.getDataDeValidade());
    }




}
