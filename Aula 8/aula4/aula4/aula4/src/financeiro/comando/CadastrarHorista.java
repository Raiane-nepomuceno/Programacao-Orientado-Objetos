package financeiro.comando;

import funcionario.Horista;
import repositorio.Repositorio;
import repositorio.RepositorioArquivo;

import java.io.IOException;
import java.util.Scanner;

public class CadastrarHorista extends Comando{
    public CadastrarHorista(RepositorioArquivo repositorio, Scanner entrada) {
        super(repositorio, entrada);
    }

    @Override
    public void execute() throws IOException {
        System.out.println("Cadastrando o funcionário horista...");
        System.out.println("Digite o id:");
        int id4 = entrada.nextInt();
        System.out.println("Digite o nome:");
        String nomeHorista = entrada.next();
        System.out.println("Digite as horas trabalhadas:");
        Double horasTrabalhadasHorista = entrada.nextDouble();
        System.out.println("Digite o valor da hora:");
        Double valorHoraHorista = entrada.nextDouble();
        Horista horista = new Horista(id4,nomeHorista,horasTrabalhadasHorista,valorHoraHorista);
        repositorio.gravar(horista);

    }
}
