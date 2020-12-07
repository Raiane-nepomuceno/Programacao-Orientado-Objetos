package financeiro.comando;

import funcionario.Comissionado;
import repositorio.Repositorio;
import repositorio.RepositorioArquivo;

import java.io.IOException;
import java.util.Scanner;

public class CadastrarComissionado extends Comando{
    public CadastrarComissionado(RepositorioArquivo repositorio, Scanner entrada) {
        super(repositorio, entrada);
    }

    @Override
    public void execute() throws IOException {
        System.out.println("Cadastrando o funcionário comissionado");
        System.out.println("Digite o id:");
        int id2 = entrada.nextInt();
        System.out.println("Digite o nome do funcionário:");
        String nomeComissionado = entrada.next();
        System.out.println("Digite o total de vendas:");
        Double totalVendas2 = entrada.nextDouble();
        System.out.println("Digite o valor da comissão:");
        Double comissao = entrada.nextDouble();
        Comissionado comissionado = new Comissionado(id2,nomeComissionado,totalVendas2,comissao);
        repositorio.gravar(comissionado);

    }
}
