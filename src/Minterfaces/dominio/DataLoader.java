package Minterfaces.dominio;

public interface DataLoader {
    void load();
    default void checkpermission(){
        System.out.println("Fazendo checagem da permissoes");
    }
    }

