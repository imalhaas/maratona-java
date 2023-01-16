package IntroducaoMetodos.dominio;

import org.w3c.dom.ls.LSOutput;

public class Funcionario {

    private String nome;
    private  int idade;
    private double[] salarios;
    private double media;

//aqui estou criando um metodo imprime, para ser usado no test e para chamar esse metodo e so funcionario.imprime
    public void imprime(){
        System.out.println("nome "+this.nome);
        System.out.println("idade "+this.idade);
        for (double salarío: salarios) {
            System.out.println("salario "+salarío+ " ");
        }
        imprimeMediaSalario();
        }

        public void imprimeMediaSalario() {
            for (double salarío : salarios) {
                media += salarío;
            }
media /= salarios.length;
            System.out.println("\nmedia salarios "+media);
        }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setSalarios(double[] salarios) {
        this.salarios = salarios;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public double[] getSalarios() {
        return salarios;
    }
}




