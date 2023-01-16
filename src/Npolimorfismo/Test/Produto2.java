package Npolimorfismo.Test;

import Npolimorfismo.dominio.Computador;
import Npolimorfismo.dominio.Produto;
import Npolimorfismo.dominio.Televisao;
import Npolimorfismo.dominio.Tomate;

public class Produto2 {
    public static void main(String[] args) {
        Produto produto = new Computador("MacPROm2", 16000);
        System.out.println(produto.getNome());
        System.out.println(produto.getValor());
        System.out.println(produto.calculaImposto());
        System.out.println("----------------- ");

        Produto produto2 = new Tomate("italiano", 25);
        System.out.println(produto2.getNome());
        System.out.println(produto2.getValor());
        System.out.println(produto2.calculaImposto());

    }





}
