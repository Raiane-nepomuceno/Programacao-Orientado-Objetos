package financeiro.comando;

import fatura.Fatura;
import repositorio.Repositorio;
import repositorio.RepositorioArquivo;

import java.io.IOException;
import java.util.Scanner;

public class CadastrarFatura extends Comando{

    public CadastrarFatura(RepositorioArquivo repositorio, Scanner entrada) {
        super(repositorio, entrada);
     }
    public void execute() throws IOException
    {
        System.out.println("Cadastrando fatura...");
        System.out.println("Digite o id:");
        int id = entrada.nextInt();
        System.out.println("Digite a descrição:");
        String descricao = entrada.next();
        System.out.println("Digite a quantidade:");
        int qtde = entrada.nextInt();
        System.out.println("Digite o preço:");
        double preco = entrada.nextFloat();
        Fatura fatura = new Fatura(id,descricao,qtde,preco);
        repositorio.gravar(fatura);

    }
}
