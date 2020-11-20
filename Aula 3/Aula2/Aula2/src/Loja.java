public class Loja {
    public static void main(String[] args) {
        Produto p1 = new Produto(1,"notebook",2000);
        Produto p2 = new Produto(2,"celular",1010);
        Produto p3 = new Produto(3,"Impressora",500);

        Venda venda = new Venda();
        venda.adicionarProduto(p1);
        venda.adicionarProduto(p2);
        venda.adicionarProduto(p3);
        venda.visualizarProdutos();

        venda.calcularVenda();
    }
}
