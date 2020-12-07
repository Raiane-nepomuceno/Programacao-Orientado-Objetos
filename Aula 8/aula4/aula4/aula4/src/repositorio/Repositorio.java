package repositorio;

import despesa.Despesa;

import java.util.ArrayList;
import java.util.List;

public class Repositorio {
    List<Despesa> despesas;

    public Repositorio() {
        despesas = new ArrayList<Despesa>();
    }
    public void adicionar(Despesa despesa)
    {
        despesas.add(despesa);
    }
    public List<Despesa> getDespesas()
    {
        return despesas;
    }
}
