package financeiro.comando;

import funcionario.Assalariado;
import repositorio.RepositorioArquivo;

import java.io.IOException;

public class VisualizarAssalariados extends Comando {
    public VisualizarAssalariados(RepositorioArquivo repositorio) {
        super(repositorio,null);
    }

    @Override
    public void execute() throws IOException {
        for(Assalariado assalariado : repositorio.getAssalariados()) System.out.println(assalariado);
    }
}
