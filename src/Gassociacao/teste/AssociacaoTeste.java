package Gassociacao.teste;


import Gassociacao.dominio.Aluno;
import Gassociacao.dominio.Local;
import Gassociacao.dominio.Professor;
import Gassociacao.dominio.Seminario;

public class AssociacaoTeste {
    public static void main(String[] args) {
        Local local = new Local("Setor bancario");
        Aluno aluno = new Aluno("Lucas", 23);
        Professor professor = new Professor("Barba Branca", "Pirata");
        Aluno[] alunosParaSeminario = {aluno};
        Seminario seminario = new Seminario("Ouro", alunosParaSeminario, local);

        Seminario[] seminariosDisponiveis = {seminario};
        professor.setSeminarios(seminariosDisponiveis);

        professor.imprime();









    }
}
