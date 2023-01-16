package Kenumeracao.teste;

import Kenumeracao.dominio.Cliente;
import Kenumeracao.dominio.TipoCliente;
import Kenumeracao.dominio.tipoPagamento;

public class Clienteteste01 {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("Tomy", TipoCliente.PESSOA_JURIDICA, tipoPagamento.DEBITO);
        Cliente cliente2 = new Cliente("Artur", TipoCliente.PESSOA_FISICA, tipoPagamento.DEBITO);
        Cliente cliente3 = new Cliente("Jon", TipoCliente.PESSOA_FISICA, tipoPagamento.DEBITO);
        Cliente cliente4 = new Cliente("Poly", TipoCliente.PESSOA_FISICA, tipoPagamento.CREDITO);

        System.out.println(cliente1);
        System.out.println(cliente2);
        System.out.println(cliente3);
        System.out.println(cliente4);
        System.out.println(tipoPagamento.DEBITO.calcularDesconto(100));
        System.out.println(tipoPagamento.CREDITO.calcularDesconto(150));
        TipoCliente tipoCliente = TipoCliente.valueOf("PESSOA_FISICA");
        System.out.println(tipoCliente);



    }
}
