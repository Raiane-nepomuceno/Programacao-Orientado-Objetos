package principal;

import despesa.Despesa;
import fatura.Fatura;
import funcionario.*;

import java.util.ArrayList;
import java.util.List;

public class Empresa {
    public static void main(String[] args) {

        AssalariadoComissionado assalariadoComissionado = new AssalariadoComissionado(1,"Ana",1000,0.1,1000);
        Horista horista = new Horista(2,"João",80,10);
        Comissionado comissionado = new Comissionado(3,"Maria",10000,0.2);
        Assalariado assalariado = new Assalariado(4,"Joana",1000);

        Fatura fatura =new Fatura(1,"computador",10,2000);
        List<Despesa> despesas = new ArrayList<Despesa>();
        despesas.add(horista);
        despesas.add(comissionado);
        despesas.add(assalariadoComissionado);
        despesas.add(assalariado);
        despesas.add(fatura);

        for (Despesa despesa : despesas) {
            System.out.println(despesa);
            System.out.println("\n");
        }

    }
}
