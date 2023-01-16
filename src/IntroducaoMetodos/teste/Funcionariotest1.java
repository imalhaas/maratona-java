package IntroducaoMetodos.teste;

import IntroducaoMetodos.dominio.Funcionario;

public class Funcionariotest1 {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();

        funcionario.setNome("MOMI");
        funcionario.setIdade(32);
        funcionario.setSalarios(new double[]{1500, 980.00, 3000});

        funcionario.imprime();


    }
}
