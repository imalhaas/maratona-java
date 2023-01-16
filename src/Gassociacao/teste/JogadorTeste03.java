package Gassociacao.teste;

import Gassociacao.dominio.Jogador;
import Gassociacao.dominio.Time;

public class JogadorTeste03 {
    public static void main(String[] args) {
        Jogador jogador = new Jogador("Messi");
        Jogador jogador2 = new Jogador("Mbappe");
        Time time = new Time("PSG");
        Jogador[] jogadores  = {jogador, jogador2};



        jogador.setTime(time);
        jogador2.setTime(time);

        time.setJogadores(jogadores);

        System.out.println("--- Jogador ---");
        jogador.imprime();

        System.out.println("--- Time ---");
        time.imprime();

    }
}
