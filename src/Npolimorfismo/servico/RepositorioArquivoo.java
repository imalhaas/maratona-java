package Npolimorfismo.servico;

import Npolimorfismo.Repositorio.Repositorio;

public class RepositorioArquivoo implements Repositorio {
    @Override
    public void salvar() {
        System.out.println("Salvando em um arquivo  ");
    }
}
