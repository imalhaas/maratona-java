package JsobrecargaMetodos.teste;

import JsobrecargaMetodos.Dominio.Anime;

public class AnimeTest {
    public static void main(String[] args) {
        Anime anime = new Anime();

       // anime.init("seila", "tv", 12);
        anime.init("seila", "tv", 12, "acao");
        anime.imprime();


    }
}
