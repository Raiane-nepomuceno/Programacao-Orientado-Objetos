package financeiro;

import financeiro.comando.*;
import repositorio.Repositorio;
import repositorio.RepositorioArquivo;

import java.io.IOException;
import java.util.Hashtable;
import java.util.Scanner;

public class Pagamentos {

    public static void menuCadastro()
    {
        System.out.println("\n");
        System.out.println("Menu de funcionários");
        System.out.println("0 - Sair");
        System.out.println("1 - Cadastrar Assalariado");
        System.out.println("2 - Cadastrar Assalariado Comissionado");
        System.out.println("3 - Cadastrar Comissionado");
        System.out.println("4 - Cadastrar Horista");
        System.out.println("5 - Cadastrar Fatura");
        System.out.println("6 - Listar Despesas");

        System.out.println("7 - Listar Funcionários");
        System.out.println("8 - Listar Faturas");
        System.out.println("9 - Listar Assalariados");
        System.out.println("10 - Listar Horistas");
        System.out.println("11 - Listar Comissionados");
        System.out.println("12 - Listar BaseComissionados");

        System.out.println("Escolha uma opção:");
    }
    public static void main(String[] args) {
        Hashtable<Integer, Comando> comandos = new Hashtable<Integer, Comando>();
        RepositorioArquivo repositorio = new RepositorioArquivo();
        Scanner entrada = new Scanner(System.in);
        comandos.put(0,new Sair());
        comandos.put(1,new CadastrarAssalariado(repositorio,entrada));
        comandos.put(2,new CadastrarBaseComissionado(repositorio,entrada));
        comandos.put(3,new CadastrarComissionado(repositorio,entrada));
        comandos.put(4, new CadastrarHorista(repositorio,entrada));
        comandos.put(5, new CadastrarFatura(repositorio,entrada));
        comandos.put(6, new VisualizarDespesas(repositorio));
        comandos.put(7,new VisualizarFuncionarios(repositorio));
        comandos.put(8,new VisualizarFaturas(repositorio));
        comandos.put(9,new VisualizarAssalariados(repositorio));
        comandos.put(10,new VisualizarHoristas(repositorio));
        comandos.put(11,new VisualizarComissionados(repositorio));
        comandos.put(12,new VisualizarBaseComissionado(repositorio));

        int opcao = 0;

        do{
            menuCadastro();
            opcao = entrada.nextInt();
            try {
                comandos.get(opcao).execute();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }

        }while (opcao != 0);
        entrada.close();
    }
}
