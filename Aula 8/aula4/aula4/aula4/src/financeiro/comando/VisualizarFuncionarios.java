package financeiro.comando;

import funcionario.Funcionario;
import repositorio.RepositorioArquivo;

import java.io.IOException;

public class VisualizarFuncionarios extends Comando{
    public VisualizarFuncionarios(RepositorioArquivo repositorio) {
        super(repositorio,null);
    }

    public void execute() throws IOException
    {
        for (Funcionario funcionario : repositorio.getFuncionarios()) System.out.println(funcionario);

    }
}
