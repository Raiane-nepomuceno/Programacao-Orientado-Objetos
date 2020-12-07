package financeiro.comando;

import funcionario.Comissionado;
import repositorio.RepositorioArquivo;

import java.io.IOException;

public class VisualizarComissionados extends Comando {
    public VisualizarComissionados(RepositorioArquivo repositorio) {
        super(repositorio,null);
    }

    @Override
    public void execute() throws IOException {
        for(Comissionado assalariado : repositorio.getComissionados()) System.out.println(assalariado);
    }
}
