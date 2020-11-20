package exercicio;


import java.util.List;

public class Calculadora{
    List<? extends Fruta> mercadorias;

    public void NotaFiscal(List<? extends Fruta> mercadoria) {
        this.mercadorias = mercadoria;
    }

    public void gerar()
    {
        float soma = 0;
        for (Fruta fruta : mercadorias) {
            soma+= fruta.getPreco();
            System.out.println(fruta);
        }
        System.out.println("Total:R$"+soma);
    }
}
