package principal;

import funcionario.*;

import java.util.ArrayList;
import java.util.List;

public class Empresa {
    public static void main(String[] args) {

        AssalariadoComissionado assalariadoComissionado = new AssalariadoComissionado(1,"Ana",1000,0.1,1000);
        Horista horista = new Horista(2,"João",80,10);
        Comissionado comissionado = new Comissionado(3,"Maria",10000,0.2);
        Assalariado assalariado = new Assalariado(4,"Joana",1000);

        List<Funcionario> funcionarios = new ArrayList<Funcionario>();
        funcionarios.add(horista);
        funcionarios.add(comissionado);
        funcionarios.add(assalariadoComissionado);
        funcionarios.add(assalariado);

        for (Funcionario funcionario : funcionarios) {
            System.out.println(funcionario);
            System.out.println("\n");
        }

    }
}
