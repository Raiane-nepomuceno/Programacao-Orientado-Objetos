package financeiro.comando;
import repositorio.RepositorioArquivo;

import java.io.IOException;
import java.util.Scanner;

public abstract class Comando {
    protected RepositorioArquivo repositorio;
    protected Scanner entrada;

    public Comando(RepositorioArquivo repositorio, Scanner entrada) {
        super();
        this.repositorio = repositorio;
        this.entrada = entrada;
    }
    public abstract void execute() throws IOException;
}
