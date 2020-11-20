package exercicio;


public class Quitanda {
    public static void main(String[] args) {
        Caixa<Banana> caixa = new Caixa();
        caixa.adicionar(new Banana("nanica",10));
        caixa.adicionar(new Banana("maçã",11));

        Caixa<Maca> caixa2 = new Caixa<>();
        caixa2.adicionar(new Maca("tipo1",10));
        caixa2.adicionar(new Maca("tipo",13));

        Caixa<Fruta> caixa3 = new Caixa<>();
        caixa3.adicionar(new Maca("tipo1",10));
        caixa3.adicionar(new Banana("maçã",11));
        caixa3.adicionar(new Manga("tipo20",22));

        Caixa<Manga> caixa4 = new Caixa<>();
        caixa4.adicionar(new Manga("tipo10",12));
        caixa4.adicionar(new Manga("tipo20",22));

        System.out.println("Caixa 1:");
        Calculadora calculadora = new Calculadora();
        calculadora.NotaFiscal(caixa.getProdutos());
        calculadora.gerar();
        System.out.println("\n");

        System.out.println("Caixa 2:");
        calculadora.NotaFiscal(caixa2.getProdutos());
        calculadora.gerar();
        System.out.println("\n");

        System.out.println("Caixa 3:");
        calculadora.NotaFiscal(caixa3.getProdutos());
        calculadora.gerar();
        System.out.println("\n");

        System.out.println("Caixa 4:");
        calculadora.NotaFiscal(caixa4.getProdutos());
        calculadora.gerar();
        System.out.println("\n");

        
    }
}
