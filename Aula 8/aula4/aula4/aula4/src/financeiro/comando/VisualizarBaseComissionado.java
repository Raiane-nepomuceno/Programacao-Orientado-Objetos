package financeiro.comando;

import funcionario.AssalariadoComissionado;
import repositorio.RepositorioArquivo;

import java.io.IOException;

public class VisualizarBaseComissionado extends Comando {
    public VisualizarBaseComissionado(RepositorioArquivo repositorio) {
        super(repositorio,null);
    }

    @Override
    public void execute() throws IOException {
        for(AssalariadoComissionado assalariado : repositorio.getBaseComissionados()) System.out.println(assalariado);
    }
}
