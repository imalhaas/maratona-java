package Hherança.teste;

import Hherança.dominio.Endereço;
import Hherança.dominio.Funcionario;
import Hherança.dominio.Pessoaa;

public class HerançaTeste {
    public static void main(String[] args) {
        Endereço endereço = new Endereço();
        endereço.setRua("Subidinha");
        endereço.setCep("2232323");
        Pessoaa pessoa = new Pessoaa("Guguzada");
        pessoa.setEndereço(endereço);
        pessoa.imprime();

        Funcionario funcionario = new Funcionario("KAKA");
        funcionario.setCpf("22323443");
        funcionario.setEndereço(endereço);
        funcionario.setSalario(20000);

        System.out.println("==========");
        funcionario.imprime();
        funcionario.relatorioPagamento();










    }
}
