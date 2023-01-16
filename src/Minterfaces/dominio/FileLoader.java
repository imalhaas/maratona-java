package Minterfaces.dominio;

public class FileLoader implements DataLoader, DataRemover{
    @Override
    public void load() {
        System.out.println("Carregando dados de um arquivo");
    }

    @Override
    public void Remover() {
        System.out.println("Removendo do banco de arquivo");

    }

    @Override
    public void checkpermission() {
        DataLoader.super.checkpermission();
        System.out.println("Checando permissoes no arquivo");
    }
}
