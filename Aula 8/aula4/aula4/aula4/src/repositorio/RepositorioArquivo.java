package repositorio;

import despesa.Despesa;
import fatura.Fatura;
import funcionario.*;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class RepositorioArquivo {
    public void gravar(Assalariado assalariado) throws IOException{
        FileWriter file = new FileWriter("assalariado.txt",true);
        BufferedWriter buffer = new BufferedWriter(file);
        buffer.append(assalariado.getId()+","+assalariado.getNome()+","+ assalariado.getSalario()+"\r\n");
        buffer.close();
        file.close();
    }
    public void gravar(Horista horista) throws IOException{
        FileWriter file = new FileWriter("horista.txt",true);
        BufferedWriter buffer = new BufferedWriter(file);
        buffer.append(horista.getId()+ "," +horista.getNome()+ ","+ horista.getHorasTrabalhadas()+","+ horista.getValorHora()+"\r\n");
        buffer.close();
        file.close();
    }
    public void gravar(Comissionado comissionado) throws IOException
    {
        FileWriter file = new FileWriter("comissionado.txt",true);
        BufferedWriter buffer = new BufferedWriter(file);
        buffer.append(comissionado.getId() + "," +comissionado.getNome()+ "," +comissionado.getTotalVendas()+ ","+comissionado.getComissao()+","+"\r\n");
        buffer.close();
        file.close();
    }
    public void gravar(AssalariadoComissionado assalariadoComissionado) throws IOException
    {
        FileWriter file = new FileWriter("assalariadoComissionado.txt",true);
        BufferedWriter buffer = new BufferedWriter(file);
        buffer.append(assalariadoComissionado.getId()+","+assalariadoComissionado.getNome()+","+assalariadoComissionado.getComissao()+","+assalariadoComissionado.getTotalVendas()+","+assalariadoComissionado.getSalario()+"\r\n");
        buffer.close();
        file.close();
    }
    public void gravar(Fatura fatura)throws IOException
    {
        FileWriter file = new FileWriter("fatura.txt",true);
        BufferedWriter buffer = new BufferedWriter(file);
        buffer.append(fatura.getId()+","+fatura.getDescricao()+","+fatura.getQuantidade()+","+fatura.getPrecoItem()+"\r\n");
        buffer.close();
        file.close();
    }
    public List<Assalariado> getAssalariados() throws IOException
    {
        FileReader file = new FileReader("assalariado.txt");
        BufferedReader buffer =  new BufferedReader(file);
        List<Assalariado> assalariados = new ArrayList<Assalariado>();
        String linha = buffer.readLine();
        while (linha != null)
        {
            String dadosFuncionarios[] = linha.split(",");
            Assalariado assalariado = new Assalariado(Integer.parseInt(dadosFuncionarios[0]),dadosFuncionarios[1],Double.parseDouble(dadosFuncionarios[2]));
            assalariados.add(assalariado);
            linha = buffer.readLine();
        }
        buffer.close();
        file.close();
        return assalariados;
    }
    public List<Comissionado> getComissionados() throws IOException
    {
        FileReader file = new FileReader("comissionado.txt");
        BufferedReader buffer =  new BufferedReader(file);
        List<Comissionado> funcionarios = new ArrayList<Comissionado>();
        String linha = buffer.readLine();
        while (linha != null)
        {
            String dadosFuncionarios[] = linha.split(",");
            Comissionado funcionario = new Comissionado(Integer.parseInt(dadosFuncionarios[0]),dadosFuncionarios[1],Double.parseDouble(dadosFuncionarios[2]),Double.parseDouble(dadosFuncionarios[3]));
            funcionarios.add(funcionario);
            linha = buffer.readLine();
        }
        buffer.close();
        file.close();
        return funcionarios;
    }
    public List<AssalariadoComissionado> getBaseComissionados() throws IOException
    {
        FileReader file = new FileReader("assalariadoComissionado.txt");
        BufferedReader buffer =  new BufferedReader(file);
        List<AssalariadoComissionado> funcionarios = new ArrayList<AssalariadoComissionado>();
        String linha = buffer.readLine();
        while (linha != null)
        {
            String dadosFuncionarios[] = linha.split(",");
            AssalariadoComissionado funcionario = new AssalariadoComissionado(Integer.parseInt(dadosFuncionarios[0]),dadosFuncionarios[1],Double.parseDouble(dadosFuncionarios[2]),Double.parseDouble(dadosFuncionarios[3]),Double.parseDouble(dadosFuncionarios[4]));
            funcionarios.add(funcionario);
            linha = buffer.readLine();
        }
        buffer.close();
        file.close();
        return funcionarios;
    }
    public List<Horista> getHoristas() throws IOException
    {
        FileReader file = new FileReader("horista.txt");
        BufferedReader buffer =  new BufferedReader(file);
        List<Horista> funcionarios = new ArrayList<Horista>();
        String linha = buffer.readLine();
        while (linha != null)
        {
            String dadosFuncionarios[] = linha.split(",");
            Horista funcionario = new Horista(Integer.parseInt(dadosFuncionarios[0]),dadosFuncionarios[1],Double.parseDouble(dadosFuncionarios[2]),Double.parseDouble(dadosFuncionarios[3]));
            funcionarios.add(funcionario);
            linha = buffer.readLine();
        }
        buffer.close();
        file.close();
        return funcionarios;
    }
    public List<Fatura> getFaturas() throws IOException
    {
        FileReader file = new FileReader("fatura.txt");
        BufferedReader buffer =  new BufferedReader(file);
        List<Fatura> faturas = new ArrayList<Fatura>();
        String linha = buffer.readLine();
        while (linha != null)
        {
            String dadosFaturas[] = linha.split(",");
            Fatura fatura = new Fatura(Integer.parseInt(dadosFaturas[0]),dadosFaturas[1],Integer.parseInt(dadosFaturas[2]),Double.parseDouble(dadosFaturas[3]));
            faturas.add(fatura);
            linha = buffer.readLine();
        }
        buffer.close();
        file.close();
        return faturas;
    }
    public List<Funcionario> getFuncionarios() throws IOException{
        List<Funcionario> funcionarios = new ArrayList<Funcionario>();
        for(Assalariado assalariado : getAssalariados()) funcionarios.add(assalariado);
        for(AssalariadoComissionado assalariado : getBaseComissionados())funcionarios.add(assalariado);
        for(Horista horista : getHoristas()) funcionarios.add(horista);
        return funcionarios;

    }
    public List<Despesa> getDespesas() throws IOException{

        List<Despesa> despesas = new ArrayList<Despesa>();
        for (Assalariado assalariado : getAssalariados())despesas.add(assalariado);
        for(Horista horista : getHoristas())despesas.add(horista);
        for(AssalariadoComissionado assalariado : getBaseComissionados()) despesas.add(assalariado);
        for(Comissionado comissionado : getComissionados()) despesas.add(comissionado);
        for(Fatura fatura : getFaturas()) despesas.add(fatura);
        return despesas;
    }
}
