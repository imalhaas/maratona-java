package IntroducaoMetodos.teste;

import IntroducaoMetodos.dominio.Estudante;

public class estudantetest1 {
    public static void main(String[] args) {
        Estudante estudante1 = new Estudante();
        Estudante estudante2 = new Estudante();
        impressoraEstudante impressora = new impressoraEstudante();

        estudante1.nome = "lucas";
        estudante1.idade = 23;
        estudante1.sexo = 'M';

        estudante2.nome = "Fernanda";
        estudante2.idade = 23;
        estudante2.sexo = 'F';

impressora.imprime(estudante1);
impressora.imprime(estudante2);


    }
}
