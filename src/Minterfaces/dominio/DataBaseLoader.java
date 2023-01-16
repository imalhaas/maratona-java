package Minterfaces.dominio;

public class DataBaseLoader implements DataLoader, DataRemover{
    @Override
    public void load() {
        System.out.println("Carregando dados do banco de dados" );
    }

    @Override
    public void Remover() {
        System.out.println("Removendo do banco de dados");

    }

    @Override
    public void checkpermission() {
        DataLoader.super.checkpermission();
        System.out.println("Checando permissoes no banco de dados");
    }
}
