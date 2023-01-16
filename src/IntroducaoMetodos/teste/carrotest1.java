package IntroducaoMetodos.teste;

import IntroducaoMetodos.dominio.Carro;

public class carrotest1 {
    public static void main(String[] args) {
        Carro carro1 = new Carro();
        Carro carro2 = new Carro();

        carro1.nome = "jetta";
        carro1.modelo = "gli";
        carro1.ano = 2022;

        carro2.nome = "BMW";
        carro2.modelo = "M8";
        carro2.ano = 2022;

        System.out.println("nome: "+carro1.nome+" modelo: "+carro1.modelo+" ano: "+carro1.ano);
        System.out.println("nome: "+carro2.nome+" modelo: "+carro2.modelo+" ano: "+carro2.ano);
    }
}
