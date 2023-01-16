package Hherança.dominio;

public class Funcionario extends Pessoaa {
    private double salario;

    public Funcionario(String nome){
        super(nome);
    }



    public void imprime(){
        super.imprime();
        System.out.println(this.salario);
    }

    public void relatorioPagamento(){
        System.out.println("Eu "+ this.nome +" recebi o pagamento de "+ this.salario);
    }



    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
