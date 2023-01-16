package Isobrescrita.dominio;

public class Animee {
    private String nome;

@Override
    public String toString(){
    return "Nome: "+ this.nome;
    }


    public Animee(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
