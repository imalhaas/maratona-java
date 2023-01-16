package Kenumeracao.dominio;

public enum tipoPagamento{
        DEBITO{
            @Override
            public double calcularDesconto(double Valor) {
                return Valor * 0.1;
            }
        }, CREDITO{
        @Override
        public double calcularDesconto(double Valor) {
            return Valor * 0.05;
        }
    };

        public double calcularDesconto(double Valor){
            return Valor * 0;
        }

    }