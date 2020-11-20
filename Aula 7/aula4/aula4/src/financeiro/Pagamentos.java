package financeiro;

import despesa.Despesa;
import fatura.Fatura;
import funcionario.Assalariado;
import funcionario.AssalariadoComissionado;
import funcionario.Comissionado;
import funcionario.Horista;
import repositorio.Repositorio;

import java.util.Scanner;

public class Pagamentos {
    public static void menu()
    {
        System.out.println("\n");
        System.out.println("Sistema Financeiro");
        System.out.println("0 - Sair");
        System.out.println("1 - Cadastrar Funcionário");
        System.out.println("2 - Cadastrar Fatura");
        System.out.println("3 - Listar Despesas");
        System.out.println("Escolha uma opção:");

    }
    public static void menuCadastro()
    {
        System.out.println("\n");
        System.out.println("Menu de funcionários");
        System.out.println("1 - Assalariado");
        System.out.println("2 - Assalariado Comissionado");
        System.out.println("3 - Comissionado");
        System.out.println("4 - Horista");
        System.out.println("5 - Voltar ao menu principal");
        System.out.println("Escolha uma opção:");
    }
    public static void main(String[] args) {
        Repositorio repositorio = new Repositorio();
        int opcao = 0,opcaoCadatro = 0;
        Scanner entrada = new Scanner(System.in);
        Scanner entrada2 = new Scanner(System.in);
        do{
            menu();
            opcao = entrada.nextInt();
            if(opcao == 1)
            {
                menuCadastro();
                opcaoCadatro = entrada2.nextInt();
                switch (opcaoCadatro)
                {
                    case 1:
                        System.out.println("Cadastrando o funcionário assalariado...");
                        System.out.println("Digite o id:");
                        int id = entrada2.nextInt();
                        System.out.println("Digite o nome:");
                        String nome = entrada2.next();
                        System.out.println("Digite o salario:");
                        float salario = entrada2.nextFloat();

                        Assalariado assalariado = new Assalariado(id,nome,salario);
                        repositorio.adicionar(assalariado);
                        break;
                    case 2:
                        System.out.println("Cadastrando o funcionário assalariado comissionado...");
                        System.out.println("Digite o id:");
                        int id3 = entrada2.nextInt();
                        System.out.println("Digite o nome:");
                        String nomeAssalariadoComissionado = entrada2.next();
                        System.out.println("Digite o total de vendas:");
                        Double totalVendas = entrada2.nextDouble();
                        System.out.println("Digite a comissão:");
                        Double comissaoAssalariadoComissionado = entrada2.nextDouble();
                        System.out.println("Digite o salário:");
                        Double salarioAsslariadoComissionado = entrada2.nextDouble();
                        AssalariadoComissionado assalariadoComissionado = new AssalariadoComissionado(id3,nomeAssalariadoComissionado,totalVendas,comissaoAssalariadoComissionado,salarioAsslariadoComissionado);
                        repositorio.adicionar(assalariadoComissionado);
                        break;
                    case 3:
                        System.out.println("Cadastrando o funcionário comissionado");
                        System.out.println("Digite o id:");
                        int id2 = entrada2.nextInt();
                        System.out.println("Digite o nome do funcionário:");
                        String nomeComissionado = entrada2.next();
                        System.out.println("Digite o total de vendas:");
                        Double totalVendas2 = entrada2.nextDouble();
                        System.out.println("Digite o valor da comissao:");
                        Double comissao = entrada2.nextDouble();
                        Comissionado comissionado = new Comissionado(id2,nomeComissionado,totalVendas2,comissao);
                        repositorio.adicionar(comissionado);
                        break;

                    case 4:
                        System.out.println("Cadastrando o funcionário horista...");
                        System.out.println("Digite o id:");
                        int id4 = entrada2.nextInt();
                        System.out.println("Digite o nome:");
                        String nomeHorista = entrada2.next();
                        System.out.println("Digite as horas trabalhadas:");
                        Double horasTrabalhadasHorista = entrada2.nextDouble();
                        System.out.println("Digite o valor da hora:");
                        Double valorHoraHorista = entrada2.nextDouble();
                        Horista horista = new Horista(id4,nomeHorista,horasTrabalhadasHorista,valorHoraHorista);
                        repositorio.adicionar(horista);
                        break;
                    case 5:
                        System.out.println("Voltando ao menu principal");
                        break;
                    default:
                        System.out.println("Opção Inválida! Tente novamente!");
                        break;
                }
            }
            else if(opcao == 2)
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
                repositorio.adicionar(fatura);

            }
            else if(opcao == 3)
            {
                for (Despesa despesa : repositorio.getDespesas()) {
                    System.out.println(despesa);
                }
            }
        }while (opcao != 0);
        entrada.close();
        System.out.println("Sistema Finalizado!");
    }
}
