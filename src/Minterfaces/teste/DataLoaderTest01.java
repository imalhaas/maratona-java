package Minterfaces.teste;

import Minterfaces.dominio.DataBaseLoader;
import Minterfaces.dominio.DataRemover;
import Minterfaces.dominio.FileLoader;

public class DataLoaderTest01 {
    public static void main(String[] args) {

        DataBaseLoader dataBaseLoader = new DataBaseLoader();
        FileLoader fileLoader = new FileLoader();


        dataBaseLoader.load();
        fileLoader.load();

        dataBaseLoader.Remover();
        fileLoader.Remover();

        dataBaseLoader.checkpermission();
        fileLoader.checkpermission();



    }
}
