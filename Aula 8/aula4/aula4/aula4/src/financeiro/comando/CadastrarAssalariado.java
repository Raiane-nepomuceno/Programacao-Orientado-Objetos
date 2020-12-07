package financeiro.comando;

import funcionario.Assalariado;
import repositorio.RepositorioArquivo;

import java.io.IOException;
import java.util.Scanner;

public class CadastrarAssalariado extends Comando{
    public CadastrarAssalariado(RepositorioArquivo repositorio, Scanner entrada) {
        super(repositorio, entrada);
    }

    @Override
    public void execute() throws IOException {
        System.out.println("Cadastrando o funcionário assalariado...");
        System.out.println("Digite o id:");
        int id = entrada.nextInt();
        System.out.println("Digite o nome:");
        String nome = entrada.next();
        System.out.println("Digite o salário:");
        float salario = entrada.nextFloat();
        Assalariado assalariado = new Assalariado(id, nome, salario);
        repositorio.gravar(assalariado);


    }
}
