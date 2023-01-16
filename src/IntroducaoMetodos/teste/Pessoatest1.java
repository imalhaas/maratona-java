package IntroducaoMetodos.teste;

import IntroducaoMetodos.dominio.Pessoa;

public class Pessoatest1 {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        pessoa.setNome("Toreto");
       pessoa.setIdade(-1);
      //  pessoa.imprime();
        System.out.println(pessoa.getNome());
        System.out.println(pessoa.getIdade());

    }
}
