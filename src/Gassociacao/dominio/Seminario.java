package Gassociacao.dominio;

import java.util.Locale;

public class Seminario {
    private String titulo;
    private Aluno[] alunos;
    private Local Local;


    public Seminario(String titulo) {
        this.titulo = titulo;
    }

    public Seminario(String titulo, Aluno[] alunos) {
        this.titulo = titulo;
        this.alunos = alunos;
    }

    public Seminario(String titulo, Aluno[] alunos, Gassociacao.dominio.Local local) {
        this.titulo = titulo;
        this.alunos = alunos;
        this.Local = local;
    }

    public Gassociacao.dominio.Local getLocal() {
        return Local;
    }

    public void setLocal(Gassociacao.dominio.Local local) {
        this.Local = local;
    }

    public Aluno[] getAlunos() {
        return alunos;
    }

    public void setAlunos(Aluno[] alunos) {
        this.alunos = alunos;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
}
