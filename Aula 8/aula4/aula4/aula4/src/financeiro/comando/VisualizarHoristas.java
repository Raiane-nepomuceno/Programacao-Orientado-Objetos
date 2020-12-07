package financeiro.comando;

import funcionario.Horista;
import repositorio.RepositorioArquivo;

import java.io.IOException;

public class VisualizarHoristas extends Comando {
    public VisualizarHoristas(RepositorioArquivo repositorio) {
        super(repositorio,null);
    }

    @Override
    public void execute() throws IOException {
        for(Horista horista : repositorio.getHoristas()) System.out.println(horista);
    }
}
