package financeiro.comando;

import despesa.Despesa;
import repositorio.Repositorio;
import repositorio.RepositorioArquivo;

import java.io.IOException;

public class VisualizarDespesas extends Comando {

    public VisualizarDespesas(RepositorioArquivo repositorio) {
        super(repositorio,null);
    }

    public void execute() throws IOException
    {
        for (Despesa despesa : repositorio.getDespesas())
            System.out.println(despesa);


    }
}
