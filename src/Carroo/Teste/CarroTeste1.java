package Carroo.Teste;

import Carroo.dominio.Carroo;

public class CarroTeste1 {
    public static void main(String[] args) {
        // objeto carro
    Carroo carro = new Carroo();
// aqui esta chamando o objeto carro e definindo o nome do carro
    carro.setNome("Ferrari");
        System.out.println(carro.getNome());
        System.out.println("Velocidade Limite do carro é: "+ Carroo.VELOCIDADE_LIMITE);
        System.out.println("Velocidade Limite do carro é: "+ carro.COMPRADOR);



    }
}
