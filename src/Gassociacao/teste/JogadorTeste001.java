package Gassociacao.teste;

import Gassociacao.dominio.Jogador;

public class JogadorTeste001 {
    public static void main(String[] args) {
        Jogador jogador1 = new Jogador("ronaldinho");
        Jogador jogador2 = new Jogador("Pele");
        Jogador jogador3 = new Jogador("Messi");
        Jogador[] jogadores = {jogador1,jogador2,jogador3};

        for (Jogador jogador : jogadores) {
            jogador.imprime();
        }


    }
}
