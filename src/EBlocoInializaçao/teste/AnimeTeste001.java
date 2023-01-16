package EBlocoInializaçao.teste;

import EBlocoInializaçao.dominio.Anime;

public class AnimeTeste001 {
    public static void main(String[] args) {
        Anime anime = new Anime("one pieace");
        for (int episodio : anime.getEpisodios()) {
            System.out.print(episodio + " ");
        }


    }
}
