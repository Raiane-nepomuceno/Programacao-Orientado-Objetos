package exercicio;

import java.util.ArrayList;
import java.util.List;

public class Caixa <T extends Fruta>{
    private List<T> caixa;

    public Caixa() {
        caixa = new ArrayList<T>();
    }

    public void adicionar(T produto)
    {
        caixa.add(produto);
    }

    public List<T> getProdutos()
    {
        return caixa;
    }
}
