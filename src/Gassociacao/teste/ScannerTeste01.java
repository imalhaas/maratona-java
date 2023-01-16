package Gassociacao.teste;

import java.util.Scanner;

public class ScannerTeste01 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite Seu Nome");
        String nome = entrada.nextLine();
        System.out.println("Digite Sua Idade");
        int idade = entrada.nextInt();
        System.out.println("Digite Seu Sexo");
        char sexo = entrada.next().charAt(0);


    }
}
