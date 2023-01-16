package Oexception.error.test.exeptionTest;

import java.io.File;
import java.io.IOException;

public class exeptionTeste01 {
    public static void main(String[] args) throws IOException{
    criarNovoArquivo();
    }
    private static void  criarNovoArquivo()throws IOException{
        File file = new File("arquivo\\teste.txt");
         try {
             boolean iscriado = file.createNewFile();
             System.out.println("Arquivo criado "+ iscriado);
         }catch (IOException e){
         e.printStackTrace();
         throw new RuntimeException("problema na hora de criar arquivo");
        }
    }
}
