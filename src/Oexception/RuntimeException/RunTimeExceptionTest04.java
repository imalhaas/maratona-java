package Oexception.RuntimeException;

import java.io.FileNotFoundException;
import java.sql.SQLException;

public class RunTimeExceptionTest04 {
    public static void main(String[] args) {
        //aqui estou falando para tentar uma exception
    try{
        // throw to mostrando a exception
         throw new IndexOutOfBoundsException();
    }
    //aqui ta vendo se é a exception e se for vai aparecer na tela
    catch (ArrayIndexOutOfBoundsException e){
        System.out.println(" Dentro do ArrayIndexOutOfBoundsException");
    }
    catch (IndexOutOfBoundsException e){
        System.out.println("Dentro do Index");
    }catch (IllegalArgumentException e){
        System.out.println("Dentro do Illigal");
    }catch (ArithmeticException e){
        System.out.println("Dentro do Arith");
    }

    try {
        talvezLanceException();
    }catch (SQLException | FileNotFoundException e){
        e.printStackTrace();
    }

    }





    public static void talvezLanceException() throws SQLException, FileNotFoundException{}
}
