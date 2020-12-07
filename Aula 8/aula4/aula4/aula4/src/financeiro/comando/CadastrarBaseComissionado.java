package financeiro.comando;

import funcionario.AssalariadoComissionado;
import repositorio.Repositorio;
import repositorio.RepositorioArquivo;

import java.io.IOException;
import java.util.Scanner;

public class CadastrarBaseComissionado extends Comando {

    public CadastrarBaseComissionado(RepositorioArquivo repositorio, Scanner entrada) {
        super(repositorio, entrada);
        }
    public void execute() throws IOException
    {
        System.out.println("Cadastrando o funcionário assalariado comissionado...");
        System.out.println("Digite o id:");
        int id3 = entrada.nextInt();
        System.out.println("Digite o nome:");
        String nomeAssalariadoComissionado = entrada.next();
        System.out.println("Digite o total de vendas:");
        Double totalVendas = entrada.nextDouble();
        System.out.println("Digite a comissão:");
        Double comissaoAssalariadoComissionado = entrada.nextDouble();
        System.out.println("Digite o salário:");
        Double salarioAsslariadoComissionado = entrada.nextDouble();
        AssalariadoComissionado assalariadoComissionado = new AssalariadoComissionado(id3,nomeAssalariadoComissionado,totalVendas,comissaoAssalariadoComissionado,salarioAsslariadoComissionado);
        repositorio.gravar((assalariadoComissionado));
    }
}
