package LclassesAbistratas.teste;

import LclassesAbistratas.dominio.Desenvolvedor;
import LclassesAbistratas.dominio.Gerente;

public class FuncionariooTeste1 {
    public static void main(String[] args) {
        Gerente gerente = new Gerente("Chefao", 100000);
        Desenvolvedor desenvolvedor = new Desenvolvedor("IRI", 12000);
        System.out.println(gerente );
        System.out.println(desenvolvedor);
        gerente.imprime();
        desenvolvedor.imprime();


    }
}
