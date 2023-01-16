package IntroducaoMetodos.dominio;

public class Calculadora {
    public void somaDOisNumeros(){
        System.out.println(10 + 10);
    }
    public void subtraiaDoisNumeros(){
        System.out.println(28 - 12);
    }
    public void multiplicaDoisNumeros(int num1, int num2){
        System.out.println(num1 * num2);
    }
    public void divideDoisNumeros(double num1, double num2){
        if (num2 == 0) {
            System.out.println("numero é zero");
            return;
        }
        System.out.println("a divisao é "+ num1/num2);
    }

    public void alteraDoisNumeros(int num1, int num2){
        num1 = 99;
        num2 = 33;
        System.out.println("dentro do alteradoisnumeros");
        System.out.println("num1 "+num1);
        System.out.println("num2 "+num2);
    }
    public void somaArrays (int[] numeros) {
        int soma = 0;
        for (int num : numeros) {
            soma += num;
        }
        System.out.println(soma);
    }
    public void somaVarArgs (int... numeros){
        int soma = 0;
        for (int num : numeros) {
            soma += num;
        }
        System.out.println(soma);
    }
}
