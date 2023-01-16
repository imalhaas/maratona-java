package Kenumeracao.dominio;

public enum TipoCliente {
    PESSOA_FISICA(1),
    PESSOA_JURIDICA(2);

    private int VALOR;
    TipoCliente(int valor) {
        this.VALOR = valor;
    }


   // public static TipoCliente tipoClientePorNomeRelatorio (String nomeRelatorio){

    //}

    public int getVALOR() {
        return VALOR;
    }
}
