package IntroducaoMetodos.teste;

import IntroducaoMetodos.dominio.Estudante;

public class impressoraEstudante {
    public void imprime (Estudante estudante){
        System.out.println("-----------------");

        System.out.println(estudante.nome);
        System.out.println(estudante.idade);
        System.out.println(estudante.sexo);

    }
}
