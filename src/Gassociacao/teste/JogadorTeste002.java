package Gassociacao.teste;

import Gassociacao.dominio.Jogador;
import Gassociacao.dominio.Time;

public class JogadorTeste002 {
    public static void main(String[] args) {
         Jogador jogador1 = new Jogador("Messi");
         Time time  = new Time ("PSG");

         jogador1.setTime(time);
        jogador1.imprime();

    }
}
