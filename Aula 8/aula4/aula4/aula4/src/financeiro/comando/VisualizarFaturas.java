package financeiro.comando;

import fatura.Fatura;
import repositorio.RepositorioArquivo;

import java.io.IOException;

public class VisualizarFaturas extends Comando {
    public VisualizarFaturas(RepositorioArquivo repositorio) {
        super(repositorio,null);
    }

    @Override
    public void execute() throws IOException {
        for(Fatura fatura : repositorio.getFaturas()) System.out.println(fatura);

    }
}
