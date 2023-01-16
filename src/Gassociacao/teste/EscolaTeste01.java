package Gassociacao.teste;

import Gassociacao.dominio.Escola;
import Gassociacao.dominio.Professor;

public class EscolaTeste01 {
    public static void main(String[] args) {
        Professor professor1 = new Professor("Jirafales");
        Professor professor2 = new Professor("Jacomé");
        Professor[] professores = {professor1, professor2};
        Escola escola = new Escola("Escola da praça", professores);

        escola.imprime();

    }
}
