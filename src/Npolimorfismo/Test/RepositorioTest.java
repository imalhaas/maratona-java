package Npolimorfismo.Test;

import Npolimorfismo.Repositorio.Repositorio;
import Npolimorfismo.servico.RepositorioArquivoo;
import Npolimorfismo.servico.RepositorioBancoDeDados;

public class RepositorioTest {
    public static void main(String[] args) {
        Repositorio repositorio = new RepositorioArquivoo();
        repositorio.salvar();
    }
}
