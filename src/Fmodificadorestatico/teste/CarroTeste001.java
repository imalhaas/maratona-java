package Fmodificadorestatico.teste;

import Fmodificadorestatico.dominio.Carro;

public class CarroTeste001 {
    public static void main(String[] args) {
        Carro c1 = new Carro("BMW", 300);
        Carro c2 = new Carro("Mercedes", 280);
        Carro c3 = new Carro("AUDI", 270);

        Carro.setVelocidadeLimite(180);

        c1.imprime();
        c2.imprime();
        c3.imprime();

    }
}
