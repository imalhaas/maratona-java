package LclassesAbistratas.dominio;

public abstract class Funcionarioo extends Pessoa {
     protected String nome;
     protected double salario;

     public Funcionarioo(String nome, double salario) {
          this.nome = nome;
          this.salario = salario;
          calculaBonus();
     }

     @Override
     public void imprime() {
          System.out.println("Imprimindo...");
     }

     public abstract void calculaBonus();

}
