public class Venda {
    Produto[] produtos;
    int posicao;
    public Venda() {
        produtos = new Produto[10];
        posicao = 0;
    }
    public void adicionarProduto(Produto produto)
    {
        if(posicao>=10) {
            System.out.println("Limite de produtos por venda atingido!");
        }
        else{
            produtos[posicao] = produto;
            posicao++;
        }
    }
    public void visualizarProdutos()
    {
        for(int i = 0; i<posicao; i++)
        {
            System.out.println(produtos[i].nome);
        }
    }
    //método para calcular venda
    public void calcularVenda()
    {
        double soma = 0;
        for(int i = 0; i<posicao;i++)
        {
            soma+=produtos[i].valor;
        }
        System.out.println("O valor é de "+soma);
    }


}
