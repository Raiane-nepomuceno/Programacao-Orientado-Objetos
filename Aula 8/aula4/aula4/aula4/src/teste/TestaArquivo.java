package teste;

import fatura.Fatura;
import funcionario.Assalariado;
import funcionario.AssalariadoComissionado;
import funcionario.Comissionado;
import funcionario.Horista;
import repositorio.RepositorioArquivo;

import java.io.IOException;

public class TestaArquivo {
    public static void main(String[] args) {
        RepositorioArquivo repositorio = new RepositorioArquivo();
        Assalariado assalariado1 = new Assalariado(1,"maria",2000f);
        Assalariado assalariado2 = new Assalariado(2,"joao",1000f);
        Comissionado comissionado1 =new Comissionado(3,"claudia",10,30);
        AssalariadoComissionado assalariadoCom =  new AssalariadoComissionado(4,"joana",10,20,2000);
        Fatura fatura1 = new Fatura(30,"computador",10,2500);
        Fatura fatura2 = new Fatura(40,"mouse",15,100);
        Horista horista = new Horista(20,"ana",100,20);
        try {
            repositorio.gravar(assalariado1);
            repositorio.gravar(assalariado2);
            repositorio.gravar(horista);
            repositorio.gravar(comissionado1);
            repositorio.gravar(assalariadoCom);
            repositorio.gravar(fatura1);
            repositorio.gravar(fatura2);
        }catch (IOException e) {
            e.printStackTrace();
        }
    }
}
